package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Machine extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.machine.Machine";
  }
  // 枚举对象

  // 引用的对象

  public MachineModel model() {
    MachineModel member = new MachineModel();
    member.setModelTypeName("machine_model");
    member.setName("model");
    member.setMemberName("model");
    member.setReferDirection(true);
    member.setRelationName("model");
    append(member);
    return member;
  }

  public MachineStatus machineStatus() {
    MachineStatus member = new MachineStatus();
    member.setModelTypeName("machine_status");
    member.setName("machine_status");
    member.setMemberName("machineStatus");
    member.setReferDirection(true);
    member.setRelationName("machineStatus");
    append(member);
    return member;
  }

  public Factory factory() {
    Factory member = new Factory();
    member.setModelTypeName("factory");
    member.setName("factory");
    member.setMemberName("factory");
    member.setReferDirection(true);
    member.setRelationName("factory");
    append(member);
    return member;
  }

  // 被引用的对象

  public QrCode qrCodeList() {
    QrCode member = new QrCode();
    member.setModelTypeName("qr_code");
    member.setName("machine");
    member.setMemberName("qrCodeList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineRunningRecord machineRunningRecordList() {
    MachineRunningRecord member = new MachineRunningRecord();
    member.setModelTypeName("machine_running_record");
    member.setName("machine");
    member.setMemberName("machineRunningRecordList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RegularMaintainPlan regularMaintainPlanList() {
    RegularMaintainPlan member = new RegularMaintainPlan();
    member.setModelTypeName("regular_maintain_plan");
    member.setName("machine");
    member.setMemberName("regularMaintainPlanList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceRecord maintenanceRecordList() {
    MaintenanceRecord member = new MaintenanceRecord();
    member.setModelTypeName("maintenance_record");
    member.setName("machine");
    member.setMemberName("maintenanceRecordList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairApplication repairApplicationList() {
    RepairApplication member = new RepairApplication();
    member.setModelTypeName("repair_application");
    member.setName("machine");
    member.setMemberName("repairApplicationList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTask maintenanceTaskList() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("machine");
    member.setMemberName("maintenanceTaskList");
    member.setRelationName("machine");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public StringAttribute modelName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("modelName");
    member.setName("model_name");
    useMember(member);
    return member;
  }

  public StringAttribute boundQrcode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("boundQrcode");
    member.setName("bound_qrcode");
    useMember(member);
    return member;
  }

  public StringAttribute operationSystem() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("operationSystem");
    member.setName("operation_system");
    useMember(member);
    return member;
  }

  public StringAttribute machineIdentifier() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineIdentifier");
    member.setName("machine_identifier");
    useMember(member);
    return member;
  }

  public StringAttribute machineLocation() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("machineLocation");
    member.setName("machine_location");
    useMember(member);
    return member;
  }

  public StringAttribute machineImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("machineImage");
    member.setName("machine_image");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
