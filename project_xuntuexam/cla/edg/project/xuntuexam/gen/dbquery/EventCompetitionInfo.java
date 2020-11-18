package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventCompetitionInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.eventcompetitioninfo.EventCompetitionInfo";
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public NumberAttribute code() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("code");
    member.setName("code");
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
