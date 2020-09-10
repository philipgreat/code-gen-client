package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WithdrawStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus";
  }
  // 枚举对象
  public static EnumAttribute NEED_EXPORT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus", "NEED_EXPORT")
          .chineseName("处理中");
  public static EnumAttribute NEED_OFFLINE_PROCESSING =
      new EnumAttribute(
              "com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus",
              "NEED_OFFLINE_PROCESSING")
          .chineseName("已受理");
  public static EnumAttribute NEED_TAKE_OFF_FROZEN =
      new EnumAttribute(
              "com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus",
              "NEED_TAKE_OFF_FROZEN")
          .chineseName("银行通过");
  public static EnumAttribute NEED_RELEASE_FROZEN =
      new EnumAttribute(
              "com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus", "NEED_RELEASE_FROZEN")
          .chineseName("银行失败");
  public static EnumAttribute SUCCESS =
      new EnumAttribute("com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus", "SUCCESS")
          .chineseName("已办结");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.doublechaintech.saleschain.withdrawstatus.WithdrawStatus", "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      NEED_EXPORT,
      NEED_OFFLINE_PROCESSING,
      NEED_TAKE_OFF_FROZEN,
      NEED_RELEASE_FROZEN,
      SUCCESS,
      CANCELLED
    };
  }

  // 引用的对象

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
    append(member);
    return member;
  }

  // 被引用的对象

  public WithdrawApplication withdrawApplicationList() {
    WithdrawApplication member = new WithdrawApplication();
    member.setModelTypeName("withdraw_application");
    member.setName("status");
    member.setMemberName("withdrawApplicationList");
    member.setRelationName("status");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
