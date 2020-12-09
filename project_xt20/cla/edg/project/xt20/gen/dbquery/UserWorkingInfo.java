package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserWorkingInfo extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.userworkinginfo.UserWorkingInfo";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser user() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
    append(member);
    return member;
  }

  public Employee employee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("employee");
    member.setMemberName("employee");
    member.setReferDirection(true);
    member.setRelationName("employee");
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

  public BooleanAttribute sellerAdReviewed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("sellerAdReviewed");
    member.setName("seller_ad_reviewed");
    useMember(member);
    return member;
  }

  public BooleanAttribute buyerAdReviewed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("buyerAdReviewed");
    member.setName("buyer_ad_reviewed");
    useMember(member);
    return member;
  }

  public StringAttribute jobRole() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("jobRole");
    member.setName("job_role");
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
