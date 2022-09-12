package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 数据字典实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_systemData_dic_db")
public class DataDictionary extends BaseEntity {
	private static final long serialVersionUID = -5296370122228599834L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键自增长
	private String superiorDic;             // 上级字典
	private String name;                    // 字典名称
	private String dicCode;                 // 字典编码
}
