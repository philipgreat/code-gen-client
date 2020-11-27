package cla.edg.project.xt20.gen.dbquery;

import cla.edg.modelbean.BeanPath;

public class MODEL {
  public static String getBasePackageName() {
    return "com.doublechaintech.xt20";
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

  public static District district() {
    District rst = new District();
    rst.setModelTypeName("district");
    rst.setBeanPath(new BeanPath().name("district"));
    return rst;
  }

  public static Role role() {
    Role rst = new Role();
    rst.setModelTypeName("role");
    rst.setBeanPath(new BeanPath().name("role"));
    return rst;
  }

  public static EmployeeStatus employeeStatus() {
    EmployeeStatus rst = new EmployeeStatus();
    rst.setModelTypeName("employee_status");
    rst.setBeanPath(new BeanPath().name("employee_status"));
    return rst;
  }

  public static InvitationType invitationType() {
    InvitationType rst = new InvitationType();
    rst.setModelTypeName("invitation_type");
    rst.setBeanPath(new BeanPath().name("invitation_type"));
    return rst;
  }

  public static Merchant merchant() {
    Merchant rst = new Merchant();
    rst.setModelTypeName("merchant");
    rst.setBeanPath(new BeanPath().name("merchant"));
    return rst;
  }

  public static PersonalUser personalUser() {
    PersonalUser rst = new PersonalUser();
    rst.setModelTypeName("personal_user");
    rst.setBeanPath(new BeanPath().name("personal_user"));
    return rst;
  }

  public static IndividualIdentity individualIdentity() {
    IndividualIdentity rst = new IndividualIdentity();
    rst.setModelTypeName("individual_identity");
    rst.setBeanPath(new BeanPath().name("individual_identity"));
    return rst;
  }

  public static UserWorkingInfo userWorkingInfo() {
    UserWorkingInfo rst = new UserWorkingInfo();
    rst.setModelTypeName("user_working_info");
    rst.setBeanPath(new BeanPath().name("user_working_info"));
    return rst;
  }

  public static OrganizationIdentity organizationIdentity() {
    OrganizationIdentity rst = new OrganizationIdentity();
    rst.setModelTypeName("organization_identity");
    rst.setBeanPath(new BeanPath().name("organization_identity"));
    return rst;
  }

  public static Warehouse warehouse() {
    Warehouse rst = new Warehouse();
    rst.setModelTypeName("warehouse");
    rst.setBeanPath(new BeanPath().name("warehouse"));
    return rst;
  }

  public static InvitationRecord invitationRecord() {
    InvitationRecord rst = new InvitationRecord();
    rst.setModelTypeName("invitation_record");
    rst.setBeanPath(new BeanPath().name("invitation_record"));
    return rst;
  }

  public static Employee employee() {
    Employee rst = new Employee();
    rst.setModelTypeName("employee");
    rst.setBeanPath(new BeanPath().name("employee"));
    return rst;
  }

  public static SupplyRelationship supplyRelationship() {
    SupplyRelationship rst = new SupplyRelationship();
    rst.setModelTypeName("supply_relationship");
    rst.setBeanPath(new BeanPath().name("supply_relationship"));
    return rst;
  }

  public static GasContainer gasContainer() {
    GasContainer rst = new GasContainer();
    rst.setModelTypeName("gas_container");
    rst.setBeanPath(new BeanPath().name("gas_container"));
    return rst;
  }

  public static FillMedium fillMedium() {
    FillMedium rst = new FillMedium();
    rst.setModelTypeName("fill_medium");
    rst.setBeanPath(new BeanPath().name("fill_medium"));
    return rst;
  }

  public static NominalVolume nominalVolume() {
    NominalVolume rst = new NominalVolume();
    rst.setModelTypeName("nominal_volume");
    rst.setBeanPath(new BeanPath().name("nominal_volume"));
    return rst;
  }

  public static FillVolume fillVolume() {
    FillVolume rst = new FillVolume();
    rst.setModelTypeName("fill_volume");
    rst.setBeanPath(new BeanPath().name("fill_volume"));
    return rst;
  }

  public static NominalPressure nominalPressure() {
    NominalPressure rst = new NominalPressure();
    rst.setModelTypeName("nominal_pressure");
    rst.setBeanPath(new BeanPath().name("nominal_pressure"));
    return rst;
  }

  public static GasContainerCategory gasContainerCategory() {
    GasContainerCategory rst = new GasContainerCategory();
    rst.setModelTypeName("gas_container_category");
    rst.setBeanPath(new BeanPath().name("gas_container_category"));
    return rst;
  }

  public static GasComponent gasComponent() {
    GasComponent rst = new GasComponent();
    rst.setModelTypeName("gas_component");
    rst.setBeanPath(new BeanPath().name("gas_component"));
    return rst;
  }

  public static CheckStatus checkStatus() {
    CheckStatus rst = new CheckStatus();
    rst.setModelTypeName("check_status");
    rst.setBeanPath(new BeanPath().name("check_status"));
    return rst;
  }

  public static ActionType actionType() {
    ActionType rst = new ActionType();
    rst.setModelTypeName("action_type");
    rst.setBeanPath(new BeanPath().name("action_type"));
    return rst;
  }

  public static ProductStatus productStatus() {
    ProductStatus rst = new ProductStatus();
    rst.setModelTypeName("product_status");
    rst.setBeanPath(new BeanPath().name("product_status"));
    return rst;
  }

  public static OrderStatus orderStatus() {
    OrderStatus rst = new OrderStatus();
    rst.setModelTypeName("order_status");
    rst.setBeanPath(new BeanPath().name("order_status"));
    return rst;
  }

  public static DeliverType deliverType() {
    DeliverType rst = new DeliverType();
    rst.setModelTypeName("deliver_type");
    rst.setBeanPath(new BeanPath().name("deliver_type"));
    return rst;
  }

  public static ShippingStatus shippingStatus() {
    ShippingStatus rst = new ShippingStatus();
    rst.setModelTypeName("shipping_status");
    rst.setBeanPath(new BeanPath().name("shipping_status"));
    return rst;
  }

  public static DeliverTaskStatus deliverTaskStatus() {
    DeliverTaskStatus rst = new DeliverTaskStatus();
    rst.setModelTypeName("deliver_task_status");
    rst.setBeanPath(new BeanPath().name("deliver_task_status"));
    return rst;
  }

  public static DeliveryReceiptStatus deliveryReceiptStatus() {
    DeliveryReceiptStatus rst = new DeliveryReceiptStatus();
    rst.setModelTypeName("delivery_receipt_status");
    rst.setBeanPath(new BeanPath().name("delivery_receipt_status"));
    return rst;
  }

  public static GasCylinder gasCylinder() {
    GasCylinder rst = new GasCylinder();
    rst.setModelTypeName("gas_cylinder");
    rst.setBeanPath(new BeanPath().name("gas_cylinder"));
    return rst;
  }

  public static MerchantCylinder merchantCylinder() {
    MerchantCylinder rst = new MerchantCylinder();
    rst.setModelTypeName("merchant_cylinder");
    rst.setBeanPath(new BeanPath().name("merchant_cylinder"));
    return rst;
  }

  public static MerchantCylinderRecord merchantCylinderRecord() {
    MerchantCylinderRecord rst = new MerchantCylinderRecord();
    rst.setModelTypeName("merchant_cylinder_record");
    rst.setBeanPath(new BeanPath().name("merchant_cylinder_record"));
    return rst;
  }

  public static CustomerCylinder customerCylinder() {
    CustomerCylinder rst = new CustomerCylinder();
    rst.setModelTypeName("customer_cylinder");
    rst.setBeanPath(new BeanPath().name("customer_cylinder"));
    return rst;
  }

  public static CustomerCylinderRecord customerCylinderRecord() {
    CustomerCylinderRecord rst = new CustomerCylinderRecord();
    rst.setModelTypeName("customer_cylinder_record");
    rst.setBeanPath(new BeanPath().name("customer_cylinder_record"));
    return rst;
  }

  public static CustomerCylinderRecordEvidence customerCylinderRecordEvidence() {
    CustomerCylinderRecordEvidence rst = new CustomerCylinderRecordEvidence();
    rst.setModelTypeName("customer_cylinder_record_evidence");
    rst.setBeanPath(new BeanPath().name("customer_cylinder_record_evidence"));
    return rst;
  }

  public static GasProductTemplate gasProductTemplate() {
    GasProductTemplate rst = new GasProductTemplate();
    rst.setModelTypeName("gas_product_template");
    rst.setBeanPath(new BeanPath().name("gas_product_template"));
    return rst;
  }

  public static GasProductTemplateComponent gasProductTemplateComponent() {
    GasProductTemplateComponent rst = new GasProductTemplateComponent();
    rst.setModelTypeName("gas_product_template_component");
    rst.setBeanPath(new BeanPath().name("gas_product_template_component"));
    return rst;
  }

  public static GasProduct gasProduct() {
    GasProduct rst = new GasProduct();
    rst.setModelTypeName("gas_product");
    rst.setBeanPath(new BeanPath().name("gas_product"));
    return rst;
  }

  public static GasProductComponent gasProductComponent() {
    GasProductComponent rst = new GasProductComponent();
    rst.setModelTypeName("gas_product_component");
    rst.setBeanPath(new BeanPath().name("gas_product_component"));
    return rst;
  }

  public static GasProductInventoryRecord gasProductInventoryRecord() {
    GasProductInventoryRecord rst = new GasProductInventoryRecord();
    rst.setModelTypeName("gas_product_inventory_record");
    rst.setBeanPath(new BeanPath().name("gas_product_inventory_record"));
    return rst;
  }

  public static GasProductCache gasProductCache() {
    GasProductCache rst = new GasProductCache();
    rst.setModelTypeName("gas_product_cache");
    rst.setBeanPath(new BeanPath().name("gas_product_cache"));
    return rst;
  }

  public static GasProductTemplateCache gasProductTemplateCache() {
    GasProductTemplateCache rst = new GasProductTemplateCache();
    rst.setModelTypeName("gas_product_template_cache");
    rst.setBeanPath(new BeanPath().name("gas_product_template_cache"));
    return rst;
  }

  public static DeliverTask deliverTask() {
    DeliverTask rst = new DeliverTask();
    rst.setModelTypeName("deliver_task");
    rst.setBeanPath(new BeanPath().name("deliver_task"));
    return rst;
  }

  public static MainOrder mainOrder() {
    MainOrder rst = new MainOrder();
    rst.setModelTypeName("main_order");
    rst.setBeanPath(new BeanPath().name("main_order"));
    return rst;
  }

  public static GasLineItem gasLineItem() {
    GasLineItem rst = new GasLineItem();
    rst.setModelTypeName("gas_line_item");
    rst.setBeanPath(new BeanPath().name("gas_line_item"));
    return rst;
  }

  public static GasShippingGroup gasShippingGroup() {
    GasShippingGroup rst = new GasShippingGroup();
    rst.setModelTypeName("gas_shipping_group");
    rst.setBeanPath(new BeanPath().name("gas_shipping_group"));
    return rst;
  }

  public static DeliveryReceipt deliveryReceipt() {
    DeliveryReceipt rst = new DeliveryReceipt();
    rst.setModelTypeName("delivery_receipt");
    rst.setBeanPath(new BeanPath().name("delivery_receipt"));
    return rst;
  }

  public static OrderActionType orderActionType() {
    OrderActionType rst = new OrderActionType();
    rst.setModelTypeName("order_action_type");
    rst.setBeanPath(new BeanPath().name("order_action_type"));
    return rst;
  }

  public static OrderOperationRecord orderOperationRecord() {
    OrderOperationRecord rst = new OrderOperationRecord();
    rst.setModelTypeName("order_operation_record");
    rst.setBeanPath(new BeanPath().name("order_operation_record"));
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

  public static SystemAnnouncement systemAnnouncement() {
    SystemAnnouncement rst = new SystemAnnouncement();
    rst.setModelTypeName("system_announcement");
    rst.setBeanPath(new BeanPath().name("system_announcement"));
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

  public static EventTbd eventTbd() {
    EventTbd rst = new EventTbd();
    rst.setModelTypeName("event_tbd");
    rst.setBeanPath(new BeanPath().name("event_tbd"));
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
