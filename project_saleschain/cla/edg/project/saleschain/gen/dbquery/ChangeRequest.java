package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.changerequest.ChangeRequest";
  }
  // 枚举对象

  // 引用的对象

  public ChangeRequestType requestType() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("request_type");
    member.setMemberName("requestType");
    member.setReferDirection(true);
    member.setRelationName("requestType");
    append(member);
    return member;
  }

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

  public EventSimpleType eventSimpleTypeList() {
    EventSimpleType member = new EventSimpleType();
    member.setModelTypeName("event_simple_type");
    member.setName("change_request");
    member.setMemberName("eventSimpleTypeList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventOtherType eventOtherTypeList() {
    EventOtherType member = new EventOtherType();
    member.setModelTypeName("event_other_type");
    member.setName("change_request");
    member.setMemberName("eventOtherTypeList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventReviewArticle eventReviewArticleList() {
    EventReviewArticle member = new EventReviewArticle();
    member.setModelTypeName("event_review_article");
    member.setName("change_request");
    member.setMemberName("eventReviewArticleList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPostDemand eventPostDemandList() {
    EventPostDemand member = new EventPostDemand();
    member.setModelTypeName("event_post_demand");
    member.setName("change_request");
    member.setMemberName("eventPostDemandList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventConfirmation eventConfirmationList() {
    EventConfirmation member = new EventConfirmation();
    member.setModelTypeName("event_confirmation");
    member.setName("change_request");
    member.setMemberName("eventConfirmationList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPlatformFinalizeReward eventPlatformFinalizeRewardList() {
    EventPlatformFinalizeReward member = new EventPlatformFinalizeReward();
    member.setModelTypeName("event_platform_finalize_reward");
    member.setName("change_request");
    member.setMemberName("eventPlatformFinalizeRewardList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventWithdrawApplication eventWithdrawApplicationList() {
    EventWithdrawApplication member = new EventWithdrawApplication();
    member.setModelTypeName("event_withdraw_application");
    member.setName("change_request");
    member.setMemberName("eventWithdrawApplicationList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPostFeedback eventPostFeedbackList() {
    EventPostFeedback member = new EventPostFeedback();
    member.setModelTypeName("event_post_feedback");
    member.setName("change_request");
    member.setMemberName("eventPostFeedbackList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventSubmitWithdrawResult eventSubmitWithdrawResultList() {
    EventSubmitWithdrawResult member = new EventSubmitWithdrawResult();
    member.setModelTypeName("event_submit_withdraw_result");
    member.setName("change_request");
    member.setMemberName("eventSubmitWithdrawResultList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventDomesticTrialApplication eventDomesticTrialApplicationList() {
    EventDomesticTrialApplication member = new EventDomesticTrialApplication();
    member.setModelTypeName("event_domestic_trial_application");
    member.setName("change_request");
    member.setMemberName("eventDomesticTrialApplicationList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventInfoInCr eventInfoInCrList() {
    EventInfoInCr member = new EventInfoInCr();
    member.setModelTypeName("event_info_in_cr");
    member.setName("change_request");
    member.setMemberName("eventInfoInCrList");
    member.setRelationName("changeRequest");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public StringAttribute remoteIp() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_client_ip");
    // member.setName("remoteIp");
    member.setName("remote_ip");
    useMember(member);
    return member;
  }

  public BooleanAttribute commited() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("commited");
    member.setName("commited");
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
