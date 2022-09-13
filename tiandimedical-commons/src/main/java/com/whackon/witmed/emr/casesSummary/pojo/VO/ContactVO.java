package com.whackon.witmed.emr.casesSummary.pojo.VO;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 病例概要联系人视图</b>
 *
 * @author YunHai
 * @date 2022/9/13
 */
@Data
public class ContactVO extends BaseVO {
    private static final long serialVersionUID = -931467739062219097L;
    private Long id;                                            //主键采用雪花算法
    private String identificationNumberCategoryCode;            //标识号-类别代码
    private String identificationNumber;                        //标识号-号码
    private String identificationNumberEffectiveDate;           //标识号-生效日期
    private String dentificationNumberExpirationDate;           //标识号-失效日期
    private String entificationNumberNameOfTheInstitution;      //标识号-提供标识的机构名称
    private String nameIdentifiesTheObject;                     //姓名-标识对象
    private String nameIdentifiesTheObjectCode;                 //姓名-标识对象代码
    private String name;                                        //姓名
}
