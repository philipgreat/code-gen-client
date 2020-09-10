package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TryOnApplication extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.tryonapplication.TryOnApplication";
  }
  // 枚举对象

  // 引用的对象

  public TryOnApplicationStatus status() {
    TryOnApplicationStatus member = new TryOnApplicationStatus();
    member.setModelTypeName("try_on_application_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  public DomesticTryOn domesticTryOn() {
    DomesticTryOn member = new DomesticTryOn();
    member.setModelTypeName("domestic_try_on");
    member.setName("domestic_try_on");
    member.setMemberName("domesticTryOn");
    member.setReferDirection(true);
    member.setRelationName("domesticTryOn");
    append(member);
    return member;
  }

  public UnitType unitType() {
    UnitType member = new UnitType();
    member.setModelTypeName("unit_type");
    member.setName("unit_type");
    member.setMemberName("unitType");
    member.setReferDirection(true);
    member.setRelationName("unitType");
    append(member);
    return member;
  }

  public MobileUser submitter() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("submitter");
    member.setMemberName("submitter");
    member.setReferDirection(true);
    member.setRelationName("submitter");
    append(member);
    return member;
  }

  public Supplier supplier() {
    Supplier member = new Supplier();
    member.setModelTypeName("supplier");
    member.setName("supplier");
    member.setMemberName("supplier");
    member.setReferDirection(true);
    member.setRelationName("supplier");
    append(member);
    return member;
  }

  public Product product() {
    Product member = new Product();
    member.setModelTypeName("product");
    member.setName("product");
    member.setMemberName("product");
    member.setReferDirection(true);
    member.setRelationName("product");
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

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute applicantName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("applicantName");
    member.setName("applicant_name");
    useMember(member);
    return member;
  }

  public StringAttribute contactMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("contactMobile");
    member.setName("contact_mobile");
    useMember(member);
    return member;
  }

  public StringAttribute unitName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("unitName");
    member.setName("unit_name");
    useMember(member);
    return member;
  }

  public StringAttribute researchGroup() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("researchGroup");
    member.setName("research_group");
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
