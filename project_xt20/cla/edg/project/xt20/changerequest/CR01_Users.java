package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class CR01_Users implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder
        .change_request("update personal info").zh_CN("更新个人信息")
            .step("A").zh_CN("更新个人信息")
            .contains_event("update personal info").zh_CN("个人信息").as("A")
                .has_field("personal user id").zh_CN("个人用户")
                    .fill_by_request("current user id")
                    .optional()
                    .hidden()
                .has_field("name").zh_CN("姓名")
                    .fill_by_request("current user id", MODEL.personalUser().name())
                    .range(2,40)
                .has_field("nick name").zh_CN("昵称")
                    .fill_by_request("current user id", MODEL.personalUser().nickName())
                    .range(0,40).optional()
                .has_field("avatar").zh_CN("头像")
                    .fill_by_request("current user id", MODEL.personalUser().avatar())
                    .which_type_of(FieldType.IMAGE)

                ;
    }

}
