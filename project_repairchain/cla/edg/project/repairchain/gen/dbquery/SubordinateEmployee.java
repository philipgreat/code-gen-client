package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SubordinateEmployee extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.subordinateemployee.SubordinateEmployee";
  }
  // 枚举对象

  // 引用的对象

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

  public Employee subordinateStuff() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("subordinate_stuff");
    member.setMemberName("subordinateStuff");
    member.setReferDirection(true);
    member.setRelationName("subordinateStuff");
    append(member);
    return member;
  }

  public Factory factory() {
    Factory member = new Factory();
    member.setModelTypeName("factory");
    member.setName("factory");
    member.setMemberName("factory");
    member.setReferDirection(true);
    member.setRelationName("factory");
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
