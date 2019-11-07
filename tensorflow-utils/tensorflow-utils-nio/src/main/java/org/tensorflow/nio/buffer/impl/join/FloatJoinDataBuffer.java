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

import org.tensorflow.nio.buffer.FloatDataBuffer;
import org.tensorflow.nio.buffer.impl.jdk.FloatJdkDataBuffer;

public final class FloatJoinDataBuffer extends
    AbstractJoinDataBuffer<Float, FloatDataBuffer> implements FloatDataBuffer {

  public static long MAX_CAPACITY = FloatJdkDataBuffer.MAX_CAPACITY * FloatJdkDataBuffer.MAX_CAPACITY;

  public static FloatDataBuffer allocate(long capacity) {
    if (capacity > MAX_CAPACITY) {
      throw new IllegalArgumentException("Capacity for a joined data buffer cannot exceeds " + MAX_CAPACITY + " bytes");
    }
    FloatDataBuffer[] buffers = allocateBuffers(FloatDataBuffer.class, capacity, FloatJdkDataBuffer.MAX_CAPACITY, FloatJdkDataBuffer::allocate);
    return new FloatJoinDataBuffer(buffers, false);
  }

  public static FloatDataBuffer join(FloatDataBuffer... buffers) {
    boolean readOnly = Validator.joinBuffers(buffers);
    return new FloatJoinDataBuffer(buffers, readOnly);
  }

  @Override
  public float getFloat() {
    float value = currentBuffer().getFloat();
    onPositionIncrement();
    return value;
  }

  @Override
  public float getFloat(long index) {
    Validator.getArgs(this, index);
    int bufferIdx = bufferIndex(index);
    return buffer(bufferIdx).getFloat(indexInBuffer(bufferIdx, index));
  }

  @Override
  public FloatDataBuffer get(float[] dst, int offset, int length) {
    Validator.getArrayArgs(this, dst.length, offset, length);
    copyArray(offset, length, (b, o, l) -> ((FloatDataBuffer)b).get(dst, o, l));
    return this;
  }

  @Override
  public FloatDataBuffer putFloat(float value) {
    Validator.put(this);
    currentBuffer().putFloat(value);
    onPositionIncrement();
    return this;
  }

  @Override
  public FloatDataBuffer putFloat(long index, float value) {
    Validator.putArgs(this, index);
    int bufferIdx = bufferIndex(index);
    buffer(bufferIdx).putFloat(indexInBuffer(bufferIdx, index), value);
    return this;
  }

  @Override
  public FloatDataBuffer put(float[] src, int offset, int length) {
    Validator.putArrayArgs(this, src.length, offset, length);
    copyArray(offset, length, (b, o, l) -> ((FloatDataBuffer)b).put(src, o, l));
    return this;
  }

  @Override
  protected FloatJoinDataBuffer instantiate(FloatDataBuffer[] buffers, boolean readOnly) {
    return new FloatJoinDataBuffer(buffers, readOnly);
  }

  private FloatJoinDataBuffer(FloatDataBuffer[] buffers, boolean readOnly) {
    super(buffers, readOnly);
  }
}
