package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ActionType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.actiontype.ActionType";
  }
  // 枚举对象
  public static EnumAttribute CYLINDER_SET =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "CYLINDER_SET")
          .chineseName("空瓶盘库");
  public static EnumAttribute CYLINDER_IN =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "CYLINDER_IN")
          .chineseName("空瓶入库");
  public static EnumAttribute PRODUCE =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "PRODUCE")
          .chineseName("生产入库");
  public static EnumAttribute SHIP =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "SHIP")
          .chineseName("配送发货");
  public static EnumAttribute ORDER_BACK_CYLINDER =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "ORDER_BACK_CYLINDER")
          .chineseName("订单返瓶");
  public static EnumAttribute BUYER_CONFIRMED =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "BUYER_CONFIRMED")
          .chineseName("确认接收单");
  public static EnumAttribute SELLER_SUBMIT_CYLINDER_SET =
      new EnumAttribute(
              "com.doublechaintech.xt20.actiontype.ActionType", "SELLER_SUBMIT_CYLINDER_SET")
          .chineseName("商家提交气瓶盘库");
  public static EnumAttribute CUSTOMER_CONFIRM_CYLINDER_SET =
      new EnumAttribute(
              "com.doublechaintech.xt20.actiontype.ActionType", "CUSTOMER_CONFIRM_CYLINDER_SET")
          .chineseName("客户确认气瓶盘库");
  public static EnumAttribute PURCHASE_OUT_OF_SYSTEM =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "PURCHASE_OUT_OF_SYSTEM")
          .chineseName("外采入库");
  public static EnumAttribute PURCHASE_IN_SYSTEM =
      new EnumAttribute("com.doublechaintech.xt20.actiontype.ActionType", "PURCHASE_IN_SYSTEM")
          .chineseName("接收单入库");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      CYLINDER_SET,
      CYLINDER_IN,
      PRODUCE,
      SHIP,
      ORDER_BACK_CYLINDER,
      BUYER_CONFIRMED,
      SELLER_SUBMIT_CYLINDER_SET,
      CUSTOMER_CONFIRM_CYLINDER_SET,
      PURCHASE_OUT_OF_SYSTEM,
      PURCHASE_IN_SYSTEM
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

  public MerchantCylinderRecord merchantCylinderRecordList() {
    MerchantCylinderRecord member = new MerchantCylinderRecord();
    member.setModelTypeName("merchant_cylinder_record");
    member.setName("action");
    member.setMemberName("merchantCylinderRecordList");
    member.setRelationName("action");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinderRecord customerCylinderRecordList() {
    CustomerCylinderRecord member = new CustomerCylinderRecord();
    member.setModelTypeName("customer_cylinder_record");
    member.setName("action");
    member.setMemberName("customerCylinderRecordList");
    member.setRelationName("action");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductInventoryRecord gasProductInventoryRecordList() {
    GasProductInventoryRecord member = new GasProductInventoryRecord();
    member.setModelTypeName("gas_product_inventory_record");
    member.setName("action");
    member.setMemberName("gasProductInventoryRecordList");
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
