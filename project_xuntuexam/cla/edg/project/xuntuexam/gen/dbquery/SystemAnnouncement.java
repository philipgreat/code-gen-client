package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemAnnouncement extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.systemannouncement.SystemAnnouncement";
  }
  // 枚举对象

  // 引用的对象

  public MobileApp mobileApp() {
    MobileApp member = new MobileApp();
    member.setModelTypeName("mobile_app");
    member.setName("mobile_app");
    member.setMemberName("mobileApp");
    member.setReferDirection(true);
    member.setRelationName("mobileApp");
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

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("content");
    member.setName("content");
    useMember(member);
    return member;
  }

  public StringAttribute linkToUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_url");
    // member.setName("linkToUrl");
    member.setName("link_to_url");
    useMember(member);
    return member;
  }

  public DateTimeAttribute startTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("startTime");
    member.setName("start_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute endTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("endTime");
    member.setName("end_time");
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
