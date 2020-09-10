package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SupplierAvailableCity extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.supplieravailablecity.SupplierAvailableCity";
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

  public Supplier supplier() {
    Supplier member = new Supplier();
    member.setModelTypeName("supplier");
    member.setName("supplier");
    member.setMemberName("supplier");
    member.setReferDirection(true);
    member.setRelationName("supplier");
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
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
