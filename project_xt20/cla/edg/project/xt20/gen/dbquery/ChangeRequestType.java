package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.changerequesttype.ChangeRequestType";
  }
  // 枚举对象
  public static EnumAttribute MORE_SUPPLIER_PRODUCT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "MORE_SUPPLIER_PRODUCT")
          .chineseName("信息反馈");
  public static EnumAttribute SELLER_REGISTER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "SELLER_REGISTER")
          .chineseName("商户注册");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_INIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_INIT")
          .chineseName("产品附加规格");
  public static EnumAttribute CONFIRM_JOIN =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "CONFIRM_JOIN")
          .chineseName("确认加入");
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
  public static EnumAttribute CREATE_HANDOVER_TASK =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CREATE_HANDOVER_TASK")
          .chineseName("创建交接单");
  public static EnumAttribute CUSTOM_PRODUCT_WHEN_QUOTE_BY_PRODUCT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CUSTOM_PRODUCT_WHEN_QUOTE_BY_PRODUCT")
          .chineseName("自定义");
  public static EnumAttribute PRODUCT_INBOUND =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_INBOUND")
          .chineseName("入库");
  public static EnumAttribute EDIT_COMMENT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "EDIT_COMMENT")
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
  public static EnumAttribute BUYER_BIC_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "BUYER_BIC_CONFIRM")
          .chineseName("确认");
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
  public static EnumAttribute COMPANY_ADMIN_TRANSFER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "COMPANY_ADMIN_TRANSFER")
          .chineseName("转移管理员");
  public static EnumAttribute BUYER_UPDATE_DELIVERY_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUYER_UPDATE_DELIVERY_INFO")
          .chineseName("完善配送");
  public static EnumAttribute BUYER =
      new EnumAttribute("com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "BUYER")
          .chineseName("审核加入");
  public static EnumAttribute UPDATE_PRODUCT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "UPDATE_PRODUCT_INFO")
          .chineseName("修改产品");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_QUOTE")
          .chineseName("完善信息");
  public static EnumAttribute UPDATE_COLLEAGUE_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_COLLEAGUE_INFO")
          .chineseName("备注");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_QUOTE")
          .chineseName("产品附加规格");
  public static EnumAttribute UPDATE_COMPANY_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "UPDATE_COMPANY_INFO")
          .chineseName("商户基础信息");
  public static EnumAttribute UPDATE_DELIVERY_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_DELIVERY_INFO")
          .chineseName("修改配送信息");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_VIEW_BUYER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_VIEW_BUYER")
          .chineseName("完善信息");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_CREATE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_CREATE")
          .chineseName("修改附加规格");
  public static EnumAttribute PRODUCT_ON_SHELF =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_ON_SHELF")
          .chineseName("上架");
  public static EnumAttribute SEND_TO_CUSTOMER_AUDIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "SEND_TO_CUSTOMER_AUDIT")
          .chineseName("提交客户审核");
  public static EnumAttribute CONFIRM_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "CONFIRM_QUOTE")
          .chineseName("同意代下");
  public static EnumAttribute AUDIT_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "AUDIT_ORDER")
          .chineseName("完成审核");
  public static EnumAttribute CUSTOM_PRODUCT_WHEN_INITIAL =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CUSTOM_PRODUCT_WHEN_INITIAL")
          .chineseName("自定义产品");
  public static EnumAttribute BUYER_DELIVERY_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "BUYER_DELIVERY_INFO")
          .chineseName("配送信息");
  public static EnumAttribute BUY_INBOUND_FROM_HOME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUY_INBOUND_FROM_HOME")
          .chineseName("外采入库");
  public static EnumAttribute COPY_PRODUCT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "COPY_PRODUCT")
          .chineseName("复制产品");
  public static EnumAttribute BUYER_UPDATE_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "BUYER_UPDATE_ORDER")
          .chineseName("修改订单");
  public static EnumAttribute SELLER_UPDATE_MERCHANT_INFO =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "SELLER_UPDATE_MERCHANT_INFO")
          .chineseName("完善信息");
  public static EnumAttribute UPDATE_MERCHANT_OFF_TIME =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_OFF_TIME")
          .chineseName("设置商户下班时间");
  public static EnumAttribute CREATE_SPLIT_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "CREATE_SPLIT_ORDER")
          .chineseName("提交新单");
  public static EnumAttribute AUDIT_JOIN_APPLY =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "AUDIT_JOIN_APPLY")
          .chineseName("审批加入+姓名");
  public static EnumAttribute UPDATE_MERCHANT_DELIVERY_LIMIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_DELIVERY_LIMIT")
          .chineseName("设置单次配送最大量");
  public static EnumAttribute BUYER_ADMIN_TRANSFER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "BUYER_ADMIN_TRANSFER")
          .chineseName("转移管理员");
  public static EnumAttribute CUSTOM_PRODUCT_WHEN_QUOTE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CUSTOM_PRODUCT_WHEN_QUOTE")
          .chineseName("自定义");
  public static EnumAttribute EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT")
          .chineseName("产品附加规格");
  public static EnumAttribute PRODUCT_OFF_SHELF =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "PRODUCT_OFF_SHELF")
          .chineseName("下架");
  public static EnumAttribute UPDATE_MERCHANT_INFO_WHEN_INVITE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_MERCHANT_INFO_WHEN_INVITE")
          .chineseName("完善信息");
  public static EnumAttribute EDIT_BUYER_COLLEAGUE =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "EDIT_BUYER_COLLEAGUE")
          .chineseName("备注");
  public static EnumAttribute CONFIRM_AS_CUSTOMER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType", "CONFIRM_AS_CUSTOMER")
          .chineseName("代客确认");
  public static EnumAttribute CONFIRM_DELIVERY_TASK =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "CONFIRM_DELIVERY_TASK")
          .chineseName("确认交接");
  public static EnumAttribute UPDATE_BUYER_INFO_WHEN_ORDER =
      new EnumAttribute(
              "com.doublechaintech.xt20.changerequesttype.ChangeRequestType",
              "UPDATE_BUYER_INFO_WHEN_ORDER")
          .chineseName("完善信息");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      MORE_SUPPLIER_PRODUCT,
      SELLER_REGISTER,
      EDIT_ADDITIONAL_SPEC_WHEN_INIT,
      CONFIRM_JOIN,
      UPDATE_MERCHANT_INFO_WHEN_INBOUND,
      EDIT_ADDITIONAL_SPEC_WHEN_CREATE_IN_QUOTE,
      CREATE_HANDOVER_TASK,
      CUSTOM_PRODUCT_WHEN_QUOTE_BY_PRODUCT,
      PRODUCT_INBOUND,
      EDIT_COMMENT,
      UPDATE_PERSONAL_INFO,
      UPDATE_MERCHANT_INFO_FROM_SELLER_HOME,
      BUYER_BIC_CONFIRM,
      APPROVE_JOIN_BUYER,
      UPDATE_BUYER_INFO_WHEN_CONFIRM_QUOTE,
      INBOUND_FROM_HOME,
      COMPANY_ADMIN_TRANSFER,
      BUYER_UPDATE_DELIVERY_INFO,
      BUYER,
      UPDATE_PRODUCT_INFO,
      UPDATE_MERCHANT_INFO_WHEN_QUOTE,
      UPDATE_COLLEAGUE_INFO,
      EDIT_ADDITIONAL_SPEC_WHEN_QUOTE,
      UPDATE_COMPANY_INFO,
      UPDATE_DELIVERY_INFO,
      UPDATE_MERCHANT_INFO_WHEN_VIEW_BUYER,
      EDIT_ADDITIONAL_SPEC_WHEN_CREATE,
      PRODUCT_ON_SHELF,
      SEND_TO_CUSTOMER_AUDIT,
      CONFIRM_QUOTE,
      AUDIT_ORDER,
      CUSTOM_PRODUCT_WHEN_INITIAL,
      BUYER_DELIVERY_INFO,
      BUY_INBOUND_FROM_HOME,
      COPY_PRODUCT,
      BUYER_UPDATE_ORDER,
      SELLER_UPDATE_MERCHANT_INFO,
      UPDATE_MERCHANT_OFF_TIME,
      CREATE_SPLIT_ORDER,
      AUDIT_JOIN_APPLY,
      UPDATE_MERCHANT_DELIVERY_LIMIT,
      BUYER_ADMIN_TRANSFER,
      CUSTOM_PRODUCT_WHEN_QUOTE,
      EDIT_ADDITIONAL_SPEC_WHEN_REVIEW_INIT,
      PRODUCT_OFF_SHELF,
      UPDATE_MERCHANT_INFO_WHEN_INVITE,
      EDIT_BUYER_COLLEAGUE,
      CONFIRM_AS_CUSTOMER,
      CONFIRM_DELIVERY_TASK,
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
