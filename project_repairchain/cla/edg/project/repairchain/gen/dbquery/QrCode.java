package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class QrCode extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.qrcode.QrCode";
  }
  // 枚举对象

  // 引用的对象

  public QrCodeStatus status() {
    QrCodeStatus member = new QrCodeStatus();
    member.setModelTypeName("qr_code_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public Agent agent() {
    Agent member = new Agent();
    member.setModelTypeName("agent");
    member.setName("agent");
    member.setMemberName("agent");
    member.setReferDirection(true);
    member.setRelationName("agent");
    append(member);
    return member;
  }

  public Machine machine() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("machine");
    member.setMemberName("machine");
    member.setReferDirection(true);
    member.setRelationName("machine");
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

  public QrCodeOperationRecord qrCodeOperationRecordList() {
    QrCodeOperationRecord member = new QrCodeOperationRecord();
    member.setModelTypeName("qr_code_operation_record");
    member.setName("qr_code");
    member.setMemberName("qrCodeOperationRecordList");
    member.setRelationName("qrCode");
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

  public StringAttribute value() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_url");
    // member.setName("value");
    member.setName("value");
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
