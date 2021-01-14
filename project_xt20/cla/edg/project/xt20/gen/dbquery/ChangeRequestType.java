package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.changerequesttype.ChangeRequestType";
  }
  // 枚举对象
  public static EnumAttribute ADMIN_TRANSFER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "ADMIN_TRANSFER")
          .chineseName("转移管理员");
  public static EnumAttribute SELLER_REGISTER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "SELLER_REGISTER")
          .chineseName("1/3 商户信息");
  public static EnumAttribute SELLER_ADD_BUYER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "SELLER_ADD_BUYER")
          .chineseName("添加客户");
  public static EnumAttribute ADD_BUYER_FOR_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "ADD_BUYER_FOR_QUOTE")
          .chineseName("添加客户");
  public static EnumAttribute CUSTOM_PRODUCT_WHEN_INITIAL =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CUSTOM_PRODUCT_WHEN_INITIAL")
          .chineseName("自定义产品");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_INIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_INIT")
          .chineseName("产品附加规格");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_INBOUND =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_INBOUND")
          .chineseName("完善信息并入库");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_CREATE_IN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_CREATE_IN_QUOTE")
          .chineseName("修改附加规格");
  public static EnumAttribute BUY_INBOUND_FROM_HOME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUY_INBOUND_FROM_HOME")
          .chineseName("外采入库");
  public static EnumAttribute SELLER_UPDATE_MERCHANT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "SELLER_UPDATE_MERCHANT_INFO")
          .chineseName("完善信息");
  public static EnumAttribute SELLER_UPDATE_CUSTOMER_COMMENT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "SELLER_UPDATE_CUSTOMER_COMMENT")
          .chineseName("修改备注");
  public static EnumAttribute PRODUCT_INBOUND =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_INBOUND")
          .chineseName("入库");
  public static EnumAttribute UPDATE_SUPPLIER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "UPDATE_SUPPLIER")
          .chineseName("编辑备注");
  public static EnumAttribute UPDATE_PERSONAL_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_PERSONAL_INFO")
          .chineseName("更新个人信息");
  public static EnumAttribute UPDATE_MERCHANT_INFO_FROM_SELLER_HOME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_FROM_SELLER_HOME")
          .chineseName("完善信息");
  public static EnumAttribute UPDATE_INDIVIDUAL_IDENTITY =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_INDIVIDUAL_IDENTITY")
          .chineseName("更新认证信息");
  public static EnumAttribute UPDATE_MERCHANT_OFF_TIME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_OFF_TIME")
          .chineseName("设置企业下班时间");
  public static EnumAttribute AUDIT_JOIN_APPLY =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "AUDIT_JOIN_APPLY")
          .chineseName("审批加入+姓名");
  public static EnumAttribute UPDATE_MERCHANT_DELIVERY_LIMIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_DELIVERY_LIMIT")
          .chineseName("设置单次配送最大量");
  public static EnumAttribute APPROVE_JOIN_BUYER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "APPROVE_JOIN_BUYER")
          .chineseName("批准加入");
  public static EnumAttribute UPDATE_BUYER_INFO_WHEN_CONFIRM_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_BUYER_INFO_WHEN_CONFIRM_QUOTE")
          .chineseName("完善信息");
  public static EnumAttribute INBOUND_FROM_HOME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "INBOUND_FROM_HOME")
          .chineseName("生产入库");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT")
          .chineseName("产品附加规格");
  public static EnumAttribute BUYER_PERFECT_ENTITY_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUYER_PERFECT_ENTITY_INFO")
          .chineseName("完善信息信息");
  public static EnumAttribute PRODUCT_OFF_SHELF =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_OFF_SHELF")
          .chineseName("下架");
  public static EnumAttribute UPDATE_INVENTORY_PARAMETER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_INVENTORY_PARAMETER")
          .chineseName("备库信息");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_INVITE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_INVITE")
          .chineseName("完善信息");
  public static EnumAttribute UPDATE_PRODUCT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "UPDATE_PRODUCT_INFO")
          .chineseName("更新产品信息");
  public static EnumAttribute UPDATE_COLLEAGUE_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_COLLEAGUE_INFO")
          .chineseName("备注");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_QUOTE")
          .chineseName("完善信息");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_QUOTE")
          .chineseName("产品附加规格");
  public static EnumAttribute BUYER_UPDATE_MERCHANT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUYER_UPDATE_MERCHANT_INFO")
          .chineseName("更新信息");
  public static EnumAttribute FULFILL_INDIVIDUAL_IDENTITY =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "FULFILL_INDIVIDUAL_IDENTITY")
          .chineseName("完善个人认证信息");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_CREATE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_CREATE")
          .chineseName("修改附加规格");
  public static EnumAttribute PRODUCT_ON_SHELF =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_ON_SHELF")
          .chineseName("上架");
  public static EnumAttribute BUYER_UPDATE_INFO_IN_HOME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUYER_UPDATE_INFO_IN_HOME")
          .chineseName("完善信息");
  public static EnumAttribute UPDATE_BUYER_INFO_WHEN_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_BUYER_INFO_WHEN_ORDER")
          .chineseName("完善信息");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      ADMIN_TRANSFER,
      SELLER_REGISTER,
      SELLER_ADD_BUYER,
      ADD_BUYER_FOR_QUOTE,
      CUSTOM_PRODUCT_WHEN_INITIAL,
      EDIT_ADDITIONAL_SPEC_WHEN_INIT,
      UPDATE_MERCHANT_INFO_WHEN_INBOUND,
      EDIT_ADDITIONAL_SPEC_WHEN_CREATE_IN_QUOTE,
      BUY_INBOUND_FROM_HOME,
      SELLER_UPDATE_MERCHANT_INFO,
      SELLER_UPDATE_CUSTOMER_COMMENT,
      PRODUCT_INBOUND,
      UPDATE_SUPPLIER,
      UPDATE_PERSONAL_INFO,
      UPDATE_MERCHANT_INFO_FROM_SELLER_HOME,
      UPDATE_INDIVIDUAL_IDENTITY,
      UPDATE_MERCHANT_OFF_TIME,
      AUDIT_JOIN_APPLY,
      UPDATE_MERCHANT_DELIVERY_LIMIT,
      APPROVE_JOIN_BUYER,
      UPDATE_BUYER_INFO_WHEN_CONFIRM_QUOTE,
      INBOUND_FROM_HOME,
      EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT,
      BUYER_PERFECT_ENTITY_INFO,
      PRODUCT_OFF_SHELF,
      UPDATE_INVENTORY_PARAMETER,
      UPDATE_MERCHANT_INFO_WHEN_INVITE,
      UPDATE_PRODUCT_INFO,
      UPDATE_COLLEAGUE_INFO,
      UPDATE_MERCHANT_INFO_WHEN_QUOTE,
      EDIT_ADDITIONAL_SPEC_WHEN_QUOTE,
      BUYER_UPDATE_MERCHANT_INFO,
      FULFILL_INDIVIDUAL_IDENTITY,
      EDIT_ADDITIONAL_SPEC_WHEN_CREATE,
      PRODUCT_ON_SHELF,
      BUYER_UPDATE_INFO_IN_HOME,
      UPDATE_BUYER_INFO_WHEN_ORDER
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

  public ChangeRequest changeRequestList() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("request_type");
    member.setMemberName("changeRequestList");
    member.setRelationName("requestType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventInfoInCr eventInfoInCrList() {
    EventInfoInCr member = new EventInfoInCr();
    member.setModelTypeName("event_info_in_cr");
    member.setName("change_request_type");
    member.setMemberName("eventInfoInCrList");
    member.setRelationName("changeRequestType");
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

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
    useMember(member);
    return member;
  }

  public StringAttribute bindTypes() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("bindTypes");
    member.setName("bind_types");
    useMember(member);
    return member;
  }

  public StringAttribute stepConfiguration() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("stepConfiguration");
    member.setName("step_configuration");
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
