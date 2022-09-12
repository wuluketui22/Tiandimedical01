package com.whackon.witmed.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者职业详情实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_patien_occupation_details_table")
public class PatientOccupation extends BaseEntity {
    private static final long serialVersionUID = 4099051140991628306L;
    @TableId(type = IdType.INPUT)
    private Long id;                    //主键采用雪花算法
    private String patientInformation;  //患者信息
    private String occupationName;      //职业名称
    private String occupationCode;      //职业代码
}
