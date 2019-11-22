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

package org.tensorflow.nio.buffer.impl.jdk;

import java.nio.FloatBuffer;
import org.tensorflow.nio.buffer.DataBuffer;
import org.tensorflow.nio.buffer.FloatDataBuffer;
import org.tensorflow.nio.buffer.impl.Validator;

/**
 * A buffer of bytes using a JDK {@link FloatBuffer} for storage.
 * <p>
 * Since JDK buffers supports only 32-bits indexation, the size of this buffer type cannot
 * exceed 2<sup>32</sup> - 1 (see {@link FloatJdkDataBuffer#MAX_CAPACITY} for the real maximum
 * value supported).
 */
public final class FloatJdkDataBuffer extends AbstractJdkDataBuffer<Float>
    implements FloatDataBuffer {

  /**
   * The maximum size for a buffer of this type, i.e. the maximum number of bytes it can store.
   * <p>
   * As the maximum size may vary depending on the JVM implementation and on the platform, this
   * property returns a value that is safe for most of them.
   */
  public static long MAX_CAPACITY = AbstractJdkDataBuffer.MAX_CAPACITY;

  /**
   * Allocates a new byte buffer, initialized with zeroes.
   *
   * @param size the new buffer's size, in bytes
   * @return the new byte buffer
   * @throws IllegalArgumentException if the size is a negative integer or exceeds
   *                                  {@link #MAX_CAPACITY}.
   */
  public static FloatDataBuffer allocate(long size) {
    if (size > MAX_CAPACITY) {
      throw new IllegalArgumentException("Capacity of a JDK data buffer cannot exceeds "
          + MAX_CAPACITY + " bytes, use FloatJoinDataBuffer instead");
    }
    return new FloatJdkDataBuffer(FloatBuffer.allocate((int)size));
  }

  /**
   * Wraps a JDK {@link FloatBuffer} into a {@code FloatDataBuffer}.
   *
   * @param buffer buffer to wrap
   * @return the new byte buffer
   */
  public static FloatDataBuffer wrap(FloatBuffer buffer) {
    return new FloatJdkDataBuffer(buffer);
  }

  @Override
  public float getFloat(long index) {
    Validator.getArgs(this, index);
    return buf.get((int)index);
  }

  @Override
  public FloatDataBuffer setFloat(float value, long index) {
    Validator.setArgs(this, index);
    buf.put((int)index, value);
    return this;
  }

  @Override
  public FloatDataBuffer read(float[] dst, int offset, int length) {
    buf.get(dst, offset, length).rewind();
    return this;
  }

  @Override
  public FloatDataBuffer write(float[] src, int offset, int length) {
    buf.put(src, offset, length).rewind();
    return this;
  }

  @Override
  public FloatDataBuffer copyTo(DataBuffer<Float> dst, long size) {
    Validator.copyToArgs(this, dst, size);
    if (dst instanceof FloatJdkDataBuffer) {
      FloatBuffer dstBuf = ((FloatJdkDataBuffer)dst).buf.duplicate();
      FloatBuffer srcBuf = (FloatBuffer)buf.duplicate().limit((int)size);
      dstBuf.put(srcBuf);
    } else {
      slowCopyTo(dst, size);
    }
    return this;
  }

  @Override
  public FloatDataBuffer offset(long index) {
    Validator.offsetArgs(this, index);
    return new FloatJdkDataBuffer(((FloatBuffer)buf.duplicate().position((int)index)).slice());
  }

  @Override
  public FloatDataBuffer narrow(long size) {
    Validator.narrowArgs(this, size);
    return new FloatJdkDataBuffer(((FloatBuffer)buf.duplicate().limit((int)size)).slice());
  }

  @Override
  FloatBuffer buf() {
    return buf;
  }

  private FloatJdkDataBuffer(FloatBuffer buf) {
    this.buf = buf;
  }

  private FloatBuffer buf;
}
