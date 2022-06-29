// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/summary.proto

package org.tensorflow.proto.framework;

public interface HistogramProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.HistogramProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double min = 1;</code>
   */
  double getMin();

  /**
   * <code>double max = 2;</code>
   */
  double getMax();

  /**
   * <code>double num = 3;</code>
   */
  double getNum();

  /**
   * <code>double sum = 4;</code>
   */
  double getSum();

  /**
   * <code>double sum_squares = 5;</code>
   */
  double getSumSquares();

  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  java.util.List<java.lang.Double> getBucketLimitList();
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  int getBucketLimitCount();
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  double getBucketLimit(int index);

  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  java.util.List<java.lang.Double> getBucketList();
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  int getBucketCount();
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  double getBucket(int index);
}
