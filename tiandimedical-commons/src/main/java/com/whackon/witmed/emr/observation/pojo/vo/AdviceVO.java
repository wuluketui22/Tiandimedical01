package com.whackon.witmed.emr.observation.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-急诊留观病历子集-医嘱信息实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName("emr_clinic_obs_advice")
public class AdviceVO extends BaseVO {
	private static final long serialVersionUID = -1048774035821601875L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String soemr;						//所属急诊留观病
	private String category;						//医嘱类别
	private String content;						//医嘱内容
	private String order;						//医嘱开嘱时间
	private String suspension;						//长期医嘱停嘱时间
	private String implement;						//医嘱执行时间
	private String cancel;						//医嘱取消时间
}
