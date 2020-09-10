package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q5_Content extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.brandCase()).list_of("brand").pagination().with_string("brand id")
                    .comments("查询品牌的 质量服务 文章")
                    .do_it_as()
                        .where(MODEL.brandCase().brand().eq("${brand id}"))
                        .order_by(MODEL.brandCase().article().postDate()).desc()
                        .order_by(MODEL.brandCase().id()).desc()
                        .wants(MODEL.brandCase().article())

                .query(MODEL.supplierCase()).list_of("supplier").pagination().with_string("supplier id")
                    .comments("查询品牌的 质量服务 文章")
                    .do_it_as()
                        .where(MODEL.supplierCase().supplier().eq("${supplier id}"))
                        .order_by(MODEL.supplierCase().article().postDate()).desc()
                        .order_by(MODEL.supplierCase().id()).desc()
                        .wants(MODEL.supplierCase().article())


                .query(MODEL.knowledgeBase()).list_of("all").pagination()
                    .comments("查询知识库文章")
                    .do_it_as()
                        .where(MODEL.knowledgeBase().article().not_null())
                        .order_by(MODEL.knowledgeBase().article().postDate()).desc()
                        .order_by(MODEL.knowledgeBase().id()).desc()
                        .wants(MODEL.knowledgeBase().article())

                .query(MODEL.knowledgeBase()).list_of("searched by title").pagination().with_string("search key")
                    .comments("查询知识库文章")
                    .do_it_as()
                        .where(MODEL.knowledgeBase().article().not_null(),
                                MODEL.knowledgeBase().article().title().like("${search key}"))
                        .order_by(MODEL.knowledgeBase().article().postDate()).desc()
                        .order_by(MODEL.knowledgeBase().id()).desc()
                        .wants(MODEL.knowledgeBase().article())

                .query(MODEL.domesticTryOn()).list_of("all").pagination()
                    .comments("查询国产试用文章")
                    .do_it_as()
                        .where(MODEL.domesticTryOn().platform().not_null())
                        .order_by(MODEL.domesticTryOn().article().postDate()).desc()
                        .order_by(MODEL.domesticTryOn().id()).desc()
                        .wants(MODEL.domesticTryOn().article())

                .query(MODEL.domesticTryOn()).list_of("searched by title").pagination().with_string("search key")
                    .comments("查询国产试用文章")
                    .do_it_as()
                        .where(MODEL.domesticTryOn().article().not_null(),
                                MODEL.domesticTryOn().article().title().like("${search key}"))
                        .order_by(MODEL.domesticTryOn().article().postDate()).desc()
                        .order_by(MODEL.domesticTryOn().id()).desc()
                        .wants(MODEL.domesticTryOn().article())

                .query(MODEL.articleReview()).list_of("article").pagination().with_string("article id")
                    .comments("查询文章的评论")
                    .do_it_as()
                        .where(MODEL.articleReview().article().eq("${article id}"),
                                MODEL.articleReview().isReviewed().eq(true))
                        .order_by(MODEL.articleReview().createTime()).desc()
                        .order_by(MODEL.articleReview().id()).desc()
                        .wants(MODEL.articleReview().postBy())

                .query(MODEL.articleReview()).list_of("user knowledge base").pagination().with_string("user id")
                    .comments("用户提交的知识库文章评论")
                    .do_it_as()
                        .where(MODEL.articleReview().article().knowledgeBaseList().id().not_null(),
                                MODEL.articleReview().postBy().eq("${user id}"))
                        .order_by(MODEL.articleReview().createTime()).desc()
                        .order_by(MODEL.articleReview().id()).desc()
                        .wants(MODEL.articleReview().article().knowledgeBaseList())

                .query(MODEL.articleReview()).list_of("user domestic trail").pagination().with_string("user id")
                    .comments("用户提交的国产试用文章评论")
                    .do_it_as()
                        .where(MODEL.articleReview().article().domesticTryOnList().id().not_null(),
                                MODEL.articleReview().postBy().eq("${user id}"))
                        .order_by(MODEL.articleReview().createTime()).desc()
                        .order_by(MODEL.articleReview().id()).desc()
                        .wants(MODEL.articleReview().article().domesticTryOnList())

                ;
    }
}
