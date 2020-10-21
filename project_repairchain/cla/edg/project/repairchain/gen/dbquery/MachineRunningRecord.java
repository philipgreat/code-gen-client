package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MachineRunningRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.machinerunningrecord.MachineRunningRecord";
  }
  // 枚举对象

  // 引用的对象

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

  public MachineStatus machineStatus() {
    MachineStatus member = new MachineStatus();
    member.setModelTypeName("machine_status");
    member.setName("machine_status");
    member.setMemberName("machineStatus");
    member.setReferDirection(true);
    member.setRelationName("machineStatus");
    append(member);
    return member;
  }

  public Employee submitter() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
    append(member);
    return member;
  }

  public MachineStatus lastReportStatus() {
    MachineStatus member = new MachineStatus();
    member.setModelTypeName("machine_status");
    member.setName("last_report_status");
    member.setMemberName("lastReportStatus");
    member.setReferDirection(true);
    member.setRelationName("lastReportStatus");
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

  public DateTimeAttribute lastReportTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lastReportTime");
    member.setName("last_report_time");
    useMember(member);
    return member;
  }

  public StringAttribute lastReportId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("lastReportId");
    member.setName("last_report_id");
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
