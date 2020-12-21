package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommonEventRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.commoneventrecord.CommonEventRecord";
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute eventCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("eventCode");
    member.setName("event_code");
    useMember(member);
    return member;
  }

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute user() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("user");
    member.setName("user");
    useMember(member);
    return member;
  }

  public StringAttribute key1() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("key1");
    member.setName("key1");
    useMember(member);
    return member;
  }

  public StringAttribute key2() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("key2");
    member.setName("key2");
    useMember(member);
    return member;
  }

  public StringAttribute key3() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("key3");
    member.setName("key3");
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

  public StringAttribute details() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("details");
    member.setName("details");
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
