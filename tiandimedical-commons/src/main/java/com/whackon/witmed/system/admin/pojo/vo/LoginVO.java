package com.whackon.witmed.system.admin.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b>天地医疗信息平台 - 系统功能 - 登录视图信息<b/>
 * @author yan
 * @date 2022/9/12
 */
@Data
public class LoginVO implements Serializable {
	private static final long serialVersionUID = -3396428476145106132L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}",message = "手机号码格式错误")
	private String cellphone;
	@NotBlank(message = "未填写登录密码")
	@Pattern(regexp = "[0-9A-Za-z]{6,}",message = "登录密码格式错误")
	private String password;
}
