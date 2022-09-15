package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 患者功能 - 患者过敏史详情视图信息<b/>
 * @author yan
 * @date 2022/9/14
 */
@Data
public class PatAllHInfoVO extends BaseVO {
	private static final long serialVersionUID = 9187989638191982796L;
	private String id;                          // 主键采用雪花算法
	private String patInfo;                     // 患者信息
	private String allHis;                      // 过敏史
	private String allergen;                    // 过敏原
	private String allergenS;                   // 过敏症状
	private String allDName;                    // 过敏药物名称
	private String allSta;                      // 过敏病情状态
	private String allHisId;                    // 过敏史标识
}
