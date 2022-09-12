package com.whackon.witmed.emr.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>地医疗平台-急诊留观病历子集-诊疗计划实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_plan")
public class Plan extends BaseEntity {
	private static final long serialVersionUID = -2402286127077595713L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String inspect;						//拟做的检查
	private String programme;						//今后治疗方案
	private String sign;						//随访标志
	private String term;						//随访间隔（随诊期限）
	private String advice;						//医嘱
	private String attention;						//特别注意事项
}
