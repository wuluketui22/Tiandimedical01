package com.whackon.witmed.emr.casesSummary.pojo.VO;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要通讯视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class CommunicationVO extends BaseVO {
    private static final long serialVersionUID = -2400285358835605941L;
    private Long id;                            //主键采用雪花算法
    private String contactNumberCategory;       //联系电话-类别
    private String contactNumberCategoryCode;   //联系电话-类别代码
    private String contactNumber;               //联系电话-号码
    private String emailAddress;                //电子邮件地址
}
