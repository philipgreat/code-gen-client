package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Province extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.province.Province";
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

  public City cityList() {
    City member = new City();
    member.setModelTypeName("city");
    member.setName("province");
    member.setMemberName("cityList");
    member.setRelationName("province");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Factory factoryList() {
    Factory member = new Factory();
    member.setModelTypeName("factory");
    member.setName("province");
    member.setMemberName("factoryList");
    member.setRelationName("province");
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
