package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员对应患者实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_system_medrec")
public class SystemMedrec extends BaseEntity {
	private static final long serialVersionUID = 3909205070922849368L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	private String patInfo;             // 患者信息
	private String regDep;              // 所挂科室
}
