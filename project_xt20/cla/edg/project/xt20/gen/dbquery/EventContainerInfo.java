package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventContainerInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventcontainerinfo.EventContainerInfo";
  }
  // 枚举对象

  // 引用的对象

  public FillMedium fillMedium() {
    FillMedium member = new FillMedium();
    member.setModelTypeName("fill_medium");
    member.setName("fill_medium");
    member.setMemberName("fillMedium");
    member.setReferDirection(true);
    member.setRelationName("fillMedium");
    append(member);
    return member;
  }

  public GasContainer gasContainer() {
    GasContainer member = new GasContainer();
    member.setModelTypeName("gas_container");
    member.setName("gas_container");
    member.setMemberName("gasContainer");
    member.setReferDirection(true);
    member.setRelationName("gasContainer");
    append(member);
    return member;
  }

  public FillVolume fillVolume() {
    FillVolume member = new FillVolume();
    member.setModelTypeName("fill_volume");
    member.setName("fill_volume");
    member.setMemberName("fillVolume");
    member.setReferDirection(true);
    member.setRelationName("fillVolume");
    append(member);
    return member;
  }

  public BottleType bottleType() {
    BottleType member = new BottleType();
    member.setModelTypeName("bottle_type");
    member.setName("bottle_type");
    member.setMemberName("bottleType");
    member.setReferDirection(true);
    member.setRelationName("bottleType");
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

  public NumberAttribute nominalVolume() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("nominalVolume");
    member.setName("nominal_volume");
    useMember(member);
    return member;
  }

  public NumberAttribute nominalPressure() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("nominalPressure");
    member.setName("nominal_pressure");
    useMember(member);
    return member;
  }

  public StringAttribute additionalInfo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("additionalInfo");
    member.setName("additional_info");
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
