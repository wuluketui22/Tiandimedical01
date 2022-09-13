package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-既往史数据视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class PastVO extends BaseVO {
	private static final long serialVersionUID = -7692672464097760814L;
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属门(急)诊病历
	private String project;						//既往观察-项目名称
	private String classification;						//既往观察-项目分类代码
	private String proCode;						//既往观察-项目代码名称
	private String obCode;						//既往观察-项目代码
	private String method;						// 既往观察-方法代码
	private String obResult;						//既往观察-结果
	private String category;						//既往史观察项目类目名称
	private String obServations;						//既往史观察结果

}
