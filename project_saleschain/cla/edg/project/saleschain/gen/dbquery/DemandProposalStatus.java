package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandProposalStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus";
  }
  // 枚举对象
  public static EnumAttribute WAIT_CONNECT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "WAIT_CONNECT")
          .chineseName("对接中");
  public static EnumAttribute CONNECTED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "CONNECTED")
          .chineseName("已对接");
  public static EnumAttribute WAIT_DEAL =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "WAIT_DEAL")
          .chineseName("交易中");
  public static EnumAttribute DEAL =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus", "DEAL")
          .chineseName("已成交");
  public static EnumAttribute ACCOUNTING =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "ACCOUNTING")
          .chineseName("核算中");
  public static EnumAttribute COMPLETED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "COMPLETED")
          .chineseName("已完成");
  public static EnumAttribute CANCELLED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.demandproposalstatus.DemandProposalStatus",
              "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      WAIT_CONNECT, CONNECTED, WAIT_DEAL, DEAL, ACCOUNTING, COMPLETED, CANCELLED
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

  public DemandProposal demandProposalListAsUserStatus() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("user_status");
    member.setMemberName("demandProposalListAsUserStatus");
    member.setRelationName("userStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposal demandProposalListAsSupplierStatus() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("supplier_status");
    member.setMemberName("demandProposalListAsSupplierStatus");
    member.setRelationName("userStatus");
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
