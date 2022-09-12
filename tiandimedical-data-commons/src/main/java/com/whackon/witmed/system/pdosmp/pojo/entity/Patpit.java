package com.whackon.witmed.system.pdosmp.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>医疗平台-系统功能-专业技术职务信息实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("sys_patpit")
public class Patpit extends BaseEntity{
	private static final long serialVersionUID = -6070404394911196843L;
	@TableId(type= IdType.AUTO)
	private Long id;						//主键,采用主键自增长
	private String category;						//所属类别
	private String grade;						//专业等级
	private String name;						//专业技术职务名称
	private String code;						//专业技术职务编码


}
