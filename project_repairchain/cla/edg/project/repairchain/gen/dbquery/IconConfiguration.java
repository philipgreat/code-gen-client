package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IconConfiguration extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration";
  }
  // 枚举对象
  public static EnumAttribute HISTORY_TASK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "HISTORY_TASK")
          .chineseName("历史记录");
  public static EnumAttribute PLANNED_TASK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "PLANNED_TASK")
          .chineseName("计划任务");
  public static EnumAttribute RUNNING_TASK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "RUNNING_TASK")
          .chineseName("当前任务");
  public static EnumAttribute BIND_QRCODE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "BIND_QRCODE")
          .chineseName("绑定二维码");
  public static EnumAttribute UNBIND_QRCODE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration",
              "UNBIND_QRCODE")
          .chineseName("解绑二维码");
  public static EnumAttribute REPORT_RUN =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "REPORT_RUN")
          .chineseName("设备开机");
  public static EnumAttribute REPORT_STOP =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "REPORT_STOP")
          .chineseName("设备关机");
  public static EnumAttribute REPAIR_NOW =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "REPAIR_NOW")
          .chineseName("立即维修");
  public static EnumAttribute REPAIR_APPOINTMENT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration",
              "REPAIR_APPOINTMENT")
          .chineseName("预约维修");
  public static EnumAttribute EMPLOYEE_ADM =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "EMPLOYEE_ADM")
          .chineseName("人员管理");
  public static EnumAttribute MACHINE_ADM =
      new EnumAttribute(
              "com.doublechaintech.repairchain.iconconfiguration.IconConfiguration", "MACHINE_ADM")
          .chineseName("设备管理");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      HISTORY_TASK,
      PLANNED_TASK,
      RUNNING_TASK,
      BIND_QRCODE,
      UNBIND_QRCODE,
      REPORT_RUN,
      REPORT_STOP,
      REPAIR_NOW,
      REPAIR_APPOINTMENT,
      EMPLOYEE_ADM,
      MACHINE_ADM
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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
