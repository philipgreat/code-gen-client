package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class NominalPressure extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.nominalpressure.NominalPressure";
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

  public GasCylinder gasCylinderList() {
    GasCylinder member = new GasCylinder();
    member.setModelTypeName("gas_cylinder");
    member.setName("nominal_pressure");
    member.setMemberName("gasCylinderList");
    member.setRelationName("nominalPressure");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductCache gasProductCacheList() {
    GasProductCache member = new GasProductCache();
    member.setModelTypeName("gas_product_cache");
    member.setName("nominal_pressure");
    member.setMemberName("gasProductCacheList");
    member.setRelationName("nominalPressure");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplateCache gasProductTemplateCacheList() {
    GasProductTemplateCache member = new GasProductTemplateCache();
    member.setModelTypeName("gas_product_template_cache");
    member.setName("nominal_pressure");
    member.setMemberName("gasProductTemplateCacheList");
    member.setRelationName("nominalPressure");
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

  public StringAttribute pressure() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("pressure");
    member.setName("pressure");
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
