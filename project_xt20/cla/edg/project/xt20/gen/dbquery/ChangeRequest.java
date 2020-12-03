package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class ChangeRequest extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.changerequest.ChangeRequest";
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

  public EventTbd eventTbdList() {
    EventTbd member = new EventTbd();
    member.setModelTypeName("event_tbd");
    member.setName("change_request");
    member.setMemberName("eventTbdList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventOrganizationInfo eventOrganizationInfoList() {
    EventOrganizationInfo member = new EventOrganizationInfo();
    member.setModelTypeName("event_organization_info");
    member.setName("change_request");
    member.setMemberName("eventOrganizationInfoList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventAdminTransfer eventAdminTransferList() {
    EventAdminTransfer member = new EventAdminTransfer();
    member.setModelTypeName("event_admin_transfer");
    member.setName("change_request");
    member.setMemberName("eventAdminTransferList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventUpdateMerchantOffTime eventUpdateMerchantOffTimeList() {
    EventUpdateMerchantOffTime member = new EventUpdateMerchantOffTime();
    member.setModelTypeName("event_update_merchant_off_time");
    member.setName("change_request");
    member.setMemberName("eventUpdateMerchantOffTimeList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventUpdateMerchantDeliveryLimit eventUpdateMerchantDeliveryLimitList() {
    EventUpdateMerchantDeliveryLimit member = new EventUpdateMerchantDeliveryLimit();
    member.setModelTypeName("event_update_merchant_delivery_limit");
    member.setName("change_request");
    member.setMemberName("eventUpdateMerchantDeliveryLimitList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventEmployeeApprove eventEmployeeApproveList() {
    EventEmployeeApprove member = new EventEmployeeApprove();
    member.setModelTypeName("event_employee_approve");
    member.setName("change_request");
    member.setMemberName("eventEmployeeApproveList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventUpdateAdditionalSpec eventUpdateAdditionalSpecList() {
    EventUpdateAdditionalSpec member = new EventUpdateAdditionalSpec();
    member.setModelTypeName("event_update_additional_spec");
    member.setName("change_request");
    member.setMemberName("eventUpdateAdditionalSpecList");
    member.setRelationName("changeRequest");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public EventProductInbound eventProductInboundList() {
    EventProductInbound member = new EventProductInbound();
    member.setModelTypeName("event_product_inbound");
    member.setName("change_request");
    member.setMemberName("eventProductInboundList");
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

  public StringAttribute cityByIp() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("cityByIp");
    member.setName("city_by_ip");
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
