// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/grappler/costs/op_performance_data.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * A collection of OpPerformance data points.
 * </pre>
 *
 * Protobuf type {@code tensorflow.OpPerformanceList}
 */
public  final class OpPerformanceList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.OpPerformanceList)
    OpPerformanceListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpPerformanceList.newBuilder() to construct.
  private OpPerformanceList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpPerformanceList() {
    opPerformance_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpPerformanceList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OpPerformanceList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              opPerformance_ = new java.util.ArrayList<org.tensorflow.proto.framework.OpPerformance>();
              mutable_bitField0_ |= 0x00000001;
            }
            opPerformance_.add(
                input.readMessage(org.tensorflow.proto.framework.OpPerformance.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        opPerformance_ = java.util.Collections.unmodifiableList(opPerformance_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.OpPerformanceDataProtos.internal_static_tensorflow_OpPerformanceList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.OpPerformanceDataProtos.internal_static_tensorflow_OpPerformanceList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.OpPerformanceList.class, org.tensorflow.proto.framework.OpPerformanceList.Builder.class);
  }

  public static final int OP_PERFORMANCE_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.proto.framework.OpPerformance> opPerformance_;
  /**
   * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
   */
  public java.util.List<org.tensorflow.proto.framework.OpPerformance> getOpPerformanceList() {
    return opPerformance_;
  }
  /**
   * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.proto.framework.OpPerformanceOrBuilder> 
      getOpPerformanceOrBuilderList() {
    return opPerformance_;
  }
  /**
   * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
   */
  public int getOpPerformanceCount() {
    return opPerformance_.size();
  }
  /**
   * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
   */
  public org.tensorflow.proto.framework.OpPerformance getOpPerformance(int index) {
    return opPerformance_.get(index);
  }
  /**
   * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
   */
  public org.tensorflow.proto.framework.OpPerformanceOrBuilder getOpPerformanceOrBuilder(
      int index) {
    return opPerformance_.get(index);
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
    for (int i = 0; i < opPerformance_.size(); i++) {
      output.writeMessage(1, opPerformance_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < opPerformance_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, opPerformance_.get(i));
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
    if (!(obj instanceof org.tensorflow.proto.framework.OpPerformanceList)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.OpPerformanceList other = (org.tensorflow.proto.framework.OpPerformanceList) obj;

    if (!getOpPerformanceList()
        .equals(other.getOpPerformanceList())) return false;
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
    if (getOpPerformanceCount() > 0) {
      hash = (37 * hash) + OP_PERFORMANCE_FIELD_NUMBER;
      hash = (53 * hash) + getOpPerformanceList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.OpPerformanceList parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.framework.OpPerformanceList prototype) {
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
   * A collection of OpPerformance data points.
   * </pre>
   *
   * Protobuf type {@code tensorflow.OpPerformanceList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.OpPerformanceList)
      org.tensorflow.proto.framework.OpPerformanceListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.OpPerformanceDataProtos.internal_static_tensorflow_OpPerformanceList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.OpPerformanceDataProtos.internal_static_tensorflow_OpPerformanceList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.OpPerformanceList.class, org.tensorflow.proto.framework.OpPerformanceList.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.OpPerformanceList.newBuilder()
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
        getOpPerformanceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (opPerformanceBuilder_ == null) {
        opPerformance_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        opPerformanceBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.OpPerformanceDataProtos.internal_static_tensorflow_OpPerformanceList_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.OpPerformanceList getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.OpPerformanceList.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.OpPerformanceList build() {
      org.tensorflow.proto.framework.OpPerformanceList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.OpPerformanceList buildPartial() {
      org.tensorflow.proto.framework.OpPerformanceList result = new org.tensorflow.proto.framework.OpPerformanceList(this);
      int from_bitField0_ = bitField0_;
      if (opPerformanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          opPerformance_ = java.util.Collections.unmodifiableList(opPerformance_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.opPerformance_ = opPerformance_;
      } else {
        result.opPerformance_ = opPerformanceBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.proto.framework.OpPerformanceList) {
        return mergeFrom((org.tensorflow.proto.framework.OpPerformanceList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.OpPerformanceList other) {
      if (other == org.tensorflow.proto.framework.OpPerformanceList.getDefaultInstance()) return this;
      if (opPerformanceBuilder_ == null) {
        if (!other.opPerformance_.isEmpty()) {
          if (opPerformance_.isEmpty()) {
            opPerformance_ = other.opPerformance_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOpPerformanceIsMutable();
            opPerformance_.addAll(other.opPerformance_);
          }
          onChanged();
        }
      } else {
        if (!other.opPerformance_.isEmpty()) {
          if (opPerformanceBuilder_.isEmpty()) {
            opPerformanceBuilder_.dispose();
            opPerformanceBuilder_ = null;
            opPerformance_ = other.opPerformance_;
            bitField0_ = (bitField0_ & ~0x00000001);
            opPerformanceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOpPerformanceFieldBuilder() : null;
          } else {
            opPerformanceBuilder_.addAllMessages(other.opPerformance_);
          }
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
      org.tensorflow.proto.framework.OpPerformanceList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.framework.OpPerformanceList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.proto.framework.OpPerformance> opPerformance_ =
      java.util.Collections.emptyList();
    private void ensureOpPerformanceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        opPerformance_ = new java.util.ArrayList<org.tensorflow.proto.framework.OpPerformance>(opPerformance_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.OpPerformance, org.tensorflow.proto.framework.OpPerformance.Builder, org.tensorflow.proto.framework.OpPerformanceOrBuilder> opPerformanceBuilder_;

    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.OpPerformance> getOpPerformanceList() {
      if (opPerformanceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(opPerformance_);
      } else {
        return opPerformanceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public int getOpPerformanceCount() {
      if (opPerformanceBuilder_ == null) {
        return opPerformance_.size();
      } else {
        return opPerformanceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public org.tensorflow.proto.framework.OpPerformance getOpPerformance(int index) {
      if (opPerformanceBuilder_ == null) {
        return opPerformance_.get(index);
      } else {
        return opPerformanceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder setOpPerformance(
        int index, org.tensorflow.proto.framework.OpPerformance value) {
      if (opPerformanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpPerformanceIsMutable();
        opPerformance_.set(index, value);
        onChanged();
      } else {
        opPerformanceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder setOpPerformance(
        int index, org.tensorflow.proto.framework.OpPerformance.Builder builderForValue) {
      if (opPerformanceBuilder_ == null) {
        ensureOpPerformanceIsMutable();
        opPerformance_.set(index, builderForValue.build());
        onChanged();
      } else {
        opPerformanceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder addOpPerformance(org.tensorflow.proto.framework.OpPerformance value) {
      if (opPerformanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpPerformanceIsMutable();
        opPerformance_.add(value);
        onChanged();
      } else {
        opPerformanceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder addOpPerformance(
        int index, org.tensorflow.proto.framework.OpPerformance value) {
      if (opPerformanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOpPerformanceIsMutable();
        opPerformance_.add(index, value);
        onChanged();
      } else {
        opPerformanceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder addOpPerformance(
        org.tensorflow.proto.framework.OpPerformance.Builder builderForValue) {
      if (opPerformanceBuilder_ == null) {
        ensureOpPerformanceIsMutable();
        opPerformance_.add(builderForValue.build());
        onChanged();
      } else {
        opPerformanceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder addOpPerformance(
        int index, org.tensorflow.proto.framework.OpPerformance.Builder builderForValue) {
      if (opPerformanceBuilder_ == null) {
        ensureOpPerformanceIsMutable();
        opPerformance_.add(index, builderForValue.build());
        onChanged();
      } else {
        opPerformanceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder addAllOpPerformance(
        java.lang.Iterable<? extends org.tensorflow.proto.framework.OpPerformance> values) {
      if (opPerformanceBuilder_ == null) {
        ensureOpPerformanceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, opPerformance_);
        onChanged();
      } else {
        opPerformanceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder clearOpPerformance() {
      if (opPerformanceBuilder_ == null) {
        opPerformance_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        opPerformanceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public Builder removeOpPerformance(int index) {
      if (opPerformanceBuilder_ == null) {
        ensureOpPerformanceIsMutable();
        opPerformance_.remove(index);
        onChanged();
      } else {
        opPerformanceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public org.tensorflow.proto.framework.OpPerformance.Builder getOpPerformanceBuilder(
        int index) {
      return getOpPerformanceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public org.tensorflow.proto.framework.OpPerformanceOrBuilder getOpPerformanceOrBuilder(
        int index) {
      if (opPerformanceBuilder_ == null) {
        return opPerformance_.get(index);  } else {
        return opPerformanceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.proto.framework.OpPerformanceOrBuilder> 
         getOpPerformanceOrBuilderList() {
      if (opPerformanceBuilder_ != null) {
        return opPerformanceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(opPerformance_);
      }
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public org.tensorflow.proto.framework.OpPerformance.Builder addOpPerformanceBuilder() {
      return getOpPerformanceFieldBuilder().addBuilder(
          org.tensorflow.proto.framework.OpPerformance.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public org.tensorflow.proto.framework.OpPerformance.Builder addOpPerformanceBuilder(
        int index) {
      return getOpPerformanceFieldBuilder().addBuilder(
          index, org.tensorflow.proto.framework.OpPerformance.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.OpPerformance op_performance = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.OpPerformance.Builder> 
         getOpPerformanceBuilderList() {
      return getOpPerformanceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.OpPerformance, org.tensorflow.proto.framework.OpPerformance.Builder, org.tensorflow.proto.framework.OpPerformanceOrBuilder> 
        getOpPerformanceFieldBuilder() {
      if (opPerformanceBuilder_ == null) {
        opPerformanceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.proto.framework.OpPerformance, org.tensorflow.proto.framework.OpPerformance.Builder, org.tensorflow.proto.framework.OpPerformanceOrBuilder>(
                opPerformance_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        opPerformance_ = null;
      }
      return opPerformanceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.OpPerformanceList)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.OpPerformanceList)
  private static final org.tensorflow.proto.framework.OpPerformanceList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.OpPerformanceList();
  }

  public static org.tensorflow.proto.framework.OpPerformanceList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpPerformanceList>
      PARSER = new com.google.protobuf.AbstractParser<OpPerformanceList>() {
    @java.lang.Override
    public OpPerformanceList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OpPerformanceList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OpPerformanceList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpPerformanceList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.OpPerformanceList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

