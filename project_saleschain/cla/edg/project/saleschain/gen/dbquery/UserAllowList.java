package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserAllowList extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.userallowlist.UserAllowList";
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute userIdentity() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("userIdentity");
    member.setName("user_identity");
    useMember(member);
    return member;
  }

  public StringAttribute userSpecialFunctions() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("userSpecialFunctions");
    member.setName("user_special_functions");
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
