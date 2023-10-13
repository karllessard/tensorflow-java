// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/tsl/protobuf/test_log.proto

package org.tensorflow.util.testlog;

/**
 * Protobuf type {@code tensorflow.CPUInfo}
 */
public final class CPUInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CPUInfo)
    CPUInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CPUInfo.newBuilder() to construct.
  private CPUInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CPUInfo() {
    cpuInfo_ = "";
    cpuGovernor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CPUInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 6:
        return internalGetCacheSize();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.testlog.CPUInfo.class, org.tensorflow.util.testlog.CPUInfo.Builder.class);
  }

  public static final int NUM_CORES_FIELD_NUMBER = 1;
  private long numCores_;
  /**
   * <code>int64 num_cores = 1;</code>
   * @return The numCores.
   */
  @java.lang.Override
  public long getNumCores() {
    return numCores_;
  }

  public static final int NUM_CORES_ALLOWED_FIELD_NUMBER = 2;
  private long numCoresAllowed_;
  /**
   * <code>int64 num_cores_allowed = 2;</code>
   * @return The numCoresAllowed.
   */
  @java.lang.Override
  public long getNumCoresAllowed() {
    return numCoresAllowed_;
  }

  public static final int MHZ_PER_CPU_FIELD_NUMBER = 3;
  private double mhzPerCpu_;
  /**
   * <pre>
   * How fast are these cpus?
   * </pre>
   *
   * <code>double mhz_per_cpu = 3;</code>
   * @return The mhzPerCpu.
   */
  @java.lang.Override
  public double getMhzPerCpu() {
    return mhzPerCpu_;
  }

  public static final int CPU_INFO_FIELD_NUMBER = 4;
  private volatile java.lang.Object cpuInfo_;
  /**
   * <pre>
   * Additional cpu information. For example,
   * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
   * </pre>
   *
   * <code>string cpu_info = 4;</code>
   * @return The cpuInfo.
   */
  @java.lang.Override
  public java.lang.String getCpuInfo() {
    java.lang.Object ref = cpuInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpuInfo_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Additional cpu information. For example,
   * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
   * </pre>
   *
   * <code>string cpu_info = 4;</code>
   * @return The bytes for cpuInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCpuInfoBytes() {
    java.lang.Object ref = cpuInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cpuInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CPU_GOVERNOR_FIELD_NUMBER = 5;
  private volatile java.lang.Object cpuGovernor_;
  /**
   * <pre>
   * What kind of cpu scaling is enabled on the host.
   * Examples include "performance", "ondemand", "conservative", "mixed".
   * </pre>
   *
   * <code>string cpu_governor = 5;</code>
   * @return The cpuGovernor.
   */
  @java.lang.Override
  public java.lang.String getCpuGovernor() {
    java.lang.Object ref = cpuGovernor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpuGovernor_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * What kind of cpu scaling is enabled on the host.
   * Examples include "performance", "ondemand", "conservative", "mixed".
   * </pre>
   *
   * <code>string cpu_governor = 5;</code>
   * @return The bytes for cpuGovernor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCpuGovernorBytes() {
    java.lang.Object ref = cpuGovernor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cpuGovernor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CACHE_SIZE_FIELD_NUMBER = 6;
  private static final class CacheSizeDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_CacheSizeEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> cacheSize_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetCacheSize() {
    if (cacheSize_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CacheSizeDefaultEntryHolder.defaultEntry);
    }
    return cacheSize_;
  }

  public int getCacheSizeCount() {
    return internalGetCacheSize().getMap().size();
  }
  /**
   * <pre>
   * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cache_size = 6;</code>
   */

  @java.lang.Override
  public boolean containsCacheSize(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCacheSize().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCacheSizeMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getCacheSize() {
    return getCacheSizeMap();
  }
  /**
   * <pre>
   * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cache_size = 6;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Long> getCacheSizeMap() {
    return internalGetCacheSize().getMap();
  }
  /**
   * <pre>
   * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cache_size = 6;</code>
   */
  @java.lang.Override

  public long getCacheSizeOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetCacheSize().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cache_size = 6;</code>
   */
  @java.lang.Override

  public long getCacheSizeOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetCacheSize().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (numCores_ != 0L) {
      output.writeInt64(1, numCores_);
    }
    if (numCoresAllowed_ != 0L) {
      output.writeInt64(2, numCoresAllowed_);
    }
    if (java.lang.Double.doubleToRawLongBits(mhzPerCpu_) != 0) {
      output.writeDouble(3, mhzPerCpu_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuInfo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cpuInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuGovernor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, cpuGovernor_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCacheSize(),
        CacheSizeDefaultEntryHolder.defaultEntry,
        6);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numCores_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numCores_);
    }
    if (numCoresAllowed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, numCoresAllowed_);
    }
    if (java.lang.Double.doubleToRawLongBits(mhzPerCpu_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, mhzPerCpu_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuInfo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cpuInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpuGovernor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, cpuGovernor_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetCacheSize().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      cacheSize__ = CacheSizeDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, cacheSize__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.util.testlog.CPUInfo)) {
      return super.equals(obj);
    }
    org.tensorflow.util.testlog.CPUInfo other = (org.tensorflow.util.testlog.CPUInfo) obj;

    if (getNumCores()
        != other.getNumCores()) return false;
    if (getNumCoresAllowed()
        != other.getNumCoresAllowed()) return false;
    if (java.lang.Double.doubleToLongBits(getMhzPerCpu())
        != java.lang.Double.doubleToLongBits(
            other.getMhzPerCpu())) return false;
    if (!getCpuInfo()
        .equals(other.getCpuInfo())) return false;
    if (!getCpuGovernor()
        .equals(other.getCpuGovernor())) return false;
    if (!internalGetCacheSize().equals(
        other.internalGetCacheSize())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM_CORES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCores());
    hash = (37 * hash) + NUM_CORES_ALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCoresAllowed());
    hash = (37 * hash) + MHZ_PER_CPU_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMhzPerCpu()));
    hash = (37 * hash) + CPU_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getCpuInfo().hashCode();
    hash = (37 * hash) + CPU_GOVERNOR_FIELD_NUMBER;
    hash = (53 * hash) + getCpuGovernor().hashCode();
    if (!internalGetCacheSize().getMap().isEmpty()) {
      hash = (37 * hash) + CACHE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCacheSize().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.testlog.CPUInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.util.testlog.CPUInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.CPUInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CPUInfo)
      org.tensorflow.util.testlog.CPUInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetCacheSize();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetMutableCacheSize();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.testlog.CPUInfo.class, org.tensorflow.util.testlog.CPUInfo.Builder.class);
    }

    // Construct using org.tensorflow.util.testlog.CPUInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      numCores_ = 0L;

      numCoresAllowed_ = 0L;

      mhzPerCpu_ = 0D;

      cpuInfo_ = "";

      cpuGovernor_ = "";

      internalGetMutableCacheSize().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.testlog.TestLogProtos.internal_static_tensorflow_CPUInfo_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.testlog.CPUInfo getDefaultInstanceForType() {
      return org.tensorflow.util.testlog.CPUInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.testlog.CPUInfo build() {
      org.tensorflow.util.testlog.CPUInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.testlog.CPUInfo buildPartial() {
      org.tensorflow.util.testlog.CPUInfo result = new org.tensorflow.util.testlog.CPUInfo(this);
      int from_bitField0_ = bitField0_;
      result.numCores_ = numCores_;
      result.numCoresAllowed_ = numCoresAllowed_;
      result.mhzPerCpu_ = mhzPerCpu_;
      result.cpuInfo_ = cpuInfo_;
      result.cpuGovernor_ = cpuGovernor_;
      result.cacheSize_ = internalGetCacheSize();
      result.cacheSize_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.util.testlog.CPUInfo) {
        return mergeFrom((org.tensorflow.util.testlog.CPUInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.testlog.CPUInfo other) {
      if (other == org.tensorflow.util.testlog.CPUInfo.getDefaultInstance()) return this;
      if (other.getNumCores() != 0L) {
        setNumCores(other.getNumCores());
      }
      if (other.getNumCoresAllowed() != 0L) {
        setNumCoresAllowed(other.getNumCoresAllowed());
      }
      if (other.getMhzPerCpu() != 0D) {
        setMhzPerCpu(other.getMhzPerCpu());
      }
      if (!other.getCpuInfo().isEmpty()) {
        cpuInfo_ = other.cpuInfo_;
        onChanged();
      }
      if (!other.getCpuGovernor().isEmpty()) {
        cpuGovernor_ = other.cpuGovernor_;
        onChanged();
      }
      internalGetMutableCacheSize().mergeFrom(
          other.internalGetCacheSize());
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              numCores_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              numCoresAllowed_ = input.readInt64();

              break;
            } // case 16
            case 25: {
              mhzPerCpu_ = input.readDouble();

              break;
            } // case 25
            case 34: {
              cpuInfo_ = input.readStringRequireUtf8();

              break;
            } // case 34
            case 42: {
              cpuGovernor_ = input.readStringRequireUtf8();

              break;
            } // case 42
            case 50: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              cacheSize__ = input.readMessage(
                  CacheSizeDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCacheSize().getMutableMap().put(
                  cacheSize__.getKey(), cacheSize__.getValue());
              break;
            } // case 50
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long numCores_ ;
    /**
     * <code>int64 num_cores = 1;</code>
     * @return The numCores.
     */
    @java.lang.Override
    public long getNumCores() {
      return numCores_;
    }
    /**
     * <code>int64 num_cores = 1;</code>
     * @param value The numCores to set.
     * @return This builder for chaining.
     */
    public Builder setNumCores(long value) {
      
      numCores_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_cores = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumCores() {
      
      numCores_ = 0L;
      onChanged();
      return this;
    }

    private long numCoresAllowed_ ;
    /**
     * <code>int64 num_cores_allowed = 2;</code>
     * @return The numCoresAllowed.
     */
    @java.lang.Override
    public long getNumCoresAllowed() {
      return numCoresAllowed_;
    }
    /**
     * <code>int64 num_cores_allowed = 2;</code>
     * @param value The numCoresAllowed to set.
     * @return This builder for chaining.
     */
    public Builder setNumCoresAllowed(long value) {
      
      numCoresAllowed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_cores_allowed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumCoresAllowed() {
      
      numCoresAllowed_ = 0L;
      onChanged();
      return this;
    }

    private double mhzPerCpu_ ;
    /**
     * <pre>
     * How fast are these cpus?
     * </pre>
     *
     * <code>double mhz_per_cpu = 3;</code>
     * @return The mhzPerCpu.
     */
    @java.lang.Override
    public double getMhzPerCpu() {
      return mhzPerCpu_;
    }
    /**
     * <pre>
     * How fast are these cpus?
     * </pre>
     *
     * <code>double mhz_per_cpu = 3;</code>
     * @param value The mhzPerCpu to set.
     * @return This builder for chaining.
     */
    public Builder setMhzPerCpu(double value) {
      
      mhzPerCpu_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * How fast are these cpus?
     * </pre>
     *
     * <code>double mhz_per_cpu = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMhzPerCpu() {
      
      mhzPerCpu_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object cpuInfo_ = "";
    /**
     * <pre>
     * Additional cpu information. For example,
     * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
     * </pre>
     *
     * <code>string cpu_info = 4;</code>
     * @return The cpuInfo.
     */
    public java.lang.String getCpuInfo() {
      java.lang.Object ref = cpuInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpuInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Additional cpu information. For example,
     * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
     * </pre>
     *
     * <code>string cpu_info = 4;</code>
     * @return The bytes for cpuInfo.
     */
    public com.google.protobuf.ByteString
        getCpuInfoBytes() {
      java.lang.Object ref = cpuInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cpuInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Additional cpu information. For example,
     * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
     * </pre>
     *
     * <code>string cpu_info = 4;</code>
     * @param value The cpuInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCpuInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cpuInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional cpu information. For example,
     * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
     * </pre>
     *
     * <code>string cpu_info = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpuInfo() {
      
      cpuInfo_ = getDefaultInstance().getCpuInfo();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Additional cpu information. For example,
     * Intel Ivybridge with HyperThreading (24 cores) dL1:32KB dL2:256KB dL3:30MB
     * </pre>
     *
     * <code>string cpu_info = 4;</code>
     * @param value The bytes for cpuInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCpuInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cpuInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cpuGovernor_ = "";
    /**
     * <pre>
     * What kind of cpu scaling is enabled on the host.
     * Examples include "performance", "ondemand", "conservative", "mixed".
     * </pre>
     *
     * <code>string cpu_governor = 5;</code>
     * @return The cpuGovernor.
     */
    public java.lang.String getCpuGovernor() {
      java.lang.Object ref = cpuGovernor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpuGovernor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * What kind of cpu scaling is enabled on the host.
     * Examples include "performance", "ondemand", "conservative", "mixed".
     * </pre>
     *
     * <code>string cpu_governor = 5;</code>
     * @return The bytes for cpuGovernor.
     */
    public com.google.protobuf.ByteString
        getCpuGovernorBytes() {
      java.lang.Object ref = cpuGovernor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cpuGovernor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * What kind of cpu scaling is enabled on the host.
     * Examples include "performance", "ondemand", "conservative", "mixed".
     * </pre>
     *
     * <code>string cpu_governor = 5;</code>
     * @param value The cpuGovernor to set.
     * @return This builder for chaining.
     */
    public Builder setCpuGovernor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cpuGovernor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What kind of cpu scaling is enabled on the host.
     * Examples include "performance", "ondemand", "conservative", "mixed".
     * </pre>
     *
     * <code>string cpu_governor = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCpuGovernor() {
      
      cpuGovernor_ = getDefaultInstance().getCpuGovernor();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * What kind of cpu scaling is enabled on the host.
     * Examples include "performance", "ondemand", "conservative", "mixed".
     * </pre>
     *
     * <code>string cpu_governor = 5;</code>
     * @param value The bytes for cpuGovernor to set.
     * @return This builder for chaining.
     */
    public Builder setCpuGovernorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cpuGovernor_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> cacheSize_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetCacheSize() {
      if (cacheSize_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CacheSizeDefaultEntryHolder.defaultEntry);
      }
      return cacheSize_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableCacheSize() {
      onChanged();;
      if (cacheSize_ == null) {
        cacheSize_ = com.google.protobuf.MapField.newMapField(
            CacheSizeDefaultEntryHolder.defaultEntry);
      }
      if (!cacheSize_.isMutable()) {
        cacheSize_ = cacheSize_.copy();
      }
      return cacheSize_;
    }

    public int getCacheSizeCount() {
      return internalGetCacheSize().getMap().size();
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */

    @java.lang.Override
    public boolean containsCacheSize(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCacheSize().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCacheSizeMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getCacheSize() {
      return getCacheSizeMap();
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Long> getCacheSizeMap() {
      return internalGetCacheSize().getMap();
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */
    @java.lang.Override

    public long getCacheSizeOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetCacheSize().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */
    @java.lang.Override

    public long getCacheSizeOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetCacheSize().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCacheSize() {
      internalGetMutableCacheSize().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */

    public Builder removeCacheSize(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCacheSize().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableCacheSize() {
      return internalGetMutableCacheSize().getMutableMap();
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */
    public Builder putCacheSize(
        java.lang.String key,
        long value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableCacheSize().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Cache sizes (in bytes), e.g. "L2": 262144 (for 256KB)
     * </pre>
     *
     * <code>map&lt;string, int64&gt; cache_size = 6;</code>
     */

    public Builder putAllCacheSize(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableCacheSize().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.CPUInfo)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CPUInfo)
  private static final org.tensorflow.util.testlog.CPUInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.testlog.CPUInfo();
  }

  public static org.tensorflow.util.testlog.CPUInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CPUInfo>
      PARSER = new com.google.protobuf.AbstractParser<CPUInfo>() {
    @java.lang.Override
    public CPUInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CPUInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CPUInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.testlog.CPUInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

