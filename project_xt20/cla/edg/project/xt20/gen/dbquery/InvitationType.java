package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InvitationType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.invitationtype.InvitationType";
  }
  // 枚举对象
  public static EnumAttribute COLLEAGUE =
      new EnumAttribute("com.doublechaintech.xt20.invitationtype.InvitationType", "COLLEAGUE")
          .chineseName("邀请同事");
  public static EnumAttribute SUPPLIER =
      new EnumAttribute("com.doublechaintech.xt20.invitationtype.InvitationType", "SUPPLIER")
          .chineseName("邀请商家");
  public static EnumAttribute CUSTOMER =
      new EnumAttribute("com.doublechaintech.xt20.invitationtype.InvitationType", "CUSTOMER")
          .chineseName("邀请用户");
  public static EnumAttribute COMMON =
      new EnumAttribute("com.doublechaintech.xt20.invitationtype.InvitationType", "COMMON")
          .chineseName("分享");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {COLLEAGUE, SUPPLIER, CUSTOMER, COMMON};
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

  public InvitationRecord invitationRecordList() {
    InvitationRecord member = new InvitationRecord();
    member.setModelTypeName("invitation_record");
    member.setName("type");
    member.setMemberName("invitationRecordList");
    member.setRelationName("type");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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