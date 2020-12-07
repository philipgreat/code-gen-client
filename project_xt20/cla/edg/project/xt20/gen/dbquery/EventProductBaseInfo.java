package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProductBaseInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventproductbaseinfo.EventProductBaseInfo";
  }
  // 枚举对象

  // 引用的对象

  public ProductType productType() {
    ProductType member = new ProductType();
    member.setModelTypeName("product_type");
    member.setName("product_type");
    member.setMemberName("productType");
    member.setReferDirection(true);
    member.setRelationName("productType");
    append(member);
    return member;
  }

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

  public StringAttribute merchantId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("merchantId");
    member.setName("merchant_id");
    useMember(member);
    return member;
  }

  public StringAttribute productAliasName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productAliasName");
    member.setName("product_alias_name");
    useMember(member);
    return member;
  }

  public StringAttribute productLegacyId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productLegacyId");
    member.setName("product_legacy_id");
    useMember(member);
    return member;
  }

  public StringAttribute productPicture() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("productPicture");
    member.setName("product_picture");
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
