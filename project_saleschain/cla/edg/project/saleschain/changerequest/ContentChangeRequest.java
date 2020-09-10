package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class ContentChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("review domestic article").zh_CN("国产试用评论")
                    .contains_event("review article").zh_CN("发表评论")
                        .has_field("article type").zh_CN("文章类型")
                            .value(MODEL.domesticTryOn().getInternalType()).hidden()
                        .has_field("article title").zh_CN("标题")
                            .fill_by_request("article id", MODEL.article().title())
                            .display()
                        .has_field("article").zh_CN("文章")
                            .fill_by_request("article id").which_model_of(MODEL.article())
                            .hidden()
                        .has_field("comment").zh_CN("评论内容")
                            .range(1,500)
                            .which_type_of(FieldType.MULTI_TEXT)



                .change_request("review knowledge base article").zh_CN("知识库评论")
                    .contains_event("review article")
                        .has_field("article type").zh_CN("文章类型")
                            .value(MODEL.knowledgeBase().getInternalType()).hidden()
                ;
    }

}
