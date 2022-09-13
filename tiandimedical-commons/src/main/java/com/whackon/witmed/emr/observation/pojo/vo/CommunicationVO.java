package com.whackon.witmed.emr.observation.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗平台-急诊留观病历子集-通信信息视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class CommunicationVO extends BaseVO {
	private static final long serialVersionUID = -5871303381155565296L;
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String category;						//联系电话-类别
	private String cateCode;						//联系电话-类别代码
	private String number;						//联系电话-号码
	private String email;						//e-mail

}
