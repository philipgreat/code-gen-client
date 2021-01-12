package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DeliveryReceiptStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.deliveryreceiptstatus.DeliveryReceiptStatus";
  }
  // 枚举对象
  public static EnumAttribute WAITING_BUYER_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.xt20.deliveryreceiptstatus.DeliveryReceiptStatus",
              "WAITING_BUYER_CONFIRM")
          .chineseName("待客户确认");
  public static EnumAttribute BUYER_CONFIRM_TIMEOUT =
      new EnumAttribute(
              "com.doublechaintech.xt20.deliveryreceiptstatus.DeliveryReceiptStatus",
              "BUYER_CONFIRM_TIMEOUT")
          .chineseName("超时未确认");
  public static EnumAttribute SELLER_FORCE_CONFIRMED =
      new EnumAttribute(
              "com.doublechaintech.xt20.deliveryreceiptstatus.DeliveryReceiptStatus",
              "SELLER_FORCE_CONFIRMED")
          .chineseName("代客户确认");
  public static EnumAttribute BUYER_CONFIRMED =
      new EnumAttribute(
              "com.doublechaintech.xt20.deliveryreceiptstatus.DeliveryReceiptStatus",
              "BUYER_CONFIRMED")
          .chineseName("客户已确认");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      WAITING_BUYER_CONFIRM, BUYER_CONFIRM_TIMEOUT, SELLER_FORCE_CONFIRMED, BUYER_CONFIRMED
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

  public DeliveryReceipt deliveryReceiptList() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("status");
    member.setMemberName("deliveryReceiptList");
    member.setRelationName("status");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptTicket deliveryReceiptTicketList() {
    DeliveryReceiptTicket member = new DeliveryReceiptTicket();
    member.setModelTypeName("delivery_receipt_ticket");
    member.setName("status");
    member.setMemberName("deliveryReceiptTicketList");
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
