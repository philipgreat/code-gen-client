package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DomesticTryOn extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.domestictryon.DomesticTryOn";
  }
  // 枚举对象

  // 引用的对象

  public Article article() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("article");
    member.setMemberName("article");
    member.setReferDirection(true);
    member.setRelationName("article");
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

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("domestic_try_on");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("domesticTryOn");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventDomesticTrialApplication eventDomesticTrialApplicationList() {
    EventDomesticTrialApplication member = new EventDomesticTrialApplication();
    member.setModelTypeName("event_domestic_trial_application");
    member.setName("domestic_try_on");
    member.setMemberName("eventDomesticTrialApplicationList");
    member.setRelationName("domesticTryOn");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
