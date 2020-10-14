package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelContent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.systemlevelcontent.SystemLevelContent";
  }
  // 枚举对象
  public static EnumAttribute CONTACT_US =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelcontent.SystemLevelContent", "CONTACT_US")
          .chineseName("联系我们");
  public static EnumAttribute AD_4_SCAN =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelcontent.SystemLevelContent", "AD_4_SCAN")
          .chineseName("非用户扫码");
  public static EnumAttribute NO_WORK_MESSAGE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelcontent.SystemLevelContent",
              "NO_WORK_MESSAGE")
          .chineseName("待定岗用户提示");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {CONTACT_US, AD_4_SCAN, NO_WORK_MESSAGE};
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

  public StringAttribute value() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("value");
    member.setName("value");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
