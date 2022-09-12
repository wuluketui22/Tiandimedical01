package com.whackon.witmed.emr.casesSummary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要个体危险性标识实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_individual_hazard_identification_table")
public class HazardMarking extends BaseEntity {
    private static final long serialVersionUID = 2242112840377267776L;
    @TableId(type = IdType.INPUT)
    private Long id;                        //主键采用雪花算法
    private String individualRiskName;      //个体危险性名称
    private String individualRiskCode;      //个体危险性代码
}
