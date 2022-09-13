package com.whackon.witmed.emr.clinic.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-卫生服务者数据视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class ServiceVO extends BaseVO {
	private static final long serialVersionUID = 4688027638294854824L;
	private String id;						//主键,采用雪花算法
	private String emrClinic;						//所属急诊留观病
	private String name;						//服务者姓名
	private String roles;						//服务者职责（角色）
	private String roleCode;						//服务者职责（角色）代码
	private String patpotsp;						//服务者专业技术职务
	private String background;						//服务者学历
	private String major;						//服务者所学专业
	private String grade;						//服务者专业技术职务等级
	private String position;						//服务者职务

}
