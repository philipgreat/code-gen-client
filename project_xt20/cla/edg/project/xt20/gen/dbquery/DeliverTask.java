package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DeliverTask extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.delivertask.DeliverTask";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser deliverStaff() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("deliver_staff");
    member.setMemberName("deliverStaff");
    member.setReferDirection(true);
    member.setRelationName("deliverStaff");
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

  public DeliverTaskStatus status() {
    DeliverTaskStatus member = new DeliverTaskStatus();
    member.setModelTypeName("deliver_task_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  // 被引用的对象

  public SellOrder sellOrderList() {
    SellOrder member = new SellOrder();
    member.setModelTypeName("sell_order");
    member.setName("deliver_task");
    member.setMemberName("sellOrderList");
    member.setRelationName("deliverTask");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
