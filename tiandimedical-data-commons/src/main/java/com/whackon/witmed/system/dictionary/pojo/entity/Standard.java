package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 国标实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_standard_db")
public class Standard extends BaseEntity {
	private static final long serialVersionUID = 1622887667519437190L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键采用自增长
	private String parent;                  // 上级数据元
	private String code;                    // 数据元值域
	private String text;                    // 数据源值域含义
}
