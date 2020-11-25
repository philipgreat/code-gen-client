package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasLineItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gaslineitem.GasLineItem";
  }
  // 枚举对象

  // 引用的对象

  public GasCylinder cylinder() {
    GasCylinder member = new GasCylinder();
    member.setModelTypeName("gas_cylinder");
    member.setName("cylinder");
    member.setMemberName("cylinder");
    member.setReferDirection(true);
    member.setRelationName("cylinder");
    append(member);
    return member;
  }

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

  public GasProductTemplate template() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("template");
    member.setMemberName("template");
    member.setReferDirection(true);
    member.setRelationName("template");
    append(member);
    return member;
  }

  public Company company() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("company");
    member.setMemberName("company");
    member.setReferDirection(true);
    member.setRelationName("company");
    append(member);
    return member;
  }

  public SellOrder sellOrder() {
    SellOrder member = new SellOrder();
    member.setModelTypeName("sell_order");
    member.setName("sell_order");
    member.setMemberName("sellOrder");
    member.setReferDirection(true);
    member.setRelationName("sellOrder");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
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

  public NumberAttribute backQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("backQuantity");
    member.setName("back_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute loadQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("loadQuantity");
    member.setName("load_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute receivedQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("receivedQuantity");
    member.setName("received_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute receivedBackQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("receivedBackQuantity");
    member.setName("received_back_quantity");
    useMember(member);
    return member;
  }

  public StringAttribute component() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("component");
    member.setName("component");
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
