package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventWithdrawApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.eventwithdrawapplication.EventWithdrawApplication";
  }
  // 枚举对象

  // 引用的对象

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public StringAttribute receiverName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("receiverName");
    member.setName("receiver_name");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute bankName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bankName");
    member.setName("bank_name");
    useMember(member);
    return member;
  }

  public StringAttribute bandAccount() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("bandAccount");
    member.setName("band_account");
    useMember(member);
    return member;
  }

  public StringAttribute alipayId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("alipayId");
    member.setName("alipay_id");
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
