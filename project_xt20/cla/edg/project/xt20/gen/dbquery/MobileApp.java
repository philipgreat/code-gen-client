package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MobileApp extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.mobileapp.MobileApp";
  }
  // 枚举对象

  // 引用的对象

  // 被引用的对象

  public SystemAnnouncement systemAnnouncementList() {
    SystemAnnouncement member = new SystemAnnouncement();
    member.setModelTypeName("system_announcement");
    member.setName("mobile_app");
    member.setMemberName("systemAnnouncementList");
    member.setRelationName("mobileApp");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GuideType guideTypeList() {
    GuideType member = new GuideType();
    member.setModelTypeName("guide_type");
    member.setName("app");
    member.setMemberName("guideTypeList");
    member.setRelationName("app");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GuideSlide guideSlideList() {
    GuideSlide member = new GuideSlide();
    member.setModelTypeName("guide_slide");
    member.setName("app");
    member.setMemberName("guideSlideList");
    member.setRelationName("app");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Page pageList() {
    Page member = new Page();
    member.setModelTypeName("page");
    member.setName("mobile_app");
    member.setMemberName("pageList");
    member.setRelationName("mobileApp");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public PageType pageTypeList() {
    PageType member = new PageType();
    member.setModelTypeName("page_type");
    member.setName("mobile_app");
    member.setMemberName("pageTypeList");
    member.setRelationName("mobileApp");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
