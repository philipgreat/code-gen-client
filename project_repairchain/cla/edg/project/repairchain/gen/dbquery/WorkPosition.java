package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WorkPosition extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.workposition.WorkPosition";
  }
  // 枚举对象
  public static EnumAttribute ADMIN =
      new EnumAttribute("com.doublechaintech.repairchain.workposition.WorkPosition", "ADMIN")
          .chineseName("管理员");
  public static EnumAttribute OPERATION_MANAGER =
      new EnumAttribute(
              "com.doublechaintech.repairchain.workposition.WorkPosition", "OPERATION_MANAGER")
          .chineseName("生产主管");
  public static EnumAttribute MAINTENANCE_MANAGER =
      new EnumAttribute(
              "com.doublechaintech.repairchain.workposition.WorkPosition", "MAINTENANCE_MANAGER")
          .chineseName("维修主管");
  public static EnumAttribute MAINTENANCE_WORKER =
      new EnumAttribute(
              "com.doublechaintech.repairchain.workposition.WorkPosition", "MAINTENANCE_WORKER")
          .chineseName("维修工");
  public static EnumAttribute OPERATION_WORKER =
      new EnumAttribute(
              "com.doublechaintech.repairchain.workposition.WorkPosition", "OPERATION_WORKER")
          .chineseName("操作工");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      ADMIN, OPERATION_MANAGER, MAINTENANCE_MANAGER, MAINTENANCE_WORKER, OPERATION_WORKER
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

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("work_position");
    member.setMemberName("employeeList");
    member.setRelationName("workPosition");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventEmployeeBasicInfo eventEmployeeBasicInfoList() {
    EventEmployeeBasicInfo member = new EventEmployeeBasicInfo();
    member.setModelTypeName("event_employee_basic_info");
    member.setName("work_position");
    member.setMemberName("eventEmployeeBasicInfoList");
    member.setRelationName("workPosition");
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
