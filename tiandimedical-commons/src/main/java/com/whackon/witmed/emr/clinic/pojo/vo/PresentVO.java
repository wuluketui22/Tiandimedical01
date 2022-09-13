package com.whackon.witmed.emr.clinic.pojo.vo;


import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-现病史数据视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class PresentVO extends BaseVO {
	private static final long serialVersionUID = -1777277028838643752L;
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String onsetDate;						//起病时间
	private String onsetDesc;						//起病情况描述
	private String sxOnsetReason;						//症状开始原因/诱因
	private String sxCh;						//症状特点
	private String sxAcc;						//伴随症状
	private String pastTx;						//本疾病既往诊疗经过
	private String onsetTx;						//起病后一般情况
	private String baseTx;						//基础疾病诊疗情况
}
