package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-过敏史数据实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_allergy")
public class AllergyVO extends BaseVO {

	private static final long serialVersionUID = -834387526970049413L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String acrosthesia;						//过敏史
	private String allergen;						//过敏原
	private String symptoms;						//过敏症状
	private String symptomCode;						//过敏症状代码
	private String allergenCode;						//过敏原代码
	private String name;						//过敏药物名称
	private String statusCode;						//过敏病情状态代码
	private String severityCode;						//过敏严重性代码
	private String identificationCode;						//过敏史标识代码

}
