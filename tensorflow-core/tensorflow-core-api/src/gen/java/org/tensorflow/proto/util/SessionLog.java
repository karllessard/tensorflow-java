// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/event.proto

package org.tensorflow.proto.util;

/**
 * <pre>
 * Protocol buffer used for logging session state.
 * </pre>
 *
 * Protobuf type {@code tensorflow.SessionLog}
 */
public final class SessionLog extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.SessionLog)
    SessionLogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SessionLog.newBuilder() to construct.
  private SessionLog(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SessionLog() {
    status_ = 0;
    checkpointPath_ = "";
    msg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SessionLog();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_SessionLog_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_SessionLog_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.util.SessionLog.class, org.tensorflow.proto.util.SessionLog.Builder.class);
  }

  /**
   * Protobuf enum {@code tensorflow.SessionLog.SessionStatus}
   */
  public enum SessionStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>START = 1;</code>
     */
    START(1),
    /**
     * <code>STOP = 2;</code>
     */
    STOP(2),
    /**
     * <code>CHECKPOINT = 3;</code>
     */
    CHECKPOINT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>START = 1;</code>
     */
    public static final int START_VALUE = 1;
    /**
     * <code>STOP = 2;</code>
     */
    public static final int STOP_VALUE = 2;
    /**
     * <code>CHECKPOINT = 3;</code>
     */
    public static final int CHECKPOINT_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SessionStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SessionStatus forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSPECIFIED;
        case 1: return START;
        case 2: return STOP;
        case 3: return CHECKPOINT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SessionStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SessionStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SessionStatus>() {
            public SessionStatus findValueByNumber(int number) {
              return SessionStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.tensorflow.proto.util.SessionLog.getDescriptor().getEnumTypes().get(0);
    }

    private static final SessionStatus[] VALUES = values();

    public static SessionStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SessionStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.SessionLog.SessionStatus)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public org.tensorflow.proto.util.SessionLog.SessionStatus getStatus() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.util.SessionLog.SessionStatus result = org.tensorflow.proto.util.SessionLog.SessionStatus.valueOf(status_);
    return result == null ? org.tensorflow.proto.util.SessionLog.SessionStatus.UNRECOGNIZED : result;
  }

  public static final int CHECKPOINT_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object checkpointPath_;
  /**
   * <pre>
   * This checkpoint_path contains both the path and filename.
   * </pre>
   *
   * <code>string checkpoint_path = 2;</code>
   * @return The checkpointPath.
   */
  @java.lang.Override
  public java.lang.String getCheckpointPath() {
    java.lang.Object ref = checkpointPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checkpointPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This checkpoint_path contains both the path and filename.
   * </pre>
   *
   * <code>string checkpoint_path = 2;</code>
   * @return The bytes for checkpointPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCheckpointPathBytes() {
    java.lang.Object ref = checkpointPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checkpointPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 3;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 3;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (status_ != org.tensorflow.proto.util.SessionLog.SessionStatus.STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkpointPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, checkpointPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != org.tensorflow.proto.util.SessionLog.SessionStatus.STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(checkpointPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, checkpointPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
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
    if (!(obj instanceof org.tensorflow.proto.util.SessionLog)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.util.SessionLog other = (org.tensorflow.proto.util.SessionLog) obj;

    if (status_ != other.status_) return false;
    if (!getCheckpointPath()
        .equals(other.getCheckpointPath())) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + CHECKPOINT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getCheckpointPath().hashCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.util.SessionLog parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.SessionLog parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.SessionLog parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.SessionLog parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.util.SessionLog prototype) {
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
   * Protocol buffer used for logging session state.
   * </pre>
   *
   * Protobuf type {@code tensorflow.SessionLog}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.SessionLog)
      org.tensorflow.proto.util.SessionLogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_SessionLog_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_SessionLog_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.util.SessionLog.class, org.tensorflow.proto.util.SessionLog.Builder.class);
    }

    // Construct using org.tensorflow.proto.util.SessionLog.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      checkpointPath_ = "";

      msg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.util.EventProtos.internal_static_tensorflow_SessionLog_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.SessionLog getDefaultInstanceForType() {
      return org.tensorflow.proto.util.SessionLog.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.util.SessionLog build() {
      org.tensorflow.proto.util.SessionLog result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.SessionLog buildPartial() {
      org.tensorflow.proto.util.SessionLog result = new org.tensorflow.proto.util.SessionLog(this);
      result.status_ = status_;
      result.checkpointPath_ = checkpointPath_;
      result.msg_ = msg_;
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
      if (other instanceof org.tensorflow.proto.util.SessionLog) {
        return mergeFrom((org.tensorflow.proto.util.SessionLog)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.util.SessionLog other) {
      if (other == org.tensorflow.proto.util.SessionLog.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getCheckpointPath().isEmpty()) {
        checkpointPath_ = other.checkpointPath_;
        onChanged();
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
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
              status_ = input.readEnum();

              break;
            } // case 8
            case 18: {
              checkpointPath_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              msg_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private int status_ = 0;
    /**
     * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public org.tensorflow.proto.util.SessionLog.SessionStatus getStatus() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.util.SessionLog.SessionStatus result = org.tensorflow.proto.util.SessionLog.SessionStatus.valueOf(status_);
      return result == null ? org.tensorflow.proto.util.SessionLog.SessionStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(org.tensorflow.proto.util.SessionLog.SessionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.SessionLog.SessionStatus status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object checkpointPath_ = "";
    /**
     * <pre>
     * This checkpoint_path contains both the path and filename.
     * </pre>
     *
     * <code>string checkpoint_path = 2;</code>
     * @return The checkpointPath.
     */
    public java.lang.String getCheckpointPath() {
      java.lang.Object ref = checkpointPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checkpointPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This checkpoint_path contains both the path and filename.
     * </pre>
     *
     * <code>string checkpoint_path = 2;</code>
     * @return The bytes for checkpointPath.
     */
    public com.google.protobuf.ByteString
        getCheckpointPathBytes() {
      java.lang.Object ref = checkpointPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checkpointPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This checkpoint_path contains both the path and filename.
     * </pre>
     *
     * <code>string checkpoint_path = 2;</code>
     * @param value The checkpointPath to set.
     * @return This builder for chaining.
     */
    public Builder setCheckpointPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checkpointPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This checkpoint_path contains both the path and filename.
     * </pre>
     *
     * <code>string checkpoint_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCheckpointPath() {
      
      checkpointPath_ = getDefaultInstance().getCheckpointPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This checkpoint_path contains both the path and filename.
     * </pre>
     *
     * <code>string checkpoint_path = 2;</code>
     * @param value The bytes for checkpointPath to set.
     * @return This builder for chaining.
     */
    public Builder setCheckpointPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checkpointPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 3;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 3;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:tensorflow.SessionLog)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.SessionLog)
  private static final org.tensorflow.proto.util.SessionLog DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.util.SessionLog();
  }

  public static org.tensorflow.proto.util.SessionLog getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionLog>
      PARSER = new com.google.protobuf.AbstractParser<SessionLog>() {
    @java.lang.Override
    public SessionLog parsePartialFrom(
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

  public static com.google.protobuf.Parser<SessionLog> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionLog> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.util.SessionLog getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

