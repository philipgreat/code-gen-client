package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserInvite extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.userinvite.UserInvite";
  }
  // 枚举对象

  // 引用的对象

  public MobileUser inviter() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("inviter");
    member.setMemberName("inviter");
    member.setReferDirection(true);
    member.setRelationName("inviter");
    append(member);
    return member;
  }

  public MobileUser invitee() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("invitee");
    member.setMemberName("invitee");
    member.setReferDirection(true);
    member.setRelationName("invitee");
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

  public DateTimeAttribute inviteTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("inviteTime");
    member.setName("invite_time");
    useMember(member);
    return member;
  }

  public BooleanAttribute succeed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("succeed");
    member.setName("succeed");
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
