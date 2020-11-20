package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Slide extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.slide.Slide";
  }
  // 枚举对象

  // 引用的对象

  public Page page() {
    Page member = new Page();
    member.setModelTypeName("page");
    member.setName("page");
    member.setMemberName("page");
    member.setReferDirection(true);
    member.setRelationName("page");
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

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
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

  public StringAttribute imageUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("imageUrl");
    member.setName("image_url");
    useMember(member);
    return member;
  }

  public StringAttribute videoUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("videoUrl");
    member.setName("video_url");
    useMember(member);
    return member;
  }

  public StringAttribute linkToUrl() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("linkToUrl");
    member.setName("link_to_url");
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
