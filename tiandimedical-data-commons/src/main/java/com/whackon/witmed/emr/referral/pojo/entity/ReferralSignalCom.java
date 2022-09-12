package com.whackon.witmed.emr.referral.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）通信实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_referral_signalCom")
public class ReferralSignalCom extends BaseEntity {
	private static final long serialVersionUID = 5450580276168037813L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	private String emrReferral;         // 所属转诊（院）记录
	private String phoneCat;            // 联系电话-类别
	private String phoneCatCode;        // 联系电话-类别代码
	private String phoneNo;             // 联系电话-号码
	private String email;               // 电子邮件地址
}
