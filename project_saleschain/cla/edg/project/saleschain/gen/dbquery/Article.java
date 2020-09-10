package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Article extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.article.Article";
  }
  // 枚举对象

  // 引用的对象

  public ArticleType articleType() {
    ArticleType member = new ArticleType();
    member.setModelTypeName("article_type");
    member.setName("article_type");
    member.setMemberName("articleType");
    member.setReferDirection(true);
    member.setRelationName("articleType");
    append(member);
    return member;
  }

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

  public KnowledgeBase knowledgeBaseList() {
    KnowledgeBase member = new KnowledgeBase();
    member.setModelTypeName("knowledge_base");
    member.setName("article");
    member.setMemberName("knowledgeBaseList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArticleReview articleReviewList() {
    ArticleReview member = new ArticleReview();
    member.setModelTypeName("article_review");
    member.setName("article");
    member.setMemberName("articleReviewList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public ArticleFavoritesRecord articleFavoritesRecordList() {
    ArticleFavoritesRecord member = new ArticleFavoritesRecord();
    member.setModelTypeName("article_favorites_record");
    member.setName("article");
    member.setMemberName("articleFavoritesRecordList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DomesticTryOn domesticTryOnList() {
    DomesticTryOn member = new DomesticTryOn();
    member.setModelTypeName("domestic_try_on");
    member.setName("article");
    member.setMemberName("domesticTryOnList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplierCase supplierCaseList() {
    SupplierCase member = new SupplierCase();
    member.setModelTypeName("supplier_case");
    member.setName("article");
    member.setMemberName("supplierCaseList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public BrandCase brandCaseList() {
    BrandCase member = new BrandCase();
    member.setModelTypeName("brand_case");
    member.setName("article");
    member.setMemberName("brandCaseList");
    member.setRelationName("article");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventReviewArticle eventReviewArticleList() {
    EventReviewArticle member = new EventReviewArticle();
    member.setModelTypeName("event_review_article");
    member.setName("article");
    member.setMemberName("eventReviewArticleList");
    member.setRelationName("article");
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

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public DateTimeAttribute postDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("postDate");
    member.setName("post_date");
    useMember(member);
    return member;
  }

  public StringAttribute coverImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("coverImage");
    member.setName("cover_image");
    useMember(member);
    return member;
  }

  public StringAttribute content() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("content");
    member.setName("content");
    useMember(member);
    return member;
  }

  public NumberAttribute pageViewCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("pageViewCount");
    member.setName("page_view_count");
    useMember(member);
    return member;
  }

  public NumberAttribute reviewCount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("reviewCount");
    member.setName("review_count");
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
