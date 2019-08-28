package com.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//控制器类

public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//创建ModelAndView对象
		ModelAndView modelAndView=new ModelAndView();
		//向模型对象添加对象
		modelAndView.addObject("msg","第一个spring mvc程序");
		//设置逻辑视图名
		modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
		return modelAndView;
	}

}
