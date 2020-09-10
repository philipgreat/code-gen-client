package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemMessage extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.systemmessage.SystemMessage";
  }
  // 枚举对象

  // 引用的对象

  public MobileUser recipient() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("recipient");
    member.setMemberName("recipient");
    member.setReferDirection(true);
    member.setRelationName("recipient");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public BooleanAttribute isRead() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("isRead");
    member.setName("is_read");
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

  public StringAttribute relatedObjectType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("relatedObjectType");
    member.setName("related_object_type");
    useMember(member);
    return member;
  }

  public StringAttribute relatedObjectId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("relatedObjectId");
    member.setName("related_object_id");
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
