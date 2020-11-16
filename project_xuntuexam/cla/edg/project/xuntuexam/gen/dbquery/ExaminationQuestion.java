package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExaminationQuestion extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.examinationquestion.ExaminationQuestion";
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

  public ExaminationAnswer examinationAnswerList() {
    ExaminationAnswer member = new ExaminationAnswer();
    member.setModelTypeName("examination_answer");
    member.setName("question");
    member.setMemberName("examinationAnswerList");
    member.setRelationName("question");
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

  public StringAttribute topic() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("topic");
    member.setName("topic");
    useMember(member);
    return member;
  }

  public StringAttribute level() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("level");
    member.setName("level");
    useMember(member);
    return member;
  }

  public StringAttribute optionA() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("optionA");
    member.setName("option_a");
    useMember(member);
    return member;
  }

  public StringAttribute optionB() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("optionB");
    member.setName("option_b");
    useMember(member);
    return member;
  }

  public StringAttribute optionC() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("optionC");
    member.setName("option_c");
    useMember(member);
    return member;
  }

  public StringAttribute optionD() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("optionD");
    member.setName("option_d");
    useMember(member);
    return member;
  }

  public StringAttribute optionE() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("optionE");
    member.setName("option_e");
    useMember(member);
    return member;
  }

  public StringAttribute rightAnswer() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("rightAnswer");
    member.setName("right_answer");
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
