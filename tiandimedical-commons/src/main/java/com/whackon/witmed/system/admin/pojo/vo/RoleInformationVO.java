package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 角色视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class RoleInformationVO extends BaseVO {
    private static final long serialVersionUID = -353095419280550655L;
    private Long id;                    //主键采用雪花算法
    private String roleName;            //角色名称
    private String roleEnCodind;        //角色编码
}
