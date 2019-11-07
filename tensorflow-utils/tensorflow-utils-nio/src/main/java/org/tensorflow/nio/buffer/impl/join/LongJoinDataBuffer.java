/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */
package org.tensorflow.nio.buffer.impl.join;

import java.util.stream.LongStream;
import org.tensorflow.nio.buffer.LongDataBuffer;
import org.tensorflow.nio.buffer.impl.jdk.LongJdkDataBuffer;

public final class LongJoinDataBuffer extends
    AbstractJoinDataBuffer<Long, LongDataBuffer> implements LongDataBuffer {

  public static long MAX_CAPACITY = LongJdkDataBuffer.MAX_CAPACITY << 1;

  public static LongDataBuffer allocate(long capacity) {
    if (capacity > MAX_CAPACITY) {
      throw new IllegalArgumentException("Capacity for a joined data buffer cannot exceeds " + MAX_CAPACITY + " bytes");
    }
    LongDataBuffer[] buffers = allocateBuffers(LongDataBuffer.class, capacity, LongJdkDataBuffer.MAX_CAPACITY, LongJdkDataBuffer::allocate);
    return new LongJoinDataBuffer(buffers, false);
  }

  public static LongDataBuffer join(LongDataBuffer... buffers) {
    boolean readOnly = Validator.joinBuffers(buffers);
    return new LongJoinDataBuffer(buffers, readOnly);
  }

  @Override
  public LongStream longStream() {
    LongStream stream = buffer(0).longStream();
    for (int i = 1; i < nbBuffers(); ++i) {
      stream = LongStream.concat(stream, buffer(i).longStream());
    }
    return stream;
  }

  @Override
  public long getLong() {
    long value = currentBuffer().getLong();
    onPositionIncrement();
    return value;
  }

  @Override
  public long getLong(long index) {
    Validator.getArgs(this, index);
    int bufferIdx = bufferIndex(index);
    return buffer(bufferIdx).getLong(indexInBuffer(bufferIdx, index));
  }

  @Override
  public LongDataBuffer get(long[] dst, int offset, int length) {
    Validator.getArrayArgs(this, dst.length, offset, length);
    copyArray(offset, length, (b, o, l) -> ((LongDataBuffer)b).get(dst, o, l));
    return this;
  }

  @Override
  public LongDataBuffer putLong(long value) {
    Validator.put(this);
    currentBuffer().putLong(value);
    onPositionIncrement();
    return this;
  }

  @Override
  public LongDataBuffer putLong(long index, long value) {
    Validator.putArgs(this, index);
    int bufferIdx = bufferIndex(index);
    buffer(bufferIdx).putLong(indexInBuffer(bufferIdx, index), value);
    return this;
  }

  @Override
  public LongDataBuffer put(long[] src, int offset, int length) {
    Validator.putArrayArgs(this, src.length, offset, length);
    copyArray(offset, length, (b, o, l) -> ((LongDataBuffer)b).put(src, o, l));
    return this;
  }

  @Override
  protected LongJoinDataBuffer instantiate(LongDataBuffer[] buffers, boolean readOnly) {
    return new LongJoinDataBuffer(buffers, readOnly);
  }

  private LongJoinDataBuffer(LongDataBuffer[] buffers, boolean readOnly) {
    super(buffers, readOnly);
  }
}
