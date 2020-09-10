package cla.edg.project.saleschain.gen.dbquery;

import cla.edg.modelbean.BeanPath;

public class MODEL {
  public static String getBasePackageName() {
    return "com.doublechaintech.saleschain";
  }

  public static Platform platform() {
    Platform rst = new Platform();
    rst.setModelTypeName("platform");
    rst.setBeanPath(new BeanPath().name("platform"));
    return rst;
  }

  public static Province province() {
    Province rst = new Province();
    rst.setModelTypeName("province");
    rst.setBeanPath(new BeanPath().name("province"));
    return rst;
  }

  public static City city() {
    City rst = new City();
    rst.setModelTypeName("city");
    rst.setBeanPath(new BeanPath().name("city"));
    return rst;
  }

  public static SystemProcessingInstance systemProcessingInstance() {
    SystemProcessingInstance rst = new SystemProcessingInstance();
    rst.setModelTypeName("system_processing_instance");
    rst.setBeanPath(new BeanPath().name("system_processing_instance"));
    return rst;
  }

  public static ArticleType articleType() {
    ArticleType rst = new ArticleType();
    rst.setModelTypeName("article_type");
    rst.setBeanPath(new BeanPath().name("article_type"));
    return rst;
  }

  public static Article article() {
    Article rst = new Article();
    rst.setModelTypeName("article");
    rst.setBeanPath(new BeanPath().name("article"));
    return rst;
  }

  public static KnowledgeBase knowledgeBase() {
    KnowledgeBase rst = new KnowledgeBase();
    rst.setModelTypeName("knowledge_base");
    rst.setBeanPath(new BeanPath().name("knowledge_base"));
    return rst;
  }

  public static ArticleReview articleReview() {
    ArticleReview rst = new ArticleReview();
    rst.setModelTypeName("article_review");
    rst.setBeanPath(new BeanPath().name("article_review"));
    return rst;
  }

  public static ArticleFavoritesRecord articleFavoritesRecord() {
    ArticleFavoritesRecord rst = new ArticleFavoritesRecord();
    rst.setModelTypeName("article_favorites_record");
    rst.setBeanPath(new BeanPath().name("article_favorites_record"));
    return rst;
  }

  public static DomesticTryOn domesticTryOn() {
    DomesticTryOn rst = new DomesticTryOn();
    rst.setModelTypeName("domestic_try_on");
    rst.setBeanPath(new BeanPath().name("domestic_try_on"));
    return rst;
  }

  public static UnitType unitType() {
    UnitType rst = new UnitType();
    rst.setModelTypeName("unit_type");
    rst.setBeanPath(new BeanPath().name("unit_type"));
    return rst;
  }

  public static TryOnApplication tryOnApplication() {
    TryOnApplication rst = new TryOnApplication();
    rst.setModelTypeName("try_on_application");
    rst.setBeanPath(new BeanPath().name("try_on_application"));
    return rst;
  }

  public static TryOnApplicationStatus tryOnApplicationStatus() {
    TryOnApplicationStatus rst = new TryOnApplicationStatus();
    rst.setModelTypeName("try_on_application_status");
    rst.setBeanPath(new BeanPath().name("try_on_application_status"));
    return rst;
  }

  public static AccountBookType accountBookType() {
    AccountBookType rst = new AccountBookType();
    rst.setModelTypeName("account_book_type");
    rst.setBeanPath(new BeanPath().name("account_book_type"));
    return rst;
  }

  public static AccountBook accountBook() {
    AccountBook rst = new AccountBook();
    rst.setModelTypeName("account_book");
    rst.setBeanPath(new BeanPath().name("account_book"));
    return rst;
  }

  public static AccountBookItemStatus accountBookItemStatus() {
    AccountBookItemStatus rst = new AccountBookItemStatus();
    rst.setModelTypeName("account_book_item_status");
    rst.setBeanPath(new BeanPath().name("account_book_item_status"));
    return rst;
  }

