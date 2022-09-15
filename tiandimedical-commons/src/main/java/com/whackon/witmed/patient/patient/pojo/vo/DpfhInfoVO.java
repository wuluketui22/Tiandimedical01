package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 患者功能 - 患者家族史详情视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class DpfhInfoVO extends BaseVO {
	private static final long serialVersionUID = -5396548041791773276L;
	private String id;                      // 主键采用雪花算法
	private String patInfo;                 // 患者信息
	private String famObsName;              // 家族史观察类目名称
	private String famObs;                  // 家族史观察结果
}
