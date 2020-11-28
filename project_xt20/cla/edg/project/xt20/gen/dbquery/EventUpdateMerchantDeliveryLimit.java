package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventUpdateMerchantDeliveryLimit extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventupdatemerchantdeliverylimit.EventUpdateMerchantDeliveryLimit";
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

  public StringAttribute merchantId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("merchantId");
    member.setName("merchant_id");
    useMember(member);
    return member;
  }

  public StringAttribute deliveryLimit() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("deliveryLimit");
    member.setName("delivery_limit");
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
