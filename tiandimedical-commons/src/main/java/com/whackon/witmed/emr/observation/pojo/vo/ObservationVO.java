package com.whackon.witmed.emr.observation.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗平台-急诊留观病历子集视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class ObservationVO extends BaseVO {
	private static final long serialVersionUID = -6870943255787498573L;
	private String id;					//主键,采用雪花算法
	private String record;				//病历信息
	private String patient;				//患者信息
	private String outpatient;			//门诊信息
	private String document;			//文档标识-名称
	private String category;			//文档标识-类别代码
	private String mechanism;			//文档标识-管理机构名称
	private String legal;				//文档标识-管理机构组织机构代码（法人代码）
	private String number;				//文档标识-号码
	private String eff;					//文档标识-生效日期
	private String exp;					//文档标识-失效日期
	private String object;				//姓名-标识对象
	private String objectCode;			//姓名-标识对象代码
	private String name;				// 姓名
	private String patientCode;			// 病人类型代码
	private String idCategory;			//标识号-类别代码法
	private String idNumber;			//标识号-号码
	private String idEff;				//标识号-生效日期
	private String idExp;				//标识号-失效日期
	private String idMechanism;			//标识号-提供标识的机构名称
	private String birth;				//出生日期
	private String birthplace;			//出生地
	private String gende;				//性别代码
	private String age;					//年龄（岁）
	private String nationality;			//国籍代码
	private String nation;				//民族代码
	private String marriage;			//婚姻状况类别代码
	private String occupation;			//职业编码系统名称
	private String vocation;			//职业代码
	private String education;			//文化程度代码
	private String address;				//标识地址类别的代码
	private String province;			//地址-省（自治区、直辖市）
	private String city;				// 地址-市（地区）
	private String county;				// 地址-县（区）
	private String town;				// 地址-乡（镇、街道办事处）
	private String village;				// 地址-村（街、路、弄等）
	private String doorplate;			//地址-门牌号码
	private String postalcode;			//邮政编码
	private String division;			// 行政区划代码
	private String company;				//工作单位名称
	private String institution;			//机构名称
	private String establishments;		//机构组织机构代码
	private String corporation;			//机构负责人（法人）
	private String enterprise;			// 机构地址
	private String department;			//科室名称
	private String  role;				//机构角色
	private String part;				//机构角色代码
	private String explain;				//主诉
	private String symPtomName;			//症状代码编码体系名称
	private String symCode;				//症状代码
	private String start;				//症状开始日期时间
	private String stop;				//症状停止日期时间
	private String obDocument;			//观察-类别
	private String  obCategory;			//观察-类别代码
	private String obMechanism;			//观察项目名称
	private String  obProject;			//观察-项目代码
	private String obScribe;			//观察-结果描述
	private String  result;				//观察-结果(数值)
	private String unit;				//观察-计量单位
	private String obResultCode;		//观察-结果代码
	private String onset;				//起病时间
	private String solar;				//起病节气归属代码
	private String deScribe;			//起病情况描述
	private String reason;				//症状开始原因/诱因
	private String trait;				//症状特点
	private String symptom;				//伴随症状
	private String after;				// 本疾病既往诊疗经过
	private String situation;			//起病后一般情况
	private String illustrate;			//基础疾病诊疗情况
	private String  project;			//既往观察-项目名称
	private String classification;		//既往观察-项目分类代码
	private String procode;				//既往观察-项目代码名称
	private String obCode;				//既往观察-项目代码
	private String  method;				//既往观察-方法代码
	private String obResult ;			//既往观察-结果
	private String  categoryName;		//既往史观察项目类目名称
	private String  obSerPrevious;		//既往史观察结果
	private String  factors;			//个人史危险因素代码
	private String  obCategoryName;		//个人史观察项目类目名称
	private String  obServations;		//个人史观察结果
	private String  catName;			//家族史观察项目类目名称
	private String  famResult;			//家族史观察结果
	private String  insDocument;		//观察-类别（检查）
	private String  insCategory;		//观察-类别代码（检查）
	private String  insMechanism;		//观察项目名称（检查）
	private String  insProject;			//观察-项目代码（检查）
	private String  insScribe;			//观察-结果描述（检查）
	private String  inSresult;			//观察-结果(数值)（检查）
	private String  insUnit;			//观察-计量单位（检查）
	private String  resultCode;			// 观察-结果代码（检查）
	private String  insPect;			//检查部位（检查）
	private String  insPart;			//检查部位代码（检查）
	private String  insMethod;			//检查方法代码（检查）
	private String  diaName;			// 诊断机构名称
	private String  diaData;			// 诊断日期
	private String  diaCategory;		// 诊断类别
	private String  diaCatCode;			//诊断类别代码
	private String  diaOrder;			//诊断顺位（从属关系）代码
	private String  disName;			//疾病名称
	private String   disEaseCode;		//疾病代码
	private String  basis;				//诊断依据
	private String   diaBasis;			//诊断依据代码
	private String  reccCype;			//病程记录类别









}
