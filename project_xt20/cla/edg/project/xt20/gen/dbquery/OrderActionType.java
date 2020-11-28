package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class OrderActionType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.orderactiontype.OrderActionType";
  }
  // 枚举对象
  public static EnumAttribute SELLER_CREATE_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "SELLER_CREATE_ORDER")
          .chineseName("商家代客下单");
  public static EnumAttribute BUYER_CREATE_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "BUYER_CREATE_ORDER")
          .chineseName("客户下单");
  public static EnumAttribute BUYER_CONFIRM =
      new EnumAttribute("com.doublechaintech.xt20.orderactiontype.OrderActionType", "BUYER_CONFIRM")
          .chineseName("客户确认订单");
  public static EnumAttribute SELLER_FORCE_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "SELLER_FORCE_CONFIRM")
          .chineseName("商家代客户确认订单");
  public static EnumAttribute SELLER_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "SELLER_CONFIRM")
          .chineseName("商家确认订单");
  public static EnumAttribute SELLER_DELIVERY =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "SELLER_DELIVERY")
          .chineseName("商家订单发货");
  public static EnumAttribute SELLER_CREATE_DELIVERY_RECEIPT =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType",
              "SELLER_CREATE_DELIVERY_RECEIPT")
          .chineseName("商家创建交接单");
  public static EnumAttribute BUYER_CONFIRM_DELIVERY_RECEIPT =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType",
              "BUYER_CONFIRM_DELIVERY_RECEIPT")
          .chineseName("客户确认交接单");
  public static EnumAttribute SELLER_FORCE_CONFIRM_DELIVERY_RECEIPT =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType",
              "SELLER_FORCE_CONFIRM_DELIVERY_RECEIPT")
          .chineseName("商家代客户确认交接单");
  public static EnumAttribute SELLER_CONFIRM_DONE =
      new EnumAttribute(
              "com.doublechaintech.xt20.orderactiontype.OrderActionType", "SELLER_CONFIRM_DONE")
          .chineseName("商家确认完成");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      SELLER_CREATE_ORDER,
      BUYER_CREATE_ORDER,
      BUYER_CONFIRM,
      SELLER_FORCE_CONFIRM,
      SELLER_CONFIRM,
      SELLER_DELIVERY,
      SELLER_CREATE_DELIVERY_RECEIPT,
      BUYER_CONFIRM_DELIVERY_RECEIPT,
      SELLER_FORCE_CONFIRM_DELIVERY_RECEIPT,
      SELLER_CONFIRM_DONE
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

  public OrderOperationRecord orderOperationRecordList() {
    OrderOperationRecord member = new OrderOperationRecord();
    member.setModelTypeName("order_operation_record");
    member.setName("action");
    member.setMemberName("orderOperationRecordList");
    member.setRelationName("action");
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
