package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProductInbound extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventproductinbound.EventProductInbound";
  }
  // 枚举对象

  // 引用的对象

  public GasProduct product() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("product");
    member.setMemberName("product");
    member.setReferDirection(true);
    member.setRelationName("product");
    append(member);
    return member;
  }

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

  public StringAttribute inboundType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("inboundType");
    member.setName("inbound_type");
    useMember(member);
    return member;
  }

  public NumberAttribute number() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("number");
    member.setName("number");
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
