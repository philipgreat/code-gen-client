package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AuditResult extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.auditresult.AuditResult";
  }
  // 枚举对象
  public static EnumAttribute PASS =
      new EnumAttribute("com.doublechaintech.repairchain.auditresult.AuditResult", "PASS")
          .chineseName("通过");
  public static EnumAttribute PENDING =
      new EnumAttribute("com.doublechaintech.repairchain.auditresult.AuditResult", "PENDING")
          .chineseName("待完善");
  public static EnumAttribute REJECT =
      new EnumAttribute("com.doublechaintech.repairchain.auditresult.AuditResult", "REJECT")
          .chineseName("不通过");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PASS, PENDING, REJECT};
  }

  // 引用的对象

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

  public RepairApplicationAuditRecord repairApplicationAuditRecordList() {
    RepairApplicationAuditRecord member = new RepairApplicationAuditRecord();
    member.setModelTypeName("repair_application_audit_record");
    member.setName("result");
    member.setMemberName("repairApplicationAuditRecordList");
    member.setRelationName("result");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAuditRecord maintenanceTaskAuditRecordList() {
    MaintenanceTaskAuditRecord member = new MaintenanceTaskAuditRecord();
    member.setModelTypeName("maintenance_task_audit_record");
    member.setName("result");
    member.setMemberName("maintenanceTaskAuditRecordList");
    member.setRelationName("result");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
