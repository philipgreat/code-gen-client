package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IconConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.iconconfiguration.IconConfiguration";
  }
  // 枚举对象
  public static EnumAttribute SELLER_QUICK_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_QUICK_QUOTE")
          .chineseName("快速代下订单");
  public static EnumAttribute SELLER_REPORT =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_REPORT")
          .chineseName("我的报表");
  public static EnumAttribute SELLER_INVENTORY_CHECK =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_INVENTORY_CHECK")
          .chineseName("盘库");
  public static EnumAttribute SELLER_CUSTOMER =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_CUSTOMER")
          .chineseName("我的客户");
  public static EnumAttribute SELLER_ORDER_LIST =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_ORDER_LIST")
          .chineseName("销售单");
  public static EnumAttribute SELLER_INBOUND_BUY =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_INBOUND_BUY")
          .chineseName("外采入库");
  public static EnumAttribute SELLER_PRODUCTS =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_PRODUCTS")
          .chineseName("我的产品");
  public static EnumAttribute SELLER_INBOUND_PRODUCE =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_INBOUND_PRODUCE")
          .chineseName("生产入库");
  public static EnumAttribute SELLER_BOTTLE_MANAGEMENT =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_BOTTLE_MANAGEMENT")
          .chineseName("气瓶结存");
  public static EnumAttribute SELLER_CONFIRM_DELIVERY =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_CONFIRM_DELIVERY")
          .chineseName("交接单确认");
  public static EnumAttribute SELLER_COLLEAGUE =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "SELLER_COLLEAGUE")
          .chineseName("我的同事");
  public static EnumAttribute SELLER_DELIVERY_MANAGE =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_DELIVERY_MANAGE")
          .chineseName("配送任务管理");
  public static EnumAttribute SELLER_BOTTLE_RETURN =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_BOTTLE_RETURN")
          .chineseName("回瓶确认");
  public static EnumAttribute SELLER_MERCHANT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "SELLER_MERCHANT_INFO")
          .chineseName("设置");
  public static EnumAttribute BUYER_QUICK_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_QUICK_ORDER")
          .chineseName("快速下单");
  public static EnumAttribute BUYER_ORDERS =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_ORDERS")
          .chineseName("我的采购单");
  public static EnumAttribute BUYER_BOTTLES =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_BOTTLES")
          .chineseName("我的持瓶");
  public static EnumAttribute BUYER_BIC =
      new EnumAttribute("com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_BIC")
          .chineseName("盘库确认");
  public static EnumAttribute BUYER_DELIVERY_RECEIPT =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration",
              "BUYER_DELIVERY_RECEIPT")
          .chineseName("交接单确认");
  public static EnumAttribute BUYER_COLLEAGUES =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_COLLEAGUES")
          .chineseName("我的同事");
  public static EnumAttribute BUYER_SUPPLIERS =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_SUPPLIERS")
          .chineseName("我的供应商");
  public static EnumAttribute BUYER_CONFIGURATION =
      new EnumAttribute(
              "com.doublechaintech.xt20.iconconfiguration.IconConfiguration", "BUYER_CONFIGURATION")
          .chineseName("设置");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      SELLER_QUICK_QUOTE,
      SELLER_REPORT,
      SELLER_INVENTORY_CHECK,
      SELLER_CUSTOMER,
      SELLER_ORDER_LIST,
      SELLER_INBOUND_BUY,
      SELLER_PRODUCTS,
      SELLER_INBOUND_PRODUCE,
      SELLER_BOTTLE_MANAGEMENT,
      SELLER_CONFIRM_DELIVERY,
      SELLER_COLLEAGUE,
      SELLER_DELIVERY_MANAGE,
      SELLER_BOTTLE_RETURN,
      SELLER_MERCHANT_INFO,
      BUYER_QUICK_ORDER,
      BUYER_ORDERS,
      BUYER_BOTTLES,
      BUYER_BIC,
      BUYER_DELIVERY_RECEIPT,
      BUYER_COLLEAGUES,
      BUYER_SUPPLIERS,
      BUYER_CONFIGURATION
    };
  }

  // 引用的对象

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public StringAttribute image() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image");
    member.setName("image");
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
