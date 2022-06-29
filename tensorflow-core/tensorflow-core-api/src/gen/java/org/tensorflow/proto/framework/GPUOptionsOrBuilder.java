// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/config.proto

package org.tensorflow.proto.framework;

public interface GPUOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GPUOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Fraction of the available GPU memory to allocate for each process.
   * 1 means to allocate all of the GPU memory, 0.5 means the process
   * allocates up to ~50% of the available GPU memory.
   * GPU memory is pre-allocated unless the allow_growth option is enabled.
   * If greater than 1.0, uses CUDA unified memory to potentially oversubscribe
   * the amount of memory available on the GPU device by using host memory as a
   * swap space. Accessing memory not available on the device will be
   * significantly slower as that would require memory transfer between the host
   * and the device. Options to reduce the memory requirement should be
   * considered before enabling this option as this may come with a negative
   * performance impact. Oversubscription using the unified memory requires
   * Pascal class or newer GPUs and it is currently only supported on the Linux
   * operating system. See
   * https://docs.nvidia.com/cuda/cuda-c-programming-guide/index.html#um-requirements
   * for the detailed requirements.
   * </pre>
   *
   * <code>double per_process_gpu_memory_fraction = 1;</code>
   */
  double getPerProcessGpuMemoryFraction();

  /**
   * <pre>
   * If true, the allocator does not pre-allocate the entire specified
   * GPU memory region, instead starting small and growing as needed.
   * </pre>
   *
   * <code>bool allow_growth = 4;</code>
   */
  boolean getAllowGrowth();

  /**
   * <pre>
   * The type of GPU allocation strategy to use.
   * Allowed values:
   * "": The empty string (default) uses a system-chosen default
   *     which may change over time.
   * "BFC": A "Best-fit with coalescing" algorithm, simplified from a
   *        version of dlmalloc.
   * </pre>
   *
   * <code>string allocator_type = 2;</code>
   */
  java.lang.String getAllocatorType();
  /**
   * <pre>
   * The type of GPU allocation strategy to use.
   * Allowed values:
   * "": The empty string (default) uses a system-chosen default
   *     which may change over time.
   * "BFC": A "Best-fit with coalescing" algorithm, simplified from a
   *        version of dlmalloc.
   * </pre>
   *
   * <code>string allocator_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getAllocatorTypeBytes();

  /**
   * <pre>
   * Delay deletion of up to this many bytes to reduce the number of
   * interactions with gpu driver code.  If 0, the system chooses
   * a reasonable default (several MBs).
   * </pre>
   *
   * <code>int64 deferred_deletion_bytes = 3;</code>
   */
  long getDeferredDeletionBytes();

  /**
   * <pre>
   * A comma-separated list of GPU ids that determines the 'visible'
   * to 'virtual' mapping of GPU devices.  For example, if TensorFlow
   * can see 8 GPU devices in the process, and one wanted to map
   * visible GPU devices 5 and 3 as "/device:GPU:0", and "/device:GPU:1",
   * then one would specify this field as "5,3".  This field is similar in
   * spirit to the CUDA_VISIBLE_DEVICES environment variable, except
   * it applies to the visible GPU devices in the process.
   * NOTE:
   * 1. The GPU driver provides the process with the visible GPUs
   *    in an order which is not guaranteed to have any correlation to
   *    the *physical* GPU id in the machine.  This field is used for
   *    remapping "visible" to "virtual", which means this operates only
   *    after the process starts.  Users are required to use vendor
   *    specific mechanisms (e.g., CUDA_VISIBLE_DEVICES) to control the
   *    physical to visible device mapping prior to invoking TensorFlow.
   * 2. In the code, the ids in this list are also called "platform GPU id"s,
   *    and the 'virtual' ids of GPU devices (i.e. the ids in the device
   *    name "/device:GPU:&lt;id&gt;") are also called "TF GPU id"s. Please
   *    refer to third_party/tensorflow/core/common_runtime/gpu/gpu_id.h
   *    for more information.
   * </pre>
   *
   * <code>string visible_device_list = 5;</code>
   */
  java.lang.String getVisibleDeviceList();
  /**
   * <pre>
   * A comma-separated list of GPU ids that determines the 'visible'
   * to 'virtual' mapping of GPU devices.  For example, if TensorFlow
   * can see 8 GPU devices in the process, and one wanted to map
   * visible GPU devices 5 and 3 as "/device:GPU:0", and "/device:GPU:1",
   * then one would specify this field as "5,3".  This field is similar in
   * spirit to the CUDA_VISIBLE_DEVICES environment variable, except
   * it applies to the visible GPU devices in the process.
   * NOTE:
   * 1. The GPU driver provides the process with the visible GPUs
   *    in an order which is not guaranteed to have any correlation to
   *    the *physical* GPU id in the machine.  This field is used for
   *    remapping "visible" to "virtual", which means this operates only
   *    after the process starts.  Users are required to use vendor
   *    specific mechanisms (e.g., CUDA_VISIBLE_DEVICES) to control the
   *    physical to visible device mapping prior to invoking TensorFlow.
   * 2. In the code, the ids in this list are also called "platform GPU id"s,
   *    and the 'virtual' ids of GPU devices (i.e. the ids in the device
   *    name "/device:GPU:&lt;id&gt;") are also called "TF GPU id"s. Please
   *    refer to third_party/tensorflow/core/common_runtime/gpu/gpu_id.h
   *    for more information.
   * </pre>
   *
   * <code>string visible_device_list = 5;</code>
   */
  com.google.protobuf.ByteString
      getVisibleDeviceListBytes();

  /**
   * <pre>
   * In the event polling loop sleep this many microseconds between
   * PollEvents calls, when the queue is not empty.  If value is not
   * set or set to 0, gets set to a non-zero default.
   * </pre>
   *
   * <code>int32 polling_active_delay_usecs = 6;</code>
   */
  int getPollingActiveDelayUsecs();

  /**
   * <pre>
   * This field is deprecated and ignored.
   * </pre>
   *
   * <code>int32 polling_inactive_delay_msecs = 7;</code>
   */
  int getPollingInactiveDelayMsecs();

  /**
   * <pre>
   * Force all tensors to be gpu_compatible. On a GPU-enabled TensorFlow,
   * enabling this option forces all CPU tensors to be allocated with Cuda
   * pinned memory. Normally, TensorFlow will infer which tensors should be
   * allocated as the pinned memory. But in case where the inference is
   * incomplete, this option can significantly speed up the cross-device memory
   * copy performance as long as it fits the memory.
   * Note that this option is not something that should be
   * enabled by default for unknown or very large models, since all Cuda pinned
   * memory is unpageable, having too much pinned memory might negatively impact
   * the overall host system performance.
   * </pre>
   *
   * <code>bool force_gpu_compatible = 8;</code>
   */
  boolean getForceGpuCompatible();

  /**
   * <pre>
   * Everything inside experimental is subject to change and is not subject
   * to API stability guarantees in
   * https://www.tensorflow.org/guide/version_compat.
   * </pre>
   *
   * <code>.tensorflow.GPUOptions.Experimental experimental = 9;</code>
   */
  boolean hasExperimental();
  /**
   * <pre>
   * Everything inside experimental is subject to change and is not subject
   * to API stability guarantees in
   * https://www.tensorflow.org/guide/version_compat.
   * </pre>
   *
   * <code>.tensorflow.GPUOptions.Experimental experimental = 9;</code>
   */
  org.tensorflow.proto.framework.GPUOptions.Experimental getExperimental();
  /**
   * <pre>
   * Everything inside experimental is subject to change and is not subject
   * to API stability guarantees in
   * https://www.tensorflow.org/guide/version_compat.
   * </pre>
   *
   * <code>.tensorflow.GPUOptions.Experimental experimental = 9;</code>
   */
  org.tensorflow.proto.framework.GPUOptions.ExperimentalOrBuilder getExperimentalOrBuilder();
}
