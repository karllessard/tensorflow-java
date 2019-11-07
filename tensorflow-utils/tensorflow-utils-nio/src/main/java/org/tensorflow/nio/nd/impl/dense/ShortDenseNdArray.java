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
package org.tensorflow.nio.nd.impl.dense;

import org.tensorflow.nio.buffer.DataBuffer;
import org.tensorflow.nio.buffer.DataBuffers;
import org.tensorflow.nio.buffer.ShortDataBuffer;
import org.tensorflow.nio.nd.ShortNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dimension.DimensionalSpace;

public class ShortDenseNdArray extends AbstractDenseNdArray<Short, ShortNdArray>
    implements ShortNdArray {

  public static ShortNdArray create(ShortDataBuffer buffer, Shape shape) {
    Validator.denseShape(buffer, shape);
    return new ShortDenseNdArray(buffer, shape);
  }

  @Override
  public short getShort(long... indices) {
    return buffer().getShort(positionOf(indices, true));
  }

  @Override
  public ShortNdArray setShort(short value, long... indices) {
    buffer().putShort(positionOf(indices, true), value);
    return this;
  }

  @Override
  public ShortNdArray read(short[] dst, int offset) {
    Validator.getArrayArgs(this, dst.length, offset);
    return read(DataBuffers.wrap(dst, false).position(offset));
  }

  @Override
  public ShortNdArray write(short[] src, int offset) {
    Validator.putArrayArgs(this, src.length, offset);
    return write(DataBuffers.wrap(src, true).position(offset));
  }

  protected ShortDenseNdArray(ShortDataBuffer buffer, Shape shape) {
    this(buffer, DimensionalSpace.create(shape));
  }

  @Override
  @SuppressWarnings("unchecked")
  protected ShortDataBuffer buffer() {
    return super.buffer();
  }

  @Override
  ShortDenseNdArray allocate(DataBuffer<Short> buffer, DimensionalSpace dimensions) {
    return new ShortDenseNdArray((ShortDataBuffer)buffer, dimensions);
  }

  private ShortDenseNdArray(ShortDataBuffer buffer, DimensionalSpace dimensions) {
    super(buffer, dimensions);
  }
}