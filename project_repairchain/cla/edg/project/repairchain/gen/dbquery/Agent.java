package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Agent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.agent.Agent";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser personalUser() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("personal_user");
    member.setMemberName("personalUser");
    member.setReferDirection(true);
    member.setRelationName("personalUser");
    append(member);
    return member;
  }

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
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

  public QrCode qrCodeList() {
    QrCode member = new QrCode();
    member.setModelTypeName("qr_code");
    member.setName("agent");
    member.setMemberName("qrCodeList");
    member.setRelationName("agent");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FactoryAgency factoryAgencyList() {
    FactoryAgency member = new FactoryAgency();
    member.setModelTypeName("factory_agency");
    member.setName("agent");
    member.setMemberName("factoryAgencyList");
    member.setRelationName("agent");
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

  public StringAttribute logo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("logo");
    member.setName("logo");
    useMember(member);
    return member;
  }

  public StringAttribute bannerImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("bannerImage");
    member.setName("banner_image");
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
