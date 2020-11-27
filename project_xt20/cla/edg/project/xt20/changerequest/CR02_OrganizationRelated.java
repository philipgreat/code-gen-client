package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR02_OrganizationRelated implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("seller register").zh_CN("商户注册")
        .step("A").zh_CN("商户注册")
            .contains_event("seller info").zh_CN("商户注册")
                .has_field("id").zh_CN("ID")
                    .optional()
                    .fill_by_request("organization identity id")
                    .hidden()
                .has_field("name").zh_CN("单位名称")
                    .place_holder("请输入您的单位名称")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().name())
                    .range(1,40)
                .has_field("agency social code").zh_CN("信用代码")
                    .place_holder("请输入您的单位信用代码")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().agencySocialCode())
                    .range(18,18)
                .has_field("contact name").zh_CN("联系人")
                    .place_holder("请输入联系人姓名")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().contactName())
                    .range(1,20)
                .has_field("contact mobile").zh_CN("联系电话")
                    .place_holder("请输入联系电话")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().mobile())
                    .which_type_of(FieldType.MOBILE)
                .has_field("address").zh_CN("单位地址")
                    .place_holder("请输入单位所在地址")
                    .fill_by_request("merchant id", MODEL.organizationIdentity().address())
                    .range(1,100)
                .has_field("logo").zh_CN("单位logo")
                    .which_type_of(FieldType.IMAGE)
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().logo())


        .change_request("seller update merchant info").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("seller info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info when invite").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("seller info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info from seller home").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("seller info")
                .has_field("agency social code")
                    .must_have()
                ;
    }

}
