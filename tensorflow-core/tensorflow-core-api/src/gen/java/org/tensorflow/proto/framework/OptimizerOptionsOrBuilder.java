// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.proto.framework;

public interface OptimizerOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.OptimizerOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, optimize the graph using common subexpression elimination.
   * Note: the optimization Level L1 will override this setting to true. So in
   * order to disable common subexpression elimination the opt_level has to be
   * set to L0.
   * </pre>
   *
   * <code>bool do_common_subexpression_elimination = 1;</code>
   */
  boolean getDoCommonSubexpressionElimination();

  /**
   * <pre>
   * If true, perform constant folding optimization on the graph.
   * Note: the optimization Level L1 will override this setting to true. So in
   * order to disable constant folding the opt_level has to be set to L0.
   * </pre>
   *
   * <code>bool do_constant_folding = 2;</code>
   */
  boolean getDoConstantFolding();

  /**
   * <pre>
   * Constant folding optimization replaces tensors whose values can be
   * predetermined, with constant nodes. To avoid inserting too large constants,
   * the size of each constant created can be limited. If this value is zero, a
   * default limit of 10 MiB will be applied. If constant folding optimization
   * is disabled, this value is ignored.
   * </pre>
   *
   * <code>int64 max_folded_constant_in_bytes = 6;</code>
   */
  long getMaxFoldedConstantInBytes();

  /**
   * <pre>
   * If true, perform function inlining on the graph.
   * </pre>
   *
   * <code>bool do_function_inlining = 4;</code>
   */
  boolean getDoFunctionInlining();

  /**
   * <pre>
   * Overall optimization level. The actual optimizations applied will be the
   * logical OR of the flags that this level implies and any flags already set.
   * </pre>
   *
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  int getOptLevelValue();
  /**
   * <pre>
   * Overall optimization level. The actual optimizations applied will be the
   * logical OR of the flags that this level implies and any flags already set.
   * </pre>
   *
   * <code>.tensorflow.OptimizerOptions.Level opt_level = 3;</code>
   */
  org.tensorflow.proto.framework.OptimizerOptions.Level getOptLevel();

  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  int getGlobalJitLevelValue();
  /**
   * <code>.tensorflow.OptimizerOptions.GlobalJitLevel global_jit_level = 5;</code>
   */
  org.tensorflow.proto.framework.OptimizerOptions.GlobalJitLevel getGlobalJitLevel();

  /**
   * <pre>
   * CPU code will be autoclustered only if global_jit_level &gt;= ON_1 and either:
   *  - this flag is true, or
   *  - TF_XLA_FLAGS contains --tf_xla_cpu_global_jit=true.
   * </pre>
   *
   * <code>bool cpu_global_jit = 7;</code>
   */
  boolean getCpuGlobalJit();
}
