/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.sparse;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TInt32;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.family.TNumber;

/**
 * Computes the max of elements across dimensions of a SparseTensor.
 * <p>
 * This Op takes a SparseTensor and is the sparse counterpart to
 * `tf.reduce_max()`.  In contrast to SparseReduceMax, this Op returns a
 * SparseTensor.
 * <p>
 * Reduces `sp_input` along the dimensions given in `reduction_axes`.  Unless
 * `keep_dims` is true, the rank of the tensor is reduced by 1 for each entry in
 * `reduction_axes`. If `keep_dims` is true, the reduced dimensions are retained
 * with length 1.
 * <p>
 * If `reduction_axes` has no entries, all dimensions are reduced, and a tensor
 * with a single element is returned.  Additionally, the axes can be negative,
 * which are interpreted according to the indexing rules in Python.
 * 
 * @param <T> data type for {@code outputValues()} output
 */
@Operator(group = "sparse")
public final class SparseReduceMaxSparse<T extends TNumber> extends RawOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.sparse.SparseReduceMaxSparse}
   */
  public static class Options {
    
    /**
     * @param keepDims If true, retain reduced dimensions with length 1.
     */
    public Options keepDims(Boolean keepDims) {
      this.keepDims = keepDims;
      return this;
    }
    
    private Boolean keepDims;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new SparseReduceMaxSparse operation.
   * 
   * @param scope current scope
   * @param inputIndices 2-D.  `N x R` matrix with the indices of non-empty values in a
   * SparseTensor, possibly not in canonical ordering.
   * @param inputValues 1-D.  `N` non-empty values corresponding to `input_indices`.
   * @param inputShape 1-D.  Shape of the input SparseTensor.
   * @param reductionAxes 1-D.  Length-`K` vector containing the reduction axes.
   * @param options carries optional attributes values
   * @return a new instance of SparseReduceMaxSparse
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> SparseReduceMaxSparse<T> create(Scope scope, Operand<TInt64> inputIndices, Operand<T> inputValues, Operand<TInt64> inputShape, Operand<TInt32> reductionAxes, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("SparseReduceMaxSparse", scope.makeOpName("SparseReduceMaxSparse"));
    opBuilder.addInput(inputIndices.asOutput(scope));
    opBuilder.addInput(inputValues.asOutput(scope));
    opBuilder.addInput(inputShape.asOutput(scope));
    opBuilder.addInput(reductionAxes.asOutput(scope));
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.keepDims != null) {
          opBuilder.setAttr("keep_dims", opts.keepDims);
        }
      }
    }
    return new SparseReduceMaxSparse<T>(opBuilder.build());
  }
  
  /**
   * @param keepDims If true, retain reduced dimensions with length 1.
   */
  public static Options keepDims(Boolean keepDims) {
    return new Options().keepDims(keepDims);
  }
  
  /**
   */
  public Output<TInt64> outputIndices() {
    return outputIndices;
  }
  
  /**
   */
  public Output<T> outputValues() {
    return outputValues;
  }
  
  /**
   */
  public Output<TInt64> outputShape() {
    return outputShape;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "SparseReduceMaxSparse";
  
  private Output<TInt64> outputIndices;
  private Output<T> outputValues;
  private Output<TInt64> outputShape;
  
  private SparseReduceMaxSparse(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputIndices = operation.output(outputIdx++);
    outputValues = operation.output(outputIdx++);
    outputShape = operation.output(outputIdx++);
  }
}
