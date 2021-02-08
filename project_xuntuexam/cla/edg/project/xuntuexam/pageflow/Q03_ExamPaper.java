package cla.edg.project.xuntuexam.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xuntuexam.gen.dbquery.CompetitionStatus;
import cla.edg.project.xuntuexam.gen.dbquery.ExamPaperStatus;
import cla.edg.project.xuntuexam.gen.dbquery.MODEL;

public class Q03_ExamPaper extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .find(MODEL.examinationPaper()).which("user in competition").with_string("competition id").with_string("merchant id")
                .comments("查看用户在某场竞赛中的最后一次答题记录")
                .do_it_as()
                .where(MODEL.examinationPaper().examinee().eq("${merchant id}"),
                        MODEL.examinationPaper().competition().eq("${competition id}"),
                        MODEL.examinationPaper().examPaperStatus().not(ExamPaperStatus.CANCELLED)
                )
                .wants(MODEL.examinationPaper().competition(),
                        MODEL.examinationPaper().examPaperStatus(),
                        MODEL.examinationPaper().examinationAnswerList())

            .find(MODEL.examinationPaper()).which("doing in competition").with_string("competition id").with_string("merchant id")
                .comments("根据用户和竞赛,找到还未答完的试卷")
                .do_it_as()
                .where(MODEL.examinationPaper().competition().eq("${competition id}"),
                        MODEL.examinationPaper().examinee().eq("${merchant id}"),
                        MODEL.examinationPaper().examPaperStatus().eq(ExamPaperStatus.ANSWERING)
                )
                .wants(MODEL.examinationPaper().competition(), MODEL.examinationPaper().examinationAnswerList().question())

            .find(MODEL.examinationPaper()).which("by id").with_string("paper id")
                .comments("根据ID加载试卷")
                .do_it_as()
                .where(MODEL.examinationPaper().id().eq("${paper id}"))
                .wants(MODEL.examinationPaper().examinationAnswerList())

            .find(MODEL.examinationPaper()).which("best in competition of user").with_string("competition id").with_string("merchant id")
                .comments("找出用户在某个竞赛中的最好成绩")
                .do_it_as()
                .where(MODEL.examinationPaper().examinee().eq("${merchant id}"),
                        MODEL.examinationPaper().competition().eq("${competition id}"))
                .order_by(MODEL.examinationPaper().score()).desc()
                .order_by("TIMESTAMPDIFF(SECOND, T1.create_time,T1.last_update_time) asc")

            .query(MODEL.examinationPaper()).list_of("user competition").with_string("competition id").with_string("merchant id")
                .comments("查询用户的历史成绩")
                .do_it_as()
                .where(MODEL.examinationPaper().examinee().eq("${merchant id}"),
                        MODEL.examinationPaper().competition().eq("${competition id}"))


            .query(MODEL.examinationQuestion()).list_of("all").pagination()
                .comments("加载所有的题目")
                .do_it_as()
                .where(MODEL.examinationQuestion().platform().not_null())
                .wants(MODEL.examinationQuestion().questionCategory())


            .query(MODEL.examinationPaper()).list_of("prepared empty for competition").with_string("competition id")
                .comments("查询竞赛的已经创建的空试卷")
                .do_it_as()
                .where(MODEL.examinationPaper().competition().eq("${competition id}"),
                        MODEL.examinationPaper().examinee().is_null())
                .top_10()
                .wants(MODEL.examinationPaper().examPaperStatus())
                ;


    }
}
