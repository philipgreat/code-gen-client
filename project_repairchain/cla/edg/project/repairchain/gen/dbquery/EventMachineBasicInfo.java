package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventMachineBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventmachinebasicinfo.EventMachineBasicInfo";
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

  public StringAttribute agentId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("agentId");
    member.setName("agent_id");
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

  public StringAttribute machineName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineName");
    member.setName("machine_name");
    useMember(member);
    return member;
  }

  public StringAttribute modelName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("modelName");
    member.setName("model_name");
    useMember(member);
    return member;
  }

  public StringAttribute osName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("osName");
    member.setName("os_name");
    useMember(member);
    return member;
  }

  public StringAttribute machineIdentity() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineIdentity");
    member.setName("machine_identity");
    useMember(member);
    return member;
  }

  public StringAttribute location() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("location");
    member.setName("location");
    useMember(member);
    return member;
  }

  public StringAttribute image() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image");
    member.setName("image");
    useMember(member);
    return member;
  }

  public StringAttribute qrCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("qrCode");
    member.setName("qr_code");
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
