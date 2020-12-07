package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventProductComponent extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.eventproductcomponent.EventProductComponent";
  }
  // 枚举对象

  // 引用的对象

  public FillMedium component() {
    FillMedium member = new FillMedium();
    member.setModelTypeName("fill_medium");
    member.setName("component");
    member.setMemberName("component");
    member.setReferDirection(true);
    member.setRelationName("component");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public NumberAttribute rate() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rate");
    member.setName("rate");
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
