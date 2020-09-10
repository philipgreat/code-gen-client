package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventSubmitWithdrawResult extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.eventsubmitwithdrawresult.EventSubmitWithdrawResult";
  }
  // 枚举对象

  // 引用的对象

  public WithdrawApplication application() {
    WithdrawApplication member = new WithdrawApplication();
    member.setModelTypeName("withdraw_application");
    member.setName("application");
    member.setMemberName("application");
    member.setReferDirection(true);
    member.setRelationName("application");
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

  public BooleanAttribute result() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("result");
    member.setName("result");
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
