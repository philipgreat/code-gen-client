package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Employee extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.employee.Employee";
  }
  // 枚举对象

  // 引用的对象

  public WorkPosition workPosition() {
    WorkPosition member = new WorkPosition();
    member.setModelTypeName("work_position");
    member.setName("work_position");
    member.setMemberName("workPosition");
    member.setReferDirection(true);
    member.setRelationName("workPosition");
    append(member);
    return member;
  }

  public PersonalUser personalUser() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("personal_user");
    member.setMemberName("personalUser");
    member.setReferDirection(true);
    member.setRelationName("personalUser");
    append(member);
    return member;
  }

  public Factory factory() {
    Factory member = new Factory();
    member.setModelTypeName("factory");
    member.setName("factory");
    member.setMemberName("factory");
    member.setReferDirection(true);
    member.setRelationName("factory");
    append(member);
    return member;
  }

  public OnJobStatus status() {
    OnJobStatus member = new OnJobStatus();
    member.setModelTypeName("on_job_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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

  public SubordinateEmployee subordinateEmployeeListAsEmployee() {
    SubordinateEmployee member = new SubordinateEmployee();
    member.setModelTypeName("subordinate_employee");
    member.setName("employee");
    member.setMemberName("subordinateEmployeeListAsEmployee");
    member.setRelationName("employee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SubordinateEmployee subordinateEmployeeListAsSubordinateStuff() {
    SubordinateEmployee member = new SubordinateEmployee();
    member.setModelTypeName("subordinate_employee");
    member.setName("subordinate_stuff");
    member.setMemberName("subordinateEmployeeListAsSubordinateStuff");
    member.setRelationName("employee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public TodoTask todoTaskList() {
    TodoTask member = new TodoTask();
    member.setModelTypeName("todo_task");
    member.setName("responsible_employee");
    member.setMemberName("todoTaskList");
    member.setRelationName("responsibleEmployee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineRunningRecord machineRunningRecordList() {
    MachineRunningRecord member = new MachineRunningRecord();
    member.setModelTypeName("machine_running_record");
    member.setName("submitter");
    member.setMemberName("machineRunningRecordList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RegularMaintainPlan regularMaintainPlanList() {
    RegularMaintainPlan member = new RegularMaintainPlan();
    member.setModelTypeName("regular_maintain_plan");
    member.setName("creator");
    member.setMemberName("regularMaintainPlanList");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskReview maintenanceTaskReviewList() {
    MaintenanceTaskReview member = new MaintenanceTaskReview();
    member.setModelTypeName("maintenance_task_review");
    member.setName("reviewer");
    member.setMemberName("maintenanceTaskReviewList");
    member.setRelationName("reviewer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceRecord maintenanceRecordList() {
    MaintenanceRecord member = new MaintenanceRecord();
    member.setModelTypeName("maintenance_record");
    member.setName("employee");
    member.setMemberName("maintenanceRecordList");
    member.setRelationName("employee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineStartStopRecord machineStartStopRecordList() {
    MachineStartStopRecord member = new MachineStartStopRecord();
    member.setModelTypeName("machine_start_stop_record");
    member.setName("reporter");
    member.setMemberName("machineStartStopRecordList");
    member.setRelationName("reporter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairApplication repairApplicationList() {
    RepairApplication member = new RepairApplication();
    member.setModelTypeName("repair_application");
    member.setName("submitter");
    member.setMemberName("repairApplicationList");
    member.setRelationName("submitter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAssignment maintenanceTaskAssignmentList() {
    MaintenanceTaskAssignment member = new MaintenanceTaskAssignment();
    member.setModelTypeName("maintenance_task_assignment");
    member.setName("employee");
    member.setMemberName("maintenanceTaskAssignmentList");
    member.setRelationName("employee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAuditRecord maintenanceTaskAuditRecordList() {
    MaintenanceTaskAuditRecord member = new MaintenanceTaskAuditRecord();
    member.setModelTypeName("maintenance_task_audit_record");
    member.setName("reviewer");
    member.setMemberName("maintenanceTaskAuditRecordList");
    member.setRelationName("reviewer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskTreatment maintenanceTaskTreatmentList() {
    MaintenanceTaskTreatment member = new MaintenanceTaskTreatment();
    member.setModelTypeName("maintenance_task_treatment");
    member.setName("executor");
    member.setMemberName("maintenanceTaskTreatmentList");
    member.setRelationName("executor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventEmployeeBasicInfo eventEmployeeBasicInfoList() {
    EventEmployeeBasicInfo member = new EventEmployeeBasicInfo();
    member.setModelTypeName("event_employee_basic_info");
    member.setName("leader");
    member.setMemberName("eventEmployeeBasicInfoList");
    member.setRelationName("leader");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventEmployeeTransfer eventEmployeeTransferList() {
    EventEmployeeTransfer member = new EventEmployeeTransfer();
    member.setModelTypeName("event_employee_transfer");
    member.setName("to_employee");
    member.setMemberName("eventEmployeeTransferList");
    member.setRelationName("toEmployee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventFaultInfo eventFaultInfoList() {
    EventFaultInfo member = new EventFaultInfo();
    member.setModelTypeName("event_fault_info");
    member.setName("send_to");
    member.setMemberName("eventFaultInfoList");
    member.setRelationName("sendTo");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventReviewResult eventReviewResultList() {
    EventReviewResult member = new EventReviewResult();
    member.setModelTypeName("event_review_result");
    member.setName("send_to");
    member.setMemberName("eventReviewResultList");
    member.setRelationName("sendTo");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventRepairFeedback eventRepairFeedbackList() {
    EventRepairFeedback member = new EventRepairFeedback();
    member.setModelTypeName("event_repair_feedback");
    member.setName("assign_to");
    member.setMemberName("eventRepairFeedbackList");
    member.setRelationName("assignTo");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
