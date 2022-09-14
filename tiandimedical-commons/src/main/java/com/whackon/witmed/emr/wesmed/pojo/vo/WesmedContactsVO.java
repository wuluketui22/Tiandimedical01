package com.whackon.witmed.emr.wesmed.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方联系人视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class WesmedContactsVO extends BaseVO {
	private static final long serialVersionUID = 472220679864626913L;
	private String id;                  // 主键采用雪花算法
	private String emrClRx;             // 门（急）诊西医处方
	private String phoneCat;            // 联系电话-类别
	private String phoneCatCode;        // 联系电话-类别代码
	private String phoneNo;             // 联系电话-号码
	private String email;               // 电子邮件地址
}
