// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserAdminRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.UserAdminRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   */
  String getUsername();
  /**
   * <code>string username = 1;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 2;</code>
   */
  String getPassword();
  /**
   * <code>string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string staff_first_name = 3;</code>
   */
  String getStaffFirstName();
  /**
   * <code>string staff_first_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getStaffFirstNameBytes();

  /**
   * <code>string staff_last_name = 4;</code>
   */
  String getStaffLastName();
  /**
   * <code>string staff_last_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getStaffLastNameBytes();

  /**
   * <pre>
   *staff_id and password will be generated then sent to staff email.
   * </pre>
   *
   * <code>string staff_email = 5;</code>
   */
  String getStaffEmail();
  /**
   * <pre>
   *staff_id and password will be generated then sent to staff email.
   * </pre>
   *
   * <code>string staff_email = 5;</code>
   */
  com.google.protobuf.ByteString
      getStaffEmailBytes();

  /**
   * <pre>
   *for remove staff
   * </pre>
   *
   * <code>string staff_id = 6;</code>
   */
  String getStaffId();
  /**
   * <pre>
   *for remove staff
   * </pre>
   *
   * <code>string staff_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getStaffIdBytes();

  /**
   * <code>string email_host = 7;</code>
   */
  String getEmailHost();
  /**
   * <code>string email_host = 7;</code>
   */
  com.google.protobuf.ByteString
      getEmailHostBytes();

  /**
   * <code>string email_port = 8;</code>
   */
  String getEmailPort();
  /**
   * <code>string email_port = 8;</code>
   */
  com.google.protobuf.ByteString
      getEmailPortBytes();

  /**
   * <code>string email_account = 9;</code>
   */
  String getEmailAccount();
  /**
   * <code>string email_account = 9;</code>
   */
  com.google.protobuf.ByteString
      getEmailAccountBytes();

  /**
   * <code>string email_password = 10;</code>
   */
  String getEmailPassword();
  /**
   * <code>string email_password = 10;</code>
   */
  com.google.protobuf.ByteString
      getEmailPasswordBytes();

  /**
   * <code>string filter_by_id_name = 11;</code>
   */
  String getFilterByIdName();
  /**
   * <code>string filter_by_id_name = 11;</code>
   */
  com.google.protobuf.ByteString
      getFilterByIdNameBytes();
}