package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class City extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.city.City";
  }
  // 枚举对象

  // 引用的对象

  public Province province() {
    Province member = new Province();
    member.setModelTypeName("province");
    member.setName("province");
    member.setMemberName("province");
    member.setReferDirection(true);
    member.setRelationName("province");
    append(member);
    return member;
  }

  // 被引用的对象

  public SupplierAvailableCity supplierAvailableCityList() {
    SupplierAvailableCity member = new SupplierAvailableCity();
    member.setModelTypeName("supplier_available_city");
    member.setName("city");
    member.setMemberName("supplierAvailableCityList");
    member.setRelationName("city");
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
