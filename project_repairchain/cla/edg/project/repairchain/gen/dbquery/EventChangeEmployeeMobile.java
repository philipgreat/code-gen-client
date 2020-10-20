package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventChangeEmployeeMobile extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventchangeemployeemobile.EventChangeEmployeeMobile";
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

  public StringAttribute employeeId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("employeeId");
    member.setName("employee_id");
    useMember(member);
    return member;
  }

  public StringAttribute oldMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("oldMobile");
    member.setName("old_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute oldVcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("oldVcode");
    member.setName("old_vcode");
    useMember(member);
    return member;
  }

  public StringAttribute newMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("newMobile");
    member.setName("new_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute vcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("vcode");
    member.setName("vcode");
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
