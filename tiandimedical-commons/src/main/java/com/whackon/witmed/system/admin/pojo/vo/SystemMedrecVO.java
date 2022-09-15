package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员对应患者视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class SystemMedrecVO extends BaseVO {
	private static final long serialVersionUID = 5432068135182674462L;
	private String id;                  // 主键采用雪花算法
	private String patInfo;             // 患者信息
	private String regDep;              // 所挂科室
}
