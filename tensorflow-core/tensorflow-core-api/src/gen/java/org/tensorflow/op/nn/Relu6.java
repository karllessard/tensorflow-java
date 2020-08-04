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

package org.tensorflow.op.nn;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;

/**
 * Computes rectified linear 6: `min(max(features, 0), 6)`.
 * 
 * @param <T> data type for {@code activations()} output
 */
@Operator(group = "nn")
public final class Relu6<T extends TNumber> extends RawOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new Relu6 operation.
   * 
   * @param scope current scope
   * @param features 
   * @return a new instance of Relu6
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> Relu6<T> create(Scope scope, Operand<T> features) {
    OperationBuilder opBuilder = scope.env().opBuilder("Relu6", scope.makeOpName("Relu6"));
    opBuilder.addInput(features.asOutput(scope));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Relu6<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> activations() {
    return activations;
  }
  
  @Override
  public Output<T> asOutput(Scope scope) {
    return activations;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "Relu6";
  
  private Output<T> activations;
  
  private Relu6(Operation operation) {
    super(operation);
    int outputIdx = 0;
    activations = operation.output(outputIdx++);
  }
}
