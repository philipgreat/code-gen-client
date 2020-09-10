package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Merchant extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.merchant.Merchant";
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

  public AccountBook accountBookList() {
    AccountBook member = new AccountBook();
    member.setModelTypeName("account_book");
    member.setName("owner");
    member.setMemberName("accountBookList");
    member.setRelationName("owner");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MobileUser mobileUserList() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("merchant");
    member.setMemberName("mobileUserList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Supplier supplierList() {
    Supplier member = new Supplier();
    member.setModelTypeName("supplier");
    member.setName("merchant");
    member.setMemberName("supplierList");
    member.setRelationName("merchant");
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

  public StringAttribute entityIdentity() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("entityIdentity");
    member.setName("entity_identity");
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
