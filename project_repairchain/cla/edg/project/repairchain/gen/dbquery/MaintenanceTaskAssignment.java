package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceTaskAssignment extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancetaskassignment.MaintenanceTaskAssignment";
  }
  // 枚举对象

  // 引用的对象

  public MaintenanceTaskStatus createOnStatus() {
    MaintenanceTaskStatus member = new MaintenanceTaskStatus();
    member.setModelTypeName("maintenance_task_status");
    member.setName("create_on_status");
    member.setMemberName("createOnStatus");
    member.setReferDirection(true);
    member.setRelationName("createOnStatus");
    append(member);
    return member;
  }

  public MaintenanceTask maintenanceTask() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("maintenance_task");
    member.setMemberName("maintenanceTask");
    member.setReferDirection(true);
    member.setRelationName("maintenanceTask");
    append(member);
    return member;
  }

  public Employee employee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("employee");
    member.setMemberName("employee");
    member.setReferDirection(true);
    member.setRelationName("employee");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public BooleanAttribute finished() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("finished");
    member.setName("finished");
    useMember(member);
    return member;
  }

  public BooleanAttribute valid() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("valid");
    member.setName("valid");
    useMember(member);
    return member;
  }

  public StringAttribute displayStatus() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("displayStatus");
    member.setName("display_status");
    useMember(member);
    return member;
  }

  public StringAttribute resultDetail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("resultDetail");
    member.setName("result_detail");
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

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
