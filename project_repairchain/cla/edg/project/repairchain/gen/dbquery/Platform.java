package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.platform.Platform";
  }
  // 枚举对象

  // 引用的对象

  // 被引用的对象

  public ChangeRequestType changeRequestTypeList() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("platform");
    member.setMemberName("changeRequestTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ChangeRequest changeRequestList() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("platform");
    member.setMemberName("changeRequestList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemProcessingInstance systemProcessingInstanceList() {
    SystemProcessingInstance member = new SystemProcessingInstance();
    member.setModelTypeName("system_processing_instance");
    member.setName("platform");
    member.setMemberName("systemProcessingInstanceList");
    member.setRelationName("platform");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
