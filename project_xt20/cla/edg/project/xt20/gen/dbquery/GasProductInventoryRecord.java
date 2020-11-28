package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductInventoryRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproductinventoryrecord.GasProductInventoryRecord";
  }
  // 枚举对象

  // 引用的对象

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

  public GasProduct product() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("product");
    member.setMemberName("product");
    member.setReferDirection(true);
    member.setRelationName("product");
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

  public ActionType action() {
    ActionType member = new ActionType();
    member.setModelTypeName("action_type");
    member.setName("action");
    member.setMemberName("action");
    member.setReferDirection(true);
    member.setRelationName("action");
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

  public NumberAttribute updateQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("updateQuantity");
    member.setName("update_quantity");
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