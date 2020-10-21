package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class CR05_QrCode implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("qrcode bind machine").zh_CN("绑定二维码")
                .step("step 1").zh_CN("第一步")
                    .contains_event("bind info").zh_CN("绑定")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)



                .change_request("machine bind qrcode").zh_CN("绑定设备")
                    .step("A").zh_CN("设备信息")
                        .contains_event("machine basic info").zh_CN("设备信息").as("A")
                            .has_field("machine id").must_have()
                            .has_field("machine name").zh_CN("设备名称")
                                .fill_by_request("machine id", MODEL.machine().name())
                                .disabled()
                            .has_field("model name").zh_CN("设备型号")
                                .fill_by_request("machine id", MODEL.machine().modelName())
                                .disabled()
                            .has_field("os name").hidden()
                            .has_field("machine identity").zh_CN("设备编号")
                                .fill_by_request("machine id", MODEL.machine().machineIdentifier())
                                .disabled()
                            .has_field("location").zh_CN("设备地址")
                                .fill_by_request("machine id", MODEL.machine().machineLocation())
                                .disabled()
                            .has_field("image").zh_CN("设备图片")
                                .fill_by_request("machine id", MODEL.machine().machineImage())
                                .disabled()

                            .has_field("prompt").zh_CN("提示")
                                .value("设备二维码编号，请扫描未使用过的设备铭牌二维码")
                                .display()
                            .has_field("qr code")
                                .must_have()
                                .fill_by_request("machine id", MODEL.machine().boundQrcode())
                                .normal_input()



                .change_request("unbound ").zh_CN("解绑二维码")
                    .step("A").zh_CN("设备信息")
                        .contains_event("machine basic info").zh_CN("设备信息").as("A")
                            .has_field("machine id").must_have()
                            .has_field("machine name").zh_CN("设备名称")
                                .fill_by_request("machine id", MODEL.machine().name())
                                .disabled()
                            .has_field("model name").zh_CN("设备型号")
                                .fill_by_request("machine id", MODEL.machine().modelName())
                                .disabled()
                            .has_field("os name").hidden()
                            .has_field("machine identity").zh_CN("设备编号")
                                .fill_by_request("machine id", MODEL.machine().machineIdentifier())
                                .disabled()
                            .has_field("location").zh_CN("设备地址")
                                .fill_by_request("machine id", MODEL.machine().machineLocation())
                                .disabled()
                            .has_field("image").zh_CN("设备图片")
                                .fill_by_request("machine id", MODEL.machine().machineImage())
                                .disabled()

                            .has_field("prompt").zh_CN("提示")
                                .value("该二维码将与当前设备解绑,请确认")
                                .display()
                            .has_field("qr code")
                                .fill_by_request("machine id", MODEL.machine().boundQrcode())
                                .disabled()
                ;
    }

}
