package com.whackon.witmed.emr.wesmed.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方用药视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class WesmedMedicationVO extends BaseVO {
	private static final long serialVersionUID = 6823120817575741707L;
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
