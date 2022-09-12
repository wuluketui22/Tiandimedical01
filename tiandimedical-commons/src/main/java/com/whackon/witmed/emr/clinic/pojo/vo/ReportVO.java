package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-检查报告数据实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_report")
public class ReportVO extends BaseVO {
	private static final long serialVersionUID = -596222098400443245L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String checkOrg;						//检查报告单—机构（科室）
	private String checkNo;						//检查报告单—编号
	private String objResult;						//检查报告结果-客观所见
	private String subResult;						//检查报告结果-主观提示
	private String  checkDate;						//检查日期
	private String reportDate;						//检查报告日期
	private String remark;						//检查报告备注

}
