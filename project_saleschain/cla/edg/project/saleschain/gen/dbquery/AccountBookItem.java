package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class AccountBookItem extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.accountbookitem.AccountBookItem";
  }
  // 枚举对象

  // 引用的对象

  public AccountBookItemStatus status() {
    AccountBookItemStatus member = new AccountBookItemStatus();
    member.setModelTypeName("account_book_item_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public AccountBook accountBook() {
    AccountBook member = new AccountBook();
    member.setModelTypeName("account_book");
    member.setName("account_book");
    member.setMemberName("accountBook");
    member.setReferDirection(true);
    member.setRelationName("accountBook");
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

  public NumberAttribute originalAmount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("originalAmount");
    member.setName("original_amount");
    useMember(member);
    return member;
  }

  public NumberAttribute balance() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("balance");
    member.setName("balance");
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
