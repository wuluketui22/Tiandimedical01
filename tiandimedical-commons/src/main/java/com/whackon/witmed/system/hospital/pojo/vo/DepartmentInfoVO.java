package com.whackon.witmed.system.hospital.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院科室视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class DepartmentInfoVO extends BaseVO {
	private static final long serialVersionUID = 3561894076494070277L;
	private Long id;                        // 主键采用自增长
	private String affiliatedHospital;      // 所属医院
	private String superiorDepartment;      // 上级科室
	private String departmentName;          // 科室名称
	private String departmentCode;          // 科室编号
}
