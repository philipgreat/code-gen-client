package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TaskAssignmentType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType";
  }
  // 枚举对象
  public static EnumAttribute NEED_REVIEW =
      new EnumAttribute(
              "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType",
              "NEED_REVIEW")
          .chineseName("待审核");
  public static EnumAttribute NEED_ACCEPT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType",
              "NEED_ACCEPT")
          .chineseName("待接单");
  public static EnumAttribute NEED_PROCESS =
      new EnumAttribute(
              "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType",
              "NEED_PROCESS")
          .chineseName("待维修");
  public static EnumAttribute NEED_CONFIRM =
      new EnumAttribute(
              "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType",
              "NEED_CONFIRM")
          .chineseName("待确认");
  public static EnumAttribute NEED_UPDATE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.taskassignmenttype.TaskAssignmentType",
              "NEED_UPDATE")
          .chineseName("待修改");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {NEED_REVIEW, NEED_ACCEPT, NEED_PROCESS, NEED_CONFIRM, NEED_UPDATE};
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

  public MaintenanceTaskAssignment maintenanceTaskAssignmentList() {
    MaintenanceTaskAssignment member = new MaintenanceTaskAssignment();
    member.setModelTypeName("maintenance_task_assignment");
    member.setName("task_assignment_type");
    member.setMemberName("maintenanceTaskAssignmentList");
    member.setRelationName("taskAssignmentType");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
