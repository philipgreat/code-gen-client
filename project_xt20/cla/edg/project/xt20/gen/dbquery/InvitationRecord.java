package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class InvitationRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.invitationrecord.InvitationRecord";
  }
  // 枚举对象

  // 引用的对象

  public Employee inviter() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("inviter");
    member.setMemberName("inviter");
    member.setReferDirection(true);
    member.setRelationName("inviter");
    append(member);
    return member;
  }

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
    append(member);
    return member;
  }

  public InvitationType type() {
    InvitationType member = new InvitationType();
    member.setModelTypeName("invitation_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  // 被引用的对象

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("invitation");
    member.setMemberName("employeeList");
    member.setRelationName("invitation");
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

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute orderId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("orderId");
    member.setName("order_id");
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
