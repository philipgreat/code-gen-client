package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SearchAssistantContext extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.searchassistantcontext.SearchAssistantContext";
  }
  // 枚举对象

  // 引用的对象

  public Product product() {
    Product member = new Product();
    member.setModelTypeName("product");
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

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("content");
    member.setName("content");
    useMember(member);
    return member;
  }

  public StringAttribute functionality() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("functionality");
    member.setName("functionality");
    useMember(member);
    return member;
  }

  public StringAttribute category() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("category");
    member.setName("category");
    useMember(member);
    return member;
  }

  public StringAttribute brand() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brand");
    member.setName("brand");
    useMember(member);
    return member;
  }

  public StringAttribute supplier() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("supplier");
    member.setName("supplier");
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
