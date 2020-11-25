package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MySupplier extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.mysupplier.MySupplier";
  }
  // 枚举对象

  // 引用的对象

  public Company user() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
    append(member);
    return member;
  }

  public Company supplier() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("supplier");
    member.setMemberName("supplier");
    member.setReferDirection(true);
    member.setRelationName("supplier");
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

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comment");
    member.setName("comment");
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
