package com.whackon.witmed.system.hospital.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 专业技术职务等级视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class professionalLevelVO extends BaseVO {
    private static final long serialVersionUID = 2411050791168734528L;
    private Long id;                    //主键自增长
    private String category;            //所属类别
    private String theNameOfTheLevel;   //等级名称
    private String levelCoding;         //等级编码
}
