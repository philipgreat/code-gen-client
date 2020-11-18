package cla.edg.project.xuntuexam.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xuntuexam.gen.dbquery.CompetitionStatus;
import cla.edg.project.xuntuexam.gen.dbquery.ExamPaperStatus;
import cla.edg.project.xuntuexam.gen.dbquery.MODEL;

public class Q01_Competition extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.competition()).list_of("all open").pagination()
                .comments("查询所有可开放的竞赛")     // 为了有趣起见,目前全部开放, 除了已经取消的
                .do_it_as()
                .where(MODEL.competition().competitionStatus().not(CompetitionStatus.CANCELLED))


            .query(MODEL.examinationQuestion()).list_of("category").with_string("category id").with_integer("number")
                .comments("查找某个类型的若干道题目")
                .do_it_as()
                .where(MODEL.examinationQuestion().questionCategory().eq("${category id}"))
                .top("${number}")
                .order_by("10000 * rand()")


                ;
    }
}
