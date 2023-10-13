// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/tsl/protobuf/histogram.proto

package org.tensorflow.framework;

public interface HistogramProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.HistogramProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double min = 1;</code>
   * @return The min.
   */
  double getMin();

  /**
   * <code>double max = 2;</code>
   * @return The max.
   */
  double getMax();

  /**
   * <code>double num = 3;</code>
   * @return The num.
   */
  double getNum();

  /**
   * <code>double sum = 4;</code>
   * @return The sum.
   */
  double getSum();

  /**
   * <code>double sum_squares = 5;</code>
   * @return The sumSquares.
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
   * @return A list containing the bucketLimit.
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
   * @return The count of bucketLimit.
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
   * @param index The index of the element to return.
   * @return The bucketLimit at the given index.
   */
  double getBucketLimit(int index);

  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @return A list containing the bucket.
   */
  java.util.List<java.lang.Double> getBucketList();
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @return The count of bucket.
   */
  int getBucketCount();
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The bucket at the given index.
   */
  double getBucket(int index);
}
