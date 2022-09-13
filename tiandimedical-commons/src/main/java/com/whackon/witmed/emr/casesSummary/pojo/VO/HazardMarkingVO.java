package com.whackon.witmed.emr.casesSummary.pojo.VO;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要个体危险性标识视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class HazardMarkingVO extends BaseVO {
    private static final long serialVersionUID = 2242112840377267776L;
    private Long id;                        //主键采用雪花算法
    private String individualRiskName;      //个体危险性名称
    private String individualRiskCode;      //个体危险性代码
}
