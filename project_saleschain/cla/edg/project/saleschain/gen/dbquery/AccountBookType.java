package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.accountbooktype.AccountBookType";
  }
  // 枚举对象
  public static EnumAttribute CASH =
      new EnumAttribute("com.doublechaintech.saleschain.accountbooktype.AccountBookType", "CASH")
          .chineseName("现金");
  public static EnumAttribute POINT =
      new EnumAttribute("com.doublechaintech.saleschain.accountbooktype.AccountBookType", "POINT")
          .chineseName("积分");
  public static EnumAttribute WITHDRAW =
      new EnumAttribute(
              "com.doublechaintech.saleschain.accountbooktype.AccountBookType", "WITHDRAW")
          .chineseName("提现");
  public static EnumAttribute EXTERNAL =
      new EnumAttribute(
              "com.doublechaintech.saleschain.accountbooktype.AccountBookType", "EXTERNAL")
          .chineseName("外部账户");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {CASH, POINT, WITHDRAW, EXTERNAL};
  }

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
    member.setName("type");
    member.setMemberName("accountBookList");
    member.setRelationName("type");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
