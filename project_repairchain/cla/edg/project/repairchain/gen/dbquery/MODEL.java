package cla.edg.project.repairchain.gen.dbquery;

import cla.edg.modelbean.BeanPath;

public class MODEL {
  public static String getBasePackageName() {
    return "com.doublechaintech.repairchain";
  }

  public static Platform platform() {
    Platform rst = new Platform();
    rst.setModelTypeName("platform");
    rst.setBeanPath(new BeanPath().name("platform"));
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

  public static EventAddFactory eventAddFactory() {
    EventAddFactory rst = new EventAddFactory();
    rst.setModelTypeName("event_add_factory");
    rst.setBeanPath(new BeanPath().name("event_add_factory"));
    return rst;
  }

  public static EventInfoInCr eventInfoInCr() {
    EventInfoInCr rst = new EventInfoInCr();
    rst.setModelTypeName("event_info_in_cr");
    rst.setBeanPath(new BeanPath().name("event_info_in_cr"));
    return rst;
  }

  public static SystemProcessingInstance systemProcessingInstance() {
    SystemProcessingInstance rst = new SystemProcessingInstance();
    rst.setModelTypeName("system_processing_instance");
    rst.setBeanPath(new BeanPath().name("system_processing_instance"));
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
