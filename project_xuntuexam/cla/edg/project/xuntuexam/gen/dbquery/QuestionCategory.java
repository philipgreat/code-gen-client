package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class QuestionCategory extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.questioncategory.QuestionCategory";
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

  public ExamScope examScopeList() {
    ExamScope member = new ExamScope();
    member.setModelTypeName("exam_scope");
    member.setName("question_category");
    member.setMemberName("examScopeList");
    member.setRelationName("questionCategory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventExamScope eventExamScopeList() {
    EventExamScope member = new EventExamScope();
    member.setModelTypeName("event_exam_scope");
    member.setName("scope");
    member.setMemberName("eventExamScopeList");
    member.setRelationName("scope");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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
