package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CommonLog extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.commonlog.CommonLog";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser person() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("person");
    member.setMemberName("person");
    member.setReferDirection(true);
    member.setRelationName("person");
    append(member);
    return member;
  }

  public Company company() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("company");
    member.setMemberName("company");
    member.setReferDirection(true);
    member.setRelationName("company");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute detail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("detail");
    member.setName("detail");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
