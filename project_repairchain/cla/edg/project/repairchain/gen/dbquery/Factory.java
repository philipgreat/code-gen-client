package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Factory extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.factory.Factory";
  }
  // 枚举对象

  // 引用的对象

  public Province province() {
    Province member = new Province();
    member.setModelTypeName("province");
    member.setName("province");
    member.setMemberName("province");
    member.setReferDirection(true);
    member.setRelationName("province");
    append(member);
    return member;
  }

  public City city() {
    City member = new City();
    member.setModelTypeName("city");
    member.setName("city");
    member.setMemberName("city");
    member.setReferDirection(true);
    member.setRelationName("city");
    append(member);
    return member;
  }

  public District district() {
    District member = new District();
    member.setModelTypeName("district");
    member.setName("district");
    member.setMemberName("district");
    member.setReferDirection(true);
    member.setRelationName("district");
    append(member);
    return member;
  }

  public Merchant merchant() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("merchant");
    member.setMemberName("merchant");
    member.setReferDirection(true);
    member.setRelationName("merchant");
    append(member);
    return member;
  }

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

  public ChangeRequest createFrom() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("create_from");
    member.setMemberName("createFrom");
    member.setReferDirection(true);
    member.setRelationName("createFrom");
    append(member);
    return member;
  }

  // 被引用的对象

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("factory");
    member.setMemberName("employeeList");
    member.setRelationName("factory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SubordinateEmployee subordinateEmployeeList() {
    SubordinateEmployee member = new SubordinateEmployee();
    member.setModelTypeName("subordinate_employee");
    member.setName("factory");
    member.setMemberName("subordinateEmployeeList");
    member.setRelationName("factory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public FactoryAgency factoryAgencyList() {
    FactoryAgency member = new FactoryAgency();
    member.setModelTypeName("factory_agency");
    member.setName("factory");
    member.setMemberName("factoryAgencyList");
    member.setRelationName("factory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Machine machineList() {
    Machine member = new Machine();
    member.setModelTypeName("machine");
    member.setName("factory");
    member.setMemberName("machineList");
    member.setRelationName("factory");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MaintenanceTask maintenanceTaskList() {
    MaintenanceTask member = new MaintenanceTask();
    member.setModelTypeName("maintenance_task");
    member.setName("factory");
    member.setMemberName("maintenanceTaskList");
    member.setRelationName("factory");
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

  public StringAttribute logo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("logo");
    member.setName("logo");
    useMember(member);
    return member;
  }

  public StringAttribute address() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("address");
    member.setName("address");
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
