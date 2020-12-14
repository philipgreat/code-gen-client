package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProductBack extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.productback.ProductBack";
  }
  // 枚举对象

  // 引用的对象

  public GasProduct proudct() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("proudct");
    member.setMemberName("proudct");
    member.setReferDirection(true);
    member.setRelationName("proudct");
    append(member);
    return member;
  }

  public DeliverTask task() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("task");
    member.setMemberName("task");
    member.setReferDirection(true);
    member.setRelationName("task");
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

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute realQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("realQuantity");
    member.setName("real_quantity");
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
