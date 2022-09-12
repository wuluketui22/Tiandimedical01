package com.whackon.witmed.emr.wesmed.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方用药实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_wesmed_medication")
public class WesmedMedication extends BaseEntity {
	private static final long serialVersionUID = -4585570413700958716L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	private String emrClRx;             // 门（急）诊西医处方
	private String medUsage;            // 药物用法
	private String usageRate;           // 药物使用-频率
	private String medUnit;             // 药物使用-剂量单位
	private String perDosage;           // 药物使用-次剂量
	private String totalDosage;         // 药物使用-总剂量
	private String wayCode;             // 药物使用-途径代码
	private String medName;             // 药物名称
	private String dosageForm;          // 药物剂型代码
	private String medCat;              // 药物类型
	private String medNameCode;         // 药物名称代码
}
