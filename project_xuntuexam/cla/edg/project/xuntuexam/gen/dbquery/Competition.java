package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Competition extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.competition.Competition";
  }
  // 枚举对象

  // 引用的对象

  public Merchant creator() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("creator");
    member.setMemberName("creator");
    member.setReferDirection(true);
    member.setRelationName("creator");
    append(member);
    return member;
  }

  public CompetitionStatus competitionStatus() {
    CompetitionStatus member = new CompetitionStatus();
    member.setModelTypeName("competition_status");
    member.setName("competition_status");
    member.setMemberName("competitionStatus");
    member.setReferDirection(true);
    member.setRelationName("competitionStatus");
    append(member);
    return member;
  }

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

  public ExaminationPaper examinationPaperList() {
    ExaminationPaper member = new ExaminationPaper();
    member.setModelTypeName("examination_paper");
    member.setName("competition");
    member.setMemberName("examinationPaperList");
    member.setRelationName("competition");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ValidExamRecord validExamRecordList() {
    ValidExamRecord member = new ValidExamRecord();
    member.setModelTypeName("valid_exam_record");
    member.setName("competition");
    member.setMemberName("validExamRecordList");
    member.setRelationName("competition");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ExamScope examScopeList() {
    ExamScope member = new ExamScope();
    member.setModelTypeName("exam_scope");
    member.setName("competition");
    member.setMemberName("examScopeList");
    member.setRelationName("competition");
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

  public StringAttribute organizationName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("organizationName");
    member.setName("organization_name");
    useMember(member);
    return member;
  }

  public StringAttribute accessCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("accessCode");
    member.setName("access_code");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
