package com.hlh.server.model.proto;

public final class MessageProto {

	private MessageProto() {
		
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
		
	}

	public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public interface ModelOrBuilder extends com.google.protobuf.MessageOrBuilder {

		/**
		 * <pre>
		 * 接口版本号
		 * </pre>
		 * 
		 * <code>string version = 1;</code>
		 */
		java.lang.String getVersion();

		/**
		 * <pre>
		 * 接口版本号
		 * </pre>
		 * 
		 * <code>string version = 1;</code>
		 */
		com.google.protobuf.ByteString getVersionBytes();

		/**
		 * <pre>
		 * 设备uuid
		 * </pre>
		 * 
		 * <code>string deviceId = 2;</code>
		 */
		java.lang.String getDeviceId();

		/**
		 * <pre>
		 * 设备uuid
		 * </pre>
		 * 
		 * <code>string deviceId = 2;</code>
		 */
		com.google.protobuf.ByteString getDeviceIdBytes();

		/**
		 * <pre>
		 * 请求接口命令字  1绑定  2心跳   3上线   4下线
		 * </pre>
		 * 
		 * <code>uint32 cmd = 3;</code>
		 */
		int getCmd();

		/**
		 * <pre>
		 * 发送人
		 * </pre>
		 * 
		 * <code>string sender = 4;</code>
		 */
		java.lang.String getSender();

		/**
		 * <pre>
		 * 发送人
		 * </pre>
		 * 
		 * <code>string sender = 4;</code>
		 */
		com.google.protobuf.ByteString getSenderBytes();

		/**
		 * <pre>
		 * 接收人
		 * </pre>
		 * 
		 * <code>string receiver = 5;</code>
		 */
		java.lang.String getReceiver();

		/**
		 * <pre>
		 * 接收人
		 * </pre>
		 * 
		 * <code>string receiver = 5;</code>
		 */
		com.google.protobuf.ByteString getReceiverBytes();

		/**
		 * <pre>
		 * 用户组编号
		 * </pre>
		 * 
		 * <code>string groupId = 6;</code>
		 */
		java.lang.String getGroupId();

		/**
		 * <pre>
		 * 用户组编号
		 * </pre>
		 * 
		 * <code>string groupId = 6;</code>
		 */
		com.google.protobuf.ByteString getGroupIdBytes();

		/**
		 * <pre>
		 * 请求1，应答2，通知3，响应4  format
		 * </pre>
		 * 
		 * <code>uint32 msgtype = 7;</code>
		 */
		int getMsgtype();

		/**
		 * <pre>
		 * 1 rsa加密 2aes加密
		 * </pre>
		 * 
		 * <code>uint32 flag = 8;</code>
		 */
		int getFlag();

		/**
		 * <pre>
		 * mobile-ios mobile-android pc-windows pc-mac
		 * </pre>
		 * 
		 * <code>string platform = 9;</code>
		 */
		java.lang.String getPlatform();

		/**
		 * <pre>
		 * mobile-ios mobile-android pc-windows pc-mac
		 * </pre>
		 * 
		 * <code>string platform = 9;</code>
		 */
		com.google.protobuf.ByteString getPlatformBytes();

		/**
		 * <pre>
		 * 客户端版本号
		 * </pre>
		 * 
		 * <code>string platformVersion = 10;</code>
		 */
		java.lang.String getPlatformVersion();

		/**
		 * <pre>
		 * 客户端版本号
		 * </pre>
		 * 
		 * <code>string platformVersion = 10;</code>
		 */
		com.google.protobuf.ByteString getPlatformVersionBytes();

		/**
		 * <pre>
		 * 客户端凭证
		 * </pre>
		 * 
		 * <code>string token = 11;</code>
		 */
		java.lang.String getToken();

		/**
		 * <pre>
		 * 客户端凭证
		 * </pre>
		 * 
		 * <code>string token = 11;</code>
		 */
		com.google.protobuf.ByteString getTokenBytes();

		/**
		 * <pre>
		 * 客户端key
		 * </pre>
		 * 
		 * <code>string appKey = 12;</code>
		 */
		java.lang.String getAppKey();

		/**
		 * <pre>
		 * 客户端key
		 * </pre>
		 * 
		 * <code>string appKey = 12;</code>
		 */
		com.google.protobuf.ByteString getAppKeyBytes();

		/**
		 * <pre>
		 * 时间戳
		 * </pre>
		 * 
		 * <code>string timeStamp = 13;</code>
		 */
		java.lang.String getTimeStamp();

		/**
		 * <pre>
		 * 时间戳
		 * </pre>
		 * 
		 * <code>string timeStamp = 13;</code>
		 */
		com.google.protobuf.ByteString getTimeStampBytes();

		/**
		 * <pre>
		 * 签名
		 * </pre>
		 * 
		 * <code>string sign = 14;</code>
		 */
		java.lang.String getSign();

		/**
		 * <pre>
		 * 签名
		 * </pre>
		 * 
		 * <code>string sign = 14;</code>
		 */
		com.google.protobuf.ByteString getSignBytes();

		/**
		 * <pre>
		 * 请求数据
		 * </pre>
		 * 
		 * <code>bytes content = 15;</code>
		 */
		com.google.protobuf.ByteString getContent();
	}

	public static final class Model extends com.google.protobuf.GeneratedMessageV3 implements ModelOrBuilder {
		private static final long serialVersionUID = 0L;

