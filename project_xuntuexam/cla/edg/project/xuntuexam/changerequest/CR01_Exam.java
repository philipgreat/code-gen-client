package cla.edg.project.xuntuexam.changerequest;

import cla.edg.project.xuntuexam.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR01_Exam implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("create competition").zh_CN("创建竞赛")
                .step("A").zh_CN("竞赛信息")
                    .contains_event("competition info").zh_CN("竞赛基本信息").as("G")
                        .has_field("unit name").zh_CN("单位名称")
                            .place_holder("请输入单位名称")
                            .range(1, 40)
                        .has_field("title").zh_CN("标题")
                            .place_holder("请输入竞赛的标题")
                            .range(1, 20)
                        .has_field("m1").zh_CN("提示信息")
                            .value("参加竞赛者,需输入'进入码'才能开始答题")
                            .display()
                        .has_field("code").zh_CN("进入码")
                            .place_holder("4~6位数字")
                            .which_type_of(FieldType.INTEGER)
                            .defaule_value("1234")
                            .range(1000,999999)
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
                            .input_at_next_line()
                        .has_field("number").zh_CN("题目数量")
                            .which_type_of(FieldType.INTEGER)
                            .place_holder("出几道题")
                            .defaule_value(20)
                            .range(1, 40)


            .change_request("create competition on step").zh_CN("创建竞赛")
                .step("A").zh_CN("创建竞赛")
                    .contains_event("create competition").zh_CN("创建竞赛").as("G")
                        .has_field("unit name").zh_CN("单位名称")
                            .place_holder("请输入单位名称")
                            .range(1, 40)
                        .has_field("title").zh_CN("标题")
                            .place_holder("请输入竞赛的标题")
                            .range(1, 20)
                        .has_field("start time").zh_CN("开始时间")
                            .place_holder("请输入答题开始时间")
                            .which_type_of(FieldType.DATE_TIME)
                        .has_field("end time").zh_CN("结束时间")
                            .place_holder("请输入答题截止时间")
                            .which_type_of(FieldType.DATE_TIME)
                        .has_field("number").zh_CN("题目数量")
                            .which_type_of(FieldType.INTEGER)
                            .place_holder("出几道题")
                            .defaule_value(20)
                            .range(10, 100)
                        .has_field("scope").zh_CN("题目类别")
                            .which_model_of(MODEL.questionCategory())
                            .values_can_check_from_query_by(null)
                ;
    }

}
