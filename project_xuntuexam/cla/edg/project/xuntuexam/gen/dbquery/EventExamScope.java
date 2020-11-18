package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventExamScope extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.eventexamscope.EventExamScope";
  }
  // 枚举对象

  // 引用的对象

  public QuestionCategory scope() {
    QuestionCategory member = new QuestionCategory();
    member.setModelTypeName("question_category");
    member.setName("scope");
    member.setMemberName("scope");
    member.setReferDirection(true);
    member.setRelationName("scope");
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

  public NumberAttribute number() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("number");
    member.setName("number");
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
