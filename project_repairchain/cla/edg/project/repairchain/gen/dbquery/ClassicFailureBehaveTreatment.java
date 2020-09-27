package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ClassicFailureBehaveTreatment extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.classicfailurebehavetreatment.ClassicFailureBehaveTreatment";
  }
  // 枚举对象

  // 引用的对象

  public FailureBehave failureBehave() {
    FailureBehave member = new FailureBehave();
    member.setModelTypeName("failure_behave");
    member.setName("failure_behave");
    member.setMemberName("failureBehave");
    member.setReferDirection(true);
    member.setRelationName("failureBehave");
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

  public StringAttribute author() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("author");
    member.setName("author");
    useMember(member);
    return member;
  }

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("content");
    member.setName("content");
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
