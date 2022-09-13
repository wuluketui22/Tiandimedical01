package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 角色菜单中间视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class RoleMenuVO extends BaseVO {
    private static final long serialVersionUID = 2205134622372302240L;
    private Long id;                        //主键采用雪花算法
    private String roleInformation;         //角色信息
    private String menuInformation;         //菜单信息
}