		private Model(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private Model() {
			version_ = "";
			deviceId_ = "";
			cmd_ = 0;
			sender_ = "";
			receiver_ = "";
			groupId_ = "";
			msgtype_ = 0;
			flag_ = 0;
			platform_ = "";
			platformVersion_ = "";
			token_ = "";
			appKey_ = "";
			timeStamp_ = "";
			sign_ = "";
			content_ = com.google.protobuf.ByteString.EMPTY;
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
			return this.unknownFields;
		}

		private Model(com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
			com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
					.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
					case 0:
						done = true;
						break;
					default: {
						if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
							done = true;
						}
						break;
					}
					case 10: {
						java.lang.String s = input.readStringRequireUtf8();

						version_ = s;
						break;
					}
					case 18: {
						java.lang.String s = input.readStringRequireUtf8();

						deviceId_ = s;
						break;
					}
					case 24: {

						cmd_ = input.readUInt32();
						break;
					}
					case 34: {
						java.lang.String s = input.readStringRequireUtf8();

						sender_ = s;
						break;
					}
					case 42: {
						java.lang.String s = input.readStringRequireUtf8();

						receiver_ = s;
						break;
					}
					case 50: {
						java.lang.String s = input.readStringRequireUtf8();

						groupId_ = s;
						break;
					}
					case 56: {

						msgtype_ = input.readUInt32();
						break;
					}
					case 64: {

						flag_ = input.readUInt32();
						break;
					}
					case 74: {
						java.lang.String s = input.readStringRequireUtf8();

						platform_ = s;
						break;
					}
					case 82: {
						java.lang.String s = input.readStringRequireUtf8();

						platformVersion_ = s;
						break;
					}
					case 90: {
						java.lang.String s = input.readStringRequireUtf8();

						token_ = s;
						break;
					}
					case 98: {
						java.lang.String s = input.readStringRequireUtf8();

						appKey_ = s;
						break;
					}
					case 106: {
						java.lang.String s = input.readStringRequireUtf8();

						timeStamp_ = s;
						break;
					}
					case 114: {
						java.lang.String s = input.readStringRequireUtf8();

						sign_ = s;
						break;
					}
					case 122: {

						content_ = input.readBytes();
						break;
					}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return com.hlh.server.model.proto.MessageProto.internal_static_com_hlh_server_model_proto_Model_descriptor;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return com.hlh.server.model.proto.MessageProto.internal_static_com_hlh_server_model_proto_Model_fieldAccessorTable
					.ensureFieldAccessorsInitialized(com.hlh.server.model.proto.MessageProto.Model.class,
							com.hlh.server.model.proto.MessageProto.Model.Builder.class);
		}

		public static final int VERSION_FIELD_NUMBER = 1;
		private volatile java.lang.Object version_;

