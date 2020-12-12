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

  public FillVolume fillVolume() {
    FillVolume member = new FillVolume();
    member.setModelTypeName("fill_volume");
    member.setName("fill_volume");
    member.setMemberName("fillVolume");
    member.setReferDirection(true);
    member.setRelationName("fillVolume");
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

  public ProductType productType() {
    ProductType member = new ProductType();
    member.setModelTypeName("product_type");
    member.setName("product_type");
    member.setMemberName("productType");
    member.setReferDirection(true);
    member.setRelationName("productType");
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

  public GasProductInventoryRecord gasProductInventoryRecordList() {
    GasProductInventoryRecord member = new GasProductInventoryRecord();
    member.setModelTypeName("gas_product_inventory_record");
    member.setName("product");
    member.setMemberName("gasProductInventoryRecordList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductCache gasProductCacheList() {
    GasProductCache member = new GasProductCache();
    member.setModelTypeName("gas_product_cache");
    member.setName("product");
    member.setMemberName("gasProductCacheList");
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

  public EventProductInbound eventProductInboundList() {
    EventProductInbound member = new EventProductInbound();
    member.setModelTypeName("event_product_inbound");
    member.setName("product");
    member.setMemberName("eventProductInboundList");
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

  public NumberAttribute quantity() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("quantity");
    member.setName("quantity");
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

  public StringAttribute legacyCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("legacyCode");
    member.setName("legacy_code");
    useMember(member);
    return member;
  }

  public StringAttribute additionalInformation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("additionalInformation");
    member.setName("additional_information");
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
