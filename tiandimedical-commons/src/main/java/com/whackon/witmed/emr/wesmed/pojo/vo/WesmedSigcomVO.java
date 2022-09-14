package com.whackon.witmed.emr.wesmed.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方通信视图信息<b/>
 * @author yan
 * @date 2022/9/14
 */
@Data
public class WesmedSigcomVO extends BaseVO {
	private static final long serialVersionUID = -2825313694860316707L;
	private String id;                  // 主键采用雪花算法
	private String emrClRx;             // 门（急）诊西医处方
	private String phoneCat;            // 联系电话-类别
	private String phoneCatCode;        // 联系电话-类别代码
	private String phoneNo;             // 联系电话-号码
	private String email;               // 电子邮件地址
}
