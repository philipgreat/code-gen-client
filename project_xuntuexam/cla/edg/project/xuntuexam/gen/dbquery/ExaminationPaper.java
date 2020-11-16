package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExaminationPaper extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.examinationpaper.ExaminationPaper";
  }
  // 枚举对象

  // 引用的对象

  public Merchant examinee() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("examinee");
    member.setMemberName("examinee");
    member.setReferDirection(true);
    member.setRelationName("examinee");
    append(member);
    return member;
  }

  public ExamPaperStatus examPaperStatus() {
    ExamPaperStatus member = new ExamPaperStatus();
    member.setModelTypeName("exam_paper_status");
    member.setName("exam_paper_status");
    member.setMemberName("examPaperStatus");
    member.setReferDirection(true);
    member.setRelationName("examPaperStatus");
    append(member);
    return member;
  }

  public Competition competition() {
    Competition member = new Competition();
    member.setModelTypeName("competition");
    member.setName("competition");
    member.setMemberName("competition");
    member.setReferDirection(true);
    member.setRelationName("competition");
    append(member);
    return member;
  }

  // 被引用的对象

  public ExaminationAnswer examinationAnswerList() {
    ExaminationAnswer member = new ExaminationAnswer();
    member.setModelTypeName("examination_answer");
    member.setName("examination_paper");
    member.setMemberName("examinationAnswerList");
    member.setRelationName("examinationPaper");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ValidExamRecord validExamRecordList() {
    ValidExamRecord member = new ValidExamRecord();
    member.setModelTypeName("valid_exam_record");
    member.setName("examination_paper");
    member.setMemberName("validExamRecordList");
    member.setRelationName("examinationPaper");
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

  public NumberAttribute score() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("score");
    member.setName("score");
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
