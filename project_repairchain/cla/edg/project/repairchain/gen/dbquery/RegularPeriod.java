package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RegularPeriod extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.regularperiod.RegularPeriod";
  }
  // 枚举对象
  public static EnumAttribute ANNUALLY =
      new EnumAttribute("com.doublechaintech.repairchain.regularperiod.RegularPeriod", "ANNUALLY")
          .chineseName("按年循环");
  public static EnumAttribute MONTHLY =
      new EnumAttribute("com.doublechaintech.repairchain.regularperiod.RegularPeriod", "MONTHLY")
          .chineseName("按月循环");
  public static EnumAttribute WEEKLY =
      new EnumAttribute("com.doublechaintech.repairchain.regularperiod.RegularPeriod", "WEEKLY")
          .chineseName("按周循环");
  public static EnumAttribute DAILY =
      new EnumAttribute("com.doublechaintech.repairchain.regularperiod.RegularPeriod", "DAILY")
          .chineseName("每天循环");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {ANNUALLY, MONTHLY, WEEKLY, DAILY};
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

  public RegularMaintainPlan regularMaintainPlanList() {
    RegularMaintainPlan member = new RegularMaintainPlan();
    member.setModelTypeName("regular_maintain_plan");
    member.setName("regular_period");
    member.setMemberName("regularMaintainPlanList");
    member.setRelationName("regularPeriod");
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
