package cla.edg.project.saleschain.gen.dbquery;

import cla.edg.modelbean.*;

public class ExaminationPaper extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.examinationpaper.ExaminationPaper";
  }
  // 枚举对象

  // 引用的对象

  public MobileUser examinee() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("examinee");
    member.setMemberName("examinee");
    member.setReferDirection(true);
    member.setRelationName("examinee");
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
