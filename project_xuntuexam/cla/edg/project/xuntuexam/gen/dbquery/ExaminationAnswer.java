package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExaminationAnswer extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.examinationanswer.ExaminationAnswer";
  }
  // 枚举对象

  // 引用的对象

  public ExaminationPaper examinationPaper() {
    ExaminationPaper member = new ExaminationPaper();
    member.setModelTypeName("examination_paper");
    member.setName("examination_paper");
    member.setMemberName("examinationPaper");
    member.setReferDirection(true);
    member.setRelationName("examinationPaper");
    append(member);
    return member;
  }

  public ExaminationQuestion question() {
    ExaminationQuestion member = new ExaminationQuestion();
    member.setModelTypeName("examination_question");
    member.setName("question");
    member.setMemberName("question");
    member.setReferDirection(true);
    member.setRelationName("question");
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

  public StringAttribute answerResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("answerResult");
    member.setName("answer_result");
    useMember(member);
    return member;
  }

  public StringAttribute rightResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("rightResult");
    member.setName("right_result");
    useMember(member);
    return member;
  }

  public StringAttribute shuffleResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("shuffleResult");
    member.setName("shuffle_result");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
