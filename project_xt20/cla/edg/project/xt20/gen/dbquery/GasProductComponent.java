package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductComponent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproductcomponent.GasProductComponent";
  }
  // 枚举对象

  // 引用的对象

  public GasComponent component() {
    GasComponent member = new GasComponent();
    member.setModelTypeName("gas_component");
    member.setName("component");
    member.setMemberName("component");
    member.setReferDirection(true);
    member.setRelationName("component");
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

  public NumberAttribute percentage() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("percentage");
    member.setName("percentage");
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
