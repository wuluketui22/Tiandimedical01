package com.whackon.witmed.patient.patient.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 患者通讯详情视图信息</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class CommunicationDetailsVO extends BaseVO {
    private static final long serialVersionUID = 7090007596475277629L;
    private Long id;                        //主键采用雪花算法
    private String patientInformation;      //患者信息
    private String cellphoneCategory;       //联系电话类别
    private String cellphone;               //联系电话
    private String EmailAddress;            //电子邮件地址
}
