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
import org.tensorflow.nio.nd.NdArray;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.impl.dimension.DimensionalSpace;
import org.tensorflow.nio.nd.impl.sequence.NdArrayCursor;

public class DenseNdArray<T> extends AbstractDenseNdArray<T, NdArray<T>> {

  public static <T> NdArray<T> wrap(DataBuffer<T> buffer, Shape shape) {
    Validator.denseShape(buffer, shape);
    return new DenseNdArray<>(buffer, shape);
  }

  protected DenseNdArray(DataBuffer<T> buffer, Shape shape) {
    this(buffer, DimensionalSpace.create(shape));
  }

  @Override
  DenseNdArray<T> allocate(DataBuffer<T> buffer, DimensionalSpace dimensions) {
    return new DenseNdArray<>(buffer, dimensions);
  }

  @Override
  DataBuffer<T> buffer() {
    return buffer;
  }

  private final DataBuffer<T> buffer;

  private DenseNdArray(DataBuffer<T> buffer, DimensionalSpace dimensions) {
    super(dimensions);
    this.buffer = buffer;
  }

  @Override
  public NdArrayCursor<T, NdArray<T>> cursor(int dimensionIdx) {
    return null;
  }
}