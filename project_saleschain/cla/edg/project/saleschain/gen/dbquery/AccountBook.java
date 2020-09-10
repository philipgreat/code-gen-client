package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBook extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.accountbook.AccountBook";
  }
  // 枚举对象

  // 引用的对象

  public AccountBookType type() {
    AccountBookType member = new AccountBookType();
    member.setModelTypeName("account_book_type");
    member.setName("type");
    member.setMemberName("type");
    member.setReferDirection(true);
    member.setRelationName("type");
    append(member);
    return member;
  }

  public Merchant owner() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("owner");
    member.setMemberName("owner");
    member.setReferDirection(true);
    member.setRelationName("owner");
    append(member);
    return member;
  }

  // 被引用的对象

  public AccountBookItem accountBookItemList() {
    AccountBookItem member = new AccountBookItem();
    member.setModelTypeName("account_book_item");
    member.setName("account_book");
    member.setMemberName("accountBookItemList");
    member.setRelationName("accountBook");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public AccountBookRecord accountBookRecordListAsPayerAccount() {
    AccountBookRecord member = new AccountBookRecord();
    member.setModelTypeName("account_book_record");
    member.setName("payer_account");
    member.setMemberName("accountBookRecordListAsPayerAccount");
    member.setRelationName("payerAccount");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public AccountBookRecord accountBookRecordListAsPayeeAccount() {
    AccountBookRecord member = new AccountBookRecord();
    member.setModelTypeName("account_book_record");
    member.setName("payee_account");
    member.setMemberName("accountBookRecordListAsPayeeAccount");
    member.setRelationName("payerAccount");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
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
