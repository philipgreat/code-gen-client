package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ProductType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.producttype.ProductType";
  }
  // 枚举对象
  public static EnumAttribute PURE_GAS =
      new EnumAttribute("com.doublechaintech.xt20.producttype.ProductType", "PURE_GAS")
          .chineseName("纯气");
  public static EnumAttribute GAS_MIXTURE =
      new EnumAttribute("com.doublechaintech.xt20.producttype.ProductType", "GAS_MIXTURE")
          .chineseName("混合气");
  public static EnumAttribute BULK_LATTICE =
      new EnumAttribute("com.doublechaintech.xt20.producttype.ProductType", "BULK_LATTICE")
          .chineseName("散装格");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PURE_GAS, GAS_MIXTURE, BULK_LATTICE};
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

  public GasProductTemplate gasProductTemplateList() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("product_type");
    member.setMemberName("gasProductTemplateList");
    member.setRelationName("productType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("product_type");
    member.setMemberName("gasProductList");
    member.setRelationName("productType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventProductBaseInfo eventProductBaseInfoList() {
    EventProductBaseInfo member = new EventProductBaseInfo();
    member.setModelTypeName("event_product_base_info");
    member.setName("product_type");
    member.setMemberName("eventProductBaseInfoList");
    member.setRelationName("productType");
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
