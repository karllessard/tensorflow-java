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

package org.tensorflow.nio.nd.impl.dimension;

import java.util.Arrays;
import org.tensorflow.nio.nd.IllegalRankException;
import org.tensorflow.nio.nd.Shape;
import org.tensorflow.nio.nd.index.Index;

public class DimensionalSpace {

  public static DimensionalSpace create(Shape shape) {
    Dimension[] dimensions = new Dimension[shape.numDimensions()];

    // Start from the last dimension, where all elements are continuous
    int lastSegmentedDimensionIdx = -1;
    for (int i = dimensions.length - 1, stride = 1; i >= 0; --i) {
      if (shape.size(i) == Shape.UNKNOWN_SIZE) {
        dimensions[i] = new UnknownDimension();
        if (lastSegmentedDimensionIdx < 0) {
          lastSegmentedDimensionIdx = i;
        }
      } else {
        dimensions[i] = new Axis(shape.size(i), stride);
      }
      stride *= dimensions[i].numElements(); // FIXME what if unknown??
    }
    return new DimensionalSpace(dimensions, lastSegmentedDimensionIdx, shape);
  }

  public DimensionalSpace mapTo(Index[] indices) {
    if (dimensions == null || indices.length > dimensions.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    Dimension[] newDimensions = Arrays.copyOf(dimensions, dimensions.length);
    int newLastSegmentedDimensionIdx = lastSegmentedDimensionIdx;
    for (int i = 0; i < indices.length; ++i) {
      Dimension newDimension = indices[i].apply(dimensions[i]);
      newDimensions[i] = newDimension;
      if (newDimension.isSegmented() && newLastSegmentedDimensionIdx < i) {
        newLastSegmentedDimensionIdx = i;
      }
    }
    return new DimensionalSpace(newDimensions, newLastSegmentedDimensionIdx);
  }

  public DimensionalSpace from(int dimensionStart) {
    if (dimensionStart > dimensions.length) {
      throw new IndexOutOfBoundsException();
    }
    Dimension[] newDimensions = Arrays.copyOfRange(dimensions, dimensionStart, dimensions.length);
    int newLastSegmentedDimensionIdx = -1;
    if (lastSegmentedDimensionIdx >= dimensionStart) {
      newLastSegmentedDimensionIdx = lastSegmentedDimensionIdx - dimensionStart;
    }
    return new DimensionalSpace(newDimensions, newLastSegmentedDimensionIdx);
  }

  public Shape shape() {
    if (shape == null) {
      shape = computeShape(dimensions);
    }
    return shape;
  }

  public int size() {
    return dimensions.length;
  }

  public Dimension get(int i) {
    return dimensions[i];
  }

  public long positionOf(long[] coords, boolean isValue) {
    if (coords.length > shape.numDimensions()) {
      throw new IndexOutOfBoundsException();
    }
    long position = 0L;
    int dimIdx = 0;
    for (long coord : coords) {
      position += dimensions[dimIdx++].positionOf(coord);
      // Fast-forward any remaining dimensions that are a single point
      while (dimIdx < dimensions.length && dimensions[dimIdx].isSinglePoint()) {
        position += dimensions[dimIdx++].position();
      }
    }
    if (isValue && dimIdx < shape.numDimensions()) {
      throw new IllegalRankException("Not a scalar value");
    }
    return position;
  }

  public int getLastSegmentedDimensionIdx() {
    return lastSegmentedDimensionIdx;
  }

  public boolean isSegmented() {
    return lastSegmentedDimensionIdx >= 0;
  }

  /** Succinct description of the shape meant for debugging. */
  @Override
  public String toString() {
    return Arrays.toString(dimensions);
  }

  private DimensionalSpace(Dimension[] dimensions, int lastSegmentedDimensionIdx) {
    this(dimensions, lastSegmentedDimensionIdx, null);
  }

  private DimensionalSpace(Dimension[] dimensions, int lastSegmentedDimensionIdx, Shape shape) {
    this.dimensions = dimensions;
    this.lastSegmentedDimensionIdx = lastSegmentedDimensionIdx;
    this.shape = shape;
  }

  private final Dimension[] dimensions;
  private final int lastSegmentedDimensionIdx;
  private Shape shape;

  private static Shape computeShape(Dimension[] dimensions) {
    long[] shapeDimSizes = new long[dimensions.length];
    int numShapeDims = 0;
    for (Dimension dimension : dimensions) {
      if (!dimension.isSinglePoint()) {
        shapeDimSizes[numShapeDims++] = dimension.numElements();
      }
    }
    // TODO instead of truncating the shape dims, have a different constructor accepting a length
    return Shape.make(Arrays.copyOf(shapeDimSizes, numShapeDims));
  }
}
