package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-检查申请数据实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_check_apply")
public class ApplyVO extends BaseVO {
	private static final long serialVersionUID = -4706428859401180895L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String checkOrg;						//检查申请单—机构（科室）
	private String  checkNo;						//检查申请单—编号
	private String checkReason;						//检查申请检查原因
	private String reportDate;						//检查申请日期
	private String attention;						//检查申请注意事项
}
