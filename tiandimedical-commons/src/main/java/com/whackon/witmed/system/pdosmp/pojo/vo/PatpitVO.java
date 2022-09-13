package com.whackon.witmed.system.pdosmp.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-系统功能-专业技术职务信息视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class PatpitVO extends BaseVO {
	private static final long serialVersionUID = -6070404394911196843L;
	private Long id;						//主键,采用主键自增长
	private String category;						//所属类别
	private String grade;						//专业等级
	private String name;						//专业技术职务名称
	private String code;						//专业技术职务编码


}
