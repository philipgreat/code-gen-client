package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelImages extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.systemlevelimages.SystemLevelImages";
  }
  // 枚举对象
  public static EnumAttribute PERSONAL_AVATAR =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelimages.SystemLevelImages",
              "PERSONAL_AVATAR")
          .chineseName("默认用户头像");
  public static EnumAttribute AGENT_LOGO =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelimages.SystemLevelImages", "AGENT_LOGO")
          .chineseName("默认代理商头像");
  public static EnumAttribute FACTORY_LOGO =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelimages.SystemLevelImages", "FACTORY_LOGO")
          .chineseName("默认工厂图片");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PERSONAL_AVATAR, AGENT_LOGO, FACTORY_LOGO};
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
    member.setModelTypeName("string_image");
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
