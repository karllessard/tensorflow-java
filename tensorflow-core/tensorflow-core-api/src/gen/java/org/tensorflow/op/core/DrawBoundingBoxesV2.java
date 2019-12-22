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
import org.tensorflow.types.family.TNumber;

/**
 * Draw bounding boxes on a batch of images.
 * <p>
 * Outputs a copy of `images` but draws on top of the pixels zero or more bounding
 * boxes specified by the locations in `boxes`. The coordinates of the each
 * bounding box in `boxes` are encoded as `[y_min, x_min, y_max, x_max]`. The
 * bounding box coordinates are floats in `[0.0, 1.0]` relative to the width and
 * height of the underlying image.
 * <p>
 * For example, if an image is 100 x 200 pixels (height x width) and the bounding
 * box is `[0.1, 0.2, 0.5, 0.9]`, the upper-left and bottom-right coordinates of
 * the bounding box will be `(40, 10)` to `(100, 50)` (in (x,y) coordinates).
 * <p>
 * Parts of the bounding box may fall outside the image.
 * 
 * @param <T> data type for {@code output()} output
 */
@Operator
public final class DrawBoundingBoxesV2<T extends TNumber> extends PrimitiveOp implements Operand<T> {
  
  /**
   * Factory method to create a class wrapping a new DrawBoundingBoxesV2 operation.
   * 
   * @param scope current scope
   * @param images 4-D with shape `[batch, height, width, depth]`. A batch of images.
   * @param boxes 3-D with shape `[batch, num_bounding_boxes, 4]` containing bounding
   * boxes.
   * @param colors 2-D. A list of RGBA colors to cycle through for the boxes.
   * @return a new instance of DrawBoundingBoxesV2
   */
  public static <T extends TNumber> DrawBoundingBoxesV2<T> create(Scope scope, Operand<T> images, Operand<TFloat> boxes, Operand<TFloat> colors) {
    OperationBuilder opBuilder = scope.env().opBuilder("DrawBoundingBoxesV2", scope.makeOpName("DrawBoundingBoxesV2"));
    opBuilder.addInput(images.asOutput());
    opBuilder.addInput(boxes.asOutput());
    opBuilder.addInput(colors.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new DrawBoundingBoxesV2<T>(opBuilder.build());
  }
  
  /**
   * 4-D with the same shape as `images`. The batch of input images with
   * bounding boxes drawn on the images.
   */
  public Output<T> output() {
    return output;
  }
  
  @Override
  public Output<T> asOutput() {
    return output;
  }
  
  private Output<T> output;
  
  private DrawBoundingBoxesV2(Operation operation) {
    super(operation);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }
}
