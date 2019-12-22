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

package org.tensorflow.op.core;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;

/**
 * Constructs a tensor by tiling a given tensor.
 * <p>
 * This operation creates a new tensor by replicating `input` `multiples` times.
 * The output tensor's i'th dimension has `input.dims(i) * multiples[i]` elements,
 * and the values of `input` are replicated `multiples[i]` times along the 'i'th
 * dimension. For example, tiling `[a b c d]` by `[2]` produces
 * `[a b c d a b c d]`.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class Tile<T> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Tile operation.
   * 
   * @param scope current scope
   * @param input 1-D or higher.
   * @param multiples 1-D. Length must be the same as the number of dimensions in `input`
   * @return a new instance of Tile
   */
  public static <T, U extends TNumber> Tile<T> create(Scope scope, Operand<T> input, Operand<U> multiples) {
    OperationBuilder opBuilder = scope.env().opBuilder("Tile", scope.makeOpName("Tile"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(multiples.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Tile<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private Tile(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
