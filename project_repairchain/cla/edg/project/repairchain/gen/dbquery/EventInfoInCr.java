package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventInfoInCr extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventinfoincr.EventInfoInCr";
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

  public ChangeRequestType changeRequestType() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("change_request_type");
    member.setMemberName("changeRequestType");
    member.setReferDirection(true);
    member.setRelationName("changeRequestType");
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

  public StringAttribute status() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("status");
    member.setName("status");
    useMember(member);
    return member;
  }

  public StringAttribute initiatorType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("initiatorType");
    member.setName("initiator_type");
    useMember(member);
    return member;
  }

  public StringAttribute initiatorId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("initiatorId");
    member.setName("initiator_id");
    useMember(member);
    return member;
  }

  public StringAttribute eventsInfo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("eventsInfo");
    member.setName("events_info");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
