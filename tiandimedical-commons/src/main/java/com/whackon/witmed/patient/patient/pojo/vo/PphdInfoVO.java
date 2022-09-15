package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 患者功能 - 患者个人史详情视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class PphdInfoVO extends BaseVO {
	private static final long serialVersionUID = 1092369955380120572L;
	private String id;                          // 主键采用雪花算法
	private String patInfo;                     // 患者信息
	private String perHRF;                      // 个人史危险因素
	private String obsCName;                    // 个人史观察类目名称
	private String observations;                // 个人史观察结果
}
