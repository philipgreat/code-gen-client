package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventFactoryBasicInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventfactorybasicinfo.EventFactoryBasicInfo";
  }
  // 枚举对象

  // 引用的对象

  public District district() {
    District member = new District();
    member.setModelTypeName("district");
    member.setName("district");
    member.setMemberName("district");
    member.setReferDirection(true);
    member.setRelationName("district");
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

  public StringAttribute agent() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("agent");
    member.setName("agent");
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

  public StringAttribute logo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("logo");
    member.setName("logo");
    useMember(member);
    return member;
  }

  public StringAttribute address() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("address");
    member.setName("address");
    useMember(member);
    return member;
  }

  public DateTimeAttribute expireDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("expireDate");
    member.setName("expire_date");
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
