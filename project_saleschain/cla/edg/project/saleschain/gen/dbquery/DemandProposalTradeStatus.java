package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandProposalTradeStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandproposaltradestatus.DemandProposalTradeStatus";
  }
  // 枚举对象
  public static EnumAttribute SUCCESS =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposaltradestatus.DemandProposalTradeStatus",
              "SUCCESS")
          .chineseName("成交");
  public static EnumAttribute FAILED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposaltradestatus.DemandProposalTradeStatus",
              "FAILED")
          .chineseName("未成交");
  public static EnumAttribute CONFIRMED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposaltradestatus.DemandProposalTradeStatus",
              "CONFIRMED")
          .chineseName("成交已确认");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {SUCCESS, FAILED, CONFIRMED};
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

  public DemandProposalTrade demandProposalTradeList() {
    DemandProposalTrade member = new DemandProposalTrade();
    member.setModelTypeName("demand_proposal_trade");
    member.setName("demand_proposal_trade_status");
    member.setMemberName("demandProposalTradeList");
    member.setRelationName("demandProposalTradeStatus");
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
