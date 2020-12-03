package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Employee extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.employee.Employee";
  }
  // 枚举对象

  // 引用的对象

  public PersonalUser personInformation() {
    PersonalUser member = new PersonalUser();
    member.setModelTypeName("personal_user");
    member.setName("person_information");
    member.setMemberName("personInformation");
    member.setReferDirection(true);
    member.setRelationName("personInformation");
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

  public Role role() {
    Role member = new Role();
    member.setModelTypeName("role");
    member.setName("role");
    member.setMemberName("role");
    member.setReferDirection(true);
    member.setRelationName("role");
    append(member);
    return member;
  }

  public EmployeeStatus status() {
    EmployeeStatus member = new EmployeeStatus();
    member.setModelTypeName("employee_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
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

  public UserWorkingInfo userWorkingInfoList() {
    UserWorkingInfo member = new UserWorkingInfo();
    member.setModelTypeName("user_working_info");
    member.setName("employee");
    member.setMemberName("userWorkingInfoList");
    member.setRelationName("employee");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InvitationRecord invitationRecordListAsInviter() {
    InvitationRecord member = new InvitationRecord();
    member.setModelTypeName("invitation_record");
    member.setName("inviter");
    member.setMemberName("invitationRecordListAsInviter");
    member.setRelationName("inviter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InvitationRecord invitationRecordListAsInvitee() {
    InvitationRecord member = new InvitationRecord();
    member.setModelTypeName("invitation_record");
    member.setName("invitee");
    member.setMemberName("invitationRecordListAsInvitee");
    member.setRelationName("inviter");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MerchantCylinderRecord merchantCylinderRecordList() {
    MerchantCylinderRecord member = new MerchantCylinderRecord();
    member.setModelTypeName("merchant_cylinder_record");
    member.setName("actor");
    member.setMemberName("merchantCylinderRecordList");
    member.setRelationName("actor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinderRecord customerCylinderRecordList() {
    CustomerCylinderRecord member = new CustomerCylinderRecord();
    member.setModelTypeName("customer_cylinder_record");
    member.setName("actor");
    member.setMemberName("customerCylinderRecordList");
    member.setRelationName("actor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinderRecordEvidence customerCylinderRecordEvidenceList() {
    CustomerCylinderRecordEvidence member = new CustomerCylinderRecordEvidence();
    member.setModelTypeName("customer_cylinder_record_evidence");
    member.setName("actor");
    member.setMemberName("customerCylinderRecordEvidenceList");
    member.setRelationName("actor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductInventoryRecord gasProductInventoryRecordList() {
    GasProductInventoryRecord member = new GasProductInventoryRecord();
    member.setModelTypeName("gas_product_inventory_record");
    member.setName("actor");
    member.setMemberName("gasProductInventoryRecordList");
    member.setRelationName("actor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverTask deliverTaskList() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("deliver_staff");
    member.setMemberName("deliverTaskList");
    member.setRelationName("deliverStaff");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MainOrder mainOrderList() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("creator");
    member.setMemberName("mainOrderList");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserComments userCommentsList() {
    UserComments member = new UserComments();
    member.setModelTypeName("user_comments");
    member.setName("creator");
    member.setMemberName("userCommentsList");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasShippingGroup gasShippingGroupList() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("creator");
    member.setMemberName("gasShippingGroupList");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceipt deliveryReceiptListAsCreator() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("creator");
    member.setMemberName("deliveryReceiptListAsCreator");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceipt deliveryReceiptListAsConfirmer() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("confirmer");
    member.setMemberName("deliveryReceiptListAsConfirmer");
    member.setRelationName("creator");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptEvidence deliveryReceiptEvidenceList() {
    DeliveryReceiptEvidence member = new DeliveryReceiptEvidence();
    member.setModelTypeName("delivery_receipt_evidence");
    member.setName("actor");
    member.setMemberName("deliveryReceiptEvidenceList");
    member.setRelationName("actor");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrderOperationRecord orderOperationRecordList() {
    OrderOperationRecord member = new OrderOperationRecord();
    member.setModelTypeName("order_operation_record");
    member.setName("actor");
    member.setMemberName("orderOperationRecordList");
    member.setRelationName("actor");
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

  public StringAttribute comment() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("comment");
    member.setName("comment");
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
