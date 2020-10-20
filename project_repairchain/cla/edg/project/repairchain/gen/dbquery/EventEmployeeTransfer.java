package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventEmployeeTransfer extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.eventemployeetransfer.EventEmployeeTransfer";
  }
  // 枚举对象

  // 引用的对象

  public Employee toEmployee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("to_employee");
    member.setMemberName("toEmployee");
    member.setReferDirection(true);
    member.setRelationName("toEmployee");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute fromEmployee() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fromEmployee");
    member.setName("from_employee");
    useMember(member);
    return member;
  }

  public StringAttribute employeeName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("employeeName");
    member.setName("employee_name");
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
