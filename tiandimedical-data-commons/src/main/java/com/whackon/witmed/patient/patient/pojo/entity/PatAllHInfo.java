package com.whackon.witmed.patient.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
/**
 * <b>天地医疗信息平台 - 患者功能 - 患者过敏史详情实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_patAllH_info")
public class PatAllHInfo extends BaseEntity {
	private static final long serialVersionUID = -7505623442377020206L;
	@TableId(type = IdType.INPUT)
	private String id;                          // 主键采用雪花算法
	private String patInfo;                     // 患者信息
	private String allHis;                      // 过敏史
	private String allergen;                    // 过敏原
	private String allergenS;                   // 过敏症状
	private String allDName;                    // 过敏药物名称
	private String allSta;                      // 过敏病情状态
	private String allHisId;                    // 过敏史标识
}
