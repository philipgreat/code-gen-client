package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasProductTemplateComponent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gasproducttemplatecomponent.GasProductTemplateComponent";
  }
  // 枚举对象

  // 引用的对象

  public GasComponent component() {
    GasComponent member = new GasComponent();
    member.setModelTypeName("gas_component");
    member.setName("component");
    member.setMemberName("component");
    member.setReferDirection(true);
    member.setRelationName("component");
    append(member);
    return member;
  }

  public GasProductTemplate productTemplate() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("product_template");
    member.setMemberName("productTemplate");
    member.setReferDirection(true);
    member.setRelationName("productTemplate");
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

  public NumberAttribute percentage() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("percentage");
    member.setName("percentage");
    useMember(member);
    return member;
  }

  public StringAttribute templateId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("templateId");
    member.setName("template_id");
    useMember(member);
    return member;
  }

  public StringAttribute searchtext() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("searchtext");
    member.setName("searchtext");
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
