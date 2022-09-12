package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Queue;

/**
 * <b>天地医疗信息平台 - 系统功能 - 功能菜单实体信息</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_function_menu_information_table")
public class FunctionMenu extends BaseEntity {
    private static final long serialVersionUID = 4584147749635348303L;
    @TableId(type = IdType.INPUT)
    private Long id;                    //主键采用雪花算法
    private String parentMenu;          //上级菜单
    private String menuText;            //菜单文本
    private String linkAddress;         //链接地址
    private String menuIcon;            //菜单图标
    private String menuSorting;         //菜单排序
}
