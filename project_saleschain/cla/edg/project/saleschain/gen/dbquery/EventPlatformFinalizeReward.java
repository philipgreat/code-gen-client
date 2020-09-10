package cla.edg.project.saleschain.gen.dbquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class EventPlatformFinalizeReward extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.saleschain.eventplatformfinalizereward.EventPlatformFinalizeReward";
  }
  // 枚举对象

  // 引用的对象

  public DemandProposal proposal() {
    DemandProposal member = new DemandProposal();
    member.setModelTypeName("demand_proposal");
    member.setName("proposal");
    member.setMemberName("proposal");
    member.setReferDirection(true);
    member.setRelationName("proposal");
    append(member);
    return member;
  }

  public ChangeRequest changeRequest() {
    ChangeRequest member = new ChangeRequest();
    member.setModelTypeName("change_request");
    member.setName("change_request");
    member.setMemberName("changeRequest");
    member.setReferDirection(true);
    member.setRelationName("changeRequest");
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

  public NumberAttribute amount() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("amount");
    member.setName("amount");
    useMember(member);
    return member;
  }

  public NumberAttribute rewardRatio() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("money");
    // member.setName("rewardRatio");
    member.setName("reward_ratio");
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
