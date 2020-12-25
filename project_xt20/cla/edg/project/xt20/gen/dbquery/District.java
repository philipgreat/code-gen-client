package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class District extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.district.District";
  }
  // 枚举对象

  // 引用的对象

  public City city() {
    City member = new City();
    member.setModelTypeName("city");
    member.setName("city");
    member.setMemberName("city");
    member.setReferDirection(true);
    member.setRelationName("city");
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

  public MainOrder mainOrderList() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("handover_district");
    member.setMemberName("mainOrderList");
    member.setRelationName("handoverDistrict");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasShippingGroup gasShippingGroupList() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("handover_district");
    member.setMemberName("gasShippingGroupList");
    member.setRelationName("handoverDistrict");
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
