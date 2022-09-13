package com.whackon.witmed.emr.casesSummary.pojo.VO;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要疾病史视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class DiseasesVO extends BaseVO {
    private static final long serialVersionUID = 2380671551024653166L;
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
