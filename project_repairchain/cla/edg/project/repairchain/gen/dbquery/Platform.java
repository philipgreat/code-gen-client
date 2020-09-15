package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.platform.Platform";
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

  public Agent agentList() {
    Agent member = new Agent();
    member.setModelTypeName("agent");
    member.setName("platform");
    member.setMemberName("agentList");
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

  public ActiveStatus activeStatusList() {
    ActiveStatus member = new ActiveStatus();
    member.setModelTypeName("active_status");
    member.setName("platform");
    member.setMemberName("activeStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WorkPosition workPositionList() {
    WorkPosition member = new WorkPosition();
    member.setModelTypeName("work_position");
    member.setName("platform");
    member.setMemberName("workPositionList");
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

  public AuditResult auditResultList() {
    AuditResult member = new AuditResult();
    member.setModelTypeName("audit_result");
    member.setName("platform");
    member.setMemberName("auditResultList");
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

  public QrCodeStatus qrCodeStatusList() {
    QrCodeStatus member = new QrCodeStatus();
    member.setModelTypeName("qr_code_status");
    member.setName("platform");
    member.setMemberName("qrCodeStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public QrCode qrCodeList() {
    QrCode member = new QrCode();
    member.setModelTypeName("qr_code");
    member.setName("platform");
    member.setMemberName("qrCodeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FactoryAgency factoryAgencyList() {
    FactoryAgency member = new FactoryAgency();
    member.setModelTypeName("factory_agency");
    member.setName("platform");
    member.setMemberName("factoryAgencyList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Factory factoryList() {
    Factory member = new Factory();
    member.setModelTypeName("factory");
    member.setName("platform");
    member.setMemberName("factoryList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineModel machineModelList() {
    MachineModel member = new MachineModel();
    member.setModelTypeName("machine_model");
    member.setName("platform");
    member.setMemberName("machineModelList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineStandardDocument machineStandardDocumentList() {
    MachineStandardDocument member = new MachineStandardDocument();
    member.setModelTypeName("machine_standard_document");
    member.setName("platform");
    member.setMemberName("machineStandardDocumentList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairApplication repairApplicationList() {
    RepairApplication member = new RepairApplication();
    member.setModelTypeName("repair_application");
    member.setName("platform");
    member.setMemberName("repairApplicationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairingStatus repairingStatusList() {
    RepairingStatus member = new RepairingStatus();
    member.setModelTypeName("repairing_status");
    member.setName("platform");
    member.setMemberName("repairingStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskType maintenanceTaskTypeList() {
    MaintenanceTaskType member = new MaintenanceTaskType();
    member.setModelTypeName("maintenance_task_type");
    member.setName("platform");
    member.setMemberName("maintenanceTaskTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskStatus maintenanceTaskStatusList() {
    MaintenanceTaskStatus member = new MaintenanceTaskStatus();
    member.setModelTypeName("maintenance_task_status");
    member.setName("platform");
    member.setMemberName("maintenanceTaskStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RegularPeriod regularPeriodList() {
    RegularPeriod member = new RegularPeriod();
    member.setModelTypeName("regular_period");
    member.setName("platform");
    member.setMemberName("regularPeriodList");
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
