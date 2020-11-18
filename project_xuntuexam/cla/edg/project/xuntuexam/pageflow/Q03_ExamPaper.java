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
                .wants(MODEL.examinationPaper().competition())

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

                ;
    }
}
