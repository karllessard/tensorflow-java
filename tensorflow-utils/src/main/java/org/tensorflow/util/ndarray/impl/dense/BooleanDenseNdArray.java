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
package org.tensorflow.util.ndarray.impl.dense;

import org.tensorflow.util.buffer.BooleanDataBuffer;
import org.tensorflow.util.buffer.DataBuffer;
import org.tensorflow.util.buffer.DataBuffers;
import org.tensorflow.util.ndarray.BooleanNdArray;
import org.tensorflow.util.ndarray.NdArray;
import org.tensorflow.util.Shape;
import org.tensorflow.util.ndarray.impl.dimension.DimensionalSpace;

public class BooleanDenseNdArray extends AbstractDenseNdArray<Boolean, BooleanNdArray>
    implements BooleanNdArray {

  public static BooleanNdArray create(BooleanDataBuffer buffer, Shape shape) {
    Validator.denseShape(buffer, shape);
    return new BooleanDenseNdArray(buffer, shape);
  }

  @Override
  public boolean getBoolean(long... indices) {
    return buffer().getBoolean(positionOf(indices, true));
  }

  @Override
  public BooleanNdArray setBoolean(boolean value, long... indices) {
    buffer().setBoolean(value, positionOf(indices, true));
    return this;
  }

  @Override
  public BooleanNdArray read(boolean[] dst, int offset) {
    Validator.getArrayArgs(this, dst.length, offset);
    return read(DataBuffers.wrap(dst, false).offset(offset));
  }

  @Override
  public BooleanNdArray write(boolean[] src, int offset) {
    Validator.putArrayArgs(this, src.length, offset);
    return write(DataBuffers.wrap(src, true).offset(offset));
  }

  @Override
  public BooleanNdArray copyTo(NdArray<Boolean> dst) {
    Validator.copyToNdArrayArgs(this, dst);
    if (dst instanceof BooleanDenseNdArray) {
      BooleanDenseNdArray booleanDst = (BooleanDenseNdArray)dst;
      DataTransfer.execute(buffer, dimensions(), booleanDst.buffer, booleanDst.dimensions(), DataTransfer::ofBoolean);
    } else {
      slowCopyTo(dst);
    }
    return this;
  }

  @Override
  public BooleanNdArray read(BooleanDataBuffer dst) {
    Validator.readToBufferArgs(this, dst);
    DataTransfer.execute(buffer, dimensions(), dst, DataTransfer::ofBoolean);
    return this;
  }

  @Override
  public BooleanNdArray write(BooleanDataBuffer src) {
    Validator.writeFromBufferArgs(this, src);
    DataTransfer.execute(src, buffer, dimensions(), DataTransfer::ofBoolean);
    return this;
  }

  protected BooleanDenseNdArray(BooleanDataBuffer buffer, Shape shape) {
    this(buffer, DimensionalSpace.create(shape));
  }

  @Override
  BooleanDenseNdArray instantiate(DataBuffer<Boolean> buffer, DimensionalSpace dimensions) {
    return new BooleanDenseNdArray((BooleanDataBuffer)buffer, dimensions);
  }

  @Override
  protected BooleanDataBuffer buffer() {
    return buffer;
  }

  private final BooleanDataBuffer buffer;

  private BooleanDenseNdArray(BooleanDataBuffer buffer, DimensionalSpace dimensions) {
    super(dimensions);
    this.buffer = buffer;
  }
}