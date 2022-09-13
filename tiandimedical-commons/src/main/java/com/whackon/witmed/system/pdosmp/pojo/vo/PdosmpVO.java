package com.whackon.witmed.system.pdosmp.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-系统功能-人员专业视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class PdosmpVO extends BaseVO {
	private static final long serialVersionUID = 2038211945260246716L;
	private Long id;						//主键,采用主键自增长
	private String personnel;						//系统人员信息
	private String professional;						//专业信息


}
