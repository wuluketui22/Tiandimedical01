package com.whackon.witmed.system.hospital.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 专业技术职务等级实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_professional_and_technical_job_levels")
public class professionalLevel extends BaseEntity {
    private static final long serialVersionUID = 2411050791168734528L;
    @TableId(type = IdType.AUTO)
    private Long id;                    //主键自增长
    private String category;            //所属类别
    private String theNameOfTheLevel;   //等级名称
    private String levelCoding;         //等级编码
}
