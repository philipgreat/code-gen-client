package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductCache extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproductcache.GasProductCache";
  }
  // 枚举对象

  // 引用的对象

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

  public GasContainer gasContainer() {
    GasContainer member = new GasContainer();
    member.setModelTypeName("gas_container");
    member.setName("gas_container");
    member.setMemberName("gasContainer");
    member.setReferDirection(true);
    member.setRelationName("gasContainer");
    append(member);
    return member;
  }

  public FillMedium fillMedium() {
    FillMedium member = new FillMedium();
    member.setModelTypeName("fill_medium");
    member.setName("fill_medium");
    member.setMemberName("fillMedium");
    member.setReferDirection(true);
    member.setRelationName("fillMedium");
    append(member);
    return member;
  }

  public NominalPressure nominalPressure() {
    NominalPressure member = new NominalPressure();
    member.setModelTypeName("nominal_pressure");
    member.setName("nominal_pressure");
    member.setMemberName("nominalPressure");
    member.setReferDirection(true);
    member.setRelationName("nominalPressure");
    append(member);
    return member;
  }

  public NominalVolume nominalVolume() {
    NominalVolume member = new NominalVolume();
    member.setModelTypeName("nominal_volume");
    member.setName("nominal_volume");
    member.setMemberName("nominalVolume");
    member.setReferDirection(true);
    member.setRelationName("nominalVolume");
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

  public StringAttribute component() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("component");
    member.setName("component");
    useMember(member);
    return member;
  }

  public StringAttribute searchText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("searchText");
    member.setName("search_text");
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
