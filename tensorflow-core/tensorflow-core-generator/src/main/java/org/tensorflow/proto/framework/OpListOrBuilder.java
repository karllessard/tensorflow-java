/*
  Copyright 2021 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ==============================================================================
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/op_def.proto

package org.tensorflow.proto.framework;

public interface OpListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.OpList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  java.util.List<OpDef>
  getOpList();

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  OpDef getOp(int index);

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  int getOpCount();

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  java.util.List<? extends OpDefOrBuilder>
  getOpOrBuilderList();

  /**
   * <code>repeated .tensorflow.OpDef op = 1;</code>
   */
  OpDefOrBuilder getOpOrBuilder(
      int index);
}
