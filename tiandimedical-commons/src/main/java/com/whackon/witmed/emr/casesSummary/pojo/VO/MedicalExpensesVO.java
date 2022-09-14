package com.whackon.witmed.emr.casesSummary.pojo.VO;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要医疗费用视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class MedicalExpensesVO extends BaseVO {
    private static final long serialVersionUID = 1510255974450536390L;
    private Long id;                                                    //主键采用雪花算法
    private String outpatientExpenseClassification;                     //门诊费用-分类
    private String outpatientExpenseClassificationCode;                 //门诊费用-分类代码
    private String theAmountOfOutpatientFees;                           //门诊费用-金额（元、人民币）
    private String paymentMethodCode;                                   //门诊费用-支付方式代码
    private String classificationOfHospitalizationExpenses;             //住院费用-分类
    private String classificationOfHospitalizationExpensesCode;         //住院费用-分类代码
    private String theAmountOfHospitalizationExpenses;                  //住院费用-金额（元、人民币）
    private String medicalPaymentMethodCodeForHospitalizationExpenses;  //住院费用-医疗付款方式代码
    private String individualExpensesAreBorneByIndividuals;             //个人承担费用（元）
}
