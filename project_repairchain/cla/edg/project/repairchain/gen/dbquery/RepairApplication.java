package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RepairApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.repairapplication.RepairApplication";
  }
  // 枚举对象

  // 引用的对象

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

  public Employee submitter() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
    append(member);
    return member;
  }

  public Employee responsibleEmployee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("responsible_employee");
    member.setMemberName("responsibleEmployee");
    member.setReferDirection(true);
    member.setRelationName("responsibleEmployee");
    append(member);
    return member;
  }

  public RepairingStatus status() {
    RepairingStatus member = new RepairingStatus();
    member.setModelTypeName("repairing_status");
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

  public RepairApplicationRecord repairApplicationRecordList() {
    RepairApplicationRecord member = new RepairApplicationRecord();
    member.setModelTypeName("repair_application_record");
    member.setName("repair_application");
    member.setMemberName("repairApplicationRecordList");
    member.setRelationName("repairApplication");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairApplicationAuditRecord repairApplicationAuditRecordList() {
    RepairApplicationAuditRecord member = new RepairApplicationAuditRecord();
    member.setModelTypeName("repair_application_audit_record");
    member.setName("repair_application");
    member.setMemberName("repairApplicationAuditRecordList");
    member.setRelationName("repairApplication");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTask maintenanceTaskList() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("repair_application");
    member.setMemberName("maintenanceTaskList");
    member.setRelationName("repairApplication");
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

  public StringAttribute detailText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("detailText");
    member.setName("detail_text");
    useMember(member);
    return member;
  }

  public StringAttribute detailImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("detailImage");
    member.setName("detail_image");
    useMember(member);
    return member;
  }

  public StringAttribute detailVideo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("detailVideo");
    member.setName("detail_video");
    useMember(member);
    return member;
  }

  public StringAttribute attachment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("attachment");
    member.setName("attachment");
    useMember(member);
    return member;
  }

  public DateTimeAttribute appointment() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("appointment");
    member.setName("appointment");
    useMember(member);
    return member;
  }

  public DateTimeAttribute timeoutTtr() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("timeoutTtr");
    member.setName("timeout_ttr");
    useMember(member);
    return member;
  }

  public DateTimeAttribute timeoutTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("timeoutTime");
    member.setName("timeout_time");
    useMember(member);
    return member;
  }

  public NumberAttribute escalationLevel() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("escalationLevel");
    member.setName("escalation_level");
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
