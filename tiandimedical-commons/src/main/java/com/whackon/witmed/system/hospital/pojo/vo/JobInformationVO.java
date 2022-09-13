package com.whackon.witmed.system.hospital.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院职务视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class JobInformationVO extends BaseVO {
    private static final long serialVersionUID = 6938908332140742482L;
    private Long id;                    //主键采用雪花算法
    private String departmentCode;      //所属科室
    private String titleName;           //职务名称
}
