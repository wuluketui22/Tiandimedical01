package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 国标视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class StandardVO extends BaseVO {
	private static final long serialVersionUID = 1370082286757605239L;
	private Long id;                        // 主键采用自增长
	private String parent;                  // 上级数据元
	private String code;                    // 数据元值域
	private String text;                    // 数据源值域含义
}
