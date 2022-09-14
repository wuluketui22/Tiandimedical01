package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 数据字典视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class DataDictionaryVO extends BaseVO {
	private static final long serialVersionUID = 4005126915879087889L;
	private Long id;                        // 主键自增长
	private String superiorDic;             // 上级字典
	private String name;                    // 字典名称
	private String dicCode;                 // 字典编码
}
