package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTaskReview extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetaskreview.MaintenanceTaskReview";
  }
  // 枚举对象

  // 引用的对象

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

  public Employee reviewer() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("reviewer");
    member.setMemberName("reviewer");
    member.setReferDirection(true);
    member.setRelationName("reviewer");
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

  public NumberAttribute rate() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("rate");
    member.setName("rate");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
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
