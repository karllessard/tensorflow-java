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
package org.tensorflow.nio.nd.index;

import org.tensorflow.nio.nd.impl.shape.Dimension;

/**
 * An index that returns all elements of a dimension in the original order.
 *
 * <p>Applying this index to a given dimension will return the original dimension
 * directly.
 *
 * <p>For example, given a vector with {@code n} elements, {@code all()} returns
 * x<sub>0</sub>, x<sub>1</sub>, ..., x<sub>n-1</sub>
 */
class All implements Index {

  static final All INSTANCE = new All();

  @Override
  public long numElements(Dimension dim) {
    return dim.numElements();
  }

  @Override
  public long mapCoordinate(long coordinate, Dimension dim) {
    return coordinate;
  }

  @Override
  public Dimension apply(Dimension dim) {
    return dim;
  }

  private All() {
  }
}
