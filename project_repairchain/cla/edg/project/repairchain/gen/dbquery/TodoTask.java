package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TodoTask extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.todotask.TodoTask";
  }
  // 枚举对象

  // 引用的对象

  public Employee responsibleEmployee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("responsible_employee");
    member.setMemberName("responsibleEmployee");
    member.setReferDirection(true);
    member.setRelationName("responsibleEmployee");
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

  public StringAttribute relativeUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("relativeUrl");
    member.setName("relative_url");
    useMember(member);
    return member;
  }

  public StringAttribute taskObjectType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("taskObjectType");
    member.setName("task_object_type");
    useMember(member);
    return member;
  }

  public StringAttribute taskObjectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("taskObjectId");
    member.setName("task_object_id");
    useMember(member);
    return member;
  }

  public StringAttribute taskActionCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("taskActionCode");
    member.setName("task_action_code");
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
