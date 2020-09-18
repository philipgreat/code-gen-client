package cla.edg.project.repairchain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.repairchain.changerequest.ChangeRequest";
  }
  // 枚举对象

  // 引用的对象

  public ChangeRequestType requestType() {
    ChangeRequestType member = new ChangeRequestType();
    member.setModelTypeName("change_request_type");
    member.setName("request_type");
    member.setMemberName("requestType");
    member.setReferDirection(true);
    member.setRelationName("requestType");
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

  // 被引用的对象

  public EventSimpleType eventSimpleTypeList() {
    EventSimpleType member = new EventSimpleType();
    member.setModelTypeName("event_simple_type");
    member.setName("change_request");
    member.setMemberName("eventSimpleTypeList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventOtherType eventOtherTypeList() {
    EventOtherType member = new EventOtherType();
    member.setModelTypeName("event_other_type");
    member.setName("change_request");
    member.setMemberName("eventOtherTypeList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventFactoryBasicInfo eventFactoryBasicInfoList() {
    EventFactoryBasicInfo member = new EventFactoryBasicInfo();
    member.setModelTypeName("event_factory_basic_info");
    member.setName("change_request");
    member.setMemberName("eventFactoryBasicInfoList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventMachineBasicInfo eventMachineBasicInfoList() {
    EventMachineBasicInfo member = new EventMachineBasicInfo();
    member.setModelTypeName("event_machine_basic_info");
    member.setName("change_request");
    member.setMemberName("eventMachineBasicInfoList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventEmployeeBasicInfo eventEmployeeBasicInfoList() {
    EventEmployeeBasicInfo member = new EventEmployeeBasicInfo();
    member.setModelTypeName("event_employee_basic_info");
    member.setName("change_request");
    member.setMemberName("eventEmployeeBasicInfoList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventBindMobile eventBindMobileList() {
    EventBindMobile member = new EventBindMobile();
    member.setModelTypeName("event_bind_mobile");
    member.setName("change_request");
    member.setMemberName("eventBindMobileList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventBindInfo eventBindInfoList() {
    EventBindInfo member = new EventBindInfo();
    member.setModelTypeName("event_bind_info");
    member.setName("change_request");
    member.setMemberName("eventBindInfoList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventInfoInCr eventInfoInCrList() {
    EventInfoInCr member = new EventInfoInCr();
    member.setModelTypeName("event_info_in_cr");
    member.setName("change_request");
    member.setMemberName("eventInfoInCrList");
    member.setRelationName("changeRequest");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public StringAttribute remoteIp() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_client_ip");
    // member.setName("remoteIp");
    member.setName("remote_ip");
    useMember(member);
    return member;
  }

  public BooleanAttribute commited() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("commited");
    member.setName("commited");
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
