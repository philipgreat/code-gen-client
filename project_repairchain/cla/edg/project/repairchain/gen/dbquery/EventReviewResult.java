package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventReviewResult extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventreviewresult.EventReviewResult";
  }
  // 枚举对象

  // 引用的对象

  public Employee sendTo() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("send_to");
    member.setMemberName("sendTo");
    member.setReferDirection(true);
    member.setRelationName("sendTo");
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

  public StringAttribute reviewType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("reviewType");
    member.setName("review_type");
    useMember(member);
    return member;
  }

  public StringAttribute taskId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("taskId");
    member.setName("task_id");
    useMember(member);
    return member;
  }

  public StringAttribute reviewResult() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("reviewResult");
    member.setName("review_result");
    useMember(member);
    return member;
  }

  public StringAttribute comments() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comments");
    member.setName("comments");
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
