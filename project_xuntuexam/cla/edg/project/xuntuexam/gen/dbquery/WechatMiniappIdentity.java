package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class WechatMiniappIdentity extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.wechatminiappidentity.WechatMiniappIdentity";
  }
  // 枚举对象

  // 引用的对象

  public SecUser secUser() {
    SecUser member = new SecUser();
    member.setModelTypeName("sec_user");
    member.setName("sec_user");
    member.setMemberName("secUser");
    member.setReferDirection(true);
    member.setRelationName("secUser");
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

  public StringAttribute openId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("openId");
    member.setName("open_id");
    useMember(member);
    return member;
  }

  public StringAttribute appId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("appId");
    member.setName("app_id");
    useMember(member);
    return member;
  }

  public StringAttribute unionId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unionId");
    member.setName("union_id");
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

  public DateTimeAttribute lastLoginTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lastLoginTime");
    member.setName("last_login_time");
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
