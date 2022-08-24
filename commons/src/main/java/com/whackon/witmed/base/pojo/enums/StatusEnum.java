package com.whackon.witmed.base.pojo.enums;

/**
 * <b>系统状态枚举信息</b>
 *
 * @author yan
 * @date 2022/8/24
 */
public enum StatusEnum {
	STATUS_ENABLE(BaseEnumConstants.STATUS_ENABLE,"启用"),
	STATUS_DISABLE(BaseEnumConstants.STATUS_DISABLE,"禁用");

	private String code;            // 状态编码
	private String remark;          // 状态说明
	private StatusEnum(String code,String remark){
		this.code=code;
		this.remark=remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
