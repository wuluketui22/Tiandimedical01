package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-患者功能-患者医疗保险视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class InsuranceVO extends BaseVO {
	private static final long serialVersionUID = 1255903039761584704L;
	private String id;						//主键,采用雪花算法
	private String patient;						//患者信息
	private String category;						//医疗保险类别

}
