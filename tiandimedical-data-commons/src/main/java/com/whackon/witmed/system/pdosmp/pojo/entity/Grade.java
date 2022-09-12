package com.whackon.witmed.system.pdosmp.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>医疗平台-系统功能-专业等级信息实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("sys_grade")
public class Grade extends BaseEntity {
	private static final long serialVersionUID = -8525274757455668032L;
	@TableId(type= IdType.AUTO)
	private Long id;						//主键,采用主键自增长
	private String grade;						//专业等级
}
