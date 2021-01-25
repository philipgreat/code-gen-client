package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class CylinderArea extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.cylinderarea.CylinderArea";
  }
  // 枚举对象
  public static EnumAttribute EMPTY =
      new EnumAttribute("com.doublechaintech.xt20.cylinderarea.CylinderArea", "EMPTY")
          .chineseName("空瓶");
  public static EnumAttribute PRODUCT =
      new EnumAttribute("com.doublechaintech.xt20.cylinderarea.CylinderArea", "PRODUCT")
          .chineseName("实/满瓶");
  public static EnumAttribute DELIVERY =
      new EnumAttribute("com.doublechaintech.xt20.cylinderarea.CylinderArea", "DELIVERY")
          .chineseName("实/满瓶在途");
  public static EnumAttribute BACK =
      new EnumAttribute("com.doublechaintech.xt20.cylinderarea.CylinderArea", "BACK")
          .chineseName("回瓶在途");
  public static EnumAttribute BUYER =
      new EnumAttribute("com.doublechaintech.xt20.cylinderarea.CylinderArea", "BUYER")
          .chineseName("客户持瓶");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {EMPTY, PRODUCT, DELIVERY, BACK, BUYER};
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

  public MerchantCylinder merchantCylinderList() {
    MerchantCylinder member = new MerchantCylinder();
    member.setModelTypeName("merchant_cylinder");
    member.setName("cylinder_area");
    member.setMemberName("merchantCylinderList");
    member.setRelationName("cylinderArea");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MerchantCylinderRecord merchantCylinderRecordList() {
    MerchantCylinderRecord member = new MerchantCylinderRecord();
    member.setModelTypeName("merchant_cylinder_record");
    member.setName("cylinder_area");
    member.setMemberName("merchantCylinderRecordList");
    member.setRelationName("cylinderArea");
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
