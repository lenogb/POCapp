// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.cart.grpc.generated_sources;

/**
 * Protobuf type {@code com.cart.grpc.compiled.Request}
 */
public final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.cart.grpc.compiled.Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
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
          case 10: {
            com.cart.grpc.generated_sources.User.Builder subBuilder = null;
            if (username_ != null) {
              subBuilder = username_.toBuilder();
            }
            username_ = input.readMessage(com.cart.grpc.generated_sources.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(username_);
              username_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            productId_ = input.readInt64();
            break;
          }
          case 24: {

            quantity_ = input.readInt64();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.cart.grpc.generated_sources.GrpcProto.internal_static_com_cart_grpc_compiled_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cart.grpc.generated_sources.GrpcProto.internal_static_com_cart_grpc_compiled_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cart.grpc.generated_sources.Request.class, com.cart.grpc.generated_sources.Request.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private com.cart.grpc.generated_sources.User username_;
  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   * @return Whether the username field is set.
   */
  @java.lang.Override
  public boolean hasUsername() {
    return username_ != null;
  }
  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public com.cart.grpc.generated_sources.User getUsername() {
    return username_ == null ? com.cart.grpc.generated_sources.User.getDefaultInstance() : username_;
  }
  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   */
  @java.lang.Override
  public com.cart.grpc.generated_sources.UserOrBuilder getUsernameOrBuilder() {
    return getUsername();
  }

  public static final int PRODUCTID_FIELD_NUMBER = 2;
  private long productId_;
  /**
   * <code>int64 productId = 2;</code>
   * @return The productId.
   */
  @java.lang.Override
  public long getProductId() {
    return productId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 3;
  private long quantity_;
  /**
   * <code>int64 quantity = 3;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public long getQuantity() {
    return quantity_;
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
    if (username_ != null) {
      output.writeMessage(1, getUsername());
    }
    if (productId_ != 0L) {
      output.writeInt64(2, productId_);
    }
    if (quantity_ != 0L) {
      output.writeInt64(3, quantity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (username_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUsername());
    }
    if (productId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, productId_);
    }
    if (quantity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, quantity_);
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
    if (!(obj instanceof com.cart.grpc.generated_sources.Request)) {
      return super.equals(obj);
    }
    com.cart.grpc.generated_sources.Request other = (com.cart.grpc.generated_sources.Request) obj;

    if (hasUsername() != other.hasUsername()) return false;
    if (hasUsername()) {
      if (!getUsername()
          .equals(other.getUsername())) return false;
    }
    if (getProductId()
        != other.getProductId()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
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
    if (hasUsername()) {
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
    }
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProductId());
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantity());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cart.grpc.generated_sources.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cart.grpc.generated_sources.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cart.grpc.generated_sources.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cart.grpc.generated_sources.Request parseFrom(
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
  public static Builder newBuilder(com.cart.grpc.generated_sources.Request prototype) {
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
   * Protobuf type {@code com.cart.grpc.compiled.Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.cart.grpc.compiled.Request)
      com.cart.grpc.generated_sources.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cart.grpc.generated_sources.GrpcProto.internal_static_com_cart_grpc_compiled_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cart.grpc.generated_sources.GrpcProto.internal_static_com_cart_grpc_compiled_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cart.grpc.generated_sources.Request.class, com.cart.grpc.generated_sources.Request.Builder.class);
    }

    // Construct using com.cart.grpc.generated_sources.Request.newBuilder()
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
      if (usernameBuilder_ == null) {
        username_ = null;
      } else {
        username_ = null;
        usernameBuilder_ = null;
      }
      productId_ = 0L;

      quantity_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cart.grpc.generated_sources.GrpcProto.internal_static_com_cart_grpc_compiled_Request_descriptor;
    }

    @java.lang.Override
    public com.cart.grpc.generated_sources.Request getDefaultInstanceForType() {
      return com.cart.grpc.generated_sources.Request.getDefaultInstance();
    }

    @java.lang.Override
    public com.cart.grpc.generated_sources.Request build() {
      com.cart.grpc.generated_sources.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cart.grpc.generated_sources.Request buildPartial() {
      com.cart.grpc.generated_sources.Request result = new com.cart.grpc.generated_sources.Request(this);
      if (usernameBuilder_ == null) {
        result.username_ = username_;
      } else {
        result.username_ = usernameBuilder_.build();
      }
      result.productId_ = productId_;
      result.quantity_ = quantity_;
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
      if (other instanceof com.cart.grpc.generated_sources.Request) {
        return mergeFrom((com.cart.grpc.generated_sources.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cart.grpc.generated_sources.Request other) {
      if (other == com.cart.grpc.generated_sources.Request.getDefaultInstance()) return this;
      if (other.hasUsername()) {
        mergeUsername(other.getUsername());
      }
      if (other.getProductId() != 0L) {
        setProductId(other.getProductId());
      }
      if (other.getQuantity() != 0L) {
        setQuantity(other.getQuantity());
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
      com.cart.grpc.generated_sources.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cart.grpc.generated_sources.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.cart.grpc.generated_sources.User username_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cart.grpc.generated_sources.User, com.cart.grpc.generated_sources.User.Builder, com.cart.grpc.generated_sources.UserOrBuilder> usernameBuilder_;
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     * @return Whether the username field is set.
     */
    public boolean hasUsername() {
      return usernameBuilder_ != null || username_ != null;
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     * @return The username.
     */
    public com.cart.grpc.generated_sources.User getUsername() {
      if (usernameBuilder_ == null) {
        return username_ == null ? com.cart.grpc.generated_sources.User.getDefaultInstance() : username_;
      } else {
        return usernameBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public Builder setUsername(com.cart.grpc.generated_sources.User value) {
      if (usernameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        username_ = value;
        onChanged();
      } else {
        usernameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public Builder setUsername(
        com.cart.grpc.generated_sources.User.Builder builderForValue) {
      if (usernameBuilder_ == null) {
        username_ = builderForValue.build();
        onChanged();
      } else {
        usernameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public Builder mergeUsername(com.cart.grpc.generated_sources.User value) {
      if (usernameBuilder_ == null) {
        if (username_ != null) {
          username_ =
            com.cart.grpc.generated_sources.User.newBuilder(username_).mergeFrom(value).buildPartial();
        } else {
          username_ = value;
        }
        onChanged();
      } else {
        usernameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public Builder clearUsername() {
      if (usernameBuilder_ == null) {
        username_ = null;
        onChanged();
      } else {
        username_ = null;
        usernameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public com.cart.grpc.generated_sources.User.Builder getUsernameBuilder() {
      
      onChanged();
      return getUsernameFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    public com.cart.grpc.generated_sources.UserOrBuilder getUsernameOrBuilder() {
      if (usernameBuilder_ != null) {
        return usernameBuilder_.getMessageOrBuilder();
      } else {
        return username_ == null ?
            com.cart.grpc.generated_sources.User.getDefaultInstance() : username_;
      }
    }
    /**
     * <code>.com.cart.grpc.compiled.User username = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cart.grpc.generated_sources.User, com.cart.grpc.generated_sources.User.Builder, com.cart.grpc.generated_sources.UserOrBuilder> 
        getUsernameFieldBuilder() {
      if (usernameBuilder_ == null) {
        usernameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cart.grpc.generated_sources.User, com.cart.grpc.generated_sources.User.Builder, com.cart.grpc.generated_sources.UserOrBuilder>(
                getUsername(),
                getParentForChildren(),
                isClean());
        username_ = null;
      }
      return usernameBuilder_;
    }

    private long productId_ ;
    /**
     * <code>int64 productId = 2;</code>
     * @return The productId.
     */
    @java.lang.Override
    public long getProductId() {
      return productId_;
    }
    /**
     * <code>int64 productId = 2;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(long value) {
      
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 productId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      
      productId_ = 0L;
      onChanged();
      return this;
    }

    private long quantity_ ;
    /**
     * <code>int64 quantity = 3;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public long getQuantity() {
      return quantity_;
    }
    /**
     * <code>int64 quantity = 3;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(long value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 quantity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.cart.grpc.compiled.Request)
  }

  // @@protoc_insertion_point(class_scope:com.cart.grpc.compiled.Request)
  private static final com.cart.grpc.generated_sources.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cart.grpc.generated_sources.Request();
  }

  public static com.cart.grpc.generated_sources.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cart.grpc.generated_sources.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

