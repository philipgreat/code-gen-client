package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.ProductType;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

import java.lang.reflect.Field;

public class CR04_Order implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("proof for accept for buyer").zh_CN("代收凭证")
            .step("A").zh_CN("代收凭证")
            .contains_event("accept proof").zh_CN("代收凭证")
                .has_field("order id").zh_CN("订单ID")
                    .fill_by_request("order id")
                    .hidden()
                .has_field("task id").zh_CN("运单ID")
                    .fill_by_request("task id")
                    .hidden()

                .has_field("contact name").zh_CN("收货人")
                    .fill_by_request("order id", MODEL.mainOrder().buyerContactName())
                    .disabled()
                .has_field("contact mobile").zh_CN("联系电话")
                    .fill_by_request("order id", MODEL.mainOrder().buyerContactPhone())
                    .disabled()
                .has_field("address").zh_CN("详细地址")
                    .fill_by_request("order id", MODEL.mainOrder().handoverAddress())

                .has_field("proof").zh_CN("上传凭证")
                    .which_type_of(FieldType.IMAGES)
                    .place_holder("请上传凭证")
                .has_field("comment").zh_CN("备注")
                    .which_type_of(FieldType.MULTI_TEXT)
                    .range(0,200).optional()

                ;
    }

}
