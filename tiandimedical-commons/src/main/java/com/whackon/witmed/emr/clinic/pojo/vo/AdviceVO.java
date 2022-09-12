package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-医嘱数据实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_advice")
public class AdviceVO extends BaseVO {

	private static final long serialVersionUID = -1428869732739406209L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String order;						//医嘱开嘱日期时间
	private String suspension;						//长期医嘱停嘱日期时间
	private String implement;						//医嘱执行日期时间
	private String medTime;						//医嘱执行时间类别代码
	private String  cancel;						//医嘱取消日期时间
	private String  category;						//医嘱类别
	private String content;						//医嘱内容

}
