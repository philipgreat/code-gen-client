package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Merchant extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.merchant.Merchant";
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

  public PersonalUser personalUserList() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("merchant");
    member.setMemberName("personalUserList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Company companyList() {
    Company member = new Company();
    member.setModelTypeName("company");
    member.setName("merchant");
    member.setMemberName("companyList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SellOrder sellOrderListAsBuyer() {
    SellOrder member = new SellOrder();
    member.setModelTypeName("sell_order");
    member.setName("buyer");
    member.setMemberName("sellOrderListAsBuyer");
    member.setRelationName("buyer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SellOrder sellOrderListAsSeller() {
    SellOrder member = new SellOrder();
    member.setModelTypeName("sell_order");
    member.setName("seller");
    member.setMemberName("sellOrderListAsSeller");
    member.setRelationName("buyer");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
