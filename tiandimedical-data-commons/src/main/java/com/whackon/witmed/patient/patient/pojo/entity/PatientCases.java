package com.whackon.witmed.patient.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;
import org.springframework.context.annotation.Primary;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者病例概要数据实体</b>
 *
 * @author YunHai
 * @date 2022/9/12
 */
@Data
@TableName("sys_summary_of_cases_data_sheet")
public class PatientCases extends BaseEntity {
	private static final long serialVersionUID = 7068066923394149062L;
	@TableId(type = IdType.INPUT)
	private Long id;                                                            //主键采用雪花算法
	private String caseInformation;                                             //病例信息
	private String patientInformation;                                          //患者信息
	private String emergencyInformation;                                        //急诊信息
	private String documentIDName;                                              //文档标识——名称
	private String documentIDCategoryCode;                                      //文档标识——管理机构名称
	private String documentIDGoverningBodyName;                                 //文档标识——管理机构组织机构代码
	private String documentIDNumber;                                            //档标识——号码
	private String documentIDEffectiveDate;                                     //文档标识-生效日期
	private String documentIDExpirationDate;                                    //文档标识-失效日期
	private String identificationNumber;                                        //标识号-号码
	private String identificationNumberExpirationDate;                          //标识号-失效日期
	private String identificationNumberNameOfTheInstitution;                    //标识号-提供标识的机构名称
	private String nameIdentifiesTheObject;                                     //姓名-标识对象
	private String nameIdentifiesTheObjectCodel;                                //姓名-标识对象代码
	private String name;                                                        //姓名
	private String patientTypeCode;                                             //病人类型代码
	private String ABOBloodType;                                                //ABO-血型
	private String RHBloodType;                                                 //RH-血型
	private String genderCode;                                                  //性别代码
	private String age;                                                         //年龄（岁）
	private String internationalCode;                                           //国际代码
	private String ethnicCode;                                                  //民族代码
	private String maritalStatusCategoryCode;                                   //婚姻状况类别代码
	private String occupationalCodingSystemName;                                //职业编码系统名称
	private String occupationCode;                                              //职业代码
	private String literacyCode;                                                //文化程度代码
	private String dateOfBirth;                                                 //出生日期
	private String placeOfBirth;                                                //出生地
	private String companyName;                                                 //工作单位名称
	private String addressCategoryCode;                                         //标识地址类别代码
	private String province;                                                    //地址-省（自治区，直辖市）
	private String city;                                                        //地址-市（地区）
	private String county;                                                      //地址-县（区）
	private String township;                                                    //地址-乡（镇，街道办事处
	private String village;                                                     //地址-村（街，路，弄等）
	private String houseNumber;                                                 //地址-门牌号码
	private String zipCode;                                                     //邮政编码
	private String boroughCode;                                                 //行政区代码
	private String medicareCategory;                                            //医疗保险-类别
	private String medicareCategoryCode;                                        //医疗保险-类别代码
	private String medicalTreatmentName;                                        //医疗待遇名称
	private String medicalTreatmentCode;                                        //医疗待遇代码
	private String publicHealthEmergency;                                       //卫生事件（动作）名称
	private String eventClassificationCode;                                     //事件分类代码
	private String eventStartTime;                                              //事件开始时间
	private String theEventEndTime;                                             //事件结束时间
	private String eventPlace;                                                  //事件发生地点
	private String eventParticipants;                                           //事件参与方
	private String eventOccurredDue;                                            //事件发生原因
	private String eventEnding;                                                 //事件结局






}
