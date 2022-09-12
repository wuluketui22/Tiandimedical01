package com.whackon.witmed.emr.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>地医疗平台-急诊留观病历子集-过敏史实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_allergy")
public class Allergy extends BaseEntity {
	private static final long serialVersionUID = -5144757346384395093L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String allergic;						//过敏史
	private String allergen;						//过敏原
	private String symptoms;						//过敏症状
	private String symptomCode;						//过敏症状代码
	private String allergenCode;						//过敏原代码
	private String name;						//过敏药物名称
	private String statusCode;						//过敏病情状态代码
	private String severityCode;						//过敏严重性代码
	private String identificationCode;						//过敏史标识代码

}
