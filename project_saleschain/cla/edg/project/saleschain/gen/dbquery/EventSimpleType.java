package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventSimpleType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.eventsimpletype.EventSimpleType";
  }
  // 枚举对象

  // 引用的对象

  public MobileUser fieldBizCandidate() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("field_biz_candidate");
    member.setMemberName("fieldBizCandidate");
    member.setReferDirection(true);
    member.setRelationName("fieldBizCandidate");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute mobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("mobile");
    member.setName("mobile");
    useMember(member);
    return member;
  }

  public StringAttribute gender() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("gender");
    member.setName("gender");
    useMember(member);
    return member;
  }

  public StringAttribute fieldText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fieldText");
    member.setName("field_text");
    useMember(member);
    return member;
  }

  public StringAttribute fieldIdNumber() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fieldIdNumber");
    member.setName("field_id_number");
    useMember(member);
    return member;
  }

  public StringAttribute fieldEmail() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_email");
    // member.setName("fieldEmail");
    member.setName("field_email");
    useMember(member);
    return member;
  }

  public StringAttribute fieldUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_url");
    // member.setName("fieldUrl");
    member.setName("field_url");
    useMember(member);
    return member;
  }

  public StringAttribute fieldOneOf() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("fieldOneOf");
    member.setName("field_one_of");
    useMember(member);
    return member;
  }

  public StringAttribute fieldSomeOf() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("fieldSomeOf");
    member.setName("field_some_of");
    useMember(member);
    return member;
  }

  public StringAttribute fieldLongtext() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("fieldLongtext");
    member.setName("field_longtext");
    useMember(member);
    return member;
  }

  public BooleanAttribute fieldBoolean() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("fieldBoolean");
    member.setName("field_boolean");
    useMember(member);
    return member;
  }

  public StringAttribute fieldImages() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("fieldImages");
    member.setName("field_images");
    useMember(member);
    return member;
  }

  public StringAttribute fieldImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("fieldImage");
    member.setName("field_image");
    useMember(member);
    return member;
  }

  public StringAttribute fieldFile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("fieldFile");
    member.setName("field_file");
    useMember(member);
    return member;
  }

  public DateTimeAttribute fieldDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("fieldDate");
    member.setName("field_date");
    useMember(member);
    return member;
  }

  public DateTimeAttribute fieldDatetime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("fieldDatetime");
    member.setName("field_datetime");
    useMember(member);
    return member;
  }

  public NumberAttribute fieldInteger() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("fieldInteger");
    member.setName("field_integer");
    useMember(member);
    return member;
  }

  public NumberAttribute fieldDecimal() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("fieldDecimal");
    member.setName("field_decimal");
    useMember(member);
    return member;
  }

  public NumberAttribute fieldMoney() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("fieldMoney");
    member.setName("field_money");
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
