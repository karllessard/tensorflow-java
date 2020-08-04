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
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TBool;
import org.tensorflow.types.family.TNumber;

/**
 * Returns which elements of x are NaN.
 * <p>
 * @compatibility(numpy)
 * Equivalent to np.isnan
 * @end_compatibility
 * <p>
 * Example:
 * <pre>{@code
 * x = tf.constant([5.0, np.nan, 6.8, np.nan, np.inf])
 * tf.math.is_nan(x) ==> [False, True, False, True, False]
 * }</pre>
 * 
 */
@Operator(group = "math")
public final class IsNan extends RawOp implements Operand<TBool> {
  
  /**
   * Factory method to create a class wrapping a new IsNan operation.
   * 
   * @param scope current scope
   * @param x 
   * @return a new instance of IsNan
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> IsNan create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.env().opBuilder("IsNan", scope.makeOpName("IsNan"));
    opBuilder.addInput(x.asOutput(scope));
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new IsNan(opBuilder.build());
  }
  
  /**
   */
  public Output<TBool> y() {
    return y;
  }
  
  @Override
  public Output<TBool> asOutput(Scope scope) {
    return y;
  }
  
  private Output<TBool> y;
  
  private IsNan(Operation operation) {
    super(operation);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }
}
