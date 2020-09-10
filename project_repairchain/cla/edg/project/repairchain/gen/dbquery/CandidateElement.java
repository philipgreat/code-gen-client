package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CandidateElement extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.candidateelement.CandidateElement";
  }
  // 枚举对象

  // 引用的对象

  public CandidateContainer container() {
    CandidateContainer member = new CandidateContainer();
    member.setModelTypeName("candidate_container");
    member.setName("container");
    member.setMemberName("container");
    member.setReferDirection(true);
    member.setRelationName("container");
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

  public StringAttribute type() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("type");
    member.setName("type");
    useMember(member);
    return member;
  }

  public StringAttribute image() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("image");
    member.setName("image");
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
