package com.whackon.witmed.emr.casesSummary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要用药实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_medication_table")
public class Medication extends BaseEntity {
    private static final long serialVersionUID = 2204112735544206025L;
    @TableId(type = IdType.INPUT)
    private Long id;                                //主键采用雪花算法
    private String drugUsage;                       //药物用法
    private String frequencyOfDrugUse;              //药物使用-频率
    private String dosageUnitsForDrugUse;           //药物使用-剂量单位
    private String theDrugIsUsedInADose;            //药物使用-次剂量
    private String theTotalDoseOfTheDrugIsUsed;     //药物使用-总剂量
    private String drugUseRouteCode;                //药物使用-途径代码
    private String nameOfTheDrug;                   //药物名称
    private String drugDosageFormCode;              //药物剂型代码
    private String typeOfDrug;                      //药物类型
    private String drugNameCode;                    //药物名称代码'
}
