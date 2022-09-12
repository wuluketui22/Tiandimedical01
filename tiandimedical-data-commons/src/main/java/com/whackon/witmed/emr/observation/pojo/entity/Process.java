package com.whackon.witmed.emr.observation.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗平台-急诊留观病历子集-诊疗过程记录实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_process")
public class Process extends BaseEntity {
	private static final long serialVersionUID = 6525037518239844445L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;					//所属急诊留观病:
	private String nodatp;					//诊疗过程名称
	private String dodatp;					//诊疗过程描述


}
