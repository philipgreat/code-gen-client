package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.ProductType;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class CR03_CreateProduct implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("edit additional spec when init").zh_CN("产品附加规格")
        // "在首次创建产品时编辑附加规格")
        .step("A").zh_CN("产品附加规格")
            .contains_event("update additional spec")
                .has_field("scene").zh_CN("使用场景")
                    .value("初始化产品-创建产品")
                    .range(1, 20)
                    .hidden()
                .has_field("template id").zh_CN("产品模板")
                    .fill_by_request("template id").optional()
                    .hidden()
                .has_field("product id").zh_CN("产品")
                    .value("N/A")
                    .range(0,48).optional()
                    .hidden()
                .has_field("merchant id").zh_CN("商户")
                    .fill_by_request("merchant id")
                    .hidden()

                .has_field("additional spec").zh_CN("附加规格")
                    .range(0, 100).optional()
                    .place_holder("请输入附加规格")


        // 在首次创建产品时编辑已经存在的产品的附加规格")
        .change_request("edit additional spec when review init").zh_CN("产品附加规格")
        .step("A").zh_CN("产品附加规格")
            .contains_event("update additional spec")
                .has_field("scene").zh_CN("使用场景")
                    .value("初始化产品-修改产品")
                .has_field("template id").zh_CN("产品模板")
                    .value("N/A")
                .has_field("product id").zh_CN("产品")
                    .fill_by_request("product id")


        // 在快速下单时,使用模板创建产品, 编辑它的附加规格
        .change_request("edit additional spec when create in quote").zh_CN("修改附加规格")
        .step("A").zh_CN("修改附加规格")
            .contains_event("update additional spec")
                .has_field("scene").zh_CN("使用场景")
                    .value("快速下单-添加产品")
                .has_field("template id").zh_CN("产品模板")
                    .fill_by_request("template id")
                .has_field("product id").zh_CN("产品")
                    .value("N/A")



        // 在产品管理页面, 使用模板创建产品, 编辑它的附加规格")
        .change_request("edit additional spec when create").zh_CN("修改附加规格")
        .step("A").zh_CN("修改附加规格")
            .contains_event("update additional spec")
                .has_field("scene").zh_CN("使用场景")
                    .value("管理产品-添加产品")
                .has_field("template id").zh_CN("产品模板")
                    .fill_by_request("template id")
                .has_field("product id").zh_CN("产品")
                    .value("N/A")

        // 在快速下单时, 编辑已经存在的产品的附加规格
        .change_request("edit additional spec when quote").zh_CN("产品附加规格")
        .step("A").zh_CN("产品附加规格")
            .contains_event("update additional spec")
                .has_field("scene").zh_CN("使用场景")
                    .value("快速下单-修改产品")
                .has_field("template id").zh_CN("产品模板")
                    .value("N/A")
                .has_field("product id").zh_CN("产品")
                    .fill_by_request("product id")



        // 入库. 从首页入库, 需要选择产品
        .change_request("inbound from home").zh_CN("生产入库")
        .step("A").zh_CN("产品附加规格")
            .contains_event("product inbound").zh_CN("产品入库")
                .has_field("merchant id").zh_CN("商户")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("m1").zh_CN("商家")
                    .fill_by_request("merchant id", MODEL.merchant().name())
                    .display()
                .has_field("product").zh_CN("产品")
                    .fill_by_request("product id")
                    .which_model_of(MODEL.gasProduct())
                    .values_can_select_from_query_by("wxappService/customerViewSelectProduct/${merchant id}/inbound_from_home/+/+/")
                    .place_holder("请选择")
                .has_field("inbound type").zh_CN("入库类型")
                    .values_canbe("produce", "生产入库")
                    .defaule_value("produce")
                    .disabled()
                .has_field("number").zh_CN("数量")
                    .place_holder("请输入入库数量")
                    .which_type_of(FieldType.INTEGER)
                    .range(1, 10000)

        // 外采入库.
        .change_request("buy inbound from home").zh_CN("外采入库")
            .step("A").zh_CN("入库")
            .contains_event("product inbound")
                .has_field("product").zh_CN("产品")
                    .values_can_select_from_query_by("wxappService/customerViewSelectProduct/${merchant id}/buy_inbound_from_home/+/+/")
                .has_field("inbound type")
                    .values_canbe("buy","外购入库")
                    .defaule_value("buy")
                    .disabled()

        // 产品入库. 从产品详情入库, 已经选定了产品
        .change_request("product inbound").zh_CN("入库")
        .step("A").zh_CN("入库")
            .contains_event("product inbound")
                .has_field("m1").zh_CN("产品")
                    .fill_by_request("product id", MODEL.gasProduct().name())
                    .display()
                .has_field("product")
                    .hidden()
                .has_field("inbound type").zh_CN("入库类型")
                    .values_canbe("produce", "生产入库").or("buy","外购入库")
                    .defaule_value("produce")

        // 初始化产品列表的时候, 添加自定义产品
        .change_request("custom product when initial").zh_CN("自定义产品")
            .step("A").zh_CN("自定义产品")
            .contains_event("product base info").zh_CN("产品基础信息")
                .has_field("merchant id").zh_CN("卖家ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("product type").zh_CN("产品类别")
                    .which_model_of(MODEL.productType())
                    .values_can_select_from_query_by(null)
                    .value(ProductType.PURE_GAS.getLiteralName())
                .has_field("product alias name").zh_CN("产品别名")
                    .place_holder("请输入产品别名")
                    .range(0,40).optional()
                .has_field("product legacy id").zh_CN("产品代码")
                    .place_holder("请输入产品代码")
                    .range(0,100).optional()
                .has_field("product picture").zh_CN("产品图片")
                    .which_type_of(FieldType.IMAGE)
                    .optional()

            .contains_event("container info").zh_CN("产品包装物信息")
                .has_field("fill medium").zh_CN("充装介质")
                    .which_model_of(MODEL.fillMedium())
                    .values_can_select_from_query_by(null)
                    .optional() // 散瓶格没有充装介质
                .has_field("gas container").zh_CN("包装类别")
                    .which_model_of(MODEL.gasContainer())
                    .values_can_select_from_query_by(null)
                .has_field("nominal volume").zh_CN("公称容积(L)")
                    .which_type_of(FieldType.DECIMAL)
                    .range(0, 1000)
                .has_field("nominal pressure").zh_CN("公称压力(Mpa)")
                    .which_type_of(FieldType.DECIMAL)
                    .range(0, 1000)
                .has_field("fill volume").zh_CN("充装量")
                    .which_model_of(MODEL.fillVolume())
                    .values_can_select_from_query_by(null)
                .has_field("bottle type").zh_CN("气瓶类别")
                    .which_model_of(MODEL.bottleType())
                    .values_can_select_from_query_by(null)
                .has_field("additional info").zh_CN("附件规格")
                    .range(0, 100).optional()
                    .place_holder("请输入附加规格")

            .contains_event("product component").zh_CN("充装介质信息")
                .many_times(1, 6).show_them_all_in_cr()
                .has_field("component").zh_CN("组分")
                    .which_model_of(MODEL.fillMedium())
                    .values_can_select_from_query_by(null)
                .has_field("rate").zh_CN("组分含量(%)")
                    .which_type_of(FieldType.DECIMAL)
                    .range(1,100)



        .change_request("product off shelf").zh_CN("下架")
            .step("A").zh_CN("下架")
            .contains_event("product on shelf").zh_CN("产品上架").as("A")
                .has_field("product id").zh_CN("产品ID")
                    .fill_by_request("product id", MODEL.gasProduct().id())
                    .hidden()
                .has_field("product name").zh_CN("产品名称")
                    .fill_by_request("product id", MODEL.gasProduct().name())
                    .display()
                .has_field("operation").zh_CN("操作")
                    .values_canbe("on_shelf", "上架").or("off_shelf", "下架")
                    .defaule_value("off_shelf")
                    .disabled()

        .change_request("product on shelf").zh_CN("上架")
            .step("A").zh_CN("上架")
            .contains_event("product on shelf").zh_CN("产品下架").as("A")
                .has_field("operation")
                .defaule_value("on_shelf")



        .change_request("update product info").zh_CN("更新产品信息")
            .step("A").zh_CN("更新")
            .contains_event("update product info").zh_CN("更新产品信息").as("A")
                .has_field("product id").zh_CN("ID")
                    .fill_by_request("product id")
                    .hidden()
                .has_field("product name").zh_CN("产品名称")
                    .fill_by_request("product id", MODEL.gasProduct().name())
                    .range(1, 100)
                .has_field("legacy code").zh_CN("代码")
                    .fill_by_request("product id", MODEL.gasProduct().legacyCode())
                    .optional()
                    .range(0,100)
                .has_field("comment").zh_CN("备注")
                    .optional()
                    .range(0,100)
                ;
    }

}