  public static AccountBookItem accountBookItem() {
    AccountBookItem rst = new AccountBookItem();
    rst.setModelTypeName("account_book_item");
    rst.setBeanPath(new BeanPath().name("account_book_item"));
    return rst;
  }

  public static AccountBookRecord accountBookRecord() {
    AccountBookRecord rst = new AccountBookRecord();
    rst.setModelTypeName("account_book_record");
    rst.setBeanPath(new BeanPath().name("account_book_record"));
    return rst;
  }

  public static WithdrawStatus withdrawStatus() {
    WithdrawStatus rst = new WithdrawStatus();
    rst.setModelTypeName("withdraw_status");
    rst.setBeanPath(new BeanPath().name("withdraw_status"));
    return rst;
  }

  public static WithdrawApplication withdrawApplication() {
    WithdrawApplication rst = new WithdrawApplication();
    rst.setModelTypeName("withdraw_application");
    rst.setBeanPath(new BeanPath().name("withdraw_application"));
    return rst;
  }

  public static CheckInRecord checkInRecord() {
    CheckInRecord rst = new CheckInRecord();
    rst.setModelTypeName("check_in_record");
    rst.setBeanPath(new BeanPath().name("check_in_record"));
    return rst;
  }

  public static UserSuggestion userSuggestion() {
    UserSuggestion rst = new UserSuggestion();
    rst.setModelTypeName("user_suggestion");
    rst.setBeanPath(new BeanPath().name("user_suggestion"));
    return rst;
  }

  public static Merchant merchant() {
    Merchant rst = new Merchant();
    rst.setModelTypeName("merchant");
    rst.setBeanPath(new BeanPath().name("merchant"));
    return rst;
  }

  public static MobileUser mobileUser() {
    MobileUser rst = new MobileUser();
    rst.setModelTypeName("mobile_user");
    rst.setBeanPath(new BeanPath().name("mobile_user"));
    return rst;
  }

  public static Supplier supplier() {
    Supplier rst = new Supplier();
    rst.setModelTypeName("supplier");
    rst.setBeanPath(new BeanPath().name("supplier"));
    return rst;
  }

  public static SupplierCase supplierCase() {
    SupplierCase rst = new SupplierCase();
    rst.setModelTypeName("supplier_case");
    rst.setBeanPath(new BeanPath().name("supplier_case"));
    return rst;
  }

  public static SupplierAvailableCity supplierAvailableCity() {
    SupplierAvailableCity rst = new SupplierAvailableCity();
    rst.setModelTypeName("supplier_available_city");
    rst.setBeanPath(new BeanPath().name("supplier_available_city"));
    return rst;
  }

  public static Brand brand() {
    Brand rst = new Brand();
    rst.setModelTypeName("brand");
    rst.setBeanPath(new BeanPath().name("brand"));
    return rst;
  }

  public static BrandCase brandCase() {
    BrandCase rst = new BrandCase();
    rst.setModelTypeName("brand_case");
    rst.setBeanPath(new BeanPath().name("brand_case"));
    return rst;
  }

  public static UserInviteTicket userInviteTicket() {
    UserInviteTicket rst = new UserInviteTicket();
    rst.setModelTypeName("user_invite_ticket");
    rst.setBeanPath(new BeanPath().name("user_invite_ticket"));
    return rst;
  }

  public static UserInvite userInvite() {
    UserInvite rst = new UserInvite();
    rst.setModelTypeName("user_invite");
    rst.setBeanPath(new BeanPath().name("user_invite"));
    return rst;
  }

  public static SystemMessage systemMessage() {
    SystemMessage rst = new SystemMessage();
    rst.setModelTypeName("system_message");
    rst.setBeanPath(new BeanPath().name("system_message"));
    return rst;
  }

  public static Functionality functionality() {
    Functionality rst = new Functionality();
    rst.setModelTypeName("functionality");
    rst.setBeanPath(new BeanPath().name("functionality"));
    return rst;
  }

  public static Category category() {
    Category rst = new Category();
    rst.setModelTypeName("category");
    rst.setBeanPath(new BeanPath().name("category"));
    return rst;
  }

