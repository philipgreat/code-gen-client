package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MainOrder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.mainorder.MainOrder";
  }
  // 枚举对象

  // 引用的对象

  public Merchant buyer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("buyer");
    member.setMemberName("buyer");
    member.setReferDirection(true);
    member.setRelationName("buyer");
    append(member);
    return member;
  }

  public Merchant seller() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("seller");
    member.setMemberName("seller");
    member.setReferDirection(true);
    member.setRelationName("seller");
    append(member);
    return member;
  }

  public OrderStatus status() {
    OrderStatus member = new OrderStatus();
    member.setModelTypeName("order_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public Employee creator() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("creator");
    member.setMemberName("creator");
    member.setReferDirection(true);
    member.setRelationName("creator");
    append(member);
    return member;
  }

  // 被引用的对象

  public GasLineItem gasLineItemList() {
    GasLineItem member = new GasLineItem();
    member.setModelTypeName("gas_line_item");
    member.setName("main_order");
    member.setMemberName("gasLineItemList");
    member.setRelationName("mainOrder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasShippingGroup gasShippingGroupList() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("main_order");
    member.setMemberName("gasShippingGroupList");
    member.setRelationName("mainOrder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceipt deliveryReceiptList() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("main_order");
    member.setMemberName("deliveryReceiptList");
    member.setRelationName("mainOrder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrderOperationRecord orderOperationRecordList() {
    OrderOperationRecord member = new OrderOperationRecord();
    member.setModelTypeName("order_operation_record");
    member.setName("main_order");
    member.setMemberName("orderOperationRecordList");
    member.setRelationName("mainOrder");
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

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comment");
    member.setName("comment");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
