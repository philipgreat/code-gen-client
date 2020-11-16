package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ExamPaperStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.exampaperstatus.ExamPaperStatus";
  }
  // 枚举对象
  public static EnumAttribute ANSWERING =
      new EnumAttribute(
              "com.doublechaintech.xuntuexam.exampaperstatus.ExamPaperStatus", "ANSWERING")
          .chineseName("考试中");
  public static EnumAttribute FINISHED =
      new EnumAttribute("com.doublechaintech.xuntuexam.exampaperstatus.ExamPaperStatus", "FINISHED")
          .chineseName("已考完");
  public static EnumAttribute CANCELLED =
      new EnumAttribute(
              "com.doublechaintech.xuntuexam.exampaperstatus.ExamPaperStatus", "CANCELLED")
          .chineseName("已取消");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {ANSWERING, FINISHED, CANCELLED};
  }

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

  public ExaminationPaper examinationPaperList() {
    ExaminationPaper member = new ExaminationPaper();
    member.setModelTypeName("examination_paper");
    member.setName("exam_paper_status");
    member.setMemberName("examinationPaperList");
    member.setRelationName("examPaperStatus");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
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
