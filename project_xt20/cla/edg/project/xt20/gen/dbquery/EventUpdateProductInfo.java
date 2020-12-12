package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventUpdateProductInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventupdateproductinfo.EventUpdateProductInfo";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute productId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productId");
    member.setName("product_id");
    useMember(member);
    return member;
  }

  public StringAttribute productName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productName");
    member.setName("product_name");
    useMember(member);
    return member;
  }

  public StringAttribute legacyCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("legacyCode");
    member.setName("legacy_code");
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
