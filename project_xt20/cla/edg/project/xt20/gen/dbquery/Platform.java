package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.platform.Platform";
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

  public City cityList() {
    City member = new City();
    member.setModelTypeName("city");
    member.setName("platform");
    member.setMemberName("cityList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public District districtList() {
    District member = new District();
    member.setModelTypeName("district");
    member.setName("platform");
    member.setMemberName("districtList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Role roleList() {
    Role member = new Role();
    member.setModelTypeName("role");
    member.setName("platform");
    member.setMemberName("roleList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EmployeeStatus employeeStatusList() {
    EmployeeStatus member = new EmployeeStatus();
    member.setModelTypeName("employee_status");
    member.setName("platform");
    member.setMemberName("employeeStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InvitationType invitationTypeList() {
    InvitationType member = new InvitationType();
    member.setModelTypeName("invitation_type");
    member.setName("platform");
    member.setMemberName("invitationTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OffTime offTimeList() {
    OffTime member = new OffTime();
    member.setModelTypeName("off_time");
    member.setName("platform");
    member.setMemberName("offTimeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MerchantType merchantTypeList() {
    MerchantType member = new MerchantType();
    member.setModelTypeName("merchant_type");
    member.setName("platform");
    member.setMemberName("merchantTypeList");
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

  public PersonalUser personalUserList() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("platform");
    member.setMemberName("personalUserList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public IndividualIdentity individualIdentityList() {
    IndividualIdentity member = new IndividualIdentity();
    member.setModelTypeName("individual_identity");
    member.setName("platform");
    member.setMemberName("individualIdentityList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrganizationIdentity organizationIdentityList() {
    OrganizationIdentity member = new OrganizationIdentity();
    member.setModelTypeName("organization_identity");
    member.setName("platform");
    member.setMemberName("organizationIdentityList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("platform");
    member.setMemberName("employeeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasContainer gasContainerList() {
    GasContainer member = new GasContainer();
    member.setModelTypeName("gas_container");
    member.setName("platform");
    member.setMemberName("gasContainerList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FillMedium fillMediumList() {
    FillMedium member = new FillMedium();
    member.setModelTypeName("fill_medium");
    member.setName("platform");
    member.setMemberName("fillMediumList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public NominalVolume nominalVolumeList() {
    NominalVolume member = new NominalVolume();
    member.setModelTypeName("nominal_volume");
    member.setName("platform");
    member.setMemberName("nominalVolumeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FillVolume fillVolumeList() {
    FillVolume member = new FillVolume();
    member.setModelTypeName("fill_volume");
    member.setName("platform");
    member.setMemberName("fillVolumeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public NominalPressure nominalPressureList() {
    NominalPressure member = new NominalPressure();
    member.setModelTypeName("nominal_pressure");
    member.setName("platform");
    member.setMemberName("nominalPressureList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProductType productTypeList() {
    ProductType member = new ProductType();
    member.setModelTypeName("product_type");
    member.setName("platform");
    member.setMemberName("productTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CheckStatus checkStatusList() {
    CheckStatus member = new CheckStatus();
    member.setModelTypeName("check_status");
    member.setName("platform");
    member.setMemberName("checkStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ActionType actionTypeList() {
    ActionType member = new ActionType();
    member.setModelTypeName("action_type");
    member.setName("platform");
    member.setMemberName("actionTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ProductStatus productStatusList() {
    ProductStatus member = new ProductStatus();
    member.setModelTypeName("product_status");
    member.setName("platform");
    member.setMemberName("productStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrderStatus orderStatusList() {
    OrderStatus member = new OrderStatus();
    member.setModelTypeName("order_status");
    member.setName("platform");
    member.setMemberName("orderStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverType deliverTypeList() {
    DeliverType member = new DeliverType();
    member.setModelTypeName("deliver_type");
    member.setName("platform");
    member.setMemberName("deliverTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ShippingStatus shippingStatusList() {
    ShippingStatus member = new ShippingStatus();
    member.setModelTypeName("shipping_status");
    member.setName("platform");
    member.setMemberName("shippingStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverTaskStatus deliverTaskStatusList() {
    DeliverTaskStatus member = new DeliverTaskStatus();
    member.setModelTypeName("deliver_task_status");
    member.setName("platform");
    member.setMemberName("deliverTaskStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptStatus deliveryReceiptStatusList() {
    DeliveryReceiptStatus member = new DeliveryReceiptStatus();
    member.setModelTypeName("delivery_receipt_status");
    member.setName("platform");
    member.setMemberName("deliveryReceiptStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CylinderArea cylinderAreaList() {
    CylinderArea member = new CylinderArea();
    member.setModelTypeName("cylinder_area");
    member.setName("platform");
    member.setMemberName("cylinderAreaList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasCylinder gasCylinderList() {
    GasCylinder member = new GasCylinder();
    member.setModelTypeName("gas_cylinder");
    member.setName("platform");
    member.setMemberName("gasCylinderList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplate gasProductTemplateList() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("platform");
    member.setMemberName("gasProductTemplateList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("platform");
    member.setMemberName("gasProductList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MainOrder mainOrderList() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("platform");
    member.setMemberName("mainOrderList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrderActionType orderActionTypeList() {
    OrderActionType member = new OrderActionType();
    member.setModelTypeName("order_action_type");
    member.setName("platform");
    member.setMemberName("orderActionTypeList");
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

  public GuideSlide guideSlideList() {
    GuideSlide member = new GuideSlide();
    member.setModelTypeName("guide_slide");
    member.setName("platform");
    member.setMemberName("guideSlideList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CommonEventRecord commonEventRecordList() {
    CommonEventRecord member = new CommonEventRecord();
    member.setModelTypeName("common_event_record");
    member.setName("platform");
    member.setMemberName("commonEventRecordList");
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
