// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/sum.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.SumRequest}
 */
public final class SumRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.SumRequest)
    SumRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumRequest.newBuilder() to construct.
  private SumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.calculator.Sum.internal_static_calculator_SumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.Sum.internal_static_calculator_SumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.SumRequest.class, com.proto.calculator.SumRequest.Builder.class);
  }

  public static final int FIRSTNUMBER_FIELD_NUMBER = 1;
  private int firstNumber_;
  /**
   * <code>int32 firstNumber = 1;</code>
   * @return The firstNumber.
   */
  @java.lang.Override
  public int getFirstNumber() {
    return firstNumber_;
  }

  public static final int SECONDNUMBER_FIELD_NUMBER = 2;
  private int secondNumber_;
  /**
   * <code>int32 secondNumber = 2;</code>
   * @return The secondNumber.
   */
  @java.lang.Override
  public int getSecondNumber() {
    return secondNumber_;
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
    if (firstNumber_ != 0) {
      output.writeInt32(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      output.writeInt32(2, secondNumber_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNumber_);
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
    if (!(obj instanceof com.proto.calculator.SumRequest)) {
      return super.equals(obj);
    }
    com.proto.calculator.SumRequest other = (com.proto.calculator.SumRequest) obj;

    if (getFirstNumber()
        != other.getFirstNumber()) return false;
    if (getSecondNumber()
        != other.getSecondNumber()) return false;
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
    hash = (37 * hash) + FIRSTNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNumber();
    hash = (37 * hash) + SECONDNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNumber();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.SumRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.SumRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.SumRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.SumRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.SumRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.SumRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.SumRequest parseFrom(
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
  public static Builder newBuilder(com.proto.calculator.SumRequest prototype) {
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
   * Protobuf type {@code calculator.SumRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.SumRequest)
      com.proto.calculator.SumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.Sum.internal_static_calculator_SumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.Sum.internal_static_calculator_SumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.SumRequest.class, com.proto.calculator.SumRequest.Builder.class);
    }

    // Construct using com.proto.calculator.SumRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      firstNumber_ = 0;

      secondNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.Sum.internal_static_calculator_SumRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.SumRequest getDefaultInstanceForType() {
      return com.proto.calculator.SumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.SumRequest build() {
      com.proto.calculator.SumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.SumRequest buildPartial() {
      com.proto.calculator.SumRequest result = new com.proto.calculator.SumRequest(this);
      result.firstNumber_ = firstNumber_;
      result.secondNumber_ = secondNumber_;
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
      if (other instanceof com.proto.calculator.SumRequest) {
        return mergeFrom((com.proto.calculator.SumRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.SumRequest other) {
      if (other == com.proto.calculator.SumRequest.getDefaultInstance()) return this;
      if (other.getFirstNumber() != 0) {
        setFirstNumber(other.getFirstNumber());
      }
      if (other.getSecondNumber() != 0) {
        setSecondNumber(other.getSecondNumber());
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
              firstNumber_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              secondNumber_ = input.readInt32();

              break;
            } // case 16
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

    private int firstNumber_ ;
    /**
     * <code>int32 firstNumber = 1;</code>
     * @return The firstNumber.
     */
    @java.lang.Override
    public int getFirstNumber() {
      return firstNumber_;
    }
    /**
     * <code>int32 firstNumber = 1;</code>
     * @param value The firstNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNumber(int value) {
      
      firstNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 firstNumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNumber() {
      
      firstNumber_ = 0;
      onChanged();
      return this;
    }

    private int secondNumber_ ;
    /**
     * <code>int32 secondNumber = 2;</code>
     * @return The secondNumber.
     */
    @java.lang.Override
    public int getSecondNumber() {
      return secondNumber_;
    }
    /**
     * <code>int32 secondNumber = 2;</code>
     * @param value The secondNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNumber(int value) {
      
      secondNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 secondNumber = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNumber() {
      
      secondNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:calculator.SumRequest)
  }

  // @@protoc_insertion_point(class_scope:calculator.SumRequest)
  private static final com.proto.calculator.SumRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.SumRequest();
  }

  public static com.proto.calculator.SumRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumRequest>
      PARSER = new com.google.protobuf.AbstractParser<SumRequest>() {
    @java.lang.Override
    public SumRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.SumRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

