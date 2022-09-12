package com.whackon.witmed.emr.wesmed.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 电子病历功能 - 西医处方联系人实体信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
@TableName("sys_wesmed_con")
public class WesmedContacts extends BaseEntity {
	private static final long serialVersionUID = 3721378299551737731L;
	@TableId(type = IdType.INPUT)
	private String id;                  // 主键采用雪花算法
	private String emrClRx;             // 门（急）诊西医处方
	private String phoneCat;            // 联系电话-类别
	private String phoneCatCode;        // 联系电话-类别代码
	private String phoneNo;             // 联系电话-号码
	private String email;               // 电子邮件地址
}
