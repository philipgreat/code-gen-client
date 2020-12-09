package cla.edg.project.xuntuexam.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xuntuexam.gen.dbquery.CompetitionStatus;
import cla.edg.project.xuntuexam.gen.dbquery.ExamPaperStatus;
import cla.edg.project.xuntuexam.gen.dbquery.MODEL;

public class Q02_ExamResult extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.validExamRecord()).list_of("user related").with_string("merchant id")
                .comments("查询用户参与的考试成绩")
                .do_it_as()
                .where(MODEL.validExamRecord().examinationPaper().examPaperStatus().eq(ExamPaperStatus.FINISHED),
                        MODEL.examinationPaper().examinee().eq("${merchant id}"),
                        MODEL.validExamRecord().competition().competitionStatus().eq(CompetitionStatus.AUTO)
                )
                .order_by(MODEL.validExamRecord().lastUpdateTime()).desc()
                .wants(MODEL.validExamRecord().competition())


            .query(MODEL.validExamRecord()).list_of("competition top5").with_string("competition id")
                .comments("查看竞赛的top5成绩")
                .do_it_as()
                .where(MODEL.validExamRecord().competition().eq("${competition id}"))
                .order_by(MODEL.validExamRecord().score()).desc()
                .order_by(MODEL.validExamRecord().lastUpdateTime()).asc()
                .top_5()
                .wants(MODEL.validExamRecord().examinee().personalUserList())

            .query(MODEL.validExamRecord()).list_of("competition").pagination().with_string("competition id")
                .comments("查看竞赛的所有成绩")
                .do_it_as()
                .where(MODEL.validExamRecord().competition().eq("${competition id}"))
                .order_by(MODEL.validExamRecord().score()).desc()
                .order_by(MODEL.validExamRecord().lastUpdateTime()).asc()
                .wants(MODEL.validExamRecord().examinee().personalUserList())

            .find(MODEL.validExamRecord()).which("user in competition").with_string("competition id").with_string("merchant id")
                .comments("找到用户在某个竞赛中的成绩记录")
                .do_it_as()
                .where(MODEL.validExamRecord().competition().eq("${competition id}"),
                        MODEL.validExamRecord().examinee().eq("${merchant id}"))
                .wants(MODEL.validExamRecord().examinationPaper().competition(),
                        MODEL.validExamRecord().examinee().personalUserList())

            .find(MODEL.validExamRecord()).which("for competition").with_string("competition id").with_integer("score").with_date("finish time")
                .comments("统计某个考试中,排名在我之前(根据之前查询出来的分数和完成时间)的有效成绩数量")
                .do_it_as().count()
                .where(MODEL.validExamRecord().competition().eq("${competition id}"),
                        MODEL.validExamRecord().score().bigger("${score}")
                        .or(MODEL.validExamRecord().score().eq("${score}").and(MODEL.validExamRecord().endTime().before("${finish time}")))
                )


            .find(MODEL.examinationAnswer()).which("correct").with_string("paper id")
                .comments("统计试卷中答对的答案")
                .do_it_as().count()
                .where(MODEL.examinationAnswer().examinationPaper().eq("${paper id}"),
                        MODEL.examinationAnswer().answerResult().eq(MODEL.examinationAnswer().rightResult()))

            .find(MODEL.examinationAnswer()).which("of paper").with_string("paper id")
                .comments("统计试卷中一共有几道题")
                .do_it_as().count()
                .where(MODEL.examinationAnswer().examinationPaper().eq("${paper id}"))

            .find(MODEL.examinationAnswer()).which("not answered in paper").with_string("paper id")
                .comments("统计试卷中一共有几道题还没有答")
                .do_it_as().count()
                .where(MODEL.examinationAnswer().examinationPaper().eq("${paper id}"),
                        MODEL.examinationAnswer().answerResult().is_null())
                ;
    }
}
