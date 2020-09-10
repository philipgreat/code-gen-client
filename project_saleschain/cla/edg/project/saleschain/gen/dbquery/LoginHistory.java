package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class LoginHistory extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.loginhistory.LoginHistory";
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

  public DateTimeAttribute loginTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("loginTime");
    member.setName("login_time");
    useMember(member);
    return member;
  }

  public StringAttribute fromIp() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fromIp");
    member.setName("from_ip");
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
