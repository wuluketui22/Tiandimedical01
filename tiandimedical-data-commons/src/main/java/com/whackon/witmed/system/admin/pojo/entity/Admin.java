package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_system_mp_info_db")
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 4226492550883944160L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	@TableField("jobNumber")
	private String jobNumber;           // 工号
	@TableField("name")
	private String name;                // 系统人员姓名
	@TableField("cellphone")
	private String cellphone;           // 系统人员手机号码
	@TableField("password")
	private String password;            // 系统人员登录密码
	@TableField("department")
	private String department;          // 系统人员所属科室
	@TableField("perIdentity")
	private String perIdentity;         // 系统人员身份
	@TableField("PerRole")
	private String PerRole;             // 系统人员角色
	private String providerPTP;         // 医务人员专业技术职务
	private String providerEB;          // 医务人员学历
	private String providerPTPG;        // 医务人员专业技术职务等级
}
