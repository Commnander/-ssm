package com.itheima.core.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//�û���������
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itheima.core.po.User;
import com.itheima.core.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//�û���¼
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(String usercode,String password,Model model,HttpSession session) {
		User user=userService.findUser(usercode, password);
		if(user!=null) {
			session.setAttribute("USER_SESSION", user);
			//��ת����ҳ��
			return "redirect:/customer/list.action";
		}
		model.addAttribute("msg","�ʺŻ��������");
		return "login";
		
	}
	
	//�˳���¼,�����¼��session
	@RequestMapping(value="/logout.action" )
	public String logout(HttpSession session) {
		//���session
		session.invalidate();
		//��ת�ص�¼���棬�����ض�����ת
		return "redirect:login.action"; 
	}
	//���¼��Ŀ��ת
	@RequestMapping(value = "/login.action",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
}
