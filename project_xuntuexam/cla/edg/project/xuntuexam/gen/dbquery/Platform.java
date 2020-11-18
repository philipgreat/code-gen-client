package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Platform extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.platform.Platform";
  }
  // 枚举对象

  // 引用的对象

  // 被引用的对象

  public Merchant merchantList() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("platform");
    member.setMemberName("merchantList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public PersonalUser personalUserList() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("platform");
    member.setMemberName("personalUserList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ExaminationQuestion examinationQuestionList() {
    ExaminationQuestion member = new ExaminationQuestion();
    member.setModelTypeName("examination_question");
    member.setName("platform");
    member.setMemberName("examinationQuestionList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ExamPaperStatus examPaperStatusList() {
    ExamPaperStatus member = new ExamPaperStatus();
    member.setModelTypeName("exam_paper_status");
    member.setName("platform");
    member.setMemberName("examPaperStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CompetitionStatus competitionStatusList() {
    CompetitionStatus member = new CompetitionStatus();
    member.setModelTypeName("competition_status");
    member.setName("platform");
    member.setMemberName("competitionStatusList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ValidExamRecord validExamRecordList() {
    ValidExamRecord member = new ValidExamRecord();
    member.setModelTypeName("valid_exam_record");
    member.setName("platform");
    member.setMemberName("validExamRecordList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public QuestionCategory questionCategoryList() {
    QuestionCategory member = new QuestionCategory();
    member.setModelTypeName("question_category");
    member.setName("platform");
    member.setMemberName("questionCategoryList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Competition competitionList() {
    Competition member = new Competition();
    member.setModelTypeName("competition");
    member.setName("platform");
    member.setMemberName("competitionList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public IconConfiguration iconConfigurationList() {
    IconConfiguration member = new IconConfiguration();
    member.setModelTypeName("icon_configuration");
    member.setName("platform");
    member.setMemberName("iconConfigurationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelConfiguration systemLevelConfigurationList() {
    SystemLevelConfiguration member = new SystemLevelConfiguration();
    member.setModelTypeName("system_level_configuration");
    member.setName("platform");
    member.setMemberName("systemLevelConfigurationList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelImages systemLevelImagesList() {
    SystemLevelImages member = new SystemLevelImages();
    member.setModelTypeName("system_level_images");
    member.setName("platform");
    member.setMemberName("systemLevelImagesList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelContent systemLevelContentList() {
    SystemLevelContent member = new SystemLevelContent();
    member.setModelTypeName("system_level_content");
    member.setName("platform");
    member.setMemberName("systemLevelContentList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemLevelNumber systemLevelNumberList() {
    SystemLevelNumber member = new SystemLevelNumber();
    member.setModelTypeName("system_level_number");
    member.setName("platform");
    member.setMemberName("systemLevelNumberList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ChangeRequestType changeRequestTypeList() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("platform");
    member.setMemberName("changeRequestTypeList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ChangeRequest changeRequestList() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("platform");
    member.setMemberName("changeRequestList");
    member.setRelationName("platform");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SystemProcessingInstance systemProcessingInstanceList() {
    SystemProcessingInstance member = new SystemProcessingInstance();
    member.setModelTypeName("system_processing_instance");
    member.setName("platform");
    member.setMemberName("systemProcessingInstanceList");
    member.setRelationName("platform");
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
