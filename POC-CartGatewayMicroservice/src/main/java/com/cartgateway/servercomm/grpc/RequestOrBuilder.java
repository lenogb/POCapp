// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.cartgateway.servercomm.grpc;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.cart.grpc.compiled.Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   * @return Whether the username field is set.
   */
  boolean hasUsername();
  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   * @return The username.
   */
  com.cartgateway.servercomm.grpc.User getUsername();
  /**
   * <code>.com.cart.grpc.compiled.User username = 1;</code>
   */
  com.cartgateway.servercomm.grpc.UserOrBuilder getUsernameOrBuilder();

  /**
   * <code>int64 productId = 2;</code>
   * @return The productId.
   */
  long getProductId();

  /**
   * <code>int64 quantity = 3;</code>
   * @return The quantity.
   */
  long getQuantity();
}
