package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 角色实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_role_information_table")
public class RoleInformation extends BaseEntity {
    private static final long serialVersionUID = -353095419280550655L;
    @TableId(type = IdType.INPUT)
    private Long id;                    //主键采用雪花算法
    private String roleName;            //角色名称
    private String roleEnCodind;        //角色编码
}
