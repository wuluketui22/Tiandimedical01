package com.whackon.witmed.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>医疗平台-患者功能-患者就诊记录实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName(" sys_treatment_record")
public class Record extends BaseEntity {
	private static final long serialVersionUID = -8984206433420095058L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String patient;						//患者信息
	private String medRecord;						//病历号
	private String clinicNo;						//门诊号
}
