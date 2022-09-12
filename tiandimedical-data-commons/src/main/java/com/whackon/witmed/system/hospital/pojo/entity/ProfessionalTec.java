package com.whackon.witmed.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院专业技术职务实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_professional_TJC_db")
public class ProfessionalTec extends BaseEntity {
	private static final long serialVersionUID = 1541780818167246482L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键采用自增长
	private String categoryName;            // 类别名称
	private String categoryCode;            // 类别编码
}
