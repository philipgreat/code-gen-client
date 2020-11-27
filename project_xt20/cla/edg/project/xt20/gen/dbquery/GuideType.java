package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class GuideType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.guidetype.GuideType";
  }
  // 枚举对象
  public static EnumAttribute NEW_SELLER =
      new EnumAttribute("com.doublechaintech.xt20.guidetype.GuideType", "NEW_SELLER")
          .chineseName("新卖家");
  public static EnumAttribute SELLER =
      new EnumAttribute("com.doublechaintech.xt20.guidetype.GuideType", "SELLER").chineseName("卖家");
  public static EnumAttribute NEW_BUYER =
      new EnumAttribute("com.doublechaintech.xt20.guidetype.GuideType", "NEW_BUYER")
          .chineseName("新买家");
  public static EnumAttribute BUYER =
      new EnumAttribute("com.doublechaintech.xt20.guidetype.GuideType", "BUYER").chineseName("买家");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {NEW_SELLER, SELLER, NEW_BUYER, BUYER};
  }

  // 引用的对象

  public MobileApp app() {
    MobileApp member = new MobileApp();
    member.setModelTypeName("mobile_app");
    member.setName("app");
    member.setMemberName("app");
    member.setReferDirection(true);
    member.setRelationName("app");
    append(member);
    return member;
  }

  // 被引用的对象

  public GuideSlide guideSlideList() {
    GuideSlide member = new GuideSlide();
    member.setModelTypeName("guide_slide");
    member.setName("guide_type");
    member.setMemberName("guideSlideList");
    member.setRelationName("guideType");
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
