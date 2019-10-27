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
import org.tensorflow.nio.buffer.FloatDataBuffer;
import org.tensorflow.nio.nd.FloatNdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dimension.DimensionalSpace;

public class FloatDenseNdArray extends AbstractDenseNdArray<Float, FloatNdArray>
    implements FloatNdArray {

  public static FloatNdArray create(FloatDataBuffer buffer, Shape shape) {
    Validator.denseShape(shape);
    return new FloatDenseNdArray(buffer, DimensionalSpace.create(shape));
  }

  @Override
  public float getFloat(long... indices) {
    return buffer().getFloat(positionOf(indices, true));
  }

  @Override
  public FloatNdArray setFloat(float value, long... indices) {
    buffer().putFloat(positionOf(indices, true), value);
    return this;
  }

  @Override
  public FloatNdArray read(float[] dst, int offset) {
    Validator.getArrayArgs(this, dst.length, offset);
    return read(DataBuffers.wrap(dst, false).position(offset));
  }

  @Override
  public FloatNdArray write(float[] src, int offset) {
    Validator.putArrayArgs(this, src.length, offset);
    return write(DataBuffers.wrap(src, true).position(offset));
  }

  protected FloatDenseNdArray(FloatDataBuffer buffer, DimensionalSpace dimensions) {
    super(buffer, dimensions);
  }

  @Override
  protected FloatDataBuffer buffer() {
    return super.buffer();
  }

  @Override
  FloatDenseNdArray allocate(DataBuffer<Float> buffer, DimensionalSpace dimensions) {
    return new FloatDenseNdArray((FloatDataBuffer)buffer, dimensions);
  }
}