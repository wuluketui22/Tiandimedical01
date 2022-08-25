package com.whackon.witmed.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础控制层类</b>
 *
 * @author DELL
 * @date 2022/8/25
 */
@Controller("baseController")
public class BaseController {
		@Autowired
		protected HttpServletRequest request;
		@Autowired
		protected HttpServletResponse response;
		@Autowired
		protected HttpSession session;
}
