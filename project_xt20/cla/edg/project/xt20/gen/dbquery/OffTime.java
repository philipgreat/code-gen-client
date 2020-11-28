package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class OffTime extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.offtime.OffTime";
  }
  // 枚举对象
  public static EnumAttribute H14_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H14_00").chineseName("14:00");
  public static EnumAttribute H15_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H15_00").chineseName("15:00");
  public static EnumAttribute H16_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H16_00").chineseName("16:00");
  public static EnumAttribute H17_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H17_00").chineseName("17:00");
  public static EnumAttribute H18_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H18_00").chineseName("18:00");
  public static EnumAttribute H19_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H19_00").chineseName("19:00");
  public static EnumAttribute H20_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H20_00").chineseName("20:00");
  public static EnumAttribute H21_00 =
      new EnumAttribute("com.doublechaintech.xt20.offtime.OffTime", "H21_00").chineseName("21:00");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {H14_00, H15_00, H16_00, H17_00, H18_00, H19_00, H20_00, H21_00};
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

  public Merchant merchantList() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("off_time");
    member.setMemberName("merchantList");
    member.setRelationName("offTime");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventUpdateMerchantOffTime eventUpdateMerchantOffTimeList() {
    EventUpdateMerchantOffTime member = new EventUpdateMerchantOffTime();
    member.setModelTypeName("event_update_merchant_off_time");
    member.setName("off_time");
    member.setMemberName("eventUpdateMerchantOffTimeList");
    member.setRelationName("offTime");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
