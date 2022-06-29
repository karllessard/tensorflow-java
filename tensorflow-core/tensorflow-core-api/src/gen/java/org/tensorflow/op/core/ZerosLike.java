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

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Returns a tensor of zeros with the same shape and type as x.
 *
 * @param <T> data type for {@code y} output
 */
@OpMetadata(
    opType = ZerosLike.OP_NAME,
    inputsClass = ZerosLike.Inputs.class
)
@Operator
public final class ZerosLike<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ZerosLike";

  private Output<T> y;

  public ZerosLike(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new ZerosLike operation.
   *
   * @param scope current scope
   * @param x a tensor of type T.
   * @param <T> data type for {@code ZerosLike} output and operands
   * @return a new instance of ZerosLike
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> ZerosLike<T> create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ZerosLike");
    opBuilder.addInput(x.asOutput());
    return new ZerosLike<>(opBuilder.build());
  }

  /**
   * Gets y.
   * a tensor of the same shape and type as x but filled with zeros.
   * @return y.
   */
  public Output<T> y() {
    return y;
  }

  @Override
  public Output<T> asOutput() {
    return y;
  }

  @OpInputsMetadata(
      outputsClass = ZerosLike.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<ZerosLike<T>> {
    /**
     * a tensor of type T.
     */
    public final Operand<T> x;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new ZerosLike<>(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      x = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
    }
  }
}
