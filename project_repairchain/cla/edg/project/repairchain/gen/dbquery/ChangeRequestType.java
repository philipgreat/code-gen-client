package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequestType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType";
  }
  // 枚举对象
  public static EnumAttribute AUDIT_REPAIR =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "AUDIT_REPAIR")
          .chineseName("更新任务");
  public static EnumAttribute START_PLAN_JOB =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "START_PLAN_JOB")
          .chineseName("执行任务");
  public static EnumAttribute REPAIRING_FEEDBACK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "REPAIRING_FEEDBACK")
          .chineseName("维修反馈");
  public static EnumAttribute UPDATE_PLAN_JOB =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "UPDATE_PLAN_JOB")
          .chineseName("更新任务");
  public static EnumAttribute REPAIRING_REPORT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "REPAIRING_REPORT")
          .chineseName("维修报告");
  public static EnumAttribute REPAIR_APPLICATION =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "REPAIR_APPLICATION")
          .chineseName("报修单");
  public static EnumAttribute UPDATE_FACTORY =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "UPDATE_FACTORY")
          .chineseName("更新工厂信息");
  public static EnumAttribute ADD_PLAN_JOB =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "ADD_PLAN_JOB")
          .chineseName("新建计划任务");
  public static EnumAttribute APPLICATION_AUDIT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "APPLICATION_AUDIT")
          .chineseName("任务审核");
  public static EnumAttribute WORK_RECORD =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "WORK_RECORD")
          .chineseName("更新任务");
  public static EnumAttribute ASSIGN_WORKER =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "ASSIGN_WORKER")
          .chineseName("分派维修工");
  public static EnumAttribute ADD_FACTORY =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "ADD_FACTORY")
          .chineseName("添加工厂");
  public static EnumAttribute UPDATE_REPAIR_APPLICATION =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "UPDATE_REPAIR_APPLICATION")
          .chineseName("完善报修单");
  public static EnumAttribute APPOINTMENT_APPLICATION =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "APPOINTMENT_APPLICATION")
          .chineseName("预约单");
  public static EnumAttribute ADD_MACHINE_BY_AGENT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "ADD_MACHINE_BY_AGENT")
          .chineseName("更新工厂信息");
  public static EnumAttribute QRCODE_BIND_MACHINE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "QRCODE_BIND_MACHINE")
          .chineseName("绑定设备");
  public static EnumAttribute REPORT_DAMAGE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "REPORT_DAMAGE")
          .chineseName("报告损毁");
  public static EnumAttribute MACHINE_BIND_QRCODE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "MACHINE_BIND_QRCODE")
          .chineseName("绑定二维码");
  public static EnumAttribute ADD_EMPLOYEE_BY_AGENT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "ADD_EMPLOYEE_BY_AGENT")
          .chineseName("添加人员");
  public static EnumAttribute DEMO_ALL_FIELD =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "DEMO_ALL_FIELD")
          .chineseName("演示所有的字段类型");
  public static EnumAttribute BIND_WITH_MOBILE =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "BIND_WITH_MOBILE")
          .chineseName("验证手机号");
  public static EnumAttribute CANCEL_PLAN_JOB =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType",
              "CANCEL_PLAN_JOB")
          .chineseName("取消任务");
  public static EnumAttribute CONFIRM_WORK =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "CONFIRM_WORK")
          .chineseName("接单");
  public static EnumAttribute UNBOUND =
      new EnumAttribute(
              "com.doublechaintech.repairchain.changerequesttype.ChangeRequestType", "UNBOUND")
          .chineseName("解绑二维码");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      AUDIT_REPAIR,
      START_PLAN_JOB,
      REPAIRING_FEEDBACK,
      UPDATE_PLAN_JOB,
      REPAIRING_REPORT,
      REPAIR_APPLICATION,
      UPDATE_FACTORY,
      ADD_PLAN_JOB,
      APPLICATION_AUDIT,
      WORK_RECORD,
      ASSIGN_WORKER,
      ADD_FACTORY,
      UPDATE_REPAIR_APPLICATION,
      APPOINTMENT_APPLICATION,
      ADD_MACHINE_BY_AGENT,
      QRCODE_BIND_MACHINE,
      REPORT_DAMAGE,
      MACHINE_BIND_QRCODE,
      ADD_EMPLOYEE_BY_AGENT,
      DEMO_ALL_FIELD,
      BIND_WITH_MOBILE,
      CANCEL_PLAN_JOB,
      CONFIRM_WORK,
      UNBOUND
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

  public ChangeRequest changeRequestList() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("request_type");
    member.setMemberName("changeRequestList");
    member.setRelationName("requestType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventInfoInCr eventInfoInCrList() {
    EventInfoInCr member = new EventInfoInCr();
    member.setModelTypeName("event_info_in_cr");
    member.setName("change_request_type");
    member.setMemberName("eventInfoInCrList");
    member.setRelationName("changeRequestType");
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
    member.setModelTypeName("string");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
    useMember(member);
    return member;
  }

  public StringAttribute bindTypes() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("bindTypes");
    member.setName("bind_types");
    useMember(member);
    return member;
  }

  public StringAttribute stepConfiguration() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("stepConfiguration");
    member.setName("step_configuration");
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
