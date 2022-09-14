package com.whackon.witmed.emr.referral.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）诊疗过程视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class ReferralProcessVO extends BaseVO {
	private static final long serialVersionUID = 1475088034945165388L;
	private String id;                  // 主键采用雪花算法
	private String emrReferral;         // 所属转诊（院）记录
	private String txprocName;          // 诊疗过程名称
	private String txprocDesc;          // 诊疗过程描述
}
