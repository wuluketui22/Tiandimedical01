package com.whackon.witmed.system.hospital.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院专业技术职务视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class ProfessionalTecVO extends BaseVO {
	private static final long serialVersionUID = -8098814748889237997L;
	private Long id;                        // 主键采用自增长
	private String categoryName;            // 类别名称
	private String categoryCode;            // 类别编码
}
