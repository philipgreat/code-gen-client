package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class TryOnApplicationStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.tryonapplicationstatus.TryOnApplicationStatus";
  }
  // 枚举对象
  public static EnumAttribute PENDING =
      new EnumAttribute(
              "com.doublechaintech.saleschain.tryonapplicationstatus.TryOnApplicationStatus",
              "PENDING")
          .chineseName("未处理");
  public static EnumAttribute REJECTED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.tryonapplicationstatus.TryOnApplicationStatus",
              "REJECTED")
          .chineseName("拒绝");
  public static EnumAttribute ACCEPTED =
      new EnumAttribute(
              "com.doublechaintech.saleschain.tryonapplicationstatus.TryOnApplicationStatus",
              "ACCEPTED")
          .chineseName("接受");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {PENDING, REJECTED, ACCEPTED};
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

  public TryOnApplication tryOnApplicationList() {
    TryOnApplication member = new TryOnApplication();
    member.setModelTypeName("try_on_application");
    member.setName("status");
    member.setMemberName("tryOnApplicationList");
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

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
