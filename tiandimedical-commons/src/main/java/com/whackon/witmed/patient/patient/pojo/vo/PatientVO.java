package com.whackon.witmed.patient.patient.pojo.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>医疗平台-患者功能-患者实体信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
@TableName(" sys_patient")
public class PatientVO extends BaseVO {

	private static final long serialVersionUID = -3601151221117433566L;
	@TableId(type= IdType.INPUT)
	private String id;						//主键,采用雪花算法
	private String number;						//病历号
	private String name;						//姓名
	private String cellphone;						//手机号码
	private String  password;						//登录密码
	private String type;						//证件类型
	private String idNumber;						//证件号码
	private String provider;						//证件提供机构
	private String eff;						//证件生效日期
	private String exp;						//证件失效日期
	private String  front;						//证件正面照片
	private String  reverse;						//证件反面照片
	private String ABO;						//ABO血型
	private String RH;						//RH血型
	private String gender;						//性别
	private String nationality;						//国籍
	private String nation;						//民族
	private String marital;						//婚姻状况
	private String  education;						//文化程度
	private String birth;						//出生日期
	private String provincebirth;						//出生地所在省（自治区、直辖市）
	private String citybirth;						//出生地所在市（地区
	private String countybirth;						//出生地所在县（区）
	private String townbirth;						//出生地所在乡（镇、街道办事处）
	private String unit;						//工作单位名称
	private String contact;						//联系地址类型
	private String province;						//地址-省（自治区、直辖市）
	private String city;						//地址-市（地区）
	private String county;						//地址-县（区）
	private String town;						//地址-乡（镇、街道办事处）
	private String village;						//地址-村（街、路、弄等）
	private String doorplate;						//地址-门牌号码 门牌
	private String  postalcode;						//邮政编码
	private String division;						//行政区划代码
}
