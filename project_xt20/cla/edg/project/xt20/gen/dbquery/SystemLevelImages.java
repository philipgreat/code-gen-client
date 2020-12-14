package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelImages extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages";
  }
  // 枚举对象
  public static EnumAttribute PERSONAL_AVATAR =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "PERSONAL_AVATAR")
          .chineseName("默认用户头像");
  public static EnumAttribute FACTORY_LOGO =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "FACTORY_LOGO")
          .chineseName("默认工厂图片");
  public static EnumAttribute PLATFORM_BANNER =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "PLATFORM_BANNER")
          .chineseName("平台推广图片");
  public static EnumAttribute SELLER_BANNER =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "SELLER_BANNER")
          .chineseName("我要卖气");
  public static EnumAttribute BUYER_BANNER =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "BUYER_BANNER")
          .chineseName("我要买气");
  public static EnumAttribute ACTION_ICON =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "ACTION_ICON")
          .chineseName("默认按钮图片");
  public static EnumAttribute INVITE_COLLEAGUE =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "INVITE_COLLEAGUE")
          .chineseName("邀请同事");
  public static EnumAttribute INVITE_CUSTOMER =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "INVITE_CUSTOMER")
          .chineseName("邀请客户");
  public static EnumAttribute CSR_ORDER =
      new EnumAttribute("com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "CSR_ORDER")
          .chineseName("代下订单");
  public static EnumAttribute SHARE_TO_SUPPLIER =
      new EnumAttribute(
              "com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "SHARE_TO_SUPPLIER")
          .chineseName("分享给供应商");
  public static EnumAttribute SHARE_APP =
      new EnumAttribute("com.doublechaintech.xt20.systemlevelimages.SystemLevelImages", "SHARE_APP")
          .chineseName("分享");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      PERSONAL_AVATAR,
      FACTORY_LOGO,
      PLATFORM_BANNER,
      SELLER_BANNER,
      BUYER_BANNER,
      ACTION_ICON,
      INVITE_COLLEAGUE,
      INVITE_CUSTOMER,
      CSR_ORDER,
      SHARE_TO_SUPPLIER,
      SHARE_APP
    };
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

  public StringAttribute value() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("value");
    member.setName("value");
    useMember(member);
    return member;
  }

  public StringAttribute linkToUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_url");
    // member.setName("linkToUrl");
    member.setName("link_to_url");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
