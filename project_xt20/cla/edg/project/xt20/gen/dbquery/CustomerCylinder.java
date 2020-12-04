package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CustomerCylinder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.customercylinder.CustomerCylinder";
  }
  // 枚举对象

  // 引用的对象

  public GasCylinder cylinder() {
    GasCylinder member = new GasCylinder();
    member.setModelTypeName("gas_cylinder");
    member.setName("cylinder");
    member.setMemberName("cylinder");
    member.setReferDirection(true);
    member.setRelationName("cylinder");
    append(member);
    return member;
  }

  public Merchant seller() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("seller");
    member.setMemberName("seller");
    member.setReferDirection(true);
    member.setRelationName("seller");
    append(member);
    return member;
  }

  public Merchant customer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("customer");
    member.setMemberName("customer");
    member.setReferDirection(true);
    member.setRelationName("customer");
    append(member);
    return member;
  }

  public CheckStatus status() {
    CheckStatus member = new CheckStatus();
    member.setModelTypeName("check_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute delta() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("delta");
    member.setName("delta");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastCheckTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lastCheckTime");
    member.setName("last_check_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastConfirmTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lastConfirmTime");
    member.setName("last_confirm_time");
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
