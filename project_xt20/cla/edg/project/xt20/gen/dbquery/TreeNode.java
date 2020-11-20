package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TreeNode extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.treenode.TreeNode";
  }
  // 枚举对象

  // 引用的对象

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

  public StringAttribute nodeId() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("nodeId");
    member.setName("node_id");
    useMember(member);
    return member;
  }

  public StringAttribute nodeType() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("nodeType");
    member.setName("node_type");
    useMember(member);
    return member;
  }

  public NumberAttribute leftValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("leftValue");
    member.setName("left_value");
    useMember(member);
    return member;
  }

  public NumberAttribute rightValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("rightValue");
    member.setName("right_value");
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
