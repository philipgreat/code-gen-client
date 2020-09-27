package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTaskTreatment extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetasktreatment.MaintenanceTaskTreatment";
  }
  // 枚举对象

  // 引用的对象

  public Employee executor() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("executor");
    member.setMemberName("executor");
    member.setReferDirection(true);
    member.setRelationName("executor");
    append(member);
    return member;
  }

  public MaintenanceTask task() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("task");
    member.setMemberName("task");
    member.setReferDirection(true);
    member.setRelationName("task");
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

  public StringAttribute reason() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("reason");
    member.setName("reason");
    useMember(member);
    return member;
  }

  public StringAttribute treatment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("treatment");
    member.setName("treatment");
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
