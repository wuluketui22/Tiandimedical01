package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-系统功能-区域行政视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = -7191568988043780672L;
	private Long id;						//主键,采用主键自增长
	private Long parent ;						//上级区划
	private Long name;						//区划名称
	private Long code;						//区划编码
	private Long postalcode;						//邮政编码
}
