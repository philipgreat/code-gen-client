package cla.edg.project.xuntuexam.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class PublicKeyType extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xuntuexam.publickeytype.PublicKeyType";
  }
  // 枚举对象

  // 引用的对象

  public UserDomain domain() {
    UserDomain member = new UserDomain();
    member.setModelTypeName("user_domain");
    member.setName("domain");
    member.setMemberName("domain");
    member.setReferDirection(true);
    member.setRelationName("domain");
    append(member);
    return member;
  }

  // 被引用的对象

  public KeypairIdentity keypairIdentityList() {
    KeypairIdentity member = new KeypairIdentity();
    member.setModelTypeName("keypair_identity");
    member.setName("key_type");
    member.setMemberName("keypairIdentityList");
    member.setRelationName("keyType");
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

  public StringAttribute keyAlg() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("keyAlg");
    member.setName("key_alg");
    useMember(member);
    return member;
  }

  public StringAttribute signAlg() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("signAlg");
    member.setName("sign_alg");
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
