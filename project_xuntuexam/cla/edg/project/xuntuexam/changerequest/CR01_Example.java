package cla.edg.project.xuntuexam.changerequest;

import cla.edg.project.xuntuexam.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR01_Example implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("create competition").zh_CN("创建竞赛")
                .step("A").zh_CN("竞赛信息")
                    .contains_event("competition info").zh_CN("竞赛基本信息").as("G")
                        .has_field("title").zh_CN("标题")
                            .place_holder("请输入竞赛的标题")
                            .range(1, 20)
                        .has_field("start time").zh_CN("开始时间")
                            .place_holder("请输入答题开始时间")
                            .which_type_of(FieldType.DATE_TIME)
                        .has_field("end time").zh_CN("结束时间")
                            .place_holder("请输入答题截止时间")
                        .which_type_of(FieldType.DATE_TIME)

                .step("B").zh_CN("竞赛范围")
                    .contains_event("exam scope").zh_CN("选择题目类别")
                        .many_times(1,5).show_previous_event(2,2)
                        .has_field("scope").zh_CN("题目类别")
                            .which_model_of(MODEL.questionCategory())
                            .values_can_select_from_query_by(null)
                        .has_field("number").zh_CN("题目数量")
                            .place_holder("出几道题")
                            .defaule_value(2)
                            .range(1, 40)

                ;
    }

}
