package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MachineStartStopRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.machinestartstoprecord.MachineStartStopRecord";
  }
  // 枚举对象

  // 引用的对象

  public Employee reporter() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("reporter");
    member.setMemberName("reporter");
    member.setReferDirection(true);
    member.setRelationName("reporter");
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

  public BooleanAttribute running() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("running");
    member.setName("running");
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
