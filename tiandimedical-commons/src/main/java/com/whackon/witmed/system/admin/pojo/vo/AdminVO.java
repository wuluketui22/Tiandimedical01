package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = -7584920453456855383L;
	private String id;                  // 主键采用雪花算法
	private String jobNumber;           // 工号
	private String name;                // 系统人员姓名
	private String cellphone;           // 系统人员手机号码
	private String password;            // 系统人员登录密码
	private String department;          // 系统人员所属科室
	private String perIdentity;         // 系统人员身份
	private String PerRole;             // 系统人员角色
	private String providerPTP;         // 医务人员专业技术职务
	private String providerEB;          // 医务人员学历
	private String providerPTPG;        // 医务人员专业技术职务等级
}
