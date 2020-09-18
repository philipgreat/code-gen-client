package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MachineStatus extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.machinestatus.MachineStatus";
  }
  // 枚举对象
  public static EnumAttribute RUNNING =
      new EnumAttribute("com.doublechaintech.repairchain.machinestatus.MachineStatus", "RUNNING")
          .chineseName("正常运行");
  public static EnumAttribute CLOSED =
      new EnumAttribute("com.doublechaintech.repairchain.machinestatus.MachineStatus", "CLOSED")
          .chineseName("已停机");
  public static EnumAttribute RUNNING_WITH_FAULT =
      new EnumAttribute(
              "com.doublechaintech.repairchain.machinestatus.MachineStatus", "RUNNING_WITH_FAULT")
          .chineseName("带病运行");

  public EnumAttribute[] getEnumNameList() {
    return new EnumAttribute[] {RUNNING, CLOSED, RUNNING_WITH_FAULT};
  }

  // 引用的对象

  public Platform platform() {
    Platform member = new Platform();
    member.setModelTypeName("platform");
    member.setName("platform");
    member.setMemberName("platform");
    member.setReferDirection(true);
    member.setRelationName("platform");
    append(member);
    return member;
  }

  // 被引用的对象

  public Machine machineList() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("machine_status");
    member.setMemberName("machineList");
    member.setRelationName("machineStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MachineRunningRecord machineRunningRecordList() {
    MachineRunningRecord member = new MachineRunningRecord();
    member.setModelTypeName("machine_running_record");
    member.setName("machine_status");
    member.setMemberName("machineRunningRecordList");
    member.setRelationName("machineStatus");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public RepairApplication repairApplicationList() {
    RepairApplication member = new RepairApplication();
    member.setModelTypeName("repair_application");
    member.setName("machine_status");
    member.setMemberName("repairApplicationList");
    member.setRelationName("machineStatus");
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

  public StringAttribute code() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("code");
    member.setName("code");
    useMember(member);
    return member;
  }

  public StringAttribute icon() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("icon");
    member.setName("icon");
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
