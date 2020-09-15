package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class RegularMaintainPlan extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.regularmaintainplan.RegularMaintainPlan";
  }
  // 枚举对象

  // 引用的对象

  public RegularPeriod regularPeriod() {
    RegularPeriod member = new RegularPeriod();
    member.setModelTypeName("regular_period");
    member.setName("regular_period");
    member.setMemberName("regularPeriod");
    member.setReferDirection(true);
    member.setRelationName("regularPeriod");
    append(member);
    return member;
  }

  public Machine machine() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("machine");
    member.setMemberName("machine");
    member.setReferDirection(true);
    member.setRelationName("machine");
    append(member);
    return member;
  }

  public ActiveStatus activeStatus() {
    ActiveStatus member = new ActiveStatus();
    member.setModelTypeName("active_status");
    member.setName("active_status");
    member.setMemberName("activeStatus");
    member.setReferDirection(true);
    member.setRelationName("activeStatus");
    append(member);
    return member;
  }

  public Employee creator() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("creator");
    member.setMemberName("creator");
    member.setReferDirection(true);
    member.setRelationName("creator");
    append(member);
    return member;
  }

  // 被引用的对象

  public MaintenanceTask maintenanceTaskList() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("regular_maintain_plan");
    member.setMemberName("maintenanceTaskList");
    member.setRelationName("regularMaintainPlan");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public DateTimeAttribute startDay() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("startDay");
    member.setName("start_day");
    useMember(member);
    return member;
  }

  public NumberAttribute daysToRemind() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("daysToRemind");
    member.setName("days_to_remind");
    useMember(member);
    return member;
  }

  public StringAttribute detailText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("detailText");
    member.setName("detail_text");
    useMember(member);
    return member;
  }

  public StringAttribute detailImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("detailImage");
    member.setName("detail_image");
    useMember(member);
    return member;
  }

  public StringAttribute detailVideo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("detailVideo");
    member.setName("detail_video");
    useMember(member);
    return member;
  }

  public StringAttribute attachment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("attachment");
    member.setName("attachment");
    useMember(member);
    return member;
  }

  public DateTimeAttribute nextExecution() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("nextExecution");
    member.setName("next_execution");
    useMember(member);
    return member;
  }

  public DateTimeAttribute nextRemind() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("nextRemind");
    member.setName("next_remind");
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
