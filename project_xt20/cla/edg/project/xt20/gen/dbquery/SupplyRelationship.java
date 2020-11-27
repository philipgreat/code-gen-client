package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplyRelationship extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.supplyrelationship.SupplyRelationship";
  }
  // 枚举对象

  // 引用的对象

  public Merchant supplier() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("supplier");
    member.setMemberName("supplier");
    member.setReferDirection(true);
    member.setRelationName("supplier");
    append(member);
    return member;
  }

  public Merchant customer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("customer");
    member.setMemberName("customer");
    member.setReferDirection(true);
    member.setRelationName("customer");
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

  public StringAttribute supplierComment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("supplierComment");
    member.setName("supplier_comment");
    useMember(member);
    return member;
  }

  public StringAttribute customerComment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("customerComment");
    member.setName("customer_comment");
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
