package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasComponent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gascomponent.GasComponent";
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

  public GasProductTemplateComponent gasProductTemplateComponentList() {
    GasProductTemplateComponent member = new GasProductTemplateComponent();
    member.setModelTypeName("gas_product_template_component");
    member.setName("component");
    member.setMemberName("gasProductTemplateComponentList");
    member.setRelationName("component");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductComponent gasProductComponentList() {
    GasProductComponent member = new GasProductComponent();
    member.setModelTypeName("gas_product_component");
    member.setName("component");
    member.setMemberName("gasProductComponentList");
    member.setRelationName("component");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
