package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandstatus.DemandStatus";
  }
  // 枚举对象
  public static EnumAttribute SUBMITTED =
      new EnumAttribute("com.doublechaintech.saleschain.demandstatus.DemandStatus", "SUBMITTED")
          .chineseName("已提交");
  public static EnumAttribute CONNECTING =
      new EnumAttribute("com.doublechaintech.saleschain.demandstatus.DemandStatus", "CONNECTING")
          .chineseName("对接中");
  public static EnumAttribute TRADE_PROCESSING =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandstatus.DemandStatus", "TRADE_PROCESSING")
          .chineseName("交易中");
  public static EnumAttribute PENDING_CLEAR =
      new EnumAttribute("com.doublechaintech.saleschain.demandstatus.DemandStatus", "PENDING_CLEAR")
          .chineseName("核算中");
  public static EnumAttribute CLEARED =
      new EnumAttribute("com.doublechaintech.saleschain.demandstatus.DemandStatus", "CLEARED")
          .chineseName("已结算");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.doublechaintech.saleschain.demandstatus.DemandStatus", "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      SUBMITTED, CONNECTING, TRADE_PROCESSING, PENDING_CLEAR, CLEARED, CANCELLED
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

  public Demand demandList() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("demand_status");
    member.setMemberName("demandList");
    member.setRelationName("demandStatus");
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
