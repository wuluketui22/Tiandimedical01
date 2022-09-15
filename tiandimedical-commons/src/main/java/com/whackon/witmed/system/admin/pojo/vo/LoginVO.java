package com.whackon.witmed.system.admin.pojo.vo;

import lombok.Data;
/**
 * <b>天地医疗信息平台 - 系统功能 - 登录视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class LoginVO {
	private String id;
	private String name;
	private String cellphone;
	private String password;
}
