package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ValidExamRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.validexamrecord.ValidExamRecord";
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

  public NumberAttribute score() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("score");
    member.setName("score");
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

  public NumberAttribute usedSeconds() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("usedSeconds");
    member.setName("used_seconds");
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
