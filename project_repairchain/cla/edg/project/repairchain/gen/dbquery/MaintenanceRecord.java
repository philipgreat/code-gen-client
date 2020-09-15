package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class MaintenanceRecord extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.maintenancerecord.MaintenanceRecord";
  }
  // 枚举对象

  // 引用的对象

  public Machine machine() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("machine");
    member.setMemberName("machine");
    member.setReferDirection(true);
    member.setRelationName("machine");
    append(member);
    return member;
  }

  public Employee employee() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("employee");
    member.setMemberName("employee");
    member.setReferDirection(true);
    member.setRelationName("employee");
    append(member);
    return member;
  }

  public MaintenanceTask maintenanceTask() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("maintenance_task");
    member.setMemberName("maintenanceTask");
    member.setReferDirection(true);
    member.setRelationName("maintenanceTask");
    append(member);
    return member;
  }

  // 被引用的对象

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute title() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("title");
    member.setName("title");
    useMember(member);
    return member;
  }

  public StringAttribute conclusion() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("conclusion");
    member.setName("conclusion");
    useMember(member);
    return member;
  }

  public StringAttribute detailText() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_longtext");
    // member.setName("detailText");
    member.setName("detail_text");
    useMember(member);
    return member;
  }

  public StringAttribute detailImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("images");
    // member.setName("detailImage");
    member.setName("detail_image");
    useMember(member);
    return member;
  }

  public StringAttribute detailVideo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("detailVideo");
    member.setName("detail_video");
    useMember(member);
    return member;
  }

  public StringAttribute attachment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_document");
    // member.setName("attachment");
    member.setName("attachment");
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
