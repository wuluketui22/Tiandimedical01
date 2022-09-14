package com.whackon.witmed.emr.clinic.pojo.vo;


import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>地医疗平台-门(急)诊病历子集数据集-视图信息</b>
 *
 * @author DELL
 * @date 2022/9/12
 */
@Data
public class ClinicVO extends BaseVO {
	private static final long serialVersionUID = -206375603299577937L;
	private String id;						//主键,采用雪花算法
	private String record;					//病历信息
	private String patient;					//患者信息
	private String outpatient;				//门诊信息
	private String document;				//文档标识-名称
	private String category;				//文档标识-类别代码
	private String legal;					// 文档标识-管理机构组织机构代码（法人代码）
	private String number;					//文档标识-号码
	private String eff;						//文档标识-生效日期
	private String exp;						//文档标识-失效日期
	private String idCategory;				//标识号-类别代码
	private String idNumber;				// 标识号-号码
	private String idEff;					//标识号-生效日期
	private String idExp;					//标识号-失效日期
	private String idMechanism;				//标识号-提供标识的机构名称
	private String object;					//姓名-标识对象
	private String objectCode;				//姓名-标识对象代码
	private String name;					//姓名
	private String patCode;					// 病人类型代码
	private String gende;					//  性别代码
	private String age;						//年龄（岁）
	private String nationality;				//国籍代码
	private String nation;					//  民族代码
	private String marriage;				//婚姻状况类别代码
	private String occupation;				//职业编码系统名称
	private String vocation;				//职业代码
	private String education;				//文化程度代码
	private String birth;					//出生日期
	private String birthplace;				//出生地
	private String company;					//工作单位名称
	private String address;					//标识地址类别的代码
	private String province;				//  地址-省（自治区、直辖市）
	private String city;					// 地址-市（地区）
	private String county;					//  地址-县（区）
	private String town;					//地址-乡（镇、街道办事处）
	private String village;					// 地址-村（街、路、弄等）
	private String doorplate;				//地址-门牌号码
	private String postalcode;				//  邮政编码
	private String division;				//行政区划代码
	private String institution;				//机构名称
	private String establishments;			//机构组织机构代码
	private String corporation;				//机构负责人（法人）
	private String enterprise;				//机构地址
	private String department;				//科室名称
	private String role;					// 机构角色
	private String part;					//机构角色代码
	private String eveName;					//卫生事件(动作)名称
	private String eveClassification;		//事件分类代码
	private String eveStart;				//事件开始时间
	private String eveEnd;					//事件结束时间
	private String eveSite;					//事件发生地点
	private String evePlace;				//事件发生场所
	private String eveParticipants;			//事件参与方
	private String eveReason;				//  事件发生原因
	private String eveEnding;				//  事件结局
	private String explain;					//主诉
	private String symPtom;					//症状代码编码体系名称
	private String symCode;					//症状代码
	private String start;					//症状开始日期时间
	private String stop;					//  症状停止日期时间
	private String symDescribe;				//症状描述
	private String symDegree;				//  症状急性程度代码
	private String severity;				//严重程度代码
	private String visit;					// 初诊标志
	private String obDocument;				//观察-类别
	private String obCategory;				//观察-类别代码
	private String obMechanism;				//观察项目名称
	private String obProject;				//观察-项目代码
	private String obScribe;				// 观察-结果描述
	private String result;					//观察-结果(数值)
	private String unit;					//观察-计量单位
	private String obResult;				//观察-结果代码
	private String insDocument;				//观察-类别（检查）
	private String insCategory;				//观察-类别代码（检查）
	private String insMechanism;			//观察项目名称（检查）
	private String insProject;				// 观察-项目代码（检查
	private String insScribe;				// 观察-结果描述（检查）
	private String inSresult;				//观察-结果(数值)（检查）
	private String insUnit;					//观察-计量单位（检查）
	private String insFruit;				// 观察-结果代码（检查）
	private String insPect;					//检查部位（检查）
	private String insPart;					//检查部位代码（检查）
	private String insMethod;				//检查方法代码（检查）
	private String diaName;					//诊断机构名称
	private String diaData;					//诊断日期
	private String diaCategory;				// 诊断类别
	private String diaCatCode;				//诊断类别代码
	private String diaOrder;				//诊断顺位（从属关系）代码
	private String disName;					//疾病名称
	private String disEase ;				// 疾病代码
	private String basis;					// 诊断依据
	private String diaBasis;				//诊断依据代码
	private String insProposed;				//拟做的检查
	private String insTest;					// 拟做的医学检验
	private String programme;				//  今后治疗方案
	private String sign;					// 随访标志
	private String term;					//随访间隔（随诊期限）
	private String advice;					//医嘱
	private String attention;				//特别注意事项
	private String treName;					// 诊疗过程名称
	private String diaDescribe;				//诊疗过程描述


}
