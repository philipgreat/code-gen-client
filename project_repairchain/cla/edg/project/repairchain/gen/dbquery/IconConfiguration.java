package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IconConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration";
  }
  // 枚举对象
  public static EnumAttribute CHECK_IN =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "CHECK_IN")
          .chineseName("签到打卡");
  public static EnumAttribute INVITE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "INVITE")
          .chineseName("邀请好友");
  public static EnumAttribute ACCOUNT_BOOK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "ACCOUNT_BOOK")
          .chineseName("账户管理");
  public static EnumAttribute MESSAGE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "MESSAGE")
          .chineseName("消息通知");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {CHECK_IN, INVITE, ACCOUNT_BOOK, MESSAGE};
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
