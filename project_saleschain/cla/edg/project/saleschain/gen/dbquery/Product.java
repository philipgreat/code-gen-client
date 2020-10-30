package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Product extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.product.Product";
  }
  // 枚举对象

  // 引用的对象

  public Category category() {
    Category member = new Category();
    member.setModelTypeName("category");
    member.setName("category");
    member.setMemberName("category");
    member.setReferDirection(true);
    member.setRelationName("category");
    append(member);
    return member;
  }

  public Brand brand() {
    Brand member = new Brand();
    member.setModelTypeName("brand");
    member.setName("brand");
    member.setMemberName("brand");
    member.setReferDirection(true);
    member.setRelationName("brand");
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

  // 被引用的对象

  public DomesticTryOn domesticTryOnList() {
    DomesticTryOn member = new DomesticTryOn();
    member.setModelTypeName("domestic_try_on");
    member.setName("product");
    member.setMemberName("domesticTryOnList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("product");
    member.setMemberName("tryOnApplicationList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SearchAssistantContext searchAssistantContextList() {
    SearchAssistantContext member = new SearchAssistantContext();
    member.setModelTypeName("search_assistant_context");
    member.setName("product");
    member.setMemberName("searchAssistantContextList");
    member.setRelationName("product");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventDomesticTrialApplication eventDomesticTrialApplicationList() {
    EventDomesticTrialApplication member = new EventDomesticTrialApplication();
    member.setModelTypeName("event_domestic_trial_application");
    member.setName("product");
    member.setMemberName("eventDomesticTrialApplicationList");
    member.setRelationName("product");
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

  public StringAttribute productCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("productCode");
    member.setName("product_code");
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

  public StringAttribute spec() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("spec");
    member.setName("spec");
    useMember(member);
    return member;
  }

  public StringAttribute listPrice() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("listPrice");
    member.setName("list_price");
    useMember(member);
    return member;
  }

  public StringAttribute deliveryTime() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("deliveryTime");
    member.setName("delivery_time");
    useMember(member);
    return member;
  }

  public StringAttribute brief() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("brief");
    member.setName("brief");
    useMember(member);
    return member;
  }

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("description");
    member.setName("description");
    useMember(member);
    return member;
  }

  public StringAttribute coverImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("coverImage");
    member.setName("cover_image");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public StringAttribute quality() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("quality");
    member.setName("quality");
    useMember(member);
    return member;
  }

  public NumberAttribute bonusPoint() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("bonusPoint");
    member.setName("bonus_point");
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
