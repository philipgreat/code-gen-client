package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class QuickLink extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.quicklink.QuickLink";
  }
  // 枚举对象

  // 引用的对象

  public UserApp app() {
    UserApp member = new UserApp();
    member.setModelTypeName("user_app");
    member.setName("app");
    member.setMemberName("app");
    member.setReferDirection(true);
    member.setRelationName("app");
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

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("icon");
    member.setName("icon");
    useMember(member);
    return member;
  }

  public StringAttribute imagePath() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("imagePath");
    member.setName("image_path");
    useMember(member);
    return member;
  }

  public StringAttribute linkTarget() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("linkTarget");
    member.setName("link_target");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
