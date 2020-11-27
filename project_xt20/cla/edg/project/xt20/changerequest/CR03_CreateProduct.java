package cla.edg.project.xt20.changerequest;

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
                ;
    }

}
