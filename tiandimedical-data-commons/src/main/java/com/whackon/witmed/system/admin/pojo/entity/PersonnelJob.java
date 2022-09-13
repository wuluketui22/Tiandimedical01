package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员职务实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_system_personnel_job_information_table")
public class PersonnelJob extends BaseEntity {
    private static final long serialVersionUID = -5323308458762911885L;
    @TableId(type = IdType.INPUT)
    private Long id;                    //主键采用雪花算法
    private String systemPersonnel;     //系统人员
    private String jobTitleInformation; //职务信息

}
