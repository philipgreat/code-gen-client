package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class QrCodeStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.qrcodestatus.QrCodeStatus";
  }
  // 枚举对象
  public static EnumAttribute ACTIVE =
      new EnumAttribute("com.doublechaintech.repairchain.qrcodestatus.QrCodeStatus", "ACTIVE")
          .chineseName("已注册");
  public static EnumAttribute GRANTED =
      new EnumAttribute("com.doublechaintech.repairchain.qrcodestatus.QrCodeStatus", "GRANTED")
          .chineseName("已授权");
  public static EnumAttribute BOUND =
      new EnumAttribute("com.doublechaintech.repairchain.qrcodestatus.QrCodeStatus", "BOUND")
          .chineseName("已绑定");
  public static EnumAttribute RELEASED =
      new EnumAttribute("com.doublechaintech.repairchain.qrcodestatus.QrCodeStatus", "RELEASED")
          .chineseName("已解绑");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {ACTIVE, GRANTED, BOUND, RELEASED};
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

  public QrCode qrCodeList() {
    QrCode member = new QrCode();
    member.setModelTypeName("qr_code");
    member.setName("status");
    member.setMemberName("qrCodeList");
    member.setRelationName("status");
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
