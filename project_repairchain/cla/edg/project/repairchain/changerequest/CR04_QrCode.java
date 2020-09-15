package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class CR04_QrCode implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("machine bind qrcode").zh_CN("绑定二维码")
                .step("step 1").zh_CN("第一步")
                    .contains_event("bind info").zh_CN("绑定")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)



                .change_request("qrcode bind machine").zh_CN("绑定设备")
                    .contains_event("bind info")


                .change_request("unbound ").zh_CN("解绑二维码")
                    .contains_event("bind info")
                ;
    }

}
