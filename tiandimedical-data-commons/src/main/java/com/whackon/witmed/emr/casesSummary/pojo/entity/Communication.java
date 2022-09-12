package com.whackon.witmed.emr.casesSummary.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要通讯实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_case_summary_communication_sheet")
public class Communication extends BaseEntity {
	private static final long serialVersionUID = -2400285358835605941L;
	@TableId(type = IdType.INPUT)
	private Long id;                            //主键采用雪花算法
	private String contactNumberCategory;       //联系电话-类别
	private String contactNumberCategoryCode;   //联系电话-类别代码
	private String contactNumber;               //联系电话-号码
	private String emailAddress;                //电子邮件地址
}
