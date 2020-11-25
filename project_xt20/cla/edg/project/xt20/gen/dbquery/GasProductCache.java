package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductCache extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproductcache.GasProductCache";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute productId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productId");
    member.setName("product_id");
    useMember(member);
    return member;
  }

  public StringAttribute companyId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("companyId");
    member.setName("company_id");
    useMember(member);
    return member;
  }

  public StringAttribute searchtext() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("searchtext");
    member.setName("searchtext");
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