package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Role extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.role.Role";
  }
  // 枚举对象
  public static EnumAttribute ADMIN =
      new EnumAttribute("com.doublechaintech.xt20.role.Role", "ADMIN").chineseName("管理员");
  public static EnumAttribute EMPLOYEE =
      new EnumAttribute("com.doublechaintech.xt20.role.Role", "EMPLOYEE").chineseName("员工");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {ADMIN, EMPLOYEE};
  }

  // 引用的对象

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

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("role");
    member.setMemberName("employeeList");
    member.setRelationName("role");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
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
