package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 系统人员职务视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class PersonnelJobVO extends BaseVO {
    private static final long serialVersionUID = -5323308458762911885L;
    private Long id;                    //主键采用雪花算法
    private String systemPersonnel;     //系统人员
    private String jobTitleInformation; //职务信息
}
