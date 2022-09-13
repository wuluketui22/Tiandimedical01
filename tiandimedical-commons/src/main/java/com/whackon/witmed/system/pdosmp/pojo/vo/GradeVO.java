package com.whackon.witmed.system.pdosmp.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-系统功能-专业等级信息视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class GradeVO extends BaseVO {
	private static final long serialVersionUID = -8525274757455668032L;
	private Long id;						//主键,采用主键自增长
	private String grade;						//专业等级
}
