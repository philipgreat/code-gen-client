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

  public static Roo roo() {
    Roo rst = new Roo();
    rst.setModelTypeName("roo");
    rst.setBeanPath(new BeanPath().name("roo"));
    return rst;
  }

  public static PersonalUser personalUser() {
    PersonalUser rst = new PersonalUser();
    rst.setModelTypeName("personal_user");
    rst.setBeanPath(new BeanPath().name("personal_user"));
    return rst;
  }

  public static Agent agent() {
    Agent rst = new Agent();
    rst.setModelTypeName("agent");
    rst.setBeanPath(new BeanPath().name("agent"));
    return rst;
  }

  public static Employee employee() {
    Employee rst = new Employee();
    rst.setModelTypeName("employee");
    rst.setBeanPath(new BeanPath().name("employee"));
    return rst;
  }

  public static SubordinateEmployee subordinateEmployee() {
    SubordinateEmployee rst = new SubordinateEmployee();
    rst.setModelTypeName("subordinate_employee");
    rst.setBeanPath(new BeanPath().name("subordinate_employee"));
    return rst;
  }

  public static ActiveStatus activeStatus() {
    ActiveStatus rst = new ActiveStatus();
    rst.setModelTypeName("active_status");
    rst.setBeanPath(new BeanPath().name("active_status"));
    return rst;
  }

  public static WorkPosition workPosition() {
    WorkPosition rst = new WorkPosition();
    rst.setModelTypeName("work_position");
    rst.setBeanPath(new BeanPath().name("work_position"));
    return rst;
  }

  public static OnJobStatus onJobStatus() {
    OnJobStatus rst = new OnJobStatus();
    rst.setModelTypeName("on_job_status");
    rst.setBeanPath(new BeanPath().name("on_job_status"));
    return rst;
  }

  public static Merchant merchant() {
    Merchant rst = new Merchant();
    rst.setModelTypeName("merchant");
    rst.setBeanPath(new BeanPath().name("merchant"));
    return rst;
  }

  public static AuditResult auditResult() {
    AuditResult rst = new AuditResult();
    rst.setModelTypeName("audit_result");
    rst.setBeanPath(new BeanPath().name("audit_result"));
    return rst;
  }

  public static TodoTask todoTask() {
    TodoTask rst = new TodoTask();
    rst.setModelTypeName("todo_task");
    rst.setBeanPath(new BeanPath().name("todo_task"));
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

  public static QrCodeStatus qrCodeStatus() {
    QrCodeStatus rst = new QrCodeStatus();
    rst.setModelTypeName("qr_code_status");
    rst.setBeanPath(new BeanPath().name("qr_code_status"));
    return rst;
  }

  public static QrCode qrCode() {
    QrCode rst = new QrCode();
    rst.setModelTypeName("qr_code");
    rst.setBeanPath(new BeanPath().name("qr_code"));
    return rst;
  }

  public static QrCodeOperationRecord qrCodeOperationRecord() {
    QrCodeOperationRecord rst = new QrCodeOperationRecord();
    rst.setModelTypeName("qr_code_operation_record");
    rst.setBeanPath(new BeanPath().name("qr_code_operation_record"));
    return rst;
  }

  public static FactoryAgency factoryAgency() {
    FactoryAgency rst = new FactoryAgency();
    rst.setModelTypeName("factory_agency");
    rst.setBeanPath(new BeanPath().name("factory_agency"));
    return rst;
  }

  public static RepairingStatus repairingStatus() {
    RepairingStatus rst = new RepairingStatus();
    rst.setModelTypeName("repairing_status");
    rst.setBeanPath(new BeanPath().name("repairing_status"));
    return rst;
  }

  public static MaintenanceTaskType maintenanceTaskType() {
    MaintenanceTaskType rst = new MaintenanceTaskType();
    rst.setModelTypeName("maintenance_task_type");
    rst.setBeanPath(new BeanPath().name("maintenance_task_type"));
    return rst;
  }

  public static MaintenanceTaskStatus maintenanceTaskStatus() {
    MaintenanceTaskStatus rst = new MaintenanceTaskStatus();
    rst.setModelTypeName("maintenance_task_status");
    rst.setBeanPath(new BeanPath().name("maintenance_task_status"));
    return rst;
  }

  public static RegularPeriod regularPeriod() {
    RegularPeriod rst = new RegularPeriod();
    rst.setModelTypeName("regular_period");
    rst.setBeanPath(new BeanPath().name("regular_period"));
    return rst;
  }

  public static MachineStatus machineStatus() {
    MachineStatus rst = new MachineStatus();
    rst.setModelTypeName("machine_status");
    rst.setBeanPath(new BeanPath().name("machine_status"));
    return rst;
  }

  public static Factory factory() {
    Factory rst = new Factory();
    rst.setModelTypeName("factory");
    rst.setBeanPath(new BeanPath().name("factory"));
    return rst;
  }

  public static MachineModel machineModel() {
    MachineModel rst = new MachineModel();
    rst.setModelTypeName("machine_model");
    rst.setBeanPath(new BeanPath().name("machine_model"));
    return rst;
  }

  public static MachineStandardDocument machineStandardDocument() {
    MachineStandardDocument rst = new MachineStandardDocument();
    rst.setModelTypeName("machine_standard_document");
    rst.setBeanPath(new BeanPath().name("machine_standard_document"));
    return rst;
  }

  public static Machine machine() {
    Machine rst = new Machine();
    rst.setModelTypeName("machine");
    rst.setBeanPath(new BeanPath().name("machine"));
    return rst;
  }

  public static MachineRunningRecord machineRunningRecord() {
    MachineRunningRecord rst = new MachineRunningRecord();
    rst.setModelTypeName("machine_running_record");
    rst.setBeanPath(new BeanPath().name("machine_running_record"));
    return rst;
  }

  public static RegularMaintainPlan regularMaintainPlan() {
    RegularMaintainPlan rst = new RegularMaintainPlan();
    rst.setModelTypeName("regular_maintain_plan");
    rst.setBeanPath(new BeanPath().name("regular_maintain_plan"));
    return rst;
  }

  public static MaintenanceTaskReview maintenanceTaskReview() {
    MaintenanceTaskReview rst = new MaintenanceTaskReview();
    rst.setModelTypeName("maintenance_task_review");
    rst.setBeanPath(new BeanPath().name("maintenance_task_review"));
    return rst;
  }

  public static MaintenanceRecord maintenanceRecord() {
    MaintenanceRecord rst = new MaintenanceRecord();
    rst.setModelTypeName("maintenance_record");
    rst.setBeanPath(new BeanPath().name("maintenance_record"));
    return rst;
  }

  public static FailureType failureType() {
    FailureType rst = new FailureType();
    rst.setModelTypeName("failure_type");
    rst.setBeanPath(new BeanPath().name("failure_type"));
    return rst;
  }

  public static FailureBehave failureBehave() {
    FailureBehave rst = new FailureBehave();
    rst.setModelTypeName("failure_behave");
    rst.setBeanPath(new BeanPath().name("failure_behave"));
    return rst;
  }

  public static ClassicFailureBehaveTreatment classicFailureBehaveTreatment() {
    ClassicFailureBehaveTreatment rst = new ClassicFailureBehaveTreatment();
    rst.setModelTypeName("classic_failure_behave_treatment");
    rst.setBeanPath(new BeanPath().name("classic_failure_behave_treatment"));
    return rst;
  }

  public static RepairApplication repairApplication() {
    RepairApplication rst = new RepairApplication();
    rst.setModelTypeName("repair_application");
    rst.setBeanPath(new BeanPath().name("repair_application"));
    return rst;
  }

  public static MaintenanceTask maintenanceTask() {
    MaintenanceTask rst = new MaintenanceTask();
    rst.setModelTypeName("maintenance_task");
    rst.setBeanPath(new BeanPath().name("maintenance_task"));
    return rst;
  }

  public static MaintenanceTaskAssignment maintenanceTaskAssignment() {
    MaintenanceTaskAssignment rst = new MaintenanceTaskAssignment();
    rst.setModelTypeName("maintenance_task_assignment");
    rst.setBeanPath(new BeanPath().name("maintenance_task_assignment"));
    return rst;
  }

  public static MaintenanceTaskAuditRecord maintenanceTaskAuditRecord() {
    MaintenanceTaskAuditRecord rst = new MaintenanceTaskAuditRecord();
    rst.setModelTypeName("maintenance_task_audit_record");
    rst.setBeanPath(new BeanPath().name("maintenance_task_audit_record"));
    return rst;
  }

  public static MaintenanceTaskTreatment maintenanceTaskTreatment() {
    MaintenanceTaskTreatment rst = new MaintenanceTaskTreatment();
    rst.setModelTypeName("maintenance_task_treatment");
    rst.setBeanPath(new BeanPath().name("maintenance_task_treatment"));
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

  public static EventInfoInCr eventInfoInCr() {
    EventInfoInCr rst = new EventInfoInCr();
    rst.setModelTypeName("event_info_in_cr");
    rst.setBeanPath(new BeanPath().name("event_info_in_cr"));
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

  public static EventFactoryBasicInfo eventFactoryBasicInfo() {
    EventFactoryBasicInfo rst = new EventFactoryBasicInfo();
    rst.setModelTypeName("event_factory_basic_info");
    rst.setBeanPath(new BeanPath().name("event_factory_basic_info"));
    return rst;
  }

  public static EventFactoryAdminInfo eventFactoryAdminInfo() {
    EventFactoryAdminInfo rst = new EventFactoryAdminInfo();
    rst.setModelTypeName("event_factory_admin_info");
    rst.setBeanPath(new BeanPath().name("event_factory_admin_info"));
    return rst;
  }

  public static EventMachineBasicInfo eventMachineBasicInfo() {
    EventMachineBasicInfo rst = new EventMachineBasicInfo();
    rst.setModelTypeName("event_machine_basic_info");
    rst.setBeanPath(new BeanPath().name("event_machine_basic_info"));
    return rst;
  }

  public static EventEmployeeBasicInfo eventEmployeeBasicInfo() {
    EventEmployeeBasicInfo rst = new EventEmployeeBasicInfo();
    rst.setModelTypeName("event_employee_basic_info");
    rst.setBeanPath(new BeanPath().name("event_employee_basic_info"));
    return rst;
  }

  public static EventChangeEmployeeMobile eventChangeEmployeeMobile() {
    EventChangeEmployeeMobile rst = new EventChangeEmployeeMobile();
    rst.setModelTypeName("event_change_employee_mobile");
    rst.setBeanPath(new BeanPath().name("event_change_employee_mobile"));
    return rst;
  }

  public static EventEmployeeTransfer eventEmployeeTransfer() {
    EventEmployeeTransfer rst = new EventEmployeeTransfer();
    rst.setModelTypeName("event_employee_transfer");
    rst.setBeanPath(new BeanPath().name("event_employee_transfer"));
    return rst;
  }

  public static EventBindMobile eventBindMobile() {
    EventBindMobile rst = new EventBindMobile();
    rst.setModelTypeName("event_bind_mobile");
    rst.setBeanPath(new BeanPath().name("event_bind_mobile"));
    return rst;
  }

  public static EventBindInfo eventBindInfo() {
    EventBindInfo rst = new EventBindInfo();
    rst.setModelTypeName("event_bind_info");
    rst.setBeanPath(new BeanPath().name("event_bind_info"));
    return rst;
  }

  public static EventMachineInfo eventMachineInfo() {
    EventMachineInfo rst = new EventMachineInfo();
    rst.setModelTypeName("event_machine_info");
    rst.setBeanPath(new BeanPath().name("event_machine_info"));
    return rst;
  }

  public static EventFaultInfo eventFaultInfo() {
    EventFaultInfo rst = new EventFaultInfo();
    rst.setModelTypeName("event_fault_info");
    rst.setBeanPath(new BeanPath().name("event_fault_info"));
    return rst;
  }

  public static EventReviewResult eventReviewResult() {
    EventReviewResult rst = new EventReviewResult();
    rst.setModelTypeName("event_review_result");
    rst.setBeanPath(new BeanPath().name("event_review_result"));
    return rst;
  }

  public static EventAssignWorker eventAssignWorker() {
    EventAssignWorker rst = new EventAssignWorker();
    rst.setModelTypeName("event_assign_worker");
    rst.setBeanPath(new BeanPath().name("event_assign_worker"));
    return rst;
  }

  public static EventWorkJobConfirmation eventWorkJobConfirmation() {
    EventWorkJobConfirmation rst = new EventWorkJobConfirmation();
    rst.setModelTypeName("event_work_job_confirmation");
    rst.setBeanPath(new BeanPath().name("event_work_job_confirmation"));
    return rst;
  }

  public static EventTaskWorkRecord eventTaskWorkRecord() {
    EventTaskWorkRecord rst = new EventTaskWorkRecord();
    rst.setModelTypeName("event_task_work_record");
    rst.setBeanPath(new BeanPath().name("event_task_work_record"));
    return rst;
  }

  public static EventRepairFeedback eventRepairFeedback() {
    EventRepairFeedback rst = new EventRepairFeedback();
    rst.setModelTypeName("event_repair_feedback");
    rst.setBeanPath(new BeanPath().name("event_repair_feedback"));
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

  public static KeyPairIdentity keyPairIdentity() {
    KeyPairIdentity rst = new KeyPairIdentity();
    rst.setModelTypeName("key_pair_identity");
    rst.setBeanPath(new BeanPath().name("key_pair_identity"));
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
