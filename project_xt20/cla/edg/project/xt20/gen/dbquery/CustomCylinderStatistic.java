package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomCylinderStatistic extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.customcylinderstatistic.CustomCylinderStatistic";
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

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
    useMember(member);
    return member;
  }

  public DateTimeAttribute statisTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("statisTime");
    member.setName("statis_time");
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
