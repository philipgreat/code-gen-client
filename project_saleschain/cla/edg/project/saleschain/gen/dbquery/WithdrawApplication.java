package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WithdrawApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.withdrawapplication.WithdrawApplication";
  }
  // 枚举对象

  // 引用的对象

  public WithdrawStatus status() {
    WithdrawStatus member = new WithdrawStatus();
    member.setModelTypeName("withdraw_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public MobileUser applicant() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("applicant");
    member.setMemberName("applicant");
    member.setReferDirection(true);
    member.setRelationName("applicant");
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

  public EventSubmitWithdrawResult eventSubmitWithdrawResultList() {
    EventSubmitWithdrawResult member = new EventSubmitWithdrawResult();
    member.setModelTypeName("event_submit_withdraw_result");
    member.setName("application");
    member.setMemberName("eventSubmitWithdrawResultList");
    member.setRelationName("application");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comments");
    member.setName("comments");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receivingAccountName");
    member.setName("receiving_account_name");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("receivingAccountMobile");
    member.setName("receiving_account_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountBankId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receivingAccountBankId");
    member.setName("receiving_account_bank_id");
    useMember(member);
    return member;
  }

  public StringAttribute receivingAccountAlipayId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_email");
    // member.setName("receivingAccountAlipayId");
    member.setName("receiving_account_alipay_id");
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
