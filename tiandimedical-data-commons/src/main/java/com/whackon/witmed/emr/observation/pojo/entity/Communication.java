package com.whackon.witmed.emr.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗平台-急诊留观病历子集-通信信息实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_communication")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = -5871303381155565296L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String category;						//联系电话-类别
	private String cateCode;						//联系电话-类别代码
	private String number;						//联系电话-号码
	private String email;						//e-mail

}
