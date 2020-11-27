package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PersonalUser extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.personaluser.PersonalUser";
  }
  // 枚举对象

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

  public IndividualIdentity individualIdentityList() {
    IndividualIdentity member = new IndividualIdentity();
    member.setModelTypeName("individual_identity");
    member.setName("personal_user");
    member.setMemberName("individualIdentityList");
    member.setRelationName("personalUser");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserWorkingInfo userWorkingInfoList() {
    UserWorkingInfo member = new UserWorkingInfo();
    member.setModelTypeName("user_working_info");
    member.setName("user");
    member.setMemberName("userWorkingInfoList");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("person_information");
    member.setMemberName("employeeList");
    member.setRelationName("personInformation");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverTask deliverTaskList() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("deliver_staff");
    member.setMemberName("deliverTaskList");
    member.setRelationName("deliverStaff");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MainOrder mainOrderList() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("creator");
    member.setMemberName("mainOrderList");
    member.setRelationName("creator");
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

  public StringAttribute nickName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("nickName");
    member.setName("nick_name");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute avatar() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("avatar");
    member.setName("avatar");
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
