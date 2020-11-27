package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class IndividualIdentity extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.individualidentity.IndividualIdentity";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser personalUser() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("personal_user");
    member.setMemberName("personalUser");
    member.setReferDirection(true);
    member.setRelationName("personalUser");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
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
