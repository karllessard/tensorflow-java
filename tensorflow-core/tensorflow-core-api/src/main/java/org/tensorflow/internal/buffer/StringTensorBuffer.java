/*
 *  Copyright 2019 The TensorFlow Authors. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  =======================================================================
 */

package org.tensorflow.internal.buffer;

import java.nio.ReadOnlyBufferException;
import java.util.function.Function;
import org.tensorflow.tools.buffer.ByteDataBuffer;
import org.tensorflow.tools.buffer.DataBuffer;
import org.tensorflow.tools.buffer.LongDataBuffer;
import org.tensorflow.tools.buffer.impl.AbstractDataBuffer;
import org.tensorflow.tools.buffer.impl.Validator;
import org.tensorflow.tools.ndarray.NdArray;

public class StringTensorBuffer extends AbstractDataBuffer<byte[]> {

  public static <T> long computeSize(NdArray<T> src, Function<T, byte[]> toBytes) {
    // reserve space to store 64-bit offsets
    long size = src.size() * Long.BYTES;

    // reserve space to store length and data of each values
    for (NdArray<T> scalar : src.scalars()) {
      byte[] elementBytes = toBytes.apply(scalar.getObject());
      size += elementBytes.length + StringTensorBuffer.varintLength(elementBytes.length);
    }
    return size;
  }

  public <T> void init(NdArray<T> src, Function<T, byte[]> toBytes) {
    InitWriter writer = new InitWriter();
    for (NdArray<T> scalar : src.scalars()) {
      writer.writeNext(toBytes.apply(scalar.getObject()));
    }
  }

  @Override
  public long size() {
    return offsets.size();
  }

  @Override
  public byte[] getObject(long index) {
    Validator.getArgs(this, index);
    long offset = offsets.getLong(index);

    // Read string length as a varint from the given offset
    byte b;
    int pos = 0;
    int length = 0;
    do {
      b = data.getByte(offset++);
      length |= (b & 0x7F) << pos++;
    } while ((b & 0x80) != 0);

    // Read string of the given length
    byte[] bytes = new byte[length];
    data.offset(offset).read(bytes);
    return bytes;
  }

  @Override
  public DataBuffer<byte[]> setObject(byte[] values, long index) {
    throw new ReadOnlyBufferException();  // Native string tensors are always read-only
  }

  @Override
  public boolean isReadOnly() {
    return true;
  }

  @Override
  public DataBuffer<byte[]> copyTo(DataBuffer<byte[]> dst, long size) {
    if (size == size() && dst instanceof StringTensorBuffer) {
      StringTensorBuffer tensorDst = (StringTensorBuffer) dst;
      if (offsets.size() != size || data.size() != size) {
        throw new IllegalArgumentException(
            "Cannot copy string tensor data to another tensor of a different size");
      }
      offsets.copyTo(tensorDst.offsets, size);
      data.copyTo(tensorDst.data, size);
    } else {
      slowCopyTo(dst, size);
    }
    return this;
  }

  @Override
  public DataBuffer<byte[]> offset(long index) {
    return new StringTensorBuffer(offsets.offset(index), data.offset(offsets.getLong(index)));
  }

  @Override
  public DataBuffer<byte[]> narrow(long size) {
    return new StringTensorBuffer(offsets.narrow(size), data.narrow(offsets.getLong(size)));
  }

  StringTensorBuffer(LongDataBuffer offsets, ByteDataBuffer data) {
    this.offsets = offsets;
    this.data = data;
  }

  private class InitWriter {
    long offsetIndex = 0;
    long dataIndex = 0;

    public void writeNext(byte[] bytes) {
      offsets.setLong(dataIndex, offsetIndex++);

      // Encode string length as a varint first
      int v = bytes.length;
      while (v >= 0x80) {
        data.setByte((byte) ((v & 0x7F) | 0x80), dataIndex++);
        v >>= 7;
      }
      data.setByte((byte) v, dataIndex++);

      // Then write string data bytes
      data.offset(dataIndex).write(bytes);
      dataIndex += bytes.length;
    }

    InitWriter() {}
  }

  private static int varintLength(int length) {
    int len = 1;
    while (length >= 0x80) {
      length >>= 7;
      len++;
    }
    return len;
  }

  private final LongDataBuffer offsets;
  private final ByteDataBuffer data;
}
