package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Warehouse extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.warehouse.Warehouse";
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

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute telephone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("telephone");
    member.setName("telephone");
    useMember(member);
    return member;
  }

  public StringAttribute address() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("address");
    member.setName("address");
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
