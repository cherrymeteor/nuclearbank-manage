// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

/**
 * Protobuf type {@code rpc.UserTransactions}
 */
public  final class UserTransactions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.UserTransactions)
    UserTransactionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserTransactions.newBuilder() to construct.
  private UserTransactions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTransactions() {
    userId_ = 0L;
    description_ = "";
    debit_ = "";
    credit_ = "";
    balance_ = 0D;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserTransactions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            userId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (date_ != null) {
              subBuilder = date_.toBuilder();
            }
            date_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(date_);
              date_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            debit_ = s;
            break;
          }
          case 42: {
            String s = input.readStringRequireUtf8();

            credit_ = s;
            break;
          }
          case 49: {

            balance_ = input.readDouble();
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
    return BankProto.internal_static_rpc_UserTransactions_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BankProto.internal_static_rpc_UserTransactions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserTransactions.class, UserTransactions.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private long userId_;
  /**
   * <code>int64 user_id = 1;</code>
   */
  public long getUserId() {
    return userId_;
  }

  public static final int DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp date_;
  /**
   * <code>.google.protobuf.Timestamp date = 2;</code>
   */
  public boolean hasDate() {
    return date_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp date = 2;</code>
   */
  public com.google.protobuf.Timestamp getDate() {
    return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
  }
  /**
   * <code>.google.protobuf.Timestamp date = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getDateOrBuilder() {
    return getDate();
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile Object description_;
  /**
   * <code>string description = 3;</code>
   */
  public String getDescription() {
    Object ref = description_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    Object ref = description_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEBIT_FIELD_NUMBER = 4;
  private volatile Object debit_;
  /**
   * <code>string debit = 4;</code>
   */
  public String getDebit() {
    Object ref = debit_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      debit_ = s;
      return s;
    }
  }
  /**
   * <code>string debit = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDebitBytes() {
    Object ref = debit_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      debit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREDIT_FIELD_NUMBER = 5;
  private volatile Object credit_;
  /**
   * <code>string credit = 5;</code>
   */
  public String getCredit() {
    Object ref = credit_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      credit_ = s;
      return s;
    }
  }
  /**
   * <code>string credit = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCreditBytes() {
    Object ref = credit_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      credit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BALANCE_FIELD_NUMBER = 6;
  private double balance_;
  /**
   * <code>double balance = 6;</code>
   */
  public double getBalance() {
    return balance_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0L) {
      output.writeInt64(1, userId_);
    }
    if (date_ != null) {
      output.writeMessage(2, getDate());
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (!getDebitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, debit_);
    }
    if (!getCreditBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, credit_);
    }
    if (balance_ != 0D) {
      output.writeDouble(6, balance_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, userId_);
    }
    if (date_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDate());
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (!getDebitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, debit_);
    }
    if (!getCreditBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, credit_);
    }
    if (balance_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, balance_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserTransactions)) {
      return super.equals(obj);
    }
    UserTransactions other = (UserTransactions) obj;

    boolean result = true;
    result = result && (getUserId()
        == other.getUserId());
    result = result && (hasDate() == other.hasDate());
    if (hasDate()) {
      result = result && getDate()
          .equals(other.getDate());
    }
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getDebit()
        .equals(other.getDebit());
    result = result && getCredit()
        .equals(other.getCredit());
    result = result && (
        Double.doubleToLongBits(getBalance())
        == Double.doubleToLongBits(
            other.getBalance()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    if (hasDate()) {
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDate().hashCode();
    }
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DEBIT_FIELD_NUMBER;
    hash = (53 * hash) + getDebit().hashCode();
    hash = (37 * hash) + CREDIT_FIELD_NUMBER;
    hash = (53 * hash) + getCredit().hashCode();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getBalance()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UserTransactions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserTransactions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserTransactions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserTransactions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserTransactions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserTransactions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserTransactions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserTransactions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserTransactions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserTransactions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserTransactions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserTransactions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserTransactions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.UserTransactions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.UserTransactions)
      UserTransactionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BankProto.internal_static_rpc_UserTransactions_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BankProto.internal_static_rpc_UserTransactions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserTransactions.class, UserTransactions.Builder.class);
    }

    // Construct using rpc.UserTransactions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      userId_ = 0L;

      if (dateBuilder_ == null) {
        date_ = null;
      } else {
        date_ = null;
        dateBuilder_ = null;
      }
      description_ = "";

      debit_ = "";

      credit_ = "";

      balance_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BankProto.internal_static_rpc_UserTransactions_descriptor;
    }

    public UserTransactions getDefaultInstanceForType() {
      return UserTransactions.getDefaultInstance();
    }

    public UserTransactions build() {
      UserTransactions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UserTransactions buildPartial() {
      UserTransactions result = new UserTransactions(this);
      result.userId_ = userId_;
      if (dateBuilder_ == null) {
        result.date_ = date_;
      } else {
        result.date_ = dateBuilder_.build();
      }
      result.description_ = description_;
      result.debit_ = debit_;
      result.credit_ = credit_;
      result.balance_ = balance_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserTransactions) {
        return mergeFrom((UserTransactions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserTransactions other) {
      if (other == UserTransactions.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.hasDate()) {
        mergeDate(other.getDate());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getDebit().isEmpty()) {
        debit_ = other.debit_;
        onChanged();
      }
      if (!other.getCredit().isEmpty()) {
        credit_ = other.credit_;
        onChanged();
      }
      if (other.getBalance() != 0D) {
        setBalance(other.getBalance());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserTransactions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserTransactions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userId_ ;
    /**
     * <code>int64 user_id = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>int64 user_id = 1;</code>
     */
    public Builder setUserId(long value) {

      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 user_id = 1;</code>
     */
    public Builder clearUserId() {

      userId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp date_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public boolean hasDate() {
      return dateBuilder_ != null || date_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public com.google.protobuf.Timestamp getDate() {
      if (dateBuilder_ == null) {
        return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
      } else {
        return dateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public Builder setDate(com.google.protobuf.Timestamp value) {
      if (dateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        date_ = value;
        onChanged();
      } else {
        dateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public Builder setDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateBuilder_ == null) {
        date_ = builderForValue.build();
        onChanged();
      } else {
        dateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public Builder mergeDate(com.google.protobuf.Timestamp value) {
      if (dateBuilder_ == null) {
        if (date_ != null) {
          date_ =
            com.google.protobuf.Timestamp.newBuilder(date_).mergeFrom(value).buildPartial();
        } else {
          date_ = value;
        }
        onChanged();
      } else {
        dateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public Builder clearDate() {
      if (dateBuilder_ == null) {
        date_ = null;
        onChanged();
      } else {
        date_ = null;
        dateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateBuilder() {

      onChanged();
      return getDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateOrBuilder() {
      if (dateBuilder_ != null) {
        return dateBuilder_.getMessageOrBuilder();
      } else {
        return date_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : date_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>
        getDateFieldBuilder() {
      if (dateBuilder_ == null) {
        dateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDate(),
                getParentForChildren(),
                isClean());
        date_ = null;
      }
      return dateBuilder_;
    }

    private Object description_ = "";
    /**
     * <code>string description = 3;</code>
     */
    public String getDescription() {
      Object ref = description_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    private Object debit_ = "";
    /**
     * <code>string debit = 4;</code>
     */
    public String getDebit() {
      Object ref = debit_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        debit_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string debit = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDebitBytes() {
      Object ref = debit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        debit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string debit = 4;</code>
     */
    public Builder setDebit(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      debit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string debit = 4;</code>
     */
    public Builder clearDebit() {

      debit_ = getDefaultInstance().getDebit();
      onChanged();
      return this;
    }
    /**
     * <code>string debit = 4;</code>
     */
    public Builder setDebitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      debit_ = value;
      onChanged();
      return this;
    }

    private Object credit_ = "";
    /**
     * <code>string credit = 5;</code>
     */
    public String getCredit() {
      Object ref = credit_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        credit_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string credit = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCreditBytes() {
      Object ref = credit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        credit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string credit = 5;</code>
     */
    public Builder setCredit(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      credit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string credit = 5;</code>
     */
    public Builder clearCredit() {

      credit_ = getDefaultInstance().getCredit();
      onChanged();
      return this;
    }
    /**
     * <code>string credit = 5;</code>
     */
    public Builder setCreditBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      credit_ = value;
      onChanged();
      return this;
    }

    private double balance_ ;
    /**
     * <code>double balance = 6;</code>
     */
    public double getBalance() {
      return balance_;
    }
    /**
     * <code>double balance = 6;</code>
     */
    public Builder setBalance(double value) {

      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double balance = 6;</code>
     */
    public Builder clearBalance() {

      balance_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.UserTransactions)
  }

  // @@protoc_insertion_point(class_scope:rpc.UserTransactions)
  private static final UserTransactions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserTransactions();
  }

  public static UserTransactions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTransactions>
      PARSER = new com.google.protobuf.AbstractParser<UserTransactions>() {
    public UserTransactions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserTransactions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserTransactions> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserTransactions> getParserForType() {
    return PARSER;
  }

  public UserTransactions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
