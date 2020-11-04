package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR02_Factory implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add factory").zh_CN("添加工厂")
                .step("A").zh_CN("工厂信息")
                    .contains_event("factory basic info").zh_CN("工厂信息")
                        .has_field("agent").zh_CN("代理ID")
                            .fill_by_request("agent id")
                            .hidden()
                        .has_field("name").zh_CN("单位名称")
                            .range(2,100)
                            .place_holder("请输入工厂的单位名称")
                        .has_field("logo").zh_CN("形象标志")
                            .which_type_of(FieldType.IMAGE)
                            .place_holder("请上传单位标志,推荐PNG,128x128")
                        .has_field("district").zh_CN("地区")
                            .which_model_of(MODEL.district())
                            .with_style(UIStyle.INPUT_REGION_PICKER)
                            .values_can_select_from_query_by("${city}")
                            .place_holder("请选择所在地区")
                        .has_field("address").zh_CN("详细地址")
                            .range(1,200)
                            .place_holder("请输入详细的地址")
                        .has_field("expire date").zh_CN("过期日期")
                            .which_type_of(FieldType.DATE)
                            .place_holder("请选择服务到期日")
                            .defaule_value("2099-12-31")

                    .contains_event("factory admin info").zh_CN("工厂管理员")
                        .has_field("contact name").zh_CN("姓名")
                            .optional().range(1, 40)
                            .place_holder("请输入工厂联系人的姓名")
                        .has_field("contact mobile").zh_CN("手机号")
                            .which_type_of(FieldType.MOBILE)
                            .place_holder("请输入工厂联系人的手机号")
                            .tips_title("?")
                            .tips_content("手机号是系统关联用户的重要凭据,请务必保证输入正确")


                .change_request("update factory").zh_CN("更新工厂信息")
                    .contains_event("factory basic info").zh_CN("更新工厂信息")



                ;
    }

}
