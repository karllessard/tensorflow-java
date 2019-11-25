package org.tensorflow.internal.buffer;

import static org.tensorflow.internal.c_api.global.tensorflow.TF_TensorByteSize;
import static org.tensorflow.internal.c_api.global.tensorflow.TF_TensorData;

import com.google.common.base.Charsets;
import java.nio.ReadOnlyBufferException;
import org.tensorflow.internal.c_api.TF_Tensor;
import org.tensorflow.nio.buffer.ByteDataBuffer;
import org.tensorflow.nio.buffer.DataBuffer;
import org.tensorflow.nio.buffer.LongDataBuffer;
import org.tensorflow.nio.buffer.impl.AbstractDataBuffer;
import org.tensorflow.nio.buffer.impl.Validator;
import org.tensorflow.nio.nd.NdArray;

public class StringTensorBuffer extends AbstractDataBuffer<String> {

  public static StringTensorBuffer map(TF_Tensor nativeTensor, long numElements) {
    long address = TF_TensorData(nativeTensor).address();
    long size = TF_TensorByteSize(nativeTensor);
    LongTensorBuffer offsets = new LongTensorBuffer(address, numElements);
    ByteTensorBuffer data = new ByteTensorBuffer(address + numElements * Long.BYTES, size);
    return new StringTensorBuffer(offsets, data);
  }

  @Override
  public long size() {
    return offsets.size();
  }

  @Override
  public String get(long index) {
    Validator.getArgs(this, index);
    long offset = offsets.get(index);

    // Read string length as a varint from the given offset
    byte b;
    int pos = 0;
    int length = 0;
    do {
      b = data.get(offset++);
      length |= (b & 0x7F) << pos++;
    } while ((b & 0x80) != 0);

    // Read string of the given length
    byte[] bytes = new byte[length];
    data.offset(offset).read(bytes);

    return new String(bytes, Charsets.UTF_8);
  }

  @Override
  public DataBuffer<String> set(String value, long index) {
    throw new ReadOnlyBufferException();
  }

  @Override
  public boolean isReadOnly() {
    return true;
  }

  @Override
  public DataBuffer<String> copyTo(DataBuffer<String> dst, long size) {
    if (size == size() && dst instanceof StringTensorBuffer) {
      StringTensorBuffer tensorDst = (StringTensorBuffer)dst;
      if (offsets.size() != size || data.size() != size) {
        throw new IllegalArgumentException("Cannot copy string tensor data to another tensor of a different size");
      }
      offsets.copyTo(tensorDst.offsets, size);
      data.copyTo(tensorDst.data, size);
    } else {
      slowCopyTo(dst, size);
    }
    return this;
  }

  @Override
  public DataBuffer<String> offset(long index) {
    return new StringTensorBuffer(offsets.offset(index), data.offset(offsets.getLong(index)));
  }

  @Override
  public DataBuffer<String> narrow(long size) {
    return new StringTensorBuffer(offsets.narrow(size), data.narrow(offsets.getLong(size)));
  }

  public void init(NdArray<String> src) {
    DataWriter writer = new DataWriter();
    src.scalars().forEach(s -> writer.writeNext(s.getValue()));
  }

  private class DataWriter {
    long count = 0;
    long dataIndex = 0;

    void writeNext(String value) {
      offsets.setLong(dataIndex, count);

      // Encode string length as a varint first
      int v = value.length();
      while (v >= 0x80) {
        data.setByte((byte)((v & 0x7F) | 0x80), dataIndex++);
        v >>= 7;
      }
      data.setByte((byte)v, dataIndex++);

      // Then write string data bytes
      byte[] bytes = value.getBytes(Charsets.UTF_8);
      data.offset(dataIndex).write(bytes);
      dataIndex += bytes.length;
    }
  }

  private final LongDataBuffer offsets;
  private final ByteDataBuffer data;

  private StringTensorBuffer(LongDataBuffer offsets, ByteDataBuffer data) {
    this.offsets = offsets;
    this.data = data;
  }
}
