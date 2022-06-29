// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

/**
 * <pre>
 * next: 3
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.DistributeOptions}
 */
public  final class DistributeOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.DistributeOptions)
    DistributeOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DistributeOptions.newBuilder() to construct.
  private DistributeOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DistributeOptions() {
    autoShardPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DistributeOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DistributeOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            autoShardPolicy_ = rawValue;
            break;
          }
          case 16: {
            optionalNumDevicesCase_ = 2;
            optionalNumDevices_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_DistributeOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_DistributeOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.data.DistributeOptions.class, org.tensorflow.proto.data.DistributeOptions.Builder.class);
  }

  private int optionalNumDevicesCase_ = 0;
  private java.lang.Object optionalNumDevices_;
  public enum OptionalNumDevicesCase
      implements com.google.protobuf.Internal.EnumLite {
    NUM_DEVICES(2),
    OPTIONALNUMDEVICES_NOT_SET(0);
    private final int value;
    private OptionalNumDevicesCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalNumDevicesCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalNumDevicesCase forNumber(int value) {
      switch (value) {
        case 2: return NUM_DEVICES;
        case 0: return OPTIONALNUMDEVICES_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalNumDevicesCase
  getOptionalNumDevicesCase() {
    return OptionalNumDevicesCase.forNumber(
        optionalNumDevicesCase_);
  }

  public static final int AUTO_SHARD_POLICY_FIELD_NUMBER = 1;
  private int autoShardPolicy_;
  /**
   * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
   */
  public int getAutoShardPolicyValue() {
    return autoShardPolicy_;
  }
  /**
   * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
   */
  public org.tensorflow.proto.data.AutoShardPolicy getAutoShardPolicy() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.data.AutoShardPolicy result = org.tensorflow.proto.data.AutoShardPolicy.valueOf(autoShardPolicy_);
    return result == null ? org.tensorflow.proto.data.AutoShardPolicy.UNRECOGNIZED : result;
  }

  public static final int NUM_DEVICES_FIELD_NUMBER = 2;
  /**
   * <code>int32 num_devices = 2;</code>
   */
  public int getNumDevices() {
    if (optionalNumDevicesCase_ == 2) {
      return (java.lang.Integer) optionalNumDevices_;
    }
    return 0;
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
    if (autoShardPolicy_ != org.tensorflow.proto.data.AutoShardPolicy.AUTO.getNumber()) {
      output.writeEnum(1, autoShardPolicy_);
    }
    if (optionalNumDevicesCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) optionalNumDevices_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoShardPolicy_ != org.tensorflow.proto.data.AutoShardPolicy.AUTO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, autoShardPolicy_);
    }
    if (optionalNumDevicesCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) optionalNumDevices_));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.data.DistributeOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.data.DistributeOptions other = (org.tensorflow.proto.data.DistributeOptions) obj;

    if (autoShardPolicy_ != other.autoShardPolicy_) return false;
    if (!getOptionalNumDevicesCase().equals(other.getOptionalNumDevicesCase())) return false;
    switch (optionalNumDevicesCase_) {
      case 2:
        if (getNumDevices()
            != other.getNumDevices()) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUTO_SHARD_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + autoShardPolicy_;
    switch (optionalNumDevicesCase_) {
      case 2:
        hash = (37 * hash) + NUM_DEVICES_FIELD_NUMBER;
        hash = (53 * hash) + getNumDevices();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.DistributeOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.data.DistributeOptions prototype) {
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
   * <pre>
   * next: 3
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.DistributeOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.DistributeOptions)
      org.tensorflow.proto.data.DistributeOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_DistributeOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_DistributeOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.DistributeOptions.class, org.tensorflow.proto.data.DistributeOptions.Builder.class);
    }

    // Construct using org.tensorflow.proto.data.DistributeOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      autoShardPolicy_ = 0;

      optionalNumDevicesCase_ = 0;
      optionalNumDevices_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_DistributeOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.DistributeOptions getDefaultInstanceForType() {
      return org.tensorflow.proto.data.DistributeOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.data.DistributeOptions build() {
      org.tensorflow.proto.data.DistributeOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.DistributeOptions buildPartial() {
      org.tensorflow.proto.data.DistributeOptions result = new org.tensorflow.proto.data.DistributeOptions(this);
      result.autoShardPolicy_ = autoShardPolicy_;
      if (optionalNumDevicesCase_ == 2) {
        result.optionalNumDevices_ = optionalNumDevices_;
      }
      result.optionalNumDevicesCase_ = optionalNumDevicesCase_;
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
      if (other instanceof org.tensorflow.proto.data.DistributeOptions) {
        return mergeFrom((org.tensorflow.proto.data.DistributeOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.data.DistributeOptions other) {
      if (other == org.tensorflow.proto.data.DistributeOptions.getDefaultInstance()) return this;
      if (other.autoShardPolicy_ != 0) {
        setAutoShardPolicyValue(other.getAutoShardPolicyValue());
      }
      switch (other.getOptionalNumDevicesCase()) {
        case NUM_DEVICES: {
          setNumDevices(other.getNumDevices());
          break;
        }
        case OPTIONALNUMDEVICES_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.tensorflow.proto.data.DistributeOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.data.DistributeOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int optionalNumDevicesCase_ = 0;
    private java.lang.Object optionalNumDevices_;
    public OptionalNumDevicesCase
        getOptionalNumDevicesCase() {
      return OptionalNumDevicesCase.forNumber(
          optionalNumDevicesCase_);
    }

    public Builder clearOptionalNumDevices() {
      optionalNumDevicesCase_ = 0;
      optionalNumDevices_ = null;
      onChanged();
      return this;
    }


    private int autoShardPolicy_ = 0;
    /**
     * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
     */
    public int getAutoShardPolicyValue() {
      return autoShardPolicy_;
    }
    /**
     * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
     */
    public Builder setAutoShardPolicyValue(int value) {
      autoShardPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
     */
    public org.tensorflow.proto.data.AutoShardPolicy getAutoShardPolicy() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.data.AutoShardPolicy result = org.tensorflow.proto.data.AutoShardPolicy.valueOf(autoShardPolicy_);
      return result == null ? org.tensorflow.proto.data.AutoShardPolicy.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
     */
    public Builder setAutoShardPolicy(org.tensorflow.proto.data.AutoShardPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      autoShardPolicy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.data.AutoShardPolicy auto_shard_policy = 1;</code>
     */
    public Builder clearAutoShardPolicy() {
      
      autoShardPolicy_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>int32 num_devices = 2;</code>
     */
    public int getNumDevices() {
      if (optionalNumDevicesCase_ == 2) {
        return (java.lang.Integer) optionalNumDevices_;
      }
      return 0;
    }
    /**
     * <code>int32 num_devices = 2;</code>
     */
    public Builder setNumDevices(int value) {
      optionalNumDevicesCase_ = 2;
      optionalNumDevices_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_devices = 2;</code>
     */
    public Builder clearNumDevices() {
      if (optionalNumDevicesCase_ == 2) {
        optionalNumDevicesCase_ = 0;
        optionalNumDevices_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:tensorflow.data.DistributeOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.DistributeOptions)
  private static final org.tensorflow.proto.data.DistributeOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.data.DistributeOptions();
  }

  public static org.tensorflow.proto.data.DistributeOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DistributeOptions>
      PARSER = new com.google.protobuf.AbstractParser<DistributeOptions>() {
    @java.lang.Override
    public DistributeOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DistributeOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DistributeOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DistributeOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.data.DistributeOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

