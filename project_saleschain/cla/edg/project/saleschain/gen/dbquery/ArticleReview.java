package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ArticleReview extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.articlereview.ArticleReview";
  }
  // 枚举对象

  // 引用的对象

  public Article article() {
    Article member = new Article();
    member.setModelTypeName("article");
    member.setName("article");
    member.setMemberName("article");
    member.setReferDirection(true);
    member.setRelationName("article");
    append(member);
    return member;
  }

  public MobileUser postBy() {
    MobileUser member = new MobileUser();
    member.setModelTypeName("mobile_user");
    member.setName("post_by");
    member.setMemberName("postBy");
    member.setReferDirection(true);
    member.setRelationName("postBy");
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

  public BooleanAttribute isReviewed() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("isReviewed");
    member.setName("is_reviewed");
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

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("comment");
    member.setName("comment");
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
