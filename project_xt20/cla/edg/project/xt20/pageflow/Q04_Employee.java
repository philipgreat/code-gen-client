package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.EmployeeStatus;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.Role;

public class Q04_Employee extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.employee()).list_of("colleague in merchant").with_string("merchant id").with_string("personal id")
                .comments("查询用户在某个公司内的正式同事")
                .do_it_as()
                .where(MODEL.employee().personInformation().not("${personal id}"),
                        MODEL.employee().merchant().eq("${merchant id}"),
                        MODEL.employee().status().in(EmployeeStatus.NORMAL))
//                .where(MODEL.employee().id().not_null()) // 调试用
                .order_by(MODEL.employee().personInformation().name()).asc_by_pinyin()
                .wants(MODEL.employee().role(), MODEL.employee().personInformation())


            .query(MODEL.employee()).list_of("merchant").with_string("merchant id")
                .comments("查询某个公司内的所有正式同事")
                .do_it_as()
                .where(MODEL.employee().merchant().eq("${merchant id}"),
                        MODEL.employee().status().in(EmployeeStatus.NORMAL))
//                .where(MODEL.employee().id().not_null()) // 调试用
                .order_by(MODEL.employee().personInformation().name()).asc_by_pinyin()
                .wants(MODEL.employee().role(), MODEL.employee().personInformation())


            .query(MODEL.employee()).list_of("colleague need approve").with_string("merchant id")
                .comments("查询用户在某个公司内的需要被approve的同事")
                .do_it_as()
                .where(MODEL.employee().merchant().eq("${merchant id}"),
                        MODEL.employee().status().in(EmployeeStatus.TO_BE_APPROVE),
                        MODEL.employee().invitation().not_null())
//                .where(MODEL.employee().invitationRecordListAsInvitee().inviter().not_null()) // 调试用
                .order_by(MODEL.employee().personInformation().name()).asc_by_pinyin()
                .wants(MODEL.employee().role(), MODEL.employee().personInformation())


            .query(MODEL.employee()).list_of("user acting").with_string("user id")
                .comments("查询用户任职的 employee 列表")
                .do_it_as()
                .where(MODEL.employee().personInformation().eq("${user id}"))
                .wants(MODEL.employee().merchant().organizationIdentityList(),
                        MODEL.employee().role(),
                        MODEL.employee().status())


       ;
    }
}
