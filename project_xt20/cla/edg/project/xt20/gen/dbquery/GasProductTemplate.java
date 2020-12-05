package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductTemplate extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproducttemplate.GasProductTemplate";
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

  public GasProductTemplateComponent gasProductTemplateComponentList() {
    GasProductTemplateComponent member = new GasProductTemplateComponent();
    member.setModelTypeName("gas_product_template_component");
    member.setName("product_template");
    member.setMemberName("gasProductTemplateComponentList");
    member.setRelationName("productTemplate");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("template");
    member.setMemberName("gasProductList");
    member.setRelationName("template");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplateCache gasProductTemplateCacheList() {
    GasProductTemplateCache member = new GasProductTemplateCache();
    member.setModelTypeName("gas_product_template_cache");
    member.setName("template_id");
    member.setMemberName("gasProductTemplateCacheList");
    member.setRelationName("templateId");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasLineItem gasLineItemList() {
    GasLineItem member = new GasLineItem();
    member.setModelTypeName("gas_line_item");
    member.setName("template");
    member.setMemberName("gasLineItemList");
    member.setRelationName("template");
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
