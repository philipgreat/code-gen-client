package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MerchantType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.merchanttype.MerchantType";
  }
  // 枚举对象
  public static EnumAttribute PERSONAL =
      new EnumAttribute("com.doublechaintech.xt20.merchanttype.MerchantType", "PERSONAL")
          .chineseName("PERSONAL");
  public static EnumAttribute ORGANIZATION =
      new EnumAttribute("com.doublechaintech.xt20.merchanttype.MerchantType", "ORGANIZATION")
          .chineseName("ORGANIZATION");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PERSONAL, ORGANIZATION};
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
    member.setName("merchant_type");
    member.setMemberName("merchantList");
    member.setRelationName("merchantType");
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
