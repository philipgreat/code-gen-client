package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR03_Machine implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add machine by agent").zh_CN("添加设备")
                .step("A").zh_CN("添加设备")
                    .contains_event("machine basic info").zh_CN("设备信息").as("A")
                        .has_field("agent id").zh_CN("代理商")
                            .optional().fill_by_request("agent id")
                            .hidden()
                        .has_field("factory id").zh_CN("工厂")
                            .optional().fill_by_request("factory id")
                            .hidden()
                        .has_field("machine id").zh_CN("设备")
                            .optional().fill_by_request("machine id")
                            .hidden()

                        .has_field("machine name").zh_CN("设备名称")
                            .range(1,40)
                            .place_holder("请输入设备名称")
                        .has_field("model name").zh_CN("设备型号")
                            .range(1,100)
                            .place_holder("请输入设备型号")
                        .has_field("os name").zh_CN("控制系统")
                            .optional().range(1,100)
                            .place_holder("请输入设备的控制系统名称")
                            .defaule_value("无")
                        .has_field("machine identity").zh_CN("设备编号")
                            .optional().range(1, 100)
                            .place_holder("请输入设备在公司的唯一编号")
                        .has_field("location").zh_CN("设备地址")
                            .range(1,100)
                            .place_holder("请输入设备所在的位置")
                        .has_field("image").zh_CN("设备图片")
                            .which_type_of(FieldType.IMAGE)
                            .place_holder("设备照片")
                        .has_field("prompt").zh_CN("提示")
                            .value("设备二维码编号，请扫描未使用过的设备铭牌二维码")
                            .display()
                        .has_field("qr code").zh_CN("二维码")
                            .range(1,48)






                            .optional().with_style(UIStyle.INPUT_CODE_SCAN)
                            .place_holder("请扫描或输入二维码")

            .change_request("update machine").zh_CN("更新设备信息")
                .step("A").zh_CN("更新设备")
                    .contains_event("machine basic info").zh_CN("设备信息").as("A")
                        .has_field("machine id").must_have()
                        .has_field("machine name").zh_CN("设备名称")
                            .fill_by_request("machine id", MODEL.machine().name())
                        .has_field("model name").zh_CN("设备型号")
                            .fill_by_request("machine id", MODEL.machine().modelName())
                        .has_field("os name").zh_CN("控制系统")
                            .fill_by_request("machine id", MODEL.machine().operationSystem())
                        .has_field("machine identity").zh_CN("设备编号")
                            .fill_by_request("machine id", MODEL.machine().machineIdentifier())
                            .disabled()
                        .has_field("location").zh_CN("设备地址")
                            .fill_by_request("machine id", MODEL.machine().machineLocation())
                        .has_field("image").zh_CN("设备图片")
                            .fill_by_request("machine id", MODEL.machine().machineImage())

                        .has_field("prompt").zh_CN("提示")
                            .value("").display()
                        .has_field("qr code").zh_CN("二维码")
                            .fill_by_request("machine id", MODEL.machine().boundQrcode())
                            .hidden()

                ;
    }

}
