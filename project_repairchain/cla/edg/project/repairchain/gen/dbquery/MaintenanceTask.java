package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTask extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetask.MaintenanceTask";
  }
  // 枚举对象

  // 引用的对象

  public MaintenanceTaskType type() {
    MaintenanceTaskType member = new MaintenanceTaskType();
    member.setModelTypeName("maintenance_task_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public MaintenanceTaskStatus status() {
    MaintenanceTaskStatus member = new MaintenanceTaskStatus();
    member.setModelTypeName("maintenance_task_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public RepairApplication repairApplication() {
    RepairApplication member = new RepairApplication();
    member.setModelTypeName("repair_application");
    member.setName("repair_application");
    member.setMemberName("repairApplication");
    member.setReferDirection(true);
    member.setRelationName("repairApplication");
    append(member);
    return member;
  }

  public RegularMaintainPlan regularMaintainPlan() {
    RegularMaintainPlan member = new RegularMaintainPlan();
    member.setModelTypeName("regular_maintain_plan");
    member.setName("regular_maintain_plan");
    member.setMemberName("regularMaintainPlan");
    member.setReferDirection(true);
    member.setRelationName("regularMaintainPlan");
    append(member);
    return member;
  }

  public Machine machine() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("machine");
    member.setMemberName("machine");
    member.setReferDirection(true);
    member.setRelationName("machine");
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

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
    append(member);
    return member;
  }

  // 被引用的对象

  public MaintenanceTaskReview maintenanceTaskReviewList() {
    MaintenanceTaskReview member = new MaintenanceTaskReview();
    member.setModelTypeName("maintenance_task_review");
    member.setName("task");
    member.setMemberName("maintenanceTaskReviewList");
    member.setRelationName("task");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceRecord maintenanceRecordList() {
    MaintenanceRecord member = new MaintenanceRecord();
    member.setModelTypeName("maintenance_record");
    member.setName("maintenance_task");
    member.setMemberName("maintenanceRecordList");
    member.setRelationName("maintenanceTask");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAssignment maintenanceTaskAssignmentList() {
    MaintenanceTaskAssignment member = new MaintenanceTaskAssignment();
    member.setModelTypeName("maintenance_task_assignment");
    member.setName("maintenance_task");
    member.setMemberName("maintenanceTaskAssignmentList");
    member.setRelationName("maintenanceTask");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAuditRecord maintenanceTaskAuditRecordList() {
    MaintenanceTaskAuditRecord member = new MaintenanceTaskAuditRecord();
    member.setModelTypeName("maintenance_task_audit_record");
    member.setName("maintenance_task");
    member.setMemberName("maintenanceTaskAuditRecordList");
    member.setRelationName("maintenanceTask");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskTreatment maintenanceTaskTreatmentList() {
    MaintenanceTaskTreatment member = new MaintenanceTaskTreatment();
    member.setModelTypeName("maintenance_task_treatment");
    member.setName("task");
    member.setMemberName("maintenanceTaskTreatmentList");
    member.setRelationName("task");
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