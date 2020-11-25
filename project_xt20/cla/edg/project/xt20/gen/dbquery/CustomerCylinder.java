package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomerCylinder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.customercylinder.CustomerCylinder";
  }
  // 枚举对象

  // 引用的对象

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

  public Company customer() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("customer");
    member.setMemberName("customer");
    member.setReferDirection(true);
    member.setRelationName("customer");
    append(member);
    return member;
  }

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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
