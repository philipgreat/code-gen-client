package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.platform.Platform";
  }
  // 枚举对象

  // 引用的对象

  // 被引用的对象

  public Province provinceList() {
    Province member = new Province();
    member.setModelTypeName("province");
    member.setName("platform");
    member.setMemberName("provinceList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemProcessingInstance systemProcessingInstanceList() {
    SystemProcessingInstance member = new SystemProcessingInstance();
    member.setModelTypeName("system_processing_instance");
    member.setName("platform");
    member.setMemberName("systemProcessingInstanceList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArticleType articleTypeList() {
    ArticleType member = new ArticleType();
    member.setModelTypeName("article_type");
    member.setName("platform");
    member.setMemberName("articleTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Article articleList() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("platform");
    member.setMemberName("articleList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public KnowledgeBase knowledgeBaseList() {
    KnowledgeBase member = new KnowledgeBase();
    member.setModelTypeName("knowledge_base");
    member.setName("platform");
    member.setMemberName("knowledgeBaseList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DomesticTryOn domesticTryOnList() {
    DomesticTryOn member = new DomesticTryOn();
    member.setModelTypeName("domestic_try_on");
    member.setName("platform");
    member.setMemberName("domesticTryOnList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UnitType unitTypeList() {
    UnitType member = new UnitType();
    member.setModelTypeName("unit_type");
    member.setName("platform");
    member.setMemberName("unitTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("platform");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public TryOnApplicationStatus tryOnApplicationStatusList() {
    TryOnApplicationStatus member = new TryOnApplicationStatus();
    member.setModelTypeName("try_on_application_status");
    member.setName("platform");
    member.setMemberName("tryOnApplicationStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public AccountBookType accountBookTypeList() {
    AccountBookType member = new AccountBookType();
    member.setModelTypeName("account_book_type");
    member.setName("platform");
    member.setMemberName("accountBookTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public AccountBookItemStatus accountBookItemStatusList() {
    AccountBookItemStatus member = new AccountBookItemStatus();
    member.setModelTypeName("account_book_item_status");
    member.setName("platform");
    member.setMemberName("accountBookItemStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WithdrawStatus withdrawStatusList() {
    WithdrawStatus member = new WithdrawStatus();
    member.setModelTypeName("withdraw_status");
    member.setName("platform");
    member.setMemberName("withdrawStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WithdrawApplication withdrawApplicationList() {
    WithdrawApplication member = new WithdrawApplication();
    member.setModelTypeName("withdraw_application");
    member.setName("platform");
    member.setMemberName("withdrawApplicationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CheckInRecord checkInRecordList() {
    CheckInRecord member = new CheckInRecord();
    member.setModelTypeName("check_in_record");
    member.setName("platform");
    member.setMemberName("checkInRecordList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserSuggestion userSuggestionList() {
    UserSuggestion member = new UserSuggestion();
    member.setModelTypeName("user_suggestion");
    member.setName("platform");
    member.setMemberName("userSuggestionList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Merchant merchantList() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("platform");
    member.setMemberName("merchantList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MobileUser mobileUserList() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("platform");
    member.setMemberName("mobileUserList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Supplier supplierList() {
    Supplier member = new Supplier();
    member.setModelTypeName("supplier");
    member.setName("platform");
    member.setMemberName("supplierList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplierAvailableCity supplierAvailableCityList() {
    SupplierAvailableCity member = new SupplierAvailableCity();
    member.setModelTypeName("supplier_available_city");
    member.setName("platform");
    member.setMemberName("supplierAvailableCityList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Brand brandList() {
    Brand member = new Brand();
    member.setModelTypeName("brand");
    member.setName("platform");
    member.setMemberName("brandList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserInvite userInviteList() {
    UserInvite member = new UserInvite();
    member.setModelTypeName("user_invite");
    member.setName("platform");
    member.setMemberName("userInviteList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemMessage systemMessageList() {
    SystemMessage member = new SystemMessage();
    member.setModelTypeName("system_message");
    member.setName("platform");
    member.setMemberName("systemMessageList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Functionality functionalityList() {
    Functionality member = new Functionality();
    member.setModelTypeName("functionality");
    member.setName("platform");
    member.setMemberName("functionalityList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandType demandTypeList() {
    DemandType member = new DemandType();
    member.setModelTypeName("demand_type");
    member.setName("platform");
    member.setMemberName("demandTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Demand demandList() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("platform");
    member.setMemberName("demandList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandStatus demandStatusList() {
    DemandStatus member = new DemandStatus();
    member.setModelTypeName("demand_status");
    member.setName("platform");
    member.setMemberName("demandStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposal demandProposalList() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("platform");
    member.setMemberName("demandProposalList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalStatus demandProposalStatusList() {
    DemandProposalStatus member = new DemandProposalStatus();
    member.setModelTypeName("demand_proposal_status");
    member.setName("platform");
    member.setMemberName("demandProposalStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalTrade demandProposalTradeList() {
    DemandProposalTrade member = new DemandProposalTrade();
    member.setModelTypeName("demand_proposal_trade");
    member.setName("platform");
    member.setMemberName("demandProposalTradeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalTradeStatus demandProposalTradeStatusList() {
    DemandProposalTradeStatus member = new DemandProposalTradeStatus();
    member.setModelTypeName("demand_proposal_trade_status");
    member.setName("platform");
    member.setMemberName("demandProposalTradeStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public IconConfiguration iconConfigurationList() {
    IconConfiguration member = new IconConfiguration();
    member.setModelTypeName("icon_configuration");
    member.setName("platform");
    member.setMemberName("iconConfigurationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelConfiguration systemLevelConfigurationList() {
    SystemLevelConfiguration member = new SystemLevelConfiguration();
    member.setModelTypeName("system_level_configuration");
    member.setName("platform");
    member.setMemberName("systemLevelConfigurationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelImages systemLevelImagesList() {
    SystemLevelImages member = new SystemLevelImages();
    member.setModelTypeName("system_level_images");
    member.setName("platform");
    member.setMemberName("systemLevelImagesList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelContent systemLevelContentList() {
    SystemLevelContent member = new SystemLevelContent();
    member.setModelTypeName("system_level_content");
    member.setName("platform");
    member.setMemberName("systemLevelContentList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelNumber systemLevelNumberList() {
    SystemLevelNumber member = new SystemLevelNumber();
    member.setModelTypeName("system_level_number");
    member.setName("platform");
    member.setMemberName("systemLevelNumberList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ChangeRequestType changeRequestTypeList() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("platform");
    member.setMemberName("changeRequestTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ChangeRequest changeRequestList() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("platform");
    member.setMemberName("changeRequestList");
    member.setRelationName("platform");
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
