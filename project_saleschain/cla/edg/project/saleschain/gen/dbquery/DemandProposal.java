package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandProposal extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandproposal.DemandProposal";
  }
  // 枚举对象

  // 引用的对象

  public Demand demand() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("demand");
    member.setMemberName("demand");
    member.setReferDirection(true);
    member.setRelationName("demand");
    append(member);
    return member;
  }

  public Supplier supplier() {
    Supplier member = new Supplier();
    member.setModelTypeName("supplier");
    member.setName("supplier");
    member.setMemberName("supplier");
    member.setReferDirection(true);
    member.setRelationName("supplier");
    append(member);
    return member;
  }

  public DemandProposalStatus userStatus() {
    DemandProposalStatus member = new DemandProposalStatus();
    member.setModelTypeName("demand_proposal_status");
    member.setName("user_status");
    member.setMemberName("userStatus");
    member.setReferDirection(true);
    member.setRelationName("userStatus");
    append(member);
    return member;
  }

  public DemandProposalStatus supplierStatus() {
    DemandProposalStatus member = new DemandProposalStatus();
    member.setModelTypeName("demand_proposal_status");
    member.setName("supplier_status");
    member.setMemberName("supplierStatus");
    member.setReferDirection(true);
    member.setRelationName("supplierStatus");
    append(member);
    return member;
  }

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
    member.setName("demand_proposal");
    member.setMemberName("demandProposalTradeList");
    member.setRelationName("demandProposal");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalLog demandProposalLogList() {
    DemandProposalLog member = new DemandProposalLog();
    member.setModelTypeName("demand_proposal_log");
    member.setName("demand_proposal");
    member.setMemberName("demandProposalLogList");
    member.setRelationName("demandProposal");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventConfirmation eventConfirmationList() {
    EventConfirmation member = new EventConfirmation();
    member.setModelTypeName("event_confirmation");
    member.setName("proposal");
    member.setMemberName("eventConfirmationList");
    member.setRelationName("proposal");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPlatformFinalizeReward eventPlatformFinalizeRewardList() {
    EventPlatformFinalizeReward member = new EventPlatformFinalizeReward();
    member.setModelTypeName("event_platform_finalize_reward");
    member.setName("proposal");
    member.setMemberName("eventPlatformFinalizeRewardList");
    member.setRelationName("proposal");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
