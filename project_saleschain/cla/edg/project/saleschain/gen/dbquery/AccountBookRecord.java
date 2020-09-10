package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.accountbookrecord.AccountBookRecord";
  }
  // 枚举对象

  // 引用的对象

  public AccountBook payerAccount() {
    AccountBook member = new AccountBook();
    member.setModelTypeName("account_book");
    member.setName("payer_account");
    member.setMemberName("payerAccount");
    member.setReferDirection(true);
    member.setRelationName("payerAccount");
    append(member);
    return member;
  }

  public AccountBook payeeAccount() {
    AccountBook member = new AccountBook();
    member.setModelTypeName("account_book");
    member.setName("payee_account");
    member.setMemberName("payeeAccount");
    member.setReferDirection(true);
    member.setRelationName("payeeAccount");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public StringAttribute referObjectType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("referObjectType");
    member.setName("refer_object_type");
    useMember(member);
    return member;
  }

  public StringAttribute referObjectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("referObjectId");
    member.setName("refer_object_id");
    useMember(member);
    return member;
  }

  public NumberAttribute payerBalance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("payerBalance");
    member.setName("payer_balance");
    useMember(member);
    return member;
  }

  public NumberAttribute payeeBalance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("payeeBalance");
    member.setName("payee_balance");
    useMember(member);
    return member;
  }

  public StringAttribute changeRequest() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("changeRequest");
    member.setName("change_request");
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
