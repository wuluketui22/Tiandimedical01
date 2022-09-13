package com.whackon.witmed.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 患者功能 - 患者家族史详情实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_dpfh_info")
public class DpfhInfo extends BaseEntity {
	private static final long serialVersionUID = 1086663295572892311L;
	@TableId(type = IdType.INPUT)
	private String id;                      // 主键采用雪花算法
	private String patInfo;                 // 患者信息
	private String famObsName;              // 家族史观察类目名称
	private String famObs;                  // 家族史观察结果
}
