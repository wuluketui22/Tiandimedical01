package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 角色菜单中间实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_the_middle_table_in_the_role_menu")
public class RoleMenu extends BaseEntity {
    private static final long serialVersionUID = 2205134622372302240L;
    @TableId(type = IdType.INPUT)
    private Long id;                        //主键采用雪花算法
    private String roleInformation;         //角色信息
    private String menuInformation;         //菜单信息
}
