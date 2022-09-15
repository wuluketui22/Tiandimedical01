package com.whackon.witmed.emr.referral.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）医院视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class ReferralHospitalVO extends BaseVO {
	private static final long serialVersionUID = 7194206979950309353L;
	private String id;                  // 主键采用雪花算法
	private String emrReferral;         // 所属转诊（院）记录
	private String orgName;             // 机构名称
	private String orgCode;             // 机构组织机构代码
	private String orgLeader;           // 机构负责人（法人）
	private String orgAddr;             // 机构地址
	private String deptName;            // 科室名称
	private String orgRole;             // 机构角色
	private String orgRoleCode;         // 机构角色代码
	private String servName;            // 服务者姓名*
	private String servRole;            // 服务者职责（角色）
	private String servRoleCode;        // 服务者职责（角色）代码
	private String servtechTitle;       // 服务者专业技术职务*
	private String servEdu;             // 服务者学历*
	private String servMajor;           // 服务者所学专业*
	private String servTechRank;        // 服务者专业技术职务等级*
	private String servPost;            // 服务者职务*
	private String referralMark;        // 转入转出标记：0-转出，1-转入
}
