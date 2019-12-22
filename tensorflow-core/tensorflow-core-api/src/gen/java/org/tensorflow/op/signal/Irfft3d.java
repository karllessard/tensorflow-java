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

package org.tensorflow.op.signal;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TFloat;
import org.tensorflow.types.TInt32;

/**
 * Inverse 3D real-valued fast Fourier transform.
 * <p>
 * Computes the inverse 3-dimensional discrete Fourier transform of a real-valued
 * signal over the inner-most 3 dimensions of `input`.
 * <p>
 * The inner-most 3 dimensions of `input` are assumed to be the result of `RFFT3D`:
 * The inner-most dimension contains the `fft_length / 2 + 1` unique components of
 * the DFT of a real-valued signal. If `fft_length` is not provided, it is computed
 * from the size of the inner-most 3 dimensions of `input`. If the FFT length used
 * to compute `input` is odd, it should be provided since it cannot be inferred
 * properly.
 * <p>
 * Along each axis `signal.Irfft3d` is computed on, if `fft_length` (or
 * `fft_length / 2 + 1` for the inner-most dimension) is smaller than the
 * corresponding dimension of `input`, the dimension is cropped. If it is larger,
 * the dimension is padded with zeros.
 */
@Operator(group = "signal")
public final class Irfft3d extends PrimitiveOp implements Operand<TFloat> {
  
  /**
   * Factory method to create a class wrapping a new Irfft3d operation.
   * 
   * @param scope current scope
   * @param input A complex64 tensor.
   * @param fftLength An int32 tensor of shape [3]. The FFT length for each dimension.
   * @return a new instance of Irfft3d
   */
  public static Irfft3d create(Scope scope, Operand<?> input, Operand<TInt32> fftLength) {
    OperationBuilder opBuilder = scope.env().opBuilder("IRFFT3D", scope.makeOpName("Irfft3d"));
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(fftLength.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new Irfft3d(opBuilder.build());
  }
  
  /**
   * A float32 tensor of the same rank as `input`. The inner-most 3
   *   dimensions of `input` are replaced with the `fft_length` samples of their
   *   inverse 3D real Fourier transform.
   * <p>
   * @compatibility(numpy)
   * Equivalent to np.irfftn with 3 dimensions.
   * @end_compatibility
   */
  public Output<TFloat> output() {
    return output;
  }
  
  @Override
  public Output<TFloat> asOutput() {
    return output;
  }
  
  private Output<TFloat> output;
  
  private Irfft3d(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
