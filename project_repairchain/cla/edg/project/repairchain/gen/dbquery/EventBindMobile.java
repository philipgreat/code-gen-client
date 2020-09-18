package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventBindMobile extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventbindmobile.EventBindMobile";
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

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("mobile");
    member.setName("mobile");
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
