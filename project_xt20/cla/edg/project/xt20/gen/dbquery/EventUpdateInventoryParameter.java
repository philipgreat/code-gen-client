package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventUpdateInventoryParameter extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventupdateinventoryparameter.EventUpdateInventoryParameter";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute productId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productId");
    member.setName("product_id");
    useMember(member);
    return member;
  }

  public NumberAttribute targetQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("targetQuantity");
    member.setName("target_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute thresholdQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("thresholdQuantity");
    member.setName("threshold_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute quantityPerDay() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantityPerDay");
    member.setName("quantity_per_day");
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
