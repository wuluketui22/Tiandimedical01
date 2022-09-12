package com.whackon.witmed.emr.casesSummary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要疾病史实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_list_of_diseases")
public class Diseases extends BaseEntity {
    private static final long serialVersionUID = 2380671551024653166L;
    @TableId(type = IdType.INPUT)
    private Long id;                                                //主键采用雪花算法
    private String historyOfPreviousIllness;                        //既往疾病史
    private String previousPsychiatricDiseaseDiagnosisName;         //既往精神类疾病诊断名称
    private String namesOfPreviousDiseases;                         //既往疾病名称
    private String previousDiseaseCode;                             //既往疾病代码
    private String previousDiseaseDiagnosisInstitutions;            //既往疾病诊断机构
    private String previousDiseaseDiagnosticAgencyLevelCodes;       //既往疾病诊断机构级别代码
    private String timeOfDiagnosisOfPreviousDisease;                //既往疾病诊断时间
    private String diseaseCurrentStatusCode;                        //疾病当前状态代码
}
