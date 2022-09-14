package com.whackon.witmed.system.hospital.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>天地医疗信息平台 - 系统功能 - 医院视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class HospitalInfoVO extends BaseVO {
	private static final long serialVersionUID = 6200499291974008745L;
	private Long id;                // 主键采用自增长
	private String name;            // 医院名称
	private String acIdCode;        // 医院标识地址类别的代码
	private String province;        // 省
	private String city;            // 地址-市
	private String county;          // 地址-县
	private String town;            // 地址-镇
	private String village;         // 地址-村
	private String houseNumber;     // 门牌号码
	private String postalCode;      // 邮政编码
	private String areaNumber;      // 行政区划代码
	private String headOfOrganization;  // 机构负责人
}
