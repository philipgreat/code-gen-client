package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType";
  }
  // 枚举对象
  public static EnumAttribute USER_CONFIRM_DEAL =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "USER_CONFIRM_DEAL")
          .chineseName("用户确认成交");
  public static EnumAttribute SUPPLIER_CONFIRM_DEAL =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "SUPPLIER_CONFIRM_DEAL")
          .chineseName("供应商确认成交");
  public static EnumAttribute SUPPLIER_REJECT_CONNECT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "SUPPLIER_REJECT_CONNECT")
          .chineseName("供应商取消对接");
  public static EnumAttribute POST_FEEDBACK =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType", "POST_FEEDBACK")
          .chineseName("意见反馈");
  public static EnumAttribute WITHDRAW_APPLICATION =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "WITHDRAW_APPLICATION")
          .chineseName("余额提现");
  public static EnumAttribute SUPPLIER_CONFIRM_CONNECT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "SUPPLIER_CONFIRM_CONNECT")
          .chineseName("供应商确认对接");
  public static EnumAttribute DOMESTIC_TRIAL_APPLICATION =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "DOMESTIC_TRIAL_APPLICATION")
          .chineseName("试用申请");
  public static EnumAttribute REVIEW_KNOWLEDGE_BASE_ARTICLE =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "REVIEW_KNOWLEDGE_BASE_ARTICLE")
          .chineseName("知识库评论");
  public static EnumAttribute POST_DEMAND =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType", "POST_DEMAND")
          .chineseName("需求提供");
  public static EnumAttribute USER_CONFIRM_CONNECT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "USER_CONFIRM_CONNECT")
          .chineseName("用户确认对接");
  public static EnumAttribute SUBMIT_WITHDRAW_RESULT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "SUBMIT_WITHDRAW_RESULT")
          .chineseName("提交提现处理结果");
  public static EnumAttribute DEMO_ALL_FIELD =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "DEMO_ALL_FIELD")
          .chineseName("演示所有的字段类型");
  public static EnumAttribute PLATFORM_FINALIZE_REWARD =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "PLATFORM_FINALIZE_REWARD")
          .chineseName("平台最终核定奖励");
  public static EnumAttribute REVIEW_DOMESTIC_ARTICLE =
      new EnumAttribute(
              "com.doublechaintech.saleschain.changerequesttype.ChangeRequestType",
              "REVIEW_DOMESTIC_ARTICLE")
          .chineseName("国产试用评论");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      USER_CONFIRM_DEAL,
      SUPPLIER_CONFIRM_DEAL,
      SUPPLIER_REJECT_CONNECT,
      POST_FEEDBACK,
      WITHDRAW_APPLICATION,
      SUPPLIER_CONFIRM_CONNECT,
      DOMESTIC_TRIAL_APPLICATION,
      REVIEW_KNOWLEDGE_BASE_ARTICLE,
      POST_DEMAND,
      USER_CONFIRM_CONNECT,
      SUBMIT_WITHDRAW_RESULT,
      DEMO_ALL_FIELD,
      PLATFORM_FINALIZE_REWARD,
      REVIEW_DOMESTIC_ARTICLE
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
