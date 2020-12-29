package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DeliverTaskStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.delivertaskstatus.DeliverTaskStatus";
  }
  // 枚举对象
  public static EnumAttribute PENDING =
      new EnumAttribute("com.doublechaintech.xt20.delivertaskstatus.DeliverTaskStatus", "PENDING")
          .chineseName("待配送");
  public static EnumAttribute SHIPPING =
      new EnumAttribute("com.doublechaintech.xt20.delivertaskstatus.DeliverTaskStatus", "SHIPPING")
          .chineseName("配送中");
  public static EnumAttribute RETURNING =
      new EnumAttribute("com.doublechaintech.xt20.delivertaskstatus.DeliverTaskStatus", "RETURNING")
          .chineseName("待确认");
  public static EnumAttribute COMPLETED =
      new EnumAttribute("com.doublechaintech.xt20.delivertaskstatus.DeliverTaskStatus", "COMPLETED")
          .chineseName("已完成");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PENDING, SHIPPING, RETURNING, COMPLETED};
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

  public DeliverTask deliverTaskList() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("status");
    member.setMemberName("deliverTaskList");
    member.setRelationName("status");
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

  public StringAttribute description() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("description");
    member.setName("description");
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
