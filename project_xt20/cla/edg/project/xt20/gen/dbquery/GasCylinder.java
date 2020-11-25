package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GasCylinder extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.gascylinder.GasCylinder";
  }
  // 枚举对象

  // 引用的对象

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

  public GasContainerCategory gasContainerCategory() {
    GasContainerCategory member = new GasContainerCategory();
    member.setModelTypeName("gas_container_category");
    member.setName("gas_container_category");
    member.setMemberName("gasContainerCategory");
    member.setReferDirection(true);
    member.setRelationName("gasContainerCategory");
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

  public CustomerCylinder customerCylinderList() {
    CustomerCylinder member = new CustomerCylinder();
    member.setModelTypeName("customer_cylinder");
    member.setName("cylinder");
    member.setMemberName("customerCylinderList");
    member.setRelationName("cylinder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CompanyCylinder companyCylinderList() {
    CompanyCylinder member = new CompanyCylinder();
    member.setModelTypeName("company_cylinder");
    member.setName("cylinder");
    member.setMemberName("companyCylinderList");
    member.setRelationName("cylinder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductTemplate gasProductTemplateList() {
    GasProductTemplate member = new GasProductTemplate();
    member.setModelTypeName("gas_product_template");
    member.setName("cylinder");
    member.setMemberName("gasProductTemplateList");
    member.setRelationName("cylinder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("cylinder");
    member.setMemberName("gasProductList");
    member.setRelationName("cylinder");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasLineItem gasLineItemList() {
    GasLineItem member = new GasLineItem();
    member.setModelTypeName("gas_line_item");
    member.setName("cylinder");
    member.setMemberName("gasLineItemList");
    member.setRelationName("cylinder");
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

  public StringAttribute additionalInformation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("additionalInformation");
    member.setName("additional_information");
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
