package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Merchant extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.merchant.Merchant";
  }
  // 枚举对象

  // 引用的对象

  public OffTime offTime() {
    OffTime member = new OffTime();
    member.setModelTypeName("off_time");
    member.setName("off_time");
    member.setMemberName("offTime");
    member.setReferDirection(true);
    member.setRelationName("offTime");
    append(member);
    return member;
  }

  public MerchantType merchantType() {
    MerchantType member = new MerchantType();
    member.setModelTypeName("merchant_type");
    member.setName("merchant_type");
    member.setMemberName("merchantType");
    member.setReferDirection(true);
    member.setRelationName("merchantType");
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

  public IndividualIdentity individualIdentityList() {
    IndividualIdentity member = new IndividualIdentity();
    member.setModelTypeName("individual_identity");
    member.setName("merchant");
    member.setMemberName("individualIdentityList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public UserWorkingInfo userWorkingInfoList() {
    UserWorkingInfo member = new UserWorkingInfo();
    member.setModelTypeName("user_working_info");
    member.setName("supplier");
    member.setMemberName("userWorkingInfoList");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public OrganizationIdentity organizationIdentityList() {
    OrganizationIdentity member = new OrganizationIdentity();
    member.setModelTypeName("organization_identity");
    member.setName("merchant");
    member.setMemberName("organizationIdentityList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Warehouse warehouseList() {
    Warehouse member = new Warehouse();
    member.setModelTypeName("warehouse");
    member.setName("merchant");
    member.setMemberName("warehouseList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public InvitationRecord invitationRecordList() {
    InvitationRecord member = new InvitationRecord();
    member.setModelTypeName("invitation_record");
    member.setName("merchant");
    member.setMemberName("invitationRecordList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("merchant");
    member.setMemberName("employeeList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplyRelationship supplyRelationshipListAsSupplier() {
    SupplyRelationship member = new SupplyRelationship();
    member.setModelTypeName("supply_relationship");
    member.setName("supplier");
    member.setMemberName("supplyRelationshipListAsSupplier");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public SupplyRelationship supplyRelationshipListAsCustomer() {
    SupplyRelationship member = new SupplyRelationship();
    member.setModelTypeName("supply_relationship");
    member.setName("customer");
    member.setMemberName("supplyRelationshipListAsCustomer");
    member.setRelationName("supplier");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MerchantCylinder merchantCylinderList() {
    MerchantCylinder member = new MerchantCylinder();
    member.setModelTypeName("merchant_cylinder");
    member.setName("merchant");
    member.setMemberName("merchantCylinderList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MerchantCylinderRecord merchantCylinderRecordList() {
    MerchantCylinderRecord member = new MerchantCylinderRecord();
    member.setModelTypeName("merchant_cylinder_record");
    member.setName("merchant");
    member.setMemberName("merchantCylinderRecordList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinder customerCylinderListAsSeller() {
    CustomerCylinder member = new CustomerCylinder();
    member.setModelTypeName("customer_cylinder");
    member.setName("seller");
    member.setMemberName("customerCylinderListAsSeller");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinder customerCylinderListAsCustomer() {
    CustomerCylinder member = new CustomerCylinder();
    member.setModelTypeName("customer_cylinder");
    member.setName("customer");
    member.setMemberName("customerCylinderListAsCustomer");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinderRecord customerCylinderRecordListAsSeller() {
    CustomerCylinderRecord member = new CustomerCylinderRecord();
    member.setModelTypeName("customer_cylinder_record");
    member.setName("seller");
    member.setMemberName("customerCylinderRecordListAsSeller");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinderRecord customerCylinderRecordListAsCustomer() {
    CustomerCylinderRecord member = new CustomerCylinderRecord();
    member.setModelTypeName("customer_cylinder_record");
    member.setName("customer");
    member.setMemberName("customerCylinderRecordListAsCustomer");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("merchant");
    member.setMemberName("gasProductList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductInventoryRecord gasProductInventoryRecordList() {
    GasProductInventoryRecord member = new GasProductInventoryRecord();
    member.setModelTypeName("gas_product_inventory_record");
    member.setName("merchant");
    member.setMemberName("gasProductInventoryRecordList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProductCache gasProductCacheList() {
    GasProductCache member = new GasProductCache();
    member.setModelTypeName("gas_product_cache");
    member.setName("merchant");
    member.setMemberName("gasProductCacheList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverTask deliverTaskList() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("merchant");
    member.setMemberName("deliverTaskList");
    member.setRelationName("merchant");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MainOrder mainOrderListAsBuyer() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("buyer");
    member.setMemberName("mainOrderListAsBuyer");
    member.setRelationName("buyer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MainOrder mainOrderListAsSeller() {
    MainOrder member = new MainOrder();
    member.setModelTypeName("main_order");
    member.setName("seller");
    member.setMemberName("mainOrderListAsSeller");
    member.setRelationName("buyer");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasShippingGroup gasShippingGroupListAsSeller() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("seller");
    member.setMemberName("gasShippingGroupListAsSeller");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasShippingGroup gasShippingGroupListAsBuyer() {
    GasShippingGroup member = new GasShippingGroup();
    member.setModelTypeName("gas_shipping_group");
    member.setName("buyer");
    member.setMemberName("gasShippingGroupListAsBuyer");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceipt deliveryReceiptListAsSeller() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("seller");
    member.setMemberName("deliveryReceiptListAsSeller");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceipt deliveryReceiptListAsBuyer() {
    DeliveryReceipt member = new DeliveryReceipt();
    member.setModelTypeName("delivery_receipt");
    member.setName("buyer");
    member.setMemberName("deliveryReceiptListAsBuyer");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptTicket deliveryReceiptTicketListAsSeller() {
    DeliveryReceiptTicket member = new DeliveryReceiptTicket();
    member.setModelTypeName("delivery_receipt_ticket");
    member.setName("seller");
    member.setMemberName("deliveryReceiptTicketListAsSeller");
    member.setRelationName("seller");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliveryReceiptTicket deliveryReceiptTicketListAsBuyer() {
    DeliveryReceiptTicket member = new DeliveryReceiptTicket();
    member.setModelTypeName("delivery_receipt_ticket");
    member.setName("buyer");
    member.setMemberName("deliveryReceiptTicketListAsBuyer");
    member.setRelationName("seller");
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

  public NumberAttribute deliveryLimit() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("deliveryLimit");
    member.setName("delivery_limit");
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
