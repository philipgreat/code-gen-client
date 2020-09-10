package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PageType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.pagetype.PageType";
  }
  // 枚举对象
  public static EnumAttribute HOME =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "HOME")
          .chineseName("首页");
  public static EnumAttribute ME =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "ME")
          .chineseName("我的");
  public static EnumAttribute GENERIC_PAGE =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "GENERIC_PAGE")
          .chineseName("Generic Page");
  public static EnumAttribute LISTOF_PAGE =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "LISTOF_PAGE")
          .chineseName("Listof Page");
  public static EnumAttribute SERVICE_CENTER =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "SERVICE_CENTER")
          .chineseName("功能大厅");
  public static EnumAttribute SIMPLE =
      new EnumAttribute("com.doublechaintech.repairchain.pagetype.PageType", "SIMPLE")
          .chineseName("普通");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {HOME, ME, GENERIC_PAGE, LISTOF_PAGE, SERVICE_CENTER, SIMPLE};
  }

  // 引用的对象

  public MobileApp mobileApp() {
    MobileApp member = new MobileApp();
    member.setModelTypeName("mobile_app");
    member.setName("mobile_app");
    member.setMemberName("mobileApp");
    member.setReferDirection(true);
    member.setRelationName("mobileApp");
    append(member);
    return member;
  }

  // 被引用的对象

  public Page pageList() {
    Page member = new Page();
    member.setModelTypeName("page");
    member.setName("page_type");
    member.setMemberName("pageList");
    member.setRelationName("pageType");
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

  public BooleanAttribute footerTab() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("footerTab");
    member.setName("footer_tab");
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