  public static Product product() {
    Product rst = new Product();
    rst.setModelTypeName("product");
    rst.setBeanPath(new BeanPath().name("product"));
    return rst;
  }

  public static SearchAssistantContext searchAssistantContext() {
    SearchAssistantContext rst = new SearchAssistantContext();
    rst.setModelTypeName("search_assistant_context");
    rst.setBeanPath(new BeanPath().name("search_assistant_context"));
    return rst;
  }

  public static DemandType demandType() {
    DemandType rst = new DemandType();
    rst.setModelTypeName("demand_type");
    rst.setBeanPath(new BeanPath().name("demand_type"));
    return rst;
  }

  public static Demand demand() {
    Demand rst = new Demand();
    rst.setModelTypeName("demand");
    rst.setBeanPath(new BeanPath().name("demand"));
    return rst;
  }

  public static DemandStatus demandStatus() {
    DemandStatus rst = new DemandStatus();
    rst.setModelTypeName("demand_status");
    rst.setBeanPath(new BeanPath().name("demand_status"));
    return rst;
  }

  public static DemandProposal demandProposal() {
    DemandProposal rst = new DemandProposal();
    rst.setModelTypeName("demand_proposal");
    rst.setBeanPath(new BeanPath().name("demand_proposal"));
    return rst;
  }

  public static DemandProposalStatus demandProposalStatus() {
    DemandProposalStatus rst = new DemandProposalStatus();
    rst.setModelTypeName("demand_proposal_status");
    rst.setBeanPath(new BeanPath().name("demand_proposal_status"));
    return rst;
  }

  public static DemandProposalTrade demandProposalTrade() {
    DemandProposalTrade rst = new DemandProposalTrade();
    rst.setModelTypeName("demand_proposal_trade");
    rst.setBeanPath(new BeanPath().name("demand_proposal_trade"));
    return rst;
  }

  public static DemandProposalTradeStatus demandProposalTradeStatus() {
    DemandProposalTradeStatus rst = new DemandProposalTradeStatus();
    rst.setModelTypeName("demand_proposal_trade_status");
    rst.setBeanPath(new BeanPath().name("demand_proposal_trade_status"));
    return rst;
  }

  public static DemandProposalLog demandProposalLog() {
    DemandProposalLog rst = new DemandProposalLog();
    rst.setModelTypeName("demand_proposal_log");
    rst.setBeanPath(new BeanPath().name("demand_proposal_log"));
    return rst;
  }

  public static Roo roo() {
    Roo rst = new Roo();
    rst.setModelTypeName("roo");
    rst.setBeanPath(new BeanPath().name("roo"));
    return rst;
  }

  public static IconConfiguration iconConfiguration() {
    IconConfiguration rst = new IconConfiguration();
    rst.setModelTypeName("icon_configuration");
    rst.setBeanPath(new BeanPath().name("icon_configuration"));
    return rst;
  }

  public static SystemLevelConfiguration systemLevelConfiguration() {
    SystemLevelConfiguration rst = new SystemLevelConfiguration();
    rst.setModelTypeName("system_level_configuration");
    rst.setBeanPath(new BeanPath().name("system_level_configuration"));
    return rst;
  }

  public static SystemLevelImages systemLevelImages() {
    SystemLevelImages rst = new SystemLevelImages();
    rst.setModelTypeName("system_level_images");
    rst.setBeanPath(new BeanPath().name("system_level_images"));
    return rst;
  }

  public static SystemLevelContent systemLevelContent() {
    SystemLevelContent rst = new SystemLevelContent();
    rst.setModelTypeName("system_level_content");
    rst.setBeanPath(new BeanPath().name("system_level_content"));
    return rst;
  }

  public static SystemLevelNumber systemLevelNumber() {
    SystemLevelNumber rst = new SystemLevelNumber();
    rst.setModelTypeName("system_level_number");
    rst.setBeanPath(new BeanPath().name("system_level_number"));
    return rst;
  }

