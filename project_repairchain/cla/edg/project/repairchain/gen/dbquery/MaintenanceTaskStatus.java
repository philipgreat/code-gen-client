package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTaskStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus";
  }
  // 枚举对象
  public static EnumAttribute CREATED =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "CREATED")
          .chineseName("已提交");
  public static EnumAttribute MORE_DETAIL =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "MORE_DETAIL")
          .chineseName("待完善");
  public static EnumAttribute SUBMITTED =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "SUBMITTED")
          .chineseName("已报修");
  public static EnumAttribute ASSIGNED =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "ASSIGNED")
          .chineseName("已派单");
  public static EnumAttribute PROCESSING =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "PROCESSING")
          .chineseName("维修中");
  public static EnumAttribute NEED_REVIEW =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "NEED_REVIEW")
          .chineseName("待核验");
  public static EnumAttribute NEED_VERIFY =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "NEED_VERIFY")
          .chineseName("待确认");
  public static EnumAttribute FINISHED_AS_REPAIRED =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "FINISHED_AS_REPAIRED")
          .chineseName("已修复");
  public static EnumAttribute FINISHED_AS_DAMAGED =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "FINISHED_AS_DAMAGED")
          .chineseName("不可修复");
  public static EnumAttribute PROCESS_MANUALLY =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "PROCESS_MANUALLY")
          .chineseName("急需干预");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      CREATED,
      MORE_DETAIL,
      SUBMITTED,
      ASSIGNED,
      PROCESSING,
      NEED_REVIEW,
      NEED_VERIFY,
      FINISHED_AS_REPAIRED,
      FINISHED_AS_DAMAGED,
      PROCESS_MANUALLY
    };
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

  public MaintenanceTask maintenanceTaskList() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("status");
    member.setMemberName("maintenanceTaskList");
    member.setRelationName("status");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTaskAssignment maintenanceTaskAssignmentList() {
    MaintenanceTaskAssignment member = new MaintenanceTaskAssignment();
    member.setModelTypeName("maintenance_task_assignment");
    member.setName("create_on_status");
    member.setMemberName("maintenanceTaskAssignmentList");
    member.setRelationName("createOnStatus");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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
