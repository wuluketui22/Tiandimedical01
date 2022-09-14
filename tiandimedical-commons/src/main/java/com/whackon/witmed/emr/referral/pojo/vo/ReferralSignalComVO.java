package com.whackon.witmed.emr.referral.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 转诊（院）通信视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class ReferralSignalComVO extends BaseVO {
	private static final long serialVersionUID = -5084086077800096544L;
	private String id;                  // 主键采用雪花算法
	private String emrReferral;         // 所属转诊（院）记录
	private String phoneCat;            // 联系电话-类别
	private String phoneCatCode;        // 联系电话-类别代码
	private String phoneNo;             // 联系电话-号码
	private String email;               // 电子邮件地址
}
