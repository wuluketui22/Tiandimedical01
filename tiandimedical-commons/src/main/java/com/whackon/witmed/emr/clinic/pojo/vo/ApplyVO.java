package com.whackon.witmed.emr.clinic.pojo.vo;


import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-检查申请数据视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class ApplyVO extends BaseVO {
	private static final long serialVersionUID = -4706428859401180895L;
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String checkOrg;						//检查申请单—机构（科室）
	private String  checkNo;						//检查申请单—编号
	private String checkReason;						//检查申请检查原因
	private String reportDate;						//检查申请日期
	private String attention;						//检查申请注意事项
}
