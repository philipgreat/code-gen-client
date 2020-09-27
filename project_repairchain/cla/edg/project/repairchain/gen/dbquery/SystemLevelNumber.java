package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelNumber extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber";
  }
  // 枚举对象
  public static EnumAttribute REVIEW_TIMEOUT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber",
              "REVIEW_TIMEOUT")
          .chineseName("审核超时(小时)");
  public static EnumAttribute UPDATE_TIMEOUT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber",
              "UPDATE_TIMEOUT")
          .chineseName("更新超时(小时)");
  public static EnumAttribute REPAIR_TIMEOUT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber",
              "REPAIR_TIMEOUT")
          .chineseName("维修超时(小时)");
  public static EnumAttribute CONFIRM_TIMEOUT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber",
              "CONFIRM_TIMEOUT")
          .chineseName("确认超时(小时)");
  public static EnumAttribute TIME_TO_REMIND =
      new EnumAttribute(
              "com.doublechaintech.repairchain.systemlevelnumber.SystemLevelNumber",
              "TIME_TO_REMIND")
          .chineseName("提前提醒(小时)");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      REVIEW_TIMEOUT, UPDATE_TIMEOUT, REPAIR_TIMEOUT, CONFIRM_TIMEOUT, TIME_TO_REMIND
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
