package cla.edg.project.heimat.changerequest;

import cla.edg.project.heimat.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR01_Example implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("demo all field").zh_CN("演示所有的字段类型")
                .step("simple type").zh_CN("简单类型")
                    .contains_event("simple type").zh_CN("简单类型").many_times(0, 10).show_previous_event(2, 2)
                        .has_field("name").zh_CN("姓名")
                            .range(1, 40)
                        .has_field("mobile").zh_CN("电话").which_type_of(FieldType.MOBILE)
                            .with_style(UIStyle.INPUT_VERIFY_CODE)
                        .has_field("gender").zh_CN("性别")
                            .values_canbe("male", "男").or("female", "女").or("secret", "保密")
                            .with_style(UIStyle.INPUT_SINGLE_SELECT)
                        .has_field("field_display").value("只是显示").display()
                        .has_field("field_text").zh_CN("短文本").which_type_of(FieldType.TEXT).with_style(UIStyle.INPUT_TEXT)
                        .has_field("field_id_number").zh_CN("身份证").which_type_of(FieldType.TEXT)
                            .range(15, 18)
                            .value("510922197812128876")
                            .disabled()
                        .has_field("field_email").zh_CN("电子邮件").with_style(UIStyle.INPUT_EMAIL)
                            .match("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$")
                        .has_field("field_url").zh_CN("链接").with_style(UIStyle.INPUT_URL)
                        .has_field("field_one_of").zh_CN("单选")
                            .values_canbe("sport", "运动").or("sleep", "睡觉")
                        .has_field("field_some_of").zh_CN("多选")
                            .values_canbe("sport", "运动")
                                .and("reading", "阅读")
                                .and("music", "音乐")
                                .and("movie", "电影")
                                .and("game", "游戏")
                        .has_field("field_longtext").zh_CN("长文本").which_type_of(FieldType.MULTI_TEXT)
                        .has_field("field_boolean").zh_CN("布尔").which_type_of(FieldType.BOOLEAN)
                        .has_field("field_images").zh_CN("多图").which_type_of(FieldType.IMAGES)
                        .has_field("field_image").zh_CN("单图").which_type_of(FieldType.IMAGE)
                        .has_field("field_file").zh_CN("单文件附件").which_type_of(FieldType.ATTACHMENT)
                        .has_field("field_date").zh_CN("日期").which_type_of(FieldType.DATE)
                        .has_field("field_datetime").zh_CN("日期时间").which_type_of(FieldType.DATE_TIME)
                        .has_field("field_integer").zh_CN("整数").which_type_of(FieldType.INTEGER)
                        .has_field("field_decimal").zh_CN("小数").which_type_of(FieldType.DECIMAL)
                        .has_field("field_money").zh_CN("金融").which_type_of(FieldType.MONEY)
                            .range(100, 10000)
//                        .has_field("field_biz_candidate").zh_CN("单选的对象").which_model_of(MODEL.merchant())
                            .values_can_select_from_query_by("field_integer")
                .step("step 2").zh_CN("其他类型")
                    .contains_event("other type").zh_CN("其他类型")
                        .has_field("field_richtext").zh_CN("富文本").which_type_of(FieldType.RICH_TEXT)
                        .has_field("field_longtext").zh_CN("长文本").which_type_of(FieldType.MULTI_TEXT)
                        .has_field("field_video").zh_CN("单视频").which_type_of(FieldType.VIDEO)

                ;
    }

}
