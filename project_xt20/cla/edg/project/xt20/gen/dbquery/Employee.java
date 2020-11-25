package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Employee extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.employee.Employee";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser personInforamtion() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("person_inforamtion");
    member.setMemberName("personInforamtion");
    member.setReferDirection(true);
    member.setRelationName("personInforamtion");
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

  public Role role() {
    Role member = new Role();
    member.setModelTypeName("role");
    member.setName("role");
    member.setMemberName("role");
    member.setReferDirection(true);
    member.setRelationName("role");
    append(member);
    return member;
  }

  public EmployeeStatus status() {
    EmployeeStatus member = new EmployeeStatus();
    member.setModelTypeName("employee_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comment");
    member.setName("comment");
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
