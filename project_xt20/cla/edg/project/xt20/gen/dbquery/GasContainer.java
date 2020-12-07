package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasContainer extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gascontainer.GasContainer";
  }
  // 枚举对象

  // 引用的对象

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
    append(member);
    return member;
  }

  // 被引用的对象

  public GasCylinder gasCylinderList() {
    GasCylinder member = new GasCylinder();
    member.setModelTypeName("gas_cylinder");
    member.setName("gas_container");
    member.setMemberName("gasCylinderList");
    member.setRelationName("gasContainer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventContainerInfo eventContainerInfoList() {
    EventContainerInfo member = new EventContainerInfo();
    member.setModelTypeName("event_container_info");
    member.setName("gas_container");
    member.setMemberName("eventContainerInfoList");
    member.setRelationName("gasContainer");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute unit() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unit");
    member.setName("unit");
    useMember(member);
    return member;
  }

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
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
