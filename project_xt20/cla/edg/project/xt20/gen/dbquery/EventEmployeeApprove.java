package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventEmployeeApprove extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventemployeeapprove.EventEmployeeApprove";
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute employeeComment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("employeeComment");
    member.setName("employee_comment");
    useMember(member);
    return member;
  }

  public StringAttribute approveComment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("approveComment");
    member.setName("approve_comment");
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
