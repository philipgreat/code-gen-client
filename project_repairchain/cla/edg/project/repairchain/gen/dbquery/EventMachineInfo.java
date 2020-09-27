package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMachineInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventmachineinfo.EventMachineInfo";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute machineName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineName");
    member.setName("machine_name");
    useMember(member);
    return member;
  }

  public StringAttribute machineNumber() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineNumber");
    member.setName("machine_number");
    useMember(member);
    return member;
  }

  public StringAttribute machineModel() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineModel");
    member.setName("machine_model");
    useMember(member);
    return member;
  }

  public StringAttribute machineLocation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineLocation");
    member.setName("machine_location");
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
