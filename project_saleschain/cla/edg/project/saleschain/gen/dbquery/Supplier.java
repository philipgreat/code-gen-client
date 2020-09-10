package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Supplier extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.supplier.Supplier";
  }
  // 枚举对象

  // 引用的对象

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

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("supplier");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplierCase supplierCaseList() {
    SupplierCase member = new SupplierCase();
    member.setModelTypeName("supplier_case");
    member.setName("supplier");
    member.setMemberName("supplierCaseList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplierAvailableCity supplierAvailableCityList() {
    SupplierAvailableCity member = new SupplierAvailableCity();
    member.setModelTypeName("supplier_available_city");
    member.setName("supplier");
    member.setMemberName("supplierAvailableCityList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Product productList() {
    Product member = new Product();
    member.setModelTypeName("product");
    member.setName("supplier");
    member.setMemberName("productList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposal demandProposalList() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("supplier");
    member.setMemberName("demandProposalList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DemandProposalTrade demandProposalTradeList() {
    DemandProposalTrade member = new DemandProposalTrade();
    member.setModelTypeName("demand_proposal_trade");
    member.setName("supplier");
    member.setMemberName("demandProposalTradeList");
    member.setRelationName("supplier");
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

  public StringAttribute supplierIntroduce() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("supplierIntroduce");
    member.setName("supplier_introduce");
    useMember(member);
    return member;
  }

  public StringAttribute qualityShow() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("qualityShow");
    member.setName("quality_show");
    useMember(member);
    return member;
  }

  public StringAttribute adminMobile() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_china_mobile_phone");
    // member.setName("adminMobile");
    member.setName("admin_mobile");
    useMember(member);
    return member;
  }

  public NumberAttribute displayOrder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("displayOrder");
    member.setName("display_order");
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
