package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UnitType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.unittype.UnitType";
  }
  // 枚举对象
  public static EnumAttribute INSTITUTION =
      new EnumAttribute("com.doublechaintech.saleschain.unittype.UnitType", "INSTITUTION")
          .chineseName("高校/院所");
  public static EnumAttribute ENTERPRISE =
      new EnumAttribute("com.doublechaintech.saleschain.unittype.UnitType", "ENTERPRISE")
          .chineseName("企业");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {INSTITUTION, ENTERPRISE};
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

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("unit_type");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("unitType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Demand demandList() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("unit_type");
    member.setMemberName("demandList");
    member.setRelationName("unitType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPostDemand eventPostDemandList() {
    EventPostDemand member = new EventPostDemand();
    member.setModelTypeName("event_post_demand");
    member.setName("unit_type");
    member.setMemberName("eventPostDemandList");
    member.setRelationName("unitType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventDomesticTrialApplication eventDomesticTrialApplicationList() {
    EventDomesticTrialApplication member = new EventDomesticTrialApplication();
    member.setModelTypeName("event_domestic_trial_application");
    member.setName("unit_type");
    member.setMemberName("eventDomesticTrialApplicationList");
    member.setRelationName("unitType");
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
