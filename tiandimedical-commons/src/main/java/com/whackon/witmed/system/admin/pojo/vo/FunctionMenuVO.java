package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 功能菜单视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class FunctionMenuVO extends BaseVO {
	private static final long serialVersionUID = 4584147749635348303L;
	private Long id;                    //主键采用雪花算法
	private String parentMenu;          //上级菜单
	private String menuText;            //菜单文本
	private String linkAddress;         //链接地址
	private String menuIcon;            //菜单图标
	private String menuSorting;         //菜单排序
}