		/**
		 * <pre>
		 * 接口版本号
		 * </pre>
		 * 
		 * <code>string version = 1;</code>
		 */
		public java.lang.String getVersion() {
			java.lang.Object ref = version_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				version_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 接口版本号
		 * </pre>
		 * 
		 * <code>string version = 1;</code>
		 */
		public com.google.protobuf.ByteString getVersionBytes() {
			java.lang.Object ref = version_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				version_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int DEVICEID_FIELD_NUMBER = 2;
		private volatile java.lang.Object deviceId_;

		/**
		 * <pre>
		 * 设备uuid
		 * </pre>
		 * 
		 * <code>string deviceId = 2;</code>
		 */
		public java.lang.String getDeviceId() {
			java.lang.Object ref = deviceId_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				deviceId_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 设备uuid
		 * </pre>
		 * 
		 * <code>string deviceId = 2;</code>
		 */
		public com.google.protobuf.ByteString getDeviceIdBytes() {
			java.lang.Object ref = deviceId_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				deviceId_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int CMD_FIELD_NUMBER = 3;
		private int cmd_;

		/**
		 * <pre>
		 * 请求接口命令字  1绑定  2心跳   3上线   4下线
		 * </pre>
		 * 
		 * <code>uint32 cmd = 3;</code>
		 */
		public int getCmd() {
			return cmd_;
		}

		public static final int SENDER_FIELD_NUMBER = 4;
		private volatile java.lang.Object sender_;

		/**
		 * <pre>
		 * 发送人
		 * </pre>
		 * 
		 * <code>string sender = 4;</code>
		 */
		public java.lang.String getSender() {
			java.lang.Object ref = sender_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				sender_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 发送人
		 * </pre>
		 * 
		 * <code>string sender = 4;</code>
		 */
		public com.google.protobuf.ByteString getSenderBytes() {
			java.lang.Object ref = sender_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				sender_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int RECEIVER_FIELD_NUMBER = 5;
		private volatile java.lang.Object receiver_;

		/**
		 * <pre>
		 * 接收人
		 * </pre>
		 * 
		 * <code>string receiver = 5;</code>
		 */
		public java.lang.String getReceiver() {
			java.lang.Object ref = receiver_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				receiver_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 接收人
		 * </pre>
		 * 
		 * <code>string receiver = 5;</code>
		 */
		public com.google.protobuf.ByteString getReceiverBytes() {
			java.lang.Object ref = receiver_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				receiver_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int GROUPID_FIELD_NUMBER = 6;
		private volatile java.lang.Object groupId_;

		/**
		 * <pre>
		 * 用户组编号
		 * </pre>
		 * 
		 * <code>string groupId = 6;</code>
		 */
		public java.lang.String getGroupId() {
			java.lang.Object ref = groupId_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				groupId_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 用户组编号
		 * </pre>
		 * 
		 * <code>string groupId = 6;</code>
		 */
		public com.google.protobuf.ByteString getGroupIdBytes() {
			java.lang.Object ref = groupId_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				groupId_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int MSGTYPE_FIELD_NUMBER = 7;
		private int msgtype_;

		/**
		 * <pre>
		 * 请求1，应答2，通知3，响应4  format
		 * </pre>
		 * 
		 * <code>uint32 msgtype = 7;</code>
		 */
		public int getMsgtype() {
			return msgtype_;
		}

		public static final int FLAG_FIELD_NUMBER = 8;
		private int flag_;

		/**
		 * <pre>
		 * 1 rsa加密 2aes加密
		 * </pre>
		 * 
		 * <code>uint32 flag = 8;</code>
		 */
		public int getFlag() {
			return flag_;
		}

		public static final int PLATFORM_FIELD_NUMBER = 9;
		private volatile java.lang.Object platform_;

		/**
		 * <pre>
		 * mobile-ios mobile-android pc-windows pc-mac
		 * </pre>
		 * 
		 * <code>string platform = 9;</code>
		 */
		public java.lang.String getPlatform() {
			java.lang.Object ref = platform_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				platform_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * mobile-ios mobile-android pc-windows pc-mac
		 * </pre>
		 * 
		 * <code>string platform = 9;</code>
		 */
		public com.google.protobuf.ByteString getPlatformBytes() {
			java.lang.Object ref = platform_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				platform_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int PLATFORMVERSION_FIELD_NUMBER = 10;
		private volatile java.lang.Object platformVersion_;

		/**
		 * <pre>
		 * 客户端版本号
		 * </pre>
		 * 
		 * <code>string platformVersion = 10;</code>
		 */
		public java.lang.String getPlatformVersion() {
			java.lang.Object ref = platformVersion_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				platformVersion_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 客户端版本号
		 * </pre>
		 * 
		 * <code>string platformVersion = 10;</code>
		 */
		public com.google.protobuf.ByteString getPlatformVersionBytes() {
			java.lang.Object ref = platformVersion_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				platformVersion_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int TOKEN_FIELD_NUMBER = 11;
		private volatile java.lang.Object token_;

		/**
		 * <pre>
		 * 客户端凭证
		 * </pre>
		 * 
		 * <code>string token = 11;</code>
		 */
		public java.lang.String getToken() {
			java.lang.Object ref = token_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				token_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 客户端凭证
		 * </pre>
		 * 
		 * <code>string token = 11;</code>
		 */
		public com.google.protobuf.ByteString getTokenBytes() {
			java.lang.Object ref = token_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				token_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int APPKEY_FIELD_NUMBER = 12;
		private volatile java.lang.Object appKey_;

		/**
		 * <pre>
		 * 客户端key
		 * </pre>
		 * 
		 * <code>string appKey = 12;</code>
		 */
		public java.lang.String getAppKey() {
			java.lang.Object ref = appKey_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				appKey_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 客户端key
		 * </pre>
		 * 
		 * <code>string appKey = 12;</code>
		 */
		public com.google.protobuf.ByteString getAppKeyBytes() {
			java.lang.Object ref = appKey_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				appKey_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int TIMESTAMP_FIELD_NUMBER = 13;
		private volatile java.lang.Object timeStamp_;

		/**
		 * <pre>
		 * 时间戳
		 * </pre>
		 * 
		 * <code>string timeStamp = 13;</code>
		 */
		public java.lang.String getTimeStamp() {
			java.lang.Object ref = timeStamp_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				timeStamp_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 时间戳
		 * </pre>
		 * 
		 * <code>string timeStamp = 13;</code>
		 */
		public com.google.protobuf.ByteString getTimeStampBytes() {
			java.lang.Object ref = timeStamp_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				timeStamp_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int SIGN_FIELD_NUMBER = 14;
		private volatile java.lang.Object sign_;

		/**
		 * <pre>
		 * 签名
		 * </pre>
		 * 
		 * <code>string sign = 14;</code>
		 */
		public java.lang.String getSign() {
			java.lang.Object ref = sign_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				sign_ = s;
				return s;
			}
		}

		/**
		 * <pre>
		 * 签名
		 * </pre>
		 * 
		 * <code>string sign = 14;</code>
		 */
		public com.google.protobuf.ByteString getSignBytes() {
			java.lang.Object ref = sign_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				sign_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static final int CONTENT_FIELD_NUMBER = 15;
		private com.google.protobuf.ByteString content_;

		/**
		 * <pre>
		 * 请求数据
		 * </pre>
		 * 
		 * <code>bytes content = 15;</code>
		 */
		public com.google.protobuf.ByteString getContent() {
			return content_;
		}

		private byte memoizedIsInitialized = -1;

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1)
				return true;
			if (isInitialized == 0)
				return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
			if (!getVersionBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
			}
			if (!getDeviceIdBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceId_);
			}
			if (cmd_ != 0) {
				output.writeUInt32(3, cmd_);
			}
			if (!getSenderBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sender_);
			}
			if (!getReceiverBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 5, receiver_);
			}
			if (!getGroupIdBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 6, groupId_);
			}
			if (msgtype_ != 0) {
				output.writeUInt32(7, msgtype_);
			}
			if (flag_ != 0) {
				output.writeUInt32(8, flag_);
			}
			if (!getPlatformBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 9, platform_);
			}
			if (!getPlatformVersionBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 10, platformVersion_);
			}
			if (!getTokenBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 11, token_);
			}
			if (!getAppKeyBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 12, appKey_);
			}
			if (!getTimeStampBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 13, timeStamp_);
			}
			if (!getSignBytes().isEmpty()) {
				com.google.protobuf.GeneratedMessageV3.writeString(output, 14, sign_);
			}
			if (!content_.isEmpty()) {
				output.writeBytes(15, content_);
			}
			unknownFields.writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1)
				return size;

			size = 0;
			if (!getVersionBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
			}
			if (!getDeviceIdBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceId_);
			}
			if (cmd_ != 0) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, cmd_);
			}
			if (!getSenderBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sender_);
			}
			if (!getReceiverBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, receiver_);
			}
			if (!getGroupIdBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, groupId_);
			}
			if (msgtype_ != 0) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, msgtype_);
			}
			if (flag_ != 0) {
				size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, flag_);
			}
			if (!getPlatformBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, platform_);
			}
			if (!getPlatformVersionBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, platformVersion_);
			}
			if (!getTokenBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, token_);
			}
			if (!getAppKeyBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, appKey_);
			}
			if (!getTimeStampBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, timeStamp_);
			}
			if (!getSignBytes().isEmpty()) {
				size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, sign_);
			}
			if (!content_.isEmpty()) {
				size += com.google.protobuf.CodedOutputStream.computeBytesSize(15, content_);
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
			if (!(obj instanceof com.hlh.server.model.proto.MessageProto.Model)) {
				return super.equals(obj);
			}
			com.hlh.server.model.proto.MessageProto.Model other = (com.hlh.server.model.proto.MessageProto.Model) obj;

			boolean result = true;
			result = result && getVersion().equals(other.getVersion());
			result = result && getDeviceId().equals(other.getDeviceId());
			result = result && (getCmd() == other.getCmd());
			result = result && getSender().equals(other.getSender());
			result = result && getReceiver().equals(other.getReceiver());
			result = result && getGroupId().equals(other.getGroupId());
			result = result && (getMsgtype() == other.getMsgtype());
			result = result && (getFlag() == other.getFlag());
			result = result && getPlatform().equals(other.getPlatform());
			result = result && getPlatformVersion().equals(other.getPlatformVersion());
			result = result && getToken().equals(other.getToken());
			result = result && getAppKey().equals(other.getAppKey());
			result = result && getTimeStamp().equals(other.getTimeStamp());
			result = result && getSign().equals(other.getSign());
			result = result && getContent().equals(other.getContent());
			result = result && unknownFields.equals(other.unknownFields);
			return result;
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			hash = (37 * hash) + VERSION_FIELD_NUMBER;
			hash = (53 * hash) + getVersion().hashCode();
			hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
			hash = (53 * hash) + getDeviceId().hashCode();
			hash = (37 * hash) + CMD_FIELD_NUMBER;
			hash = (53 * hash) + getCmd();
			hash = (37 * hash) + SENDER_FIELD_NUMBER;
			hash = (53 * hash) + getSender().hashCode();
			hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
			hash = (53 * hash) + getReceiver().hashCode();
			hash = (37 * hash) + GROUPID_FIELD_NUMBER;
			hash = (53 * hash) + getGroupId().hashCode();
			hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
			hash = (53 * hash) + getMsgtype();
			hash = (37 * hash) + FLAG_FIELD_NUMBER;
			hash = (53 * hash) + getFlag();
			hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
			hash = (53 * hash) + getPlatform().hashCode();
			hash = (37 * hash) + PLATFORMVERSION_FIELD_NUMBER;
			hash = (53 * hash) + getPlatformVersion().hashCode();
			hash = (37 * hash) + TOKEN_FIELD_NUMBER;
			hash = (53 * hash) + getToken().hashCode();
			hash = (37 * hash) + APPKEY_FIELD_NUMBER;
			hash = (53 * hash) + getAppKey().hashCode();
			hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
			hash = (53 * hash) + getTimeStamp().hashCode();
			hash = (37 * hash) + SIGN_FIELD_NUMBER;
			hash = (53 * hash) + getSign().hashCode();
			hash = (37 * hash) + CONTENT_FIELD_NUMBER;
			hash = (53 * hash) + getContent().hashCode();
			hash = (29 * hash) + unknownFields.hashCode();
			return hash;
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(java.nio.ByteBuffer data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(java.nio.ByteBuffer data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseDelimitedFrom(java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
					extensionRegistry);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input) throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
		}

		public static com.hlh.server.model.proto.MessageProto.Model parseFrom(
				com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(com.hlh.server.model.proto.MessageProto.Model prothlhpe) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prothlhpe);
		}

		public Builder toBuilder() {
			return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
		}

		@java.lang.Override
		protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
				implements com.hlh.server.model.proto.MessageProto.ModelOrBuilder {
			public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
				return com.hlh.server.model.proto.MessageProto.internal_static_com_hlh_server_model_proto_Model_descriptor;
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
				return com.hlh.server.model.proto.MessageProto.internal_static_com_hlh_server_model_proto_Model_fieldAccessorTable
						.ensureFieldAccessorsInitialized(com.hlh.server.model.proto.MessageProto.Model.class,
								com.hlh.server.model.proto.MessageProto.Model.Builder.class);
			}

			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
				}
			}

			public Builder clear() {
				super.clear();
				version_ = "";

				deviceId_ = "";

				cmd_ = 0;

				sender_ = "";

				receiver_ = "";

				groupId_ = "";

				msgtype_ = 0;

				flag_ = 0;

				platform_ = "";

				platformVersion_ = "";

				token_ = "";

				appKey_ = "";

				timeStamp_ = "";

				sign_ = "";

				content_ = com.google.protobuf.ByteString.EMPTY;

				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
				return com.hlh.server.model.proto.MessageProto.internal_static_com_hlh_server_model_proto_Model_descriptor;
			}

			public com.hlh.server.model.proto.MessageProto.Model getDefaultInstanceForType() {
				return com.hlh.server.model.proto.MessageProto.Model.getDefaultInstance();
			}

			public com.hlh.server.model.proto.MessageProto.Model build() {
				com.hlh.server.model.proto.MessageProto.Model result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public com.hlh.server.model.proto.MessageProto.Model buildPartial() {
				com.hlh.server.model.proto.MessageProto.Model result = new com.hlh.server.model.proto.MessageProto.Model(
						this);
				result.version_ = version_;
				result.deviceId_ = deviceId_;
				result.cmd_ = cmd_;
				result.sender_ = sender_;
				result.receiver_ = receiver_;
				result.groupId_ = groupId_;
				result.msgtype_ = msgtype_;
				result.flag_ = flag_;
				result.platform_ = platform_;
				result.platformVersion_ = platformVersion_;
				result.token_ = token_;
				result.appKey_ = appKey_;
				result.timeStamp_ = timeStamp_;
				result.sign_ = sign_;
				result.content_ = content_;
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
					java.lang.Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
					java.lang.Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.hlh.server.model.proto.MessageProto.Model) {
					return mergeFrom((com.hlh.server.model.proto.MessageProto.Model) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.hlh.server.model.proto.MessageProto.Model other) {
				if (other == com.hlh.server.model.proto.MessageProto.Model.getDefaultInstance())
					return this;
				if (!other.getVersion().isEmpty()) {
					version_ = other.version_;
					onChanged();
				}
				if (!other.getDeviceId().isEmpty()) {
					deviceId_ = other.deviceId_;
					onChanged();
				}
				if (other.getCmd() != 0) {
					setCmd(other.getCmd());
				}
				if (!other.getSender().isEmpty()) {
					sender_ = other.sender_;
					onChanged();
				}
				if (!other.getReceiver().isEmpty()) {
					receiver_ = other.receiver_;
					onChanged();
				}
				if (!other.getGroupId().isEmpty()) {
					groupId_ = other.groupId_;
					onChanged();
				}
				if (other.getMsgtype() != 0) {
					setMsgtype(other.getMsgtype());
				}
				if (other.getFlag() != 0) {
					setFlag(other.getFlag());
				}
				if (!other.getPlatform().isEmpty()) {
					platform_ = other.platform_;
					onChanged();
				}
				if (!other.getPlatformVersion().isEmpty()) {
					platformVersion_ = other.platformVersion_;
					onChanged();
				}
				if (!other.getToken().isEmpty()) {
					token_ = other.token_;
					onChanged();
				}
				if (!other.getAppKey().isEmpty()) {
					appKey_ = other.appKey_;
					onChanged();
				}
				if (!other.getTimeStamp().isEmpty()) {
					timeStamp_ = other.timeStamp_;
					onChanged();
				}
				if (!other.getSign().isEmpty()) {
					sign_ = other.sign_;
					onChanged();
				}
				if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
					setContent(other.getContent());
				}
				this.mergeUnknownFields(other.unknownFields);
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
				com.hlh.server.model.proto.MessageProto.Model parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (com.hlh.server.model.proto.MessageProto.Model) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			private java.lang.Object version_ = "";

			/**
			 * <pre>
			 * 接口版本号
			 * </pre>
			 * 
			 * <code>string version = 1;</code>
			 */
			public java.lang.String getVersion() {
				java.lang.Object ref = version_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					version_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 接口版本号
			 * </pre>
			 * 
			 * <code>string version = 1;</code>
			 */
			public com.google.protobuf.ByteString getVersionBytes() {
				java.lang.Object ref = version_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					version_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 接口版本号
			 * </pre>
			 * 
			 * <code>string version = 1;</code>
			 */
			public Builder setVersion(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				version_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 接口版本号
			 * </pre>
			 * 
			 * <code>string version = 1;</code>
			 */
			public Builder clearVersion() {

				version_ = getDefaultInstance().getVersion();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 接口版本号
			 * </pre>
			 * 
			 * <code>string version = 1;</code>
			 */
			public Builder setVersionBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				version_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object deviceId_ = "";

			/**
			 * <pre>
			 * 设备uuid
			 * </pre>
			 * 
			 * <code>string deviceId = 2;</code>
			 */
			public java.lang.String getDeviceId() {
				java.lang.Object ref = deviceId_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					deviceId_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 设备uuid
			 * </pre>
			 * 
			 * <code>string deviceId = 2;</code>
			 */
			public com.google.protobuf.ByteString getDeviceIdBytes() {
				java.lang.Object ref = deviceId_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					deviceId_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 设备uuid
			 * </pre>
			 * 
			 * <code>string deviceId = 2;</code>
			 */
			public Builder setDeviceId(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				deviceId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 设备uuid
			 * </pre>
			 * 
			 * <code>string deviceId = 2;</code>
			 */
			public Builder clearDeviceId() {

				deviceId_ = getDefaultInstance().getDeviceId();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 设备uuid
			 * </pre>
			 * 
			 * <code>string deviceId = 2;</code>
			 */
			public Builder setDeviceIdBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				deviceId_ = value;
				onChanged();
				return this;
			}

			private int cmd_;

			/**
			 * <pre>
			 * 请求接口命令字  1绑定  2心跳   3上线   4下线
			 * </pre>
			 * 
			 * <code>uint32 cmd = 3;</code>
			 */
			public int getCmd() {
				return cmd_;
			}

			/**
			 * <pre>
			 * 请求接口命令字  1绑定  2心跳   3上线   4下线
			 * </pre>
			 * 
			 * <code>uint32 cmd = 3;</code>
			 */
			public Builder setCmd(int value) {

				cmd_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 请求接口命令字  1绑定  2心跳   3上线   4下线
			 * </pre>
			 * 
			 * <code>uint32 cmd = 3;</code>
			 */
			public Builder clearCmd() {

				cmd_ = 0;
				onChanged();
				return this;
			}

			private java.lang.Object sender_ = "";

			/**
			 * <pre>
			 * 发送人
			 * </pre>
			 * 
			 * <code>string sender = 4;</code>
			 */
			public java.lang.String getSender() {
				java.lang.Object ref = sender_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					sender_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 发送人
			 * </pre>
			 * 
			 * <code>string sender = 4;</code>
			 */
			public com.google.protobuf.ByteString getSenderBytes() {
				java.lang.Object ref = sender_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					sender_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 发送人
			 * </pre>
			 * 
			 * <code>string sender = 4;</code>
			 */
			public Builder setSender(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				sender_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 发送人
			 * </pre>
			 * 
			 * <code>string sender = 4;</code>
			 */
			public Builder clearSender() {

				sender_ = getDefaultInstance().getSender();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 发送人
			 * </pre>
			 * 
			 * <code>string sender = 4;</code>
			 */
			public Builder setSenderBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				sender_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object receiver_ = "";

			/**
			 * <pre>
			 * 接收人
			 * </pre>
			 * 
			 * <code>string receiver = 5;</code>
			 */
			public java.lang.String getReceiver() {
				java.lang.Object ref = receiver_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					receiver_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 接收人
			 * </pre>
			 * 
			 * <code>string receiver = 5;</code>
			 */
			public com.google.protobuf.ByteString getReceiverBytes() {
				java.lang.Object ref = receiver_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					receiver_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 接收人
			 * </pre>
			 * 
			 * <code>string receiver = 5;</code>
			 */
			public Builder setReceiver(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				receiver_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 接收人
			 * </pre>
			 * 
			 * <code>string receiver = 5;</code>
			 */
			public Builder clearReceiver() {

				receiver_ = getDefaultInstance().getReceiver();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 接收人
			 * </pre>
			 * 
			 * <code>string receiver = 5;</code>
			 */
			public Builder setReceiverBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				receiver_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object groupId_ = "";

			/**
			 * <pre>
			 * 用户组编号
			 * </pre>
			 * 
			 * <code>string groupId = 6;</code>
			 */
			public java.lang.String getGroupId() {
				java.lang.Object ref = groupId_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					groupId_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 用户组编号
			 * </pre>
			 * 
			 * <code>string groupId = 6;</code>
			 */
			public com.google.protobuf.ByteString getGroupIdBytes() {
				java.lang.Object ref = groupId_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					groupId_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 用户组编号
			 * </pre>
			 * 
			 * <code>string groupId = 6;</code>
			 */
			public Builder setGroupId(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				groupId_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 用户组编号
			 * </pre>
			 * 
			 * <code>string groupId = 6;</code>
			 */
			public Builder clearGroupId() {

				groupId_ = getDefaultInstance().getGroupId();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 用户组编号
			 * </pre>
			 * 
			 * <code>string groupId = 6;</code>
			 */
			public Builder setGroupIdBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				groupId_ = value;
				onChanged();
				return this;
			}

			private int msgtype_;

			/**
			 * <pre>
			 * 请求1，应答2，通知3，响应4  format
			 * </pre>
			 * 
			 * <code>uint32 msgtype = 7;</code>
			 */
			public int getMsgtype() {
				return msgtype_;
			}

			/**
			 * <pre>
			 * 请求1，应答2，通知3，响应4  format
			 * </pre>
			 * 
			 * <code>uint32 msgtype = 7;</code>
			 */
			public Builder setMsgtype(int value) {

				msgtype_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 请求1，应答2，通知3，响应4  format
			 * </pre>
			 * 
			 * <code>uint32 msgtype = 7;</code>
			 */
			public Builder clearMsgtype() {

				msgtype_ = 0;
				onChanged();
				return this;
			}

			private int flag_;

			/**
			 * <pre>
			 * 1 rsa加密 2aes加密
			 * </pre>
			 * 
			 * <code>uint32 flag = 8;</code>
			 */
			public int getFlag() {
				return flag_;
			}

			/**
			 * <pre>
			 * 1 rsa加密 2aes加密
			 * </pre>
			 * 
			 * <code>uint32 flag = 8;</code>
			 */
			public Builder setFlag(int value) {

				flag_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 1 rsa加密 2aes加密
			 * </pre>
			 * 
			 * <code>uint32 flag = 8;</code>
			 */
			public Builder clearFlag() {

				flag_ = 0;
				onChanged();
				return this;
			}

			private java.lang.Object platform_ = "";

			/**
			 * <pre>
			 * mobile-ios mobile-android pc-windows pc-mac
			 * </pre>
			 * 
			 * <code>string platform = 9;</code>
			 */
			public java.lang.String getPlatform() {
				java.lang.Object ref = platform_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					platform_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * mobile-ios mobile-android pc-windows pc-mac
			 * </pre>
			 * 
			 * <code>string platform = 9;</code>
			 */
			public com.google.protobuf.ByteString getPlatformBytes() {
				java.lang.Object ref = platform_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					platform_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * mobile-ios mobile-android pc-windows pc-mac
			 * </pre>
			 * 
			 * <code>string platform = 9;</code>
			 */
			public Builder setPlatform(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				platform_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * mobile-ios mobile-android pc-windows pc-mac
			 * </pre>
			 * 
			 * <code>string platform = 9;</code>
			 */
			public Builder clearPlatform() {

				platform_ = getDefaultInstance().getPlatform();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * mobile-ios mobile-android pc-windows pc-mac
			 * </pre>
			 * 
			 * <code>string platform = 9;</code>
			 */
			public Builder setPlatformBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				platform_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object platformVersion_ = "";

			/**
			 * <pre>
			 * 客户端版本号
			 * </pre>
			 * 
			 * <code>string platformVersion = 10;</code>
			 */
			public java.lang.String getPlatformVersion() {
				java.lang.Object ref = platformVersion_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					platformVersion_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端版本号
			 * </pre>
			 * 
			 * <code>string platformVersion = 10;</code>
			 */
			public com.google.protobuf.ByteString getPlatformVersionBytes() {
				java.lang.Object ref = platformVersion_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					platformVersion_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端版本号
			 * </pre>
			 * 
			 * <code>string platformVersion = 10;</code>
			 */
			public Builder setPlatformVersion(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				platformVersion_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端版本号
			 * </pre>
			 * 
			 * <code>string platformVersion = 10;</code>
			 */
			public Builder clearPlatformVersion() {

				platformVersion_ = getDefaultInstance().getPlatformVersion();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端版本号
			 * </pre>
			 * 
			 * <code>string platformVersion = 10;</code>
			 */
			public Builder setPlatformVersionBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				platformVersion_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object token_ = "";

			/**
			 * <pre>
			 * 客户端凭证
			 * </pre>
			 * 
			 * <code>string token = 11;</code>
			 */
			public java.lang.String getToken() {
				java.lang.Object ref = token_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					token_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端凭证
			 * </pre>
			 * 
			 * <code>string token = 11;</code>
			 */
			public com.google.protobuf.ByteString getTokenBytes() {
				java.lang.Object ref = token_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					token_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端凭证
			 * </pre>
			 * 
			 * <code>string token = 11;</code>
			 */
			public Builder setToken(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				token_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端凭证
			 * </pre>
			 * 
			 * <code>string token = 11;</code>
			 */
			public Builder clearToken() {

				token_ = getDefaultInstance().getToken();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端凭证
			 * </pre>
			 * 
			 * <code>string token = 11;</code>
			 */
			public Builder setTokenBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				token_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object appKey_ = "";

			/**
			 * <pre>
			 * 客户端key
			 * </pre>
			 * 
			 * <code>string appKey = 12;</code>
			 */
			public java.lang.String getAppKey() {
				java.lang.Object ref = appKey_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					appKey_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端key
			 * </pre>
			 * 
			 * <code>string appKey = 12;</code>
			 */
			public com.google.protobuf.ByteString getAppKeyBytes() {
				java.lang.Object ref = appKey_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					appKey_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 客户端key
			 * </pre>
			 * 
			 * <code>string appKey = 12;</code>
			 */
			public Builder setAppKey(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				appKey_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端key
			 * </pre>
			 * 
			 * <code>string appKey = 12;</code>
			 */
			public Builder clearAppKey() {

				appKey_ = getDefaultInstance().getAppKey();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 客户端key
			 * </pre>
			 * 
			 * <code>string appKey = 12;</code>
			 */
			public Builder setAppKeyBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				appKey_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object timeStamp_ = "";

			/**
			 * <pre>
			 * 时间戳
			 * </pre>
			 * 
			 * <code>string timeStamp = 13;</code>
			 */
			public java.lang.String getTimeStamp() {
				java.lang.Object ref = timeStamp_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					timeStamp_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 时间戳
			 * </pre>
			 * 
			 * <code>string timeStamp = 13;</code>
			 */
			public com.google.protobuf.ByteString getTimeStampBytes() {
				java.lang.Object ref = timeStamp_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					timeStamp_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 时间戳
			 * </pre>
			 * 
			 * <code>string timeStamp = 13;</code>
			 */
			public Builder setTimeStamp(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				timeStamp_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 时间戳
			 * </pre>
			 * 
			 * <code>string timeStamp = 13;</code>
			 */
			public Builder clearTimeStamp() {

				timeStamp_ = getDefaultInstance().getTimeStamp();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 时间戳
			 * </pre>
			 * 
			 * <code>string timeStamp = 13;</code>
			 */
			public Builder setTimeStampBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				timeStamp_ = value;
				onChanged();
				return this;
			}

			private java.lang.Object sign_ = "";

			/**
			 * <pre>
			 * 签名
			 * </pre>
			 * 
			 * <code>string sign = 14;</code>
			 */
			public java.lang.String getSign() {
				java.lang.Object ref = sign_;
				if (!(ref instanceof java.lang.String)) {
					com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
					java.lang.String s = bs.toStringUtf8();
					sign_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <pre>
			 * 签名
			 * </pre>
			 * 
			 * <code>string sign = 14;</code>
			 */
			public com.google.protobuf.ByteString getSignBytes() {
				java.lang.Object ref = sign_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b = com.google.protobuf.ByteString
							.copyFromUtf8((java.lang.String) ref);
					sign_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <pre>
			 * 签名
			 * </pre>
			 * 
			 * <code>string sign = 14;</code>
			 */
			public Builder setSign(java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}

				sign_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 签名
			 * </pre>
			 * 
			 * <code>string sign = 14;</code>
			 */
			public Builder clearSign() {

				sign_ = getDefaultInstance().getSign();
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 签名
			 * </pre>
			 * 
			 * <code>string sign = 14;</code>
			 */
			public Builder setSignBytes(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				checkByteStringIsUtf8(value);

				sign_ = value;
				onChanged();
				return this;
			}

			private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;

			/**
			 * <pre>
			 * 请求数据
			 * </pre>
			 * 
			 * <code>bytes content = 15;</code>
			 */
			public com.google.protobuf.ByteString getContent() {
				return content_;
			}

			/**
			 * <pre>
			 * 请求数据
			 * </pre>
			 * 
			 * <code>bytes content = 15;</code>
			 */
			public Builder setContent(com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}

				content_ = value;
				onChanged();
				return this;
			}

			/**
			 * <pre>
			 * 请求数据
			 * </pre>
			 * 
			 * <code>bytes content = 15;</code>
			 */
			public Builder clearContent() {

				content_ = getDefaultInstance().getContent();
				onChanged();
				return this;
			}

			public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFieldsProto3(unknownFields);
			}

			public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}

			// @@protoc_insertion_point(builder_scope:com.hlh.server.model.proto.Model)
		}

		// @@protoc_insertion_point(class_scope:com.hlh.server.model.proto.Model)
		private static final com.hlh.server.model.proto.MessageProto.Model DEFAULT_INSTANCE;
		static {
			DEFAULT_INSTANCE = new com.hlh.server.model.proto.MessageProto.Model();
		}

		public static com.hlh.server.model.proto.MessageProto.Model getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		private static final com.google.protobuf.Parser<Model> PARSER = new com.google.protobuf.AbstractParser<Model>() {
			public Model parsePartialFrom(com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new Model(input, extensionRegistry);
			}
		};

		public static com.google.protobuf.Parser<Model> parser() {
			return PARSER;
		}

		@java.lang.Override
		public com.google.protobuf.Parser<Model> getParserForType() {
			return PARSER;
		}

		public com.hlh.server.model.proto.MessageProto.Model getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

	}

	private static final com.google.protobuf.Descriptors.Descriptor internal_static_com_hlh_server_model_proto_Model_descriptor;
	private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_com_hlh_server_model_proto_Model_fieldAccessorTable;

	public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
	static {
		java.lang.String[] descriptorData = { "\n\030proto/java/Message.proto\022\035com.hlh.s"
				+ "erver.model.proto\"\205\002\n\005Model\022\017\n\007version\030\001"
				+ " \001(\t\022\020\n\010deviceId\030\002 \001(\t\022\013\n\003cmd\030\003 \001(\r\022\016\n\006s"
				+ "ender\030\004 \001(\t\022\020\n\010receiver\030\005 \001(\t\022\017\n\007groupId"
				+ "\030\006 \001(\t\022\017\n\007msgtype\030\007 \001(\r\022\014\n\004flag\030\010 \001(\r\022\020\n"
				+ "\010platform\030\t \001(\t\022\027\n\017platformVersion\030\n \001(\t"
				+ "\022\r\n\005token\030\013 \001(\t\022\016\n\006appKey\030\014 \001(\t\022\021\n\ttimeS"
				+ "tamp\030\r \001(\t\022\014\n\004sign\030\016 \001(\t\022\017\n\007content\030\017 \001("
				+ "\014B\016B\014MessageProtob\006proto3" };
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
			public com.google.protobuf.ExtensionRegistry assignDescriptors(
					com.google.protobuf.Descriptors.FileDescriptor root) {
				descriptor = root;
				return null;
			}
		};
		com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
				new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
		internal_static_com_hlh_server_model_proto_Model_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_com_hlh_server_model_proto_Model_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_com_hlh_server_model_proto_Model_descriptor,
				new java.lang.String[] { "Version", "DeviceId", "Cmd", "Sender", "Receiver", "GroupId", "Msgtype",
						"Flag", "Platform", "PlatformVersion", "Token", "AppKey", "TimeStamp", "Sign", "Content", });
	}

}