  public static ChangeRequestType changeRequestType() {
    ChangeRequestType rst = new ChangeRequestType();
    rst.setModelTypeName("change_request_type");
    rst.setBeanPath(new BeanPath().name("change_request_type"));
    return rst;
  }

  public static ChangeRequest changeRequest() {
    ChangeRequest rst = new ChangeRequest();
    rst.setModelTypeName("change_request");
    rst.setBeanPath(new BeanPath().name("change_request"));
    return rst;
  }

  public static EventSimpleType eventSimpleType() {
    EventSimpleType rst = new EventSimpleType();
    rst.setModelTypeName("event_simple_type");
    rst.setBeanPath(new BeanPath().name("event_simple_type"));
    return rst;
  }

  public static EventOtherType eventOtherType() {
    EventOtherType rst = new EventOtherType();
    rst.setModelTypeName("event_other_type");
    rst.setBeanPath(new BeanPath().name("event_other_type"));
    return rst;
  }

  public static EventReviewArticle eventReviewArticle() {
    EventReviewArticle rst = new EventReviewArticle();
    rst.setModelTypeName("event_review_article");
    rst.setBeanPath(new BeanPath().name("event_review_article"));
    return rst;
  }

  public static EventPostDemand eventPostDemand() {
    EventPostDemand rst = new EventPostDemand();
    rst.setModelTypeName("event_post_demand");
    rst.setBeanPath(new BeanPath().name("event_post_demand"));
    return rst;
  }

  public static EventConfirmation eventConfirmation() {
    EventConfirmation rst = new EventConfirmation();
    rst.setModelTypeName("event_confirmation");
    rst.setBeanPath(new BeanPath().name("event_confirmation"));
    return rst;
  }

  public static EventPlatformFinalizeReward eventPlatformFinalizeReward() {
    EventPlatformFinalizeReward rst = new EventPlatformFinalizeReward();
    rst.setModelTypeName("event_platform_finalize_reward");
    rst.setBeanPath(new BeanPath().name("event_platform_finalize_reward"));
    return rst;
  }

  public static EventWithdrawApplication eventWithdrawApplication() {
    EventWithdrawApplication rst = new EventWithdrawApplication();
    rst.setModelTypeName("event_withdraw_application");
    rst.setBeanPath(new BeanPath().name("event_withdraw_application"));
    return rst;
  }

  public static EventPostFeedback eventPostFeedback() {
    EventPostFeedback rst = new EventPostFeedback();
    rst.setModelTypeName("event_post_feedback");
    rst.setBeanPath(new BeanPath().name("event_post_feedback"));
    return rst;
  }

  public static EventSubmitWithdrawResult eventSubmitWithdrawResult() {
    EventSubmitWithdrawResult rst = new EventSubmitWithdrawResult();
    rst.setModelTypeName("event_submit_withdraw_result");
    rst.setBeanPath(new BeanPath().name("event_submit_withdraw_result"));
    return rst;
  }

  public static EventDomesticTrialApplication eventDomesticTrialApplication() {
    EventDomesticTrialApplication rst = new EventDomesticTrialApplication();
    rst.setModelTypeName("event_domestic_trial_application");
    rst.setBeanPath(new BeanPath().name("event_domestic_trial_application"));
    return rst;
  }

  public static EventInfoInCr eventInfoInCr() {
    EventInfoInCr rst = new EventInfoInCr();
    rst.setModelTypeName("event_info_in_cr");
    rst.setBeanPath(new BeanPath().name("event_info_in_cr"));
    return rst;
  }

  public static MobileApp mobileApp() {
    MobileApp rst = new MobileApp();
    rst.setModelTypeName("mobile_app");
    rst.setBeanPath(new BeanPath().name("mobile_app"));
    return rst;
  }

  public static Page page() {
    Page rst = new Page();
    rst.setModelTypeName("page");
    rst.setBeanPath(new BeanPath().name("page"));
    return rst;
  }

