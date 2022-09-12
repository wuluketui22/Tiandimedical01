package com.whackon.witmed.patient.history.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-患者功能-患者既往病史实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName(" sys_anamnesis")
public class AnamnesisVO extends BaseVO {
	private static final long serialVersionUID = 6351930784191314137L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String patient;						//患者信息
	private String dishistory;						//既往疾病史
	private String  diagnosis;						//既往精神类疾病诊断名称
	private String name;						//既往疾病名称
	private String code;						//既往疾病代码
	private String organization;						//既往疾病诊断机构
	private String orgcode;						//既往疾病诊断机构级别代码
	private String  time;						//既往疾病诊断时间
	private String state ;						//疾病当前状态

}
