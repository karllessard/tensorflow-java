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

import org.tensorflow.nio.buffer.DataBuffers;
import org.tensorflow.nio.buffer.IntDataBuffer;
import org.tensorflow.nio.nd.IntNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dimension.DimensionalSpace;

public class IntDenseNdArray extends AbstractDenseNdArray<Integer, IntNdArray> implements IntNdArray {

  public static IntNdArray create(IntDataBuffer buffer, Shape shape) {
    Validator.denseShape(shape);
    return new IntDenseNdArray(buffer, DimensionalSpace.create(shape));
  }

  @Override
  public int getInt(long... coordinates) {
    return buffer().get(position(coordinates, true));
  }

  @Override
  public IntNdArray setInt(int value, long... coordinates) {
    buffer().put(position(coordinates, true), value);
    return this;
  }

  @Override
  public IntNdArray read(int[] dst, int offset) {
    Validator.getArrayArgs(this, dst.length, offset);
    return read(DataBuffers.wrap(dst, false).position(offset));
  }

  @Override
  public IntNdArray write(int[] src, int offset) {
    Validator.putArrayArgs(this, src.length, offset);
    return write(DataBuffers.wrap(src, true).position(offset));
  }

  protected IntDenseNdArray(IntDataBuffer buffer, DimensionalSpace dimensions) {
    super(dimensions);
    this.buffer = buffer;
  }

  @Override
  protected IntDataBuffer buffer() {
    return buffer;
  }

  @Override
  protected IntDenseNdArray allocateSlice(long position, DimensionalSpace dimensions) {
    return new IntDenseNdArray(buffer.withPosition(position).slice(), dimensions);
  }

  private IntDataBuffer buffer;
}