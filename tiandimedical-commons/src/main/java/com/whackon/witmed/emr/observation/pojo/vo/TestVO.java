package com.whackon.witmed.emr.observation.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-急诊留观病历子集-医学检验实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_test")
public class TestVO extends BaseVO {
	private static final long serialVersionUID = -8614877373265939857L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String category;						//观察-类别
	private String categoryCode;						//观察-类别代码
	private String name;						//观察项目名称
	private String code;						//观察-项目代码
	private String description;						//观察-结果描述
	private String result;						//观察-结果(数值)
	private String measurement;						//观察-计量单位
	private String resultCode;						//观察-结果代码

}
