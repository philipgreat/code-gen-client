package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SecUser extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.secuser.SecUser";
  }
  // 枚举对象

  // 引用的对象

  public UserDomain domain() {
    UserDomain member = new UserDomain();
    member.setModelTypeName("user_domain");
    member.setName("domain");
    member.setMemberName("domain");
    member.setReferDirection(true);
    member.setRelationName("domain");
    append(member);
    return member;
  }

  // 被引用的对象

  public UserApp userAppList() {
    UserApp member = new UserApp();
    member.setModelTypeName("user_app");
    member.setName("sec_user");
    member.setMemberName("userAppList");
    member.setRelationName("secUser");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public LoginHistory loginHistoryList() {
    LoginHistory member = new LoginHistory();
    member.setModelTypeName("login_history");
    member.setName("sec_user");
    member.setMemberName("loginHistoryList");
    member.setRelationName("secUser");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WechatWorkappIdentity wechatWorkappIdentityList() {
    WechatWorkappIdentity member = new WechatWorkappIdentity();
    member.setModelTypeName("wechat_workapp_identity");
    member.setName("sec_user");
    member.setMemberName("wechatWorkappIdentityList");
    member.setRelationName("secUser");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public WechatMiniappIdentity wechatMiniappIdentityList() {
    WechatMiniappIdentity member = new WechatMiniappIdentity();
    member.setModelTypeName("wechat_miniapp_identity");
    member.setName("sec_user");
    member.setMemberName("wechatMiniappIdentityList");
    member.setRelationName("secUser");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public KeypairIdentity keypairIdentityList() {
    KeypairIdentity member = new KeypairIdentity();
    member.setModelTypeName("keypair_identity");
    member.setName("sec_user");
    member.setMemberName("keypairIdentityList");
    member.setRelationName("secUser");
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

  public StringAttribute login() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("login");
    member.setName("login");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute email() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_email");
    // member.setName("email");
    member.setName("email");
    useMember(member);
    return member;
  }

  public StringAttribute pwd() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_password");
    // member.setName("pwd");
    member.setName("pwd");
    useMember(member);
    return member;
  }

  public StringAttribute weixinOpenid() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("weixinOpenid");
    member.setName("weixin_openid");
    useMember(member);
    return member;
  }

  public StringAttribute weixinAppid() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("weixinAppid");
    member.setName("weixin_appid");
    useMember(member);
    return member;
  }

  public StringAttribute accessToken() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("accessToken");
    member.setName("access_token");
    useMember(member);
    return member;
  }

  public NumberAttribute verificationCode() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("verificationCode");
    member.setName("verification_code");
    useMember(member);
    return member;
  }

  public DateTimeAttribute verificationCodeExpire() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("verificationCodeExpire");
    member.setName("verification_code_expire");
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
