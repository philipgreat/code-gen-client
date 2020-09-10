package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MobileUser extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.mobileuser.MobileUser";
  }
  // 枚举对象

  // 引用的对象

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
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

  public ArticleReview articleReviewList() {
    ArticleReview member = new ArticleReview();
    member.setModelTypeName("article_review");
    member.setName("post_by");
    member.setMemberName("articleReviewList");
    member.setRelationName("postBy");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArticleFavoritesRecord articleFavoritesRecordList() {
    ArticleFavoritesRecord member = new ArticleFavoritesRecord();
    member.setModelTypeName("article_favorites_record");
    member.setName("favorite_by");
    member.setMemberName("articleFavoritesRecordList");
    member.setRelationName("favoriteBy");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("submitter");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WithdrawApplication withdrawApplicationList() {
    WithdrawApplication member = new WithdrawApplication();
    member.setModelTypeName("withdraw_application");
    member.setName("applicant");
    member.setMemberName("withdrawApplicationList");
    member.setRelationName("applicant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CheckInRecord checkInRecordList() {
    CheckInRecord member = new CheckInRecord();
    member.setModelTypeName("check_in_record");
    member.setName("user");
    member.setMemberName("checkInRecordList");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserSuggestion userSuggestionList() {
    UserSuggestion member = new UserSuggestion();
    member.setModelTypeName("user_suggestion");
    member.setName("user");
    member.setMemberName("userSuggestionList");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserInviteTicket userInviteTicketList() {
    UserInviteTicket member = new UserInviteTicket();
    member.setModelTypeName("user_invite_ticket");
    member.setName("user");
    member.setMemberName("userInviteTicketList");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserInvite userInviteListAsInviter() {
    UserInvite member = new UserInvite();
    member.setModelTypeName("user_invite");
    member.setName("inviter");
    member.setMemberName("userInviteListAsInviter");
    member.setRelationName("inviter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserInvite userInviteListAsInvitee() {
    UserInvite member = new UserInvite();
    member.setModelTypeName("user_invite");
    member.setName("invitee");
    member.setMemberName("userInviteListAsInvitee");
    member.setRelationName("inviter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemMessage systemMessageList() {
    SystemMessage member = new SystemMessage();
    member.setModelTypeName("system_message");
    member.setName("recipient");
    member.setMemberName("systemMessageList");
    member.setRelationName("recipient");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Demand demandList() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("submitter");
    member.setMemberName("demandList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalTrade demandProposalTradeList() {
    DemandProposalTrade member = new DemandProposalTrade();
    member.setModelTypeName("demand_proposal_trade");
    member.setName("informant");
    member.setMemberName("demandProposalTradeList");
    member.setRelationName("informant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventSimpleType eventSimpleTypeList() {
    EventSimpleType member = new EventSimpleType();
    member.setModelTypeName("event_simple_type");
    member.setName("field_biz_candidate");
    member.setMemberName("eventSimpleTypeList");
    member.setRelationName("fieldBizCandidate");
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

  public StringAttribute avatar() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("avatar");
    member.setName("avatar");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
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
