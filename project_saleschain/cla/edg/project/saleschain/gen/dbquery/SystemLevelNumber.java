package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelNumber extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.systemlevelnumber.SystemLevelNumber";
  }
  // 枚举对象
  public static EnumAttribute UPPER_REWARD_RATE =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelnumber.SystemLevelNumber",
              "UPPER_REWARD_RATE")
          .chineseName("上级分成");
  public static EnumAttribute DEFAULT_REWARD_RATE =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelnumber.SystemLevelNumber",
              "DEFAULT_REWARD_RATE")
          .chineseName("默认分成");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {UPPER_REWARD_RATE, DEFAULT_REWARD_RATE};
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

  public NumberAttribute value() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("value");
    member.setName("value");
    useMember(member);
    return member;
  }

  public NumberAttribute minValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("minValue");
    member.setName("min_value");
    useMember(member);
    return member;
  }

  public NumberAttribute maxValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("maxValue");
    member.setName("max_value");
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
