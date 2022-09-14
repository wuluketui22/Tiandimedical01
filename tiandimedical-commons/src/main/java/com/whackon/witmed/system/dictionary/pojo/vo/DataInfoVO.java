package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 数据元值域视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class DataInfoVO extends BaseVO {
    private static final long serialVersionUID = 261999676466923336L;
    private Long id;                        //主键自增长
    private String parent;                  //上级数据元
    private String code;                    //数据元值域
    private String text;                    //数据源值域含义
    private String illustrate;              //数据元值说明
}
