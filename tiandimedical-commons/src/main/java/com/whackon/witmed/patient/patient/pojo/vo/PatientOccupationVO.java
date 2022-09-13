package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者职业详情视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class PatientOccupationVO extends BaseVO {
	private static final long serialVersionUID = 4099051140991628306L;
	private Long id;                    //主键采用雪花算法
	private String patientInformation;  //患者信息
	private String occupationName;      //职业名称
	private String occupationCode;      //职业代码
}
