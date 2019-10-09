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
import org.tensorflow.types.TFloat;
import org.tensorflow.types.TString;

/**
 */
@Operator
public final class TensorArrayUnpack extends PrimitiveOp implements Operand<TFloat> {
  
  /**
   * Factory method to create a class wrapping a new TensorArrayUnpack operation.
   * 
   * @param scope current scope
   * @param handle 
   * @param value 
   * @param flowIn 
   * @return a new instance of TensorArrayUnpack
   */
  public static <T> TensorArrayUnpack create(Scope scope, Operand<TString> handle, Operand<T> value, Operand<TFloat> flowIn) {
    OperationBuilder opBuilder = scope.env().opBuilder("TensorArrayUnpack", scope.makeOpName("TensorArrayUnpack"));
    opBuilder.addInput(handle.asOutput());
    opBuilder.addInput(value.asOutput());
    opBuilder.addInput(flowIn.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new TensorArrayUnpack(opBuilder.build());
  }
  
  /**
   */
  public Output<TFloat> flowOut() {
    return flowOut;
  }
  
  @Override
  public Output<TFloat> asOutput() {
    return flowOut;
  }
  
  private Output<TFloat> flowOut;
  
  private TensorArrayUnpack(Operation operation) {
    super(operation);
    int outputIdx = 0;
    flowOut = operation.output(outputIdx++);
  }
}
