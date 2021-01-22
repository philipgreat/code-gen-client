package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FillVolume extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.fillvolume.FillVolume";
  }
  // 枚举对象

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
    member.setName("fill_volume");
    member.setMemberName("gasProductTemplateList");
    member.setRelationName("fillVolume");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("fill_volume");
    member.setMemberName("gasProductList");
    member.setRelationName("fillVolume");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductCache gasProductCacheList() {
    GasProductCache member = new GasProductCache();
    member.setModelTypeName("gas_product_cache");
    member.setName("fill_volume");
    member.setMemberName("gasProductCacheList");
    member.setRelationName("fillVolume");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplateCache gasProductTemplateCacheList() {
    GasProductTemplateCache member = new GasProductTemplateCache();
    member.setModelTypeName("gas_product_template_cache");
    member.setName("fill_volume");
    member.setMemberName("gasProductTemplateCacheList");
    member.setRelationName("fillVolume");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventContainerInfo eventContainerInfoList() {
    EventContainerInfo member = new EventContainerInfo();
    member.setModelTypeName("event_container_info");
    member.setName("fill_volume");
    member.setMemberName("eventContainerInfoList");
    member.setRelationName("fillVolume");
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

  public StringAttribute volume() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("volume");
    member.setName("volume");
    useMember(member);
    return member;
  }

  public NumberAttribute numericValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("numericValue");
    member.setName("numeric_value");
    useMember(member);
    return member;
  }

  public StringAttribute unitName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unitName");
    member.setName("unit_name");
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
