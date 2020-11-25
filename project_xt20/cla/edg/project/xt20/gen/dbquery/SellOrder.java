package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SellOrder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.sellorder.SellOrder";
  }
  // 枚举对象

  // 引用的对象

  public OrderShippingType shippingType() {
    OrderShippingType member = new OrderShippingType();
    member.setModelTypeName("order_shipping_type");
    member.setName("shipping_type");
    member.setMemberName("shippingType");
    member.setReferDirection(true);
    member.setRelationName("shippingType");
    append(member);
    return member;
  }

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

  public DeliverTask deliverTask() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("deliver_task");
    member.setMemberName("deliverTask");
    member.setReferDirection(true);
    member.setRelationName("deliverTask");
    append(member);
    return member;
  }

  public PersonalUser creator() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
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
    member.setName("sell_order");
    member.setMemberName("gasLineItemList");
    member.setRelationName("sellOrder");
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

  public StringAttribute handoverAddress() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("handoverAddress");
    member.setName("handover_address");
    useMember(member);
    return member;
  }

  public StringAttribute sellerContactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerContactName");
    member.setName("seller_contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute sellerContactPhone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("sellerContactPhone");
    member.setName("seller_contact_phone");
    useMember(member);
    return member;
  }

  public StringAttribute buyerContactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerContactName");
    member.setName("buyer_contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute buyerContactPhone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("buyerContactPhone");
    member.setName("buyer_contact_phone");
    useMember(member);
    return member;
  }

  public DateTimeAttribute handoverDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("handoverDate");
    member.setName("handover_date");
    useMember(member);
    return member;
  }

  public StringAttribute handoverTime() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("handoverTime");
    member.setName("handover_time");
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
