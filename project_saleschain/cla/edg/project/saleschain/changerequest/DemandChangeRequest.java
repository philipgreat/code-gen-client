package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class DemandChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("post demand").zh_CN("需求提供")
                    .has_field("type").zh_CN("类型")
                        .which_model_of(MODEL.demandType())
                        .values_can_select_from_query_by(null)
                    .has_field("unit type").zh_CN("单位性质")
                        .which_model_of(MODEL.unitType())
                        .values_can_select_from_query_by(null)
                    .has_field("unit name").zh_CN("单位名称")
                        .place_holder("请输入需求方的单位名称")
                        .range(1,48)
                    .has_field("research group").zh_CN("课题组")
                        .place_holder("如有课题组,请输入")
                        .optional()
                        .range(0,99)
                    .has_field("contact name").zh_CN("联系人")
                        .range(1,40)
                    .has_field("contact mobile").zh_CN("联系电话")
                        .which_type_of(FieldType.MOBILE)
                    .has_field("content").zh_CN("需求详情")
                        .place_holder("请尽量细致的说明需要的物品细节")
                        .which_type_of(FieldType.MULTI_TEXT)

                ;
    }

}
