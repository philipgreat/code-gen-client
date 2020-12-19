package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomOrderStatistic extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.customorderstatistic.CustomOrderStatistic";
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute type() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("type");
    member.setName("type");
    useMember(member);
    return member;
  }

  public StringAttribute sellerId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerId");
    member.setName("seller_id");
    useMember(member);
    return member;
  }

  public StringAttribute sellerName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerName");
    member.setName("seller_name");
    useMember(member);
    return member;
  }

  public StringAttribute buyerId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerId");
    member.setName("buyer_id");
    useMember(member);
    return member;
  }

  public StringAttribute buyerName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerName");
    member.setName("buyer_name");
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

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
    useMember(member);
    return member;
  }

  public DateTimeAttribute beginTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("beginTime");
    member.setName("begin_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute endTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("endTime");
    member.setName("end_time");
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
