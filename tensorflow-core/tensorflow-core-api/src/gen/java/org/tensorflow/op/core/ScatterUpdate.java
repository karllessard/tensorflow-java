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
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Applies sparse updates to a variable reference.
 * <p>
 * This operation computes
 * <pre>{@code
 *     # Scalar indices
 *     ref[indices, ...] = updates[...]
 * 
 *     # Vector indices (for each i)
 *     ref[indices[i], ...] = updates[i, ...]
 * 
 *     # High rank indices (for each i, ..., j)
 *     ref[indices[i, ..., j], ...] = updates[i, ..., j, ...]
 * }</pre>
 * This operation outputs `ref` after the update is done.
 * This makes it easier to chain operations that need to use the reset value.
 * <p>
 * If values in `ref` is to be updated more than once, because there are
 * duplicate entries in `indices`, the order at which the updates happen
 * for each value is undefined.
 * <p>
 * Requires `updates.shape = indices.shape + ref.shape[1:]` or `updates.shape = []`.
 * <p>
 * <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 * <img style="width:100%" src="https://www.tensorflow.org/images/ScatterUpdate.png" alt>
 * </div>
 * <p>
 * See also `tf.batch_scatter_update` and `tf.scatter_nd_update`.
 * 
 * @param <T> data type for {@code outputRef()} output
 */
@Operator
public final class ScatterUpdate<T extends TType> extends RawOp implements Operand<T> {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.core.ScatterUpdate}
   */
  public static class Options {
    
    /**
     * @param useLocking If True, the assignment will be protected by a lock;
     * otherwise the behavior is undefined, but may exhibit less contention.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
    
    private Boolean useLocking;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new ScatterUpdate operation.
   * 
   * @param scope current scope
   * @param ref Should be from a `Variable` node.
   * @param indices A tensor of indices into the first dimension of `ref`.
   * @param updates A tensor of updated values to store in `ref`.
   * @param options carries optional attributes values
   * @return a new instance of ScatterUpdate
   */
  @Endpoint(describeByClass = true)
  public static <T extends TType, U extends TNumber> ScatterUpdate<T> create(Scope scope, Operand<T> ref, Operand<U> indices, Operand<T> updates, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("ScatterUpdate", scope.makeOpName("ScatterUpdate"));
    opBuilder.addInput(ref.asOutput(scope));
    opBuilder.addInput(indices.asOutput(scope));
    opBuilder.addInput(updates.asOutput(scope));
    opBuilder = scope.applyControlDependencies(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new ScatterUpdate<T>(opBuilder.build());
  }
  
  /**
   * @param useLocking If True, the assignment will be protected by a lock;
   * otherwise the behavior is undefined, but may exhibit less contention.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }
  
  /**
   * = Same as `ref`.  Returned as a convenience for operations that want
   * to use the updated values after the update is done.
   */
  public Output<T> outputRef() {
    return outputRef;
  }
  
  @Override
  public Output<T> asOutput(Scope scope) {
    return outputRef;
  }
  
  private Output<T> outputRef;
  
  private ScatterUpdate(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputRef = operation.output(outputIdx++);
  }
}
