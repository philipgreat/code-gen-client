package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventPostDemand extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.eventpostdemand.EventPostDemand";
  }
  // 枚举对象

  // 引用的对象

  public DemandType type() {
    DemandType member = new DemandType();
    member.setModelTypeName("demand_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public UnitType unitType() {
    UnitType member = new UnitType();
    member.setModelTypeName("unit_type");
    member.setName("unit_type");
    member.setMemberName("unitType");
    member.setReferDirection(true);
    member.setRelationName("unitType");
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

  public StringAttribute unitName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unitName");
    member.setName("unit_name");
    useMember(member);
    return member;
  }

  public StringAttribute researchGroup() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("researchGroup");
    member.setName("research_group");
    useMember(member);
    return member;
  }

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute contactMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("contactMobile");
    member.setName("contact_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("content");
    member.setName("content");
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
