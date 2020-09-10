package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ListAccess extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.listaccess.ListAccess";
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

  public StringAttribute internalName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("internalName");
    member.setName("internal_name");
    useMember(member);
    return member;
  }

  public BooleanAttribute readPermission() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("readPermission");
    member.setName("read_permission");
    useMember(member);
    return member;
  }

  public BooleanAttribute createPermission() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("createPermission");
    member.setName("create_permission");
    useMember(member);
    return member;
  }

  public BooleanAttribute deletePermission() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("deletePermission");
    member.setName("delete_permission");
    useMember(member);
    return member;
  }

  public BooleanAttribute updatePermission() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("updatePermission");
    member.setName("update_permission");
    useMember(member);
    return member;
  }

  public BooleanAttribute executionPermission() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("executionPermission");
    member.setName("execution_permission");
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
