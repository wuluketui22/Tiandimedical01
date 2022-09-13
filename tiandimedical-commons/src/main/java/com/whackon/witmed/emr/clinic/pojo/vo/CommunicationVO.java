package com.whackon.witmed.emr.clinic.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-通信数据视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class CommunicationVO extends BaseVO {
	private static final long serialVersionUID = -556061463296030298L;
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String cateGory;						//联系电话-类别
	private String cateCode;						//联系电话-类别代码
	private String number;						//联系电话-号码
	private String email;						//电子邮件地址
}
