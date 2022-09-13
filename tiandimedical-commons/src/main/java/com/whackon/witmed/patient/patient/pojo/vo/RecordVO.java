package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-患者功能-患者就诊记录视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class RecordVO extends BaseVO {
	private static final long serialVersionUID = -8984206433420095058L;
	private String id;						//主键,采用雪花算法
	private String patient;						//患者信息
	private String medRecord;						//病历号
	private String clinicNo;						//门诊号
}
