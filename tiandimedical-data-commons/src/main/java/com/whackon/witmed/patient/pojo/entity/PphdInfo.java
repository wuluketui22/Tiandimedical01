package com.whackon.witmed.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 患者功能 - 患者个人史详情实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_pphd_info")
public class PphdInfo extends BaseEntity {
	private static final long serialVersionUID = 7704537820609856837L;
	@TableId(type = IdType.INPUT)
	private String id;                          // 主键采用雪花算法
	private String patInfo;                     // 患者信息
	private String perHRF;                      // 个人史危险因素
	private String obsCName;                    // 个人史观察类目名称
	private String observations;                // 个人史观察结果
}
