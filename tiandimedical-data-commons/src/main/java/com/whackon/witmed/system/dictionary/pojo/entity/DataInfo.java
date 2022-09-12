package com.whackon.witmed.system.dictionary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 数据元值域实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_data_info")
public class DataInfo extends BaseEntity {
	private static final long serialVersionUID = 261999676466923336L;
	@TableId(type = IdType.AUTO)
	private Long id;                        //主键自增长
	private String parent;                  //上级数据元
	private String code;                    //数据元值域
	private String text;                    //数据源值域含义
	private String illustrate;              //数据元值说明
}
