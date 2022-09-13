package com.whackon.witmed.emr.casesSummary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者通讯详情实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_patient_communication_details_table")
public class SummaryOfCases extends BaseEntity {
    private static final long serialVersionUID = 7090007596475277629L;
    @TableId(type = IdType.INPUT)
    private Long id;                        //主键采用雪花算法
    private String patientInformation;      //患者信息
    private String cellphoneCategory;       //联系电话类别
    private String cellphone;               //联系电话
    private String EmailAddress;            //电子邮件地址
}
