package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ShippingStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.shippingstatus.ShippingStatus";
  }
  // 枚举对象
  public static EnumAttribute WAITING_BUYER_PICK_UP =
      new EnumAttribute(
              "com.doublechaintech.xt20.shippingstatus.ShippingStatus", "WAITING_BUYER_PICK_UP")
          .chineseName("待自提");
  public static EnumAttribute WAITING_SELLER_DELIVERY =
      new EnumAttribute(
              "com.doublechaintech.xt20.shippingstatus.ShippingStatus", "WAITING_SELLER_DELIVERY")
          .chineseName("待配送");
  public static EnumAttribute SELLER_SHIPPING =
      new EnumAttribute("com.doublechaintech.xt20.shippingstatus.ShippingStatus", "SELLER_SHIPPING")
          .chineseName("正在配送");
  public static EnumAttribute BUYER_RECEIVED =
      new EnumAttribute("com.doublechaintech.xt20.shippingstatus.ShippingStatus", "BUYER_RECEIVED")
          .chineseName("已签收");
  public static EnumAttribute COMPLETED =
      new EnumAttribute("com.doublechaintech.xt20.shippingstatus.ShippingStatus", "COMPLETED")
          .chineseName("已完成");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.doublechaintech.xt20.shippingstatus.ShippingStatus", "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      WAITING_BUYER_PICK_UP,
      WAITING_SELLER_DELIVERY,
      SELLER_SHIPPING,
      BUYER_RECEIVED,
      COMPLETED,
      CANCELLED
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

  public GasShippingGroup gasShippingGroupList() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("shipping_status");
    member.setMemberName("gasShippingGroupList");
    member.setRelationName("shippingStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
