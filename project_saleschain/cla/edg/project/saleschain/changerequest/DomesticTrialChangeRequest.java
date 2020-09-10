package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class DomesticTrialChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("domestic trial application").zh_CN("试用申请")
                .has_field("domestic_try_on").zh_CN("试用")
                    .which_model_of(MODEL.domesticTryOn())
                    .fill_by_request("domestic trail id")
                    .hidden()
                .has_field("product").zh_CN("产品")
                    .which_model_of(MODEL.product())
                    .fill_by_request("product id")
                    .hidden()
                .has_field("product name").zh_CN("产品名称")
                    .fill_by_request("product id", MODEL.product().name())
                    .display()
                .has_field("unit type").zh_CN("单位性质")
                    .which_model_of(MODEL.unitType())
                    .values_can_select_from_query_by(null)
                .has_field("unit name").zh_CN("单位名称")
                    .place_holder("请输入单位名称")
                    .range(1,48)
                .has_field("research group").zh_CN("课题组")
                    .place_holder("如有课题组,请输入")
                    .optional()
                    .range(0,99)
                .has_field("contact name").zh_CN("联系人")
                    .range(1,40)
                .has_field("contact mobile").zh_CN("联系电话")
                    .which_type_of(FieldType.MOBILE)
                .has_field("content").zh_CN("备注")
                    .place_holder("如果您有备注,请在此说明")
                    .which_type_of(FieldType.MULTI_TEXT)
                    .optional()

                ;
    }

}
