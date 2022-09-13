package com.whackon.witmed.emr.observation.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗平台-急诊留观病历子集-诊疗过程记录视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class ProcessVO extends BaseVO {
	private static final long serialVersionUID = 6525037518239844445L;
	private String id;						//主键,采用雪花算法
	private String soemr;					//所属急诊留观病:
	private String nodatp;					//诊疗过程名称
	private String dodatp;					//诊疗过程描述


}
