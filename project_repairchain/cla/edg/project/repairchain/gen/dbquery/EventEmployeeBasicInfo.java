package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventEmployeeBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventemployeebasicinfo.EventEmployeeBasicInfo";
  }
  // 枚举对象

  // 引用的对象

  public WorkPosition workPosition() {
    WorkPosition member = new WorkPosition();
    member.setModelTypeName("work_position");
    member.setName("work_position");
    member.setMemberName("workPosition");
    member.setReferDirection(true);
    member.setRelationName("workPosition");
    append(member);
    return member;
  }

  public Employee leader() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("leader");
    member.setMemberName("leader");
    member.setReferDirection(true);
    member.setRelationName("leader");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute factoryId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("factoryId");
    member.setName("factory_id");
    useMember(member);
    return member;
  }

  public StringAttribute agentId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("agentId");
    member.setName("agent_id");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
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
