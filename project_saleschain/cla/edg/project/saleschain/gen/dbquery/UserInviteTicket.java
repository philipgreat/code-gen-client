package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class UserInviteTicket extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.userinviteticket.UserInviteTicket";
  }
  // 枚举对象

  // 引用的对象

  public MobileUser user() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
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

  public StringAttribute qrCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("qrCode");
    member.setName("qr_code");
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
