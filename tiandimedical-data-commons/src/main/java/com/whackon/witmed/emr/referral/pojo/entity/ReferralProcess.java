package com.whackon.witmed.emr.referral.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）诊疗过程实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_referral_process")
public class ReferralProcess extends BaseEntity {
	private static final long serialVersionUID = 2300666662723777659L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	private String emrReferral;         // 所属转诊（院）记录
	private String txprocName;          // 诊疗过程名称
	private String txprocDesc;          // 诊疗过程描述
}
