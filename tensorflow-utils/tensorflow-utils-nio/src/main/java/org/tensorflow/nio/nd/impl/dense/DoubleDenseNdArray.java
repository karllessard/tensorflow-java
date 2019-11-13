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
import org.tensorflow.nio.buffer.DoubleDataBuffer;
import org.tensorflow.nio.nd.DoubleNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dense.mutable.DoubleMutableDataBuffer;
import org.tensorflow.nio.nd.impl.dimension.DimensionalSpace;
import org.tensorflow.nio.nd.impl.sequence.NdArrayCursor;

public class DoubleDenseNdArray extends AbstractDenseNdArray<Double, DoubleNdArray>
    implements DoubleNdArray {

  public static DoubleNdArray create(DoubleDataBuffer buffer, Shape shape) {
    Validator.denseShape(buffer, shape);
    return new DoubleDenseNdArray(buffer, shape);
  }

  @Override
  public double getDouble(long... indices) {
    return buffer().getDouble(positionOf(indices, true));
  }

  @Override
  public DoubleNdArray setDouble(double value, long... indices) {
    buffer().putDouble(positionOf(indices, true), value);
    return this;
  }

  @Override
  public DoubleNdArray read(double[] dst, int offset) {
    Validator.getArrayArgs(this, dst.length, offset);
    return read(DataBuffers.wrap(dst, false).offset(offset));
  }

  @Override
  public DoubleNdArray write(double[] src, int offset) {
    Validator.putArrayArgs(this, src.length, offset);
    return write(DataBuffers.wrap(src, true).offset(offset));
  }

  @Override
  public NdArrayCursor<Double, DoubleNdArray> cursor(int dimensionIdx) {
    DoubleDataBuffer mutableBuffer = DoubleMutableDataBuffer.create(buffer());
    DoubleDenseNdArray mutableElement = new DoubleDenseNdArray(mutableBuffer, dimensions().from(dimensionIdx));
    return new DenseNdArrayCursor<>(mutableElement, dimensions());
  }

  protected DoubleDenseNdArray(DoubleDataBuffer buffer, Shape shape) {
    this(buffer, DimensionalSpace.create(shape));
  }

  @Override
  DoubleDenseNdArray allocate(DataBuffer<Double> buffer, DimensionalSpace dimensions) {
    return new DoubleDenseNdArray((DoubleDataBuffer)buffer, dimensions);
  }

  @Override
  protected DoubleDataBuffer buffer() {
    return buffer;
  }

  private final DoubleDataBuffer buffer;

  private DoubleDenseNdArray(DoubleDataBuffer buffer, DimensionalSpace dimensions) {
    super(dimensions);
    this.buffer = buffer;
  }
}