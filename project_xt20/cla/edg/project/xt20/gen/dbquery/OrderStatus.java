package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class OrderStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.orderstatus.OrderStatus";
  }
  // 枚举对象
  public static EnumAttribute CREATED =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "CREATED")
          .chineseName("创建");
  public static EnumAttribute PROCESSING =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "PROCESSING")
          .chineseName("处理中");
  public static EnumAttribute WAITING_BUYER_CONFIRM =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "WAITING_BUYER_CONFIRM")
          .chineseName("待买家确认");
  public static EnumAttribute BUYER_CONFIRM_TIMEOUT =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "BUYER_CONFIRM_TIMEOUT")
          .chineseName("买家确认超时");
  public static EnumAttribute WAITING_SELLER_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderstatus.OrderStatus", "WAITING_SELLER_CONFIRM")
          .chineseName("待卖家确认");
  public static EnumAttribute SUBMITTED =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "SUBMITTED")
          .chineseName("已提交");
  public static EnumAttribute PENDING_DELIVERY =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "PENDING_DELIVERY")
          .chineseName("待配送");
  public static EnumAttribute SHIPPING =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "SHIPPING")
          .chineseName("正在配送");
  public static EnumAttribute RECEIVED =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "RECEIVED")
          .chineseName("已接收");
  public static EnumAttribute COMPLETED =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "COMPLETED")
          .chineseName("已完成");
  public static EnumAttribute CANCELLED =
      new EnumAttribute("com.doublechaintech.xt20.orderstatus.OrderStatus", "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      CREATED,
      PROCESSING,
      WAITING_BUYER_CONFIRM,
      BUYER_CONFIRM_TIMEOUT,
      WAITING_SELLER_CONFIRM,
      SUBMITTED,
      PENDING_DELIVERY,
      SHIPPING,
      RECEIVED,
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

  public SellOrder sellOrderList() {
    SellOrder member = new SellOrder();
    member.setModelTypeName("sell_order");
    member.setName("status");
    member.setMemberName("sellOrderList");
    member.setRelationName("status");
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
