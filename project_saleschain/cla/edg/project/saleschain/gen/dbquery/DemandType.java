package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DemandType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.demandtype.DemandType";
  }
  // 枚举对象

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

  public Demand demandList() {
    Demand member = new Demand();
    member.setModelTypeName("demand");
    member.setName("demand_type");
    member.setMemberName("demandList");
    member.setRelationName("demandType");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventPostDemand eventPostDemandList() {
    EventPostDemand member = new EventPostDemand();
    member.setModelTypeName("event_post_demand");
    member.setName("type");
    member.setMemberName("eventPostDemandList");
    member.setRelationName("type");
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
