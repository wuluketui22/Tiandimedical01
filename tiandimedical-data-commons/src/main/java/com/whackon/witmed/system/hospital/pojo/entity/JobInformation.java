package com.whackon.witmed.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院职务实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_hospital_job_information")
public class JobInformation extends BaseEntity {
    private static final long serialVersionUID = 6938908332140742482L;
    @TableId(type = IdType.INPUT)
    private Long id;                    //主键采用雪花算法
    private String departmentCode;      //所属科室
    private String titleName;           //职务名称
}
