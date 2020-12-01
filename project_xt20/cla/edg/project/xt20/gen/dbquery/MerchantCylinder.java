package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantCylinder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.merchantcylinder.MerchantCylinder";
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

  public CylinderArea cylinderArea() {
    CylinderArea member = new CylinderArea();
    member.setModelTypeName("cylinder_area");
    member.setName("cylinder_area");
    member.setMemberName("cylinderArea");
    member.setReferDirection(true);
    member.setRelationName("cylinderArea");
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

  public DateTimeAttribute lastCheckTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("lastCheckTime");
    member.setName("last_check_time");
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
