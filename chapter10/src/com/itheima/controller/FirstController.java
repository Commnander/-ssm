package com.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//��������

public class FirstController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//����ModelAndView����
		ModelAndView modelAndView=new ModelAndView();
		//��ģ�Ͷ�����Ӷ���
		modelAndView.addObject("msg","��һ��spring mvc����");
		//�����߼���ͼ��
		modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
		return modelAndView;
	}

}
