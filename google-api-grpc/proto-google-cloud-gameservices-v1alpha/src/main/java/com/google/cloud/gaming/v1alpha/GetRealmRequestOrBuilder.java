// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/realms.proto

package com.google.cloud.gaming.v1alpha;

public interface GetRealmRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.GetRealmRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the realm to retrieve, using the form:
   * `projects/{project_id}/locations/{location}/realms/{realm_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the realm to retrieve, using the form:
   * `projects/{project_id}/locations/{location}/realms/{realm_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}