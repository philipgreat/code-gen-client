package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class QrCodeOperationRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.qrcodeoperationrecord.QrCodeOperationRecord";
  }
  // 枚举对象

  // 引用的对象

  public QrCode qrCode() {
    QrCode member = new QrCode();
    member.setModelTypeName("qr_code");
    member.setName("qr_code");
    member.setMemberName("qrCode");
    member.setReferDirection(true);
    member.setRelationName("qrCode");
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

  public StringAttribute details() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("details");
    member.setName("details");
    useMember(member);
    return member;
  }

  public StringAttribute executor() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("executor");
    member.setName("executor");
    useMember(member);
    return member;
  }

  public StringAttribute machine() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machine");
    member.setName("machine");
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
