package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProduct extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproduct.GasProduct";
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

  public GasProductTemplate template() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("template");
    member.setMemberName("template");
    member.setReferDirection(true);
    member.setRelationName("template");
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

  public ProductStatus status() {
    ProductStatus member = new ProductStatus();
    member.setModelTypeName("product_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

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

  public GasProductComponent gasProductComponentList() {
    GasProductComponent member = new GasProductComponent();
    member.setModelTypeName("gas_product_component");
    member.setName("product");
    member.setMemberName("gasProductComponentList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductInventory gasProductInventoryList() {
    GasProductInventory member = new GasProductInventory();
    member.setModelTypeName("gas_product_inventory");
    member.setName("product");
    member.setMemberName("gasProductInventoryList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasLineItem gasLineItemList() {
    GasLineItem member = new GasLineItem();
    member.setModelTypeName("gas_line_item");
    member.setName("product");
    member.setMemberName("gasLineItemList");
    member.setRelationName("product");
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

  public NumberAttribute targetQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("targetQuantity");
    member.setName("target_quantity");
    useMember(member);
    return member;
  }

  public NumberAttribute threholdQuantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("threholdQuantity");
    member.setName("threhold_quantity");
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
