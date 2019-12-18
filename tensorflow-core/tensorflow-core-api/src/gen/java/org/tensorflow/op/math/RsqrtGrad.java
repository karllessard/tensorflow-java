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

package org.tensorflow.op.math;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.types.family.TType;

/**
 * Computes the gradient for the rsqrt of `x` wrt its input.
 * <p>
 * Specifically, `grad = dy * -0.5 * y^3`, where `y = rsqrt(x)`, and `dy`
 * is the corresponding input gradient.
 * 
 * @param <T> data type for {@code z()} output
 */
public final class RsqrtGrad<T extends TType> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new RsqrtGrad operation.
   * 
   * @param scope current scope
   * @param y 
   * @param dy 
   * @return a new instance of RsqrtGrad
   */
  public static <T extends TType> RsqrtGrad<T> create(Scope scope, Operand<T> y, Operand<T> dy) {
    OperationBuilder opBuilder = scope.env().opBuilder("RsqrtGrad", scope.makeOpName("RsqrtGrad"));
    opBuilder.addInput(y.asOutput());
    opBuilder.addInput(dy.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new RsqrtGrad<T>(opBuilder.build());
  }
  
  /**
   */
  public Output<T> z() {
    return z;
  }
  
  @Override
  public Output<T> asOutput() {
    return z;
  }
  
  private Output<T> z;
  
  private RsqrtGrad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }
}
