package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class FillMedium extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.fillmedium.FillMedium";
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
    member.setName("fill_medium");
    member.setMemberName("gasCylinderList");
    member.setRelationName("fillMedium");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplateComponent gasProductTemplateComponentList() {
    GasProductTemplateComponent member = new GasProductTemplateComponent();
    member.setModelTypeName("gas_product_template_component");
    member.setName("fill_medium");
    member.setMemberName("gasProductTemplateComponentList");
    member.setRelationName("fillMedium");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductComponent gasProductComponentList() {
    GasProductComponent member = new GasProductComponent();
    member.setModelTypeName("gas_product_component");
    member.setName("fill_medium");
    member.setMemberName("gasProductComponentList");
    member.setRelationName("fillMedium");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventContainerInfo eventContainerInfoList() {
    EventContainerInfo member = new EventContainerInfo();
    member.setModelTypeName("event_container_info");
    member.setName("fill_medium");
    member.setMemberName("eventContainerInfoList");
    member.setRelationName("fillMedium");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventProductComponent eventProductComponentList() {
    EventProductComponent member = new EventProductComponent();
    member.setModelTypeName("event_product_component");
    member.setName("component");
    member.setMemberName("eventProductComponentList");
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
