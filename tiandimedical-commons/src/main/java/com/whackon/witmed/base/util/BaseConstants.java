package com.whackon.witmed.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.util.Date;
import java.util.Properties;


/**
 * <b>基础常量类</b>
 * @author xt
 *  * @date 2022/8/24
 */
public class BaseConstants {
	//创建日志
	private static Logger logger= LoggerFactory.getLogger(BaseConstants.class);
	private static Properties props=new Properties();

	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (IOException e) {
			// 将产生的异常信息记录到日志中
			logger.error(e.getMessage() + " : " + new Date(), e);
			throw new RuntimeException(e);
		}
	}

	/**
	 * <b>系统分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(props.getProperty("base.page.num"));

	/**
	 * <b>系统分页信息：默认每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE=Integer.parseInt(props.getProperty("base.page.size"));

	public static final String TOKEN_SECRET =props.getProperty("best.token.secret");

}
