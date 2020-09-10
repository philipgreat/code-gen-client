package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandProposalTrade extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandproposaltrade.DemandProposalTrade";
  }
  // 枚举对象

  // 引用的对象

  public DemandProposal demandProposal() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("demand_proposal");
    member.setMemberName("demandProposal");
    member.setReferDirection(true);
    member.setRelationName("demandProposal");
    append(member);
    return member;
  }

  public MobileUser informant() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("informant");
    member.setMemberName("informant");
    member.setReferDirection(true);
    member.setRelationName("informant");
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

  public DemandProposalTradeStatus demandProposalTradeStatus() {
    DemandProposalTradeStatus member = new DemandProposalTradeStatus();
    member.setModelTypeName("demand_proposal_trade_status");
    member.setName("demand_proposal_trade_status");
    member.setMemberName("demandProposalTradeStatus");
    member.setReferDirection(true);
    member.setRelationName("demandProposalTradeStatus");
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public NumberAttribute informantConfirmAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("informantConfirmAmount");
    member.setName("informant_confirm_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute supplierConfirmAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("supplierConfirmAmount");
    member.setName("supplier_confirm_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute adminConfirmAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("adminConfirmAmount");
    member.setName("admin_confirm_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute bonusRate() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bonusRate");
    member.setName("bonus_rate");
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
