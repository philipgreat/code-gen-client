package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class SystemLevelImages extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages";
  }
  // 枚举对象
  public static EnumAttribute INVITE_BG_IMAGE =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages",
              "INVITE_BG_IMAGE")
          .chineseName("背景图-邀请");
  public static EnumAttribute DEFAULT_FUNCTIONALITY =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages",
              "DEFAULT_FUNCTIONALITY")
          .chineseName("默认功能图片");
  public static EnumAttribute DEFAULT_CATEGORY =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages",
              "DEFAULT_CATEGORY")
          .chineseName("默认分类图片");
  public static EnumAttribute DEFAULT_PRODUCT =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages",
              "DEFAULT_PRODUCT")
          .chineseName("默认产品图片");
  public static EnumAttribute DEFAULT_SUPPLIER =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages",
              "DEFAULT_SUPPLIER")
          .chineseName("默认供应商图片");
  public static EnumAttribute DEFAULT_BRAND =
      new EnumAttribute(
              "com.doublechaintech.saleschain.systemlevelimages.SystemLevelImages", "DEFAULT_BRAND")
          .chineseName("默认品牌图片");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {
      INVITE_BG_IMAGE,
      DEFAULT_FUNCTIONALITY,
      DEFAULT_CATEGORY,
      DEFAULT_PRODUCT,
      DEFAULT_SUPPLIER,
      DEFAULT_BRAND
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
