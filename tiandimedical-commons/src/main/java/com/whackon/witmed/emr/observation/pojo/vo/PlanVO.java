package com.whackon.witmed.emr.observation.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-急诊留观病历子集-诊疗计划实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class PlanVO extends BaseVO {
	private static final long serialVersionUID = -2402286127077595713L;
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String inspect;						//拟做的检查
	private String programme;						//今后治疗方案
	private String sign;						//随访标志
	private String term;						//随访间隔（随诊期限）
	private String advice;						//医嘱
	private String attention;						//特别注意事项
}
