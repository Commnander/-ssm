package com.itheima.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//��������

@Controller
@RequestMapping(value = "/hello")
public class FirstController  {
	/*
	 * @RequestMapping(value = "/firstController") public ModelAndView
	 * handleRequest(HttpServletRequest request, HttpServletResponse response)
	 * throws Exception { // TODO Auto-generated method stub
	 * 
	 * //����ModelAndView���� ModelAndView modelAndView=new ModelAndView(); //��ģ�Ͷ�����Ӷ���
	 * modelAndView.addObject("msg","��һ��spring mvc����"); //�����߼���ͼ��
	 * modelAndView.setViewName("/WEB-INF/jsp/first.jsp"); return modelAndView; }
	 */
	@RequestMapping(value = "/firstController")
	public String handleRequest(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception {
		// TODO Auto-generated method stub
		model.addAttribute("msg", "��һ��spring mvc����");
		return "first";
		
	}

}
