package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Demand extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demand.Demand";
  }
  // 枚举对象

  // 引用的对象

  public DemandType demandType() {
    DemandType member = new DemandType();
    member.setModelTypeName("demand_type");
    member.setName("demand_type");
    member.setMemberName("demandType");
    member.setReferDirection(true);
    member.setRelationName("demandType");
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

  public DemandStatus demandStatus() {
    DemandStatus member = new DemandStatus();
    member.setModelTypeName("demand_status");
    member.setName("demand_status");
    member.setMemberName("demandStatus");
    member.setReferDirection(true);
    member.setRelationName("demandStatus");
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

  public DemandProposal demandProposalList() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("demand");
    member.setMemberName("demandProposalList");
    member.setRelationName("demand");
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

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
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

  public StringAttribute demandContent() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("demandContent");
    member.setName("demand_content");
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
