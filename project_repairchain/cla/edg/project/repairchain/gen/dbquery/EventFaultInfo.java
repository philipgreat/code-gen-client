package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventFaultInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventfaultinfo.EventFaultInfo";
  }
  // 枚举对象

  // 引用的对象

  public FailureType faultType() {
    FailureType member = new FailureType();
    member.setModelTypeName("failure_type");
    member.setName("fault_type");
    member.setMemberName("faultType");
    member.setReferDirection(true);
    member.setRelationName("faultType");
    append(member);
    return member;
  }

  public MachineStatus machineState() {
    MachineStatus member = new MachineStatus();
    member.setModelTypeName("machine_status");
    member.setName("machine_state");
    member.setMemberName("machineState");
    member.setReferDirection(true);
    member.setRelationName("machineState");
    append(member);
    return member;
  }

  public Employee sendTo() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("send_to");
    member.setMemberName("sendTo");
    member.setReferDirection(true);
    member.setRelationName("sendTo");
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

  public StringAttribute repairNow() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("repairNow");
    member.setName("repair_now");
    useMember(member);
    return member;
  }

  public StringAttribute workJobId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("workJobId");
    member.setName("work_job_id");
    useMember(member);
    return member;
  }

  public StringAttribute machineId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineId");
    member.setName("machine_id");
    useMember(member);
    return member;
  }

  public StringAttribute faultTags() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("faultTags");
    member.setName("fault_tags");
    useMember(member);
    return member;
  }

  public DateTimeAttribute requiredTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("requiredTime");
    member.setName("required_time");
    useMember(member);
    return member;
  }

  public StringAttribute faultDetail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("faultDetail");
    member.setName("fault_detail");
    useMember(member);
    return member;
  }

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("images");
    member.setName("images");
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