  public static PageType pageType() {
    PageType rst = new PageType();
    rst.setModelTypeName("page_type");
    rst.setBeanPath(new BeanPath().name("page_type"));
    return rst;
  }

  public static Slide slide() {
    Slide rst = new Slide();
    rst.setModelTypeName("slide");
    rst.setBeanPath(new BeanPath().name("slide"));
    return rst;
  }

  public static UiAction uiAction() {
    UiAction rst = new UiAction();
    rst.setModelTypeName("ui_action");
    rst.setBeanPath(new BeanPath().name("ui_action"));
    return rst;
  }

  public static Section section() {
    Section rst = new Section();
    rst.setModelTypeName("section");
    rst.setBeanPath(new BeanPath().name("section"));
    return rst;
  }

  public static UserDomain userDomain() {
    UserDomain rst = new UserDomain();
    rst.setModelTypeName("user_domain");
    rst.setBeanPath(new BeanPath().name("user_domain"));
    return rst;
  }

  public static UserAllowList userAllowList() {
    UserAllowList rst = new UserAllowList();
    rst.setModelTypeName("user_allow_list");
    rst.setBeanPath(new BeanPath().name("user_allow_list"));
    return rst;
  }

  public static SecUser secUser() {
    SecUser rst = new SecUser();
    rst.setModelTypeName("sec_user");
    rst.setBeanPath(new BeanPath().name("sec_user"));
    return rst;
  }

  public static UserApp userApp() {
    UserApp rst = new UserApp();
    rst.setModelTypeName("user_app");
    rst.setBeanPath(new BeanPath().name("user_app"));
    return rst;
  }

  public static QuickLink quickLink() {
    QuickLink rst = new QuickLink();
    rst.setModelTypeName("quick_link");
    rst.setBeanPath(new BeanPath().name("quick_link"));
    return rst;
  }

  public static ListAccess listAccess() {
    ListAccess rst = new ListAccess();
    rst.setModelTypeName("list_access");
    rst.setBeanPath(new BeanPath().name("list_access"));
    return rst;
  }

  public static LoginHistory loginHistory() {
    LoginHistory rst = new LoginHistory();
    rst.setModelTypeName("login_history");
    rst.setBeanPath(new BeanPath().name("login_history"));
    return rst;
  }

  public static CandidateContainer candidateContainer() {
    CandidateContainer rst = new CandidateContainer();
    rst.setModelTypeName("candidate_container");
    rst.setBeanPath(new BeanPath().name("candidate_container"));
    return rst;
  }

  public static CandidateElement candidateElement() {
    CandidateElement rst = new CandidateElement();
    rst.setModelTypeName("candidate_element");
    rst.setBeanPath(new BeanPath().name("candidate_element"));
    return rst;
  }

  public static WechatWorkappIdentity wechatWorkappIdentity() {
    WechatWorkappIdentity rst = new WechatWorkappIdentity();
    rst.setModelTypeName("wechat_workapp_identity");
    rst.setBeanPath(new BeanPath().name("wechat_workapp_identity"));
    return rst;
  }

  public static WechatMiniappIdentity wechatMiniappIdentity() {
    WechatMiniappIdentity rst = new WechatMiniappIdentity();
    rst.setModelTypeName("wechat_miniapp_identity");
    rst.setBeanPath(new BeanPath().name("wechat_miniapp_identity"));
    return rst;
  }

  public static KeypairIdentity keypairIdentity() {
    KeypairIdentity rst = new KeypairIdentity();
    rst.setModelTypeName("keypair_identity");
    rst.setBeanPath(new BeanPath().name("keypair_identity"));
    return rst;
  }

  public static PublicKeyType publicKeyType() {
    PublicKeyType rst = new PublicKeyType();
    rst.setModelTypeName("public_key_type");
    rst.setBeanPath(new BeanPath().name("public_key_type"));
    return rst;
  }

  public static TreeNode treeNode() {
    TreeNode rst = new TreeNode();
    rst.setModelTypeName("tree_node");
    rst.setBeanPath(new BeanPath().name("tree_node"));
    return rst;
  }
}
