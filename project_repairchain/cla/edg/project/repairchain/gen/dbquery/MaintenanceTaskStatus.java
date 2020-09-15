package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTaskStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus";
  }
  // 枚举对象
  public static EnumAttribute PENDING =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "PENDING")
          .chineseName("待处理");
  public static EnumAttribute PROCESSING =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus",
              "PROCESSING")
          .chineseName("处理中");
  public static EnumAttribute DONE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.maintenancetaskstatus.MaintenanceTaskStatus", "DONE")
          .chineseName("关闭");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PENDING, PROCESSING, DONE};
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
