package com.whackon.witmed.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者联系人详情实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_patient_contact_details_table")
public class PatientContact extends BaseEntity {
    private static final long serialVersionUID = -5892754924366498546L;

    private Long id;                                     //主键采用雪花算法
    private String patientInformation;                   //患者信息
    private String theTypeOfCredential;                  //证件类型
    private String contactCategory;                      //联系人信息
    private String contactName;                          //联系人姓名
    private String cellphone;                            //手机号码
    private String theEffectiveDateOfTheDocument;        //证件生效日期
}
