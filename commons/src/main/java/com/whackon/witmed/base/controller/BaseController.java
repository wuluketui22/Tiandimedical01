package com.whackon.witmed.base.controller;

import cn.hutool.http.server.HttpServerRequest;
import cn.hutool.http.server.HttpServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * <b>基础控制层类</b>
 * <p>
 *     基础控制层类依赖注入了如下属性：<br/>
 *     HttpServerRequest
 *     HttpServerResponse
 *     HttpSession
 *     本项目所有功能控制层类必须继承于本基础控制层类
 *
 * </p>
 * @author ASUS
 * @data 2022-08-24
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServerRequest request;
	@Autowired
	protected HttpServerResponse response;
	@Autowired
	protected HttpSession session;
}
