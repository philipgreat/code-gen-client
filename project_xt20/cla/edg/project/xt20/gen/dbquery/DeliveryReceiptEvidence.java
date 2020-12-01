package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DeliveryReceiptEvidence extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.deliveryreceiptevidence.DeliveryReceiptEvidence";
  }
  // 枚举对象

  // 引用的对象

  public DeliveryReceipt record() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("record");
    member.setMemberName("record");
    member.setReferDirection(true);
    member.setRelationName("record");
    append(member);
    return member;
  }

  public Employee actor() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("actor");
    member.setMemberName("actor");
    member.setReferDirection(true);
    member.setRelationName("actor");
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

  public StringAttribute images() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("images");
    member.setName("images");
    useMember(member);
    return member;
  }

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comment");
    member.setName("comment");
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
