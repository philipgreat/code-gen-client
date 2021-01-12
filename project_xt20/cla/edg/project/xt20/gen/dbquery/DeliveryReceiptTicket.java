package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class DeliveryReceiptTicket extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.deliveryreceiptticket.DeliveryReceiptTicket";
  }
  // 枚举对象

  // 引用的对象

  public DeliverTask deliverTask() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("deliver_task");
    member.setMemberName("deliverTask");
    member.setReferDirection(true);
    member.setRelationName("deliverTask");
    append(member);
    return member;
  }

  public MainOrder mainOrder() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("main_order");
    member.setMemberName("mainOrder");
    member.setReferDirection(true);
    member.setRelationName("mainOrder");
    append(member);
    return member;
  }

  public Merchant seller() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("seller");
    member.setMemberName("seller");
    member.setReferDirection(true);
    member.setRelationName("seller");
    append(member);
    return member;
  }

  public Merchant buyer() {
    Merchant member = new Merchant();
    member.setModelTypeName("merchant");
    member.setName("buyer");
    member.setMemberName("buyer");
    member.setReferDirection(true);
    member.setRelationName("buyer");
    append(member);
    return member;
  }

  public Employee creator() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("creator");
    member.setMemberName("creator");
    member.setReferDirection(true);
    member.setRelationName("creator");
    append(member);
    return member;
  }

  public Employee confirmer() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("confirmer");
    member.setMemberName("confirmer");
    member.setReferDirection(true);
    member.setRelationName("confirmer");
    append(member);
    return member;
  }

  public DeliveryReceiptStatus status() {
    DeliveryReceiptStatus member = new DeliveryReceiptStatus();
    member.setModelTypeName("delivery_receipt_status");
    member.setName("status");
    member.setMemberName("status");
    member.setReferDirection(true);
    member.setRelationName("status");
    append(member);
    return member;
  }

  // 被引用的对象

  public DeliveryReceipt deliveryReceiptList() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("ticket");
    member.setMemberName("deliveryReceiptList");
    member.setRelationName("ticket");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptEvidence deliveryReceiptEvidenceList() {
    DeliveryReceiptEvidence member = new DeliveryReceiptEvidence();
    member.setModelTypeName("delivery_receipt_evidence");
    member.setName("record");
    member.setMemberName("deliveryReceiptEvidenceList");
    member.setRelationName("record");
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

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute confirmTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time");
    // member.setName("confirmTime");
    member.setName("confirm_time");
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
