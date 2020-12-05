package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EmployeeStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.employeestatus.EmployeeStatus";
  }
  // 枚举对象
  public static EnumAttribute INVITED =
      new EnumAttribute("com.doublechaintech.xt20.employeestatus.EmployeeStatus", "INVITED")
          .chineseName("被邀请");
  public static EnumAttribute NORMAL =
      new EnumAttribute("com.doublechaintech.xt20.employeestatus.EmployeeStatus", "NORMAL")
          .chineseName("正常");
  public static EnumAttribute REMOVED =
      new EnumAttribute("com.doublechaintech.xt20.employeestatus.EmployeeStatus", "REMOVED")
          .chineseName("已删除");
  public static EnumAttribute TO_BE_APPROVE =
      new EnumAttribute("com.doublechaintech.xt20.employeestatus.EmployeeStatus", "TO_BE_APPROVE")
          .chineseName("待审核");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {INVITED, NORMAL, REMOVED, TO_BE_APPROVE};
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
    member.setName("status");
    member.setMemberName("employeeList");
    member.setRelationName("status");
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
