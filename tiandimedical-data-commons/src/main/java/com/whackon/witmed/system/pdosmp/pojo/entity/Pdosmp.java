package com.whackon.witmed.system.pdosmp.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>地医疗平台-系统功能-人员专业实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("sys_pdosmp")
public class Pdosmp extends BaseEntity {
	private static final long serialVersionUID = 2038211945260246716L;
	@TableId(type= IdType.AUTO)
	private Long id;						//主键,采用主键自增长
	private String personnel;						//系统人员信息
	private String professional;						//专业信息


}
