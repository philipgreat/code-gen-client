package cla.edg.project.xt20.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Company extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.xt20.company.Company";
  }
  // 枚举对象

  // 引用的对象

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

  // 被引用的对象

  public Warehouse warehouseList() {
    Warehouse member = new Warehouse();
    member.setModelTypeName("warehouse");
    member.setName("company");
    member.setMemberName("warehouseList");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public Employee employeeList() {
    Employee member = new Employee();
    member.setModelTypeName("employee");
    member.setName("company");
    member.setMemberName("employeeList");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MyCustomer myCustomerListAsUser() {
    MyCustomer member = new MyCustomer();
    member.setModelTypeName("my_customer");
    member.setName("user");
    member.setMemberName("myCustomerListAsUser");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MyCustomer myCustomerListAsCustomer() {
    MyCustomer member = new MyCustomer();
    member.setModelTypeName("my_customer");
    member.setName("customer");
    member.setMemberName("myCustomerListAsCustomer");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinder customerCylinderListAsCompany() {
    CustomerCylinder member = new CustomerCylinder();
    member.setModelTypeName("customer_cylinder");
    member.setName("company");
    member.setMemberName("customerCylinderListAsCompany");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CustomerCylinder customerCylinderListAsCustomer() {
    CustomerCylinder member = new CustomerCylinder();
    member.setModelTypeName("customer_cylinder");
    member.setName("customer");
    member.setMemberName("customerCylinderListAsCustomer");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MySupplier mySupplierListAsUser() {
    MySupplier member = new MySupplier();
    member.setModelTypeName("my_supplier");
    member.setName("user");
    member.setMemberName("mySupplierListAsUser");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public MySupplier mySupplierListAsSupplier() {
    MySupplier member = new MySupplier();
    member.setModelTypeName("my_supplier");
    member.setName("supplier");
    member.setMemberName("mySupplierListAsSupplier");
    member.setRelationName("user");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public CommonLog commonLogList() {
    CommonLog member = new CommonLog();
    member.setModelTypeName("common_log");
    member.setName("company");
    member.setMemberName("commonLogList");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasProduct gasProductList() {
    GasProduct member = new GasProduct();
    member.setModelTypeName("gas_product");
    member.setName("company");
    member.setMemberName("gasProductList");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public DeliverTask deliverTaskList() {
    DeliverTask member = new DeliverTask();
    member.setModelTypeName("deliver_task");
    member.setName("company");
    member.setMemberName("deliverTaskList");
    member.setRelationName("company");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  public GasLineItem gasLineItemList() {
    GasLineItem member = new GasLineItem();
    member.setModelTypeName("gas_line_item");
    member.setName("company");
    member.setMemberName("gasLineItemList");
    member.setRelationName("company");
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

  public StringAttribute agencySocialCode() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("agencySocialCode");
    member.setName("agency_social_code");
    useMember(member);
    return member;
  }

  public StringAttribute contactName() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("contactName");
    member.setName("contact_name");
    useMember(member);
    return member;
  }

  public StringAttribute telephone() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("telephone");
    member.setName("telephone");
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

  public StringAttribute logo() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("logo");
    member.setName("logo");
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
