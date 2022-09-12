package com.whackon.witmed.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
/**
 * <b>天地医疗信息平台 - 系统功能 - 医院科室实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_department_info_db")
public class DepartmentInfo extends BaseEntity {
	private static final long serialVersionUID = -7036621653410773794L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键采用自增长
	private String affiliatedHospital;      // 所属医院
	private String superiorDepartment;      // 上级科室
	private String departmentName;          // 科室名称
	private String departmentCode;          // 科室编号
}
