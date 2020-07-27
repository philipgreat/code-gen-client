package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class ContentChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("review domestic article").zh_CN("国产试用评论")
                    .contains_event("review article").zh_CN("发表评论")
                        .has_field("article").zh_CN("文章")


                .change_request("review knowledge base article").zh_CN("知识库评论")
                    .contains_event("review article")
                ;
    }

}
