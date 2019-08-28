package com.itheima.core.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//用户控制器类
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
	
	//用户登录
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(String usercode,String password,Model model,HttpSession session) {
		User user=userService.findUser(usercode, password);
		if(user!=null) {
			session.setAttribute("USER_SESSION", user);
			//跳转到主页面
			return "redirect:/customer/list.action";
		}
		model.addAttribute("msg","帐号或密码错误");
		return "login";
		
	}
	
	//退出登录,清除登录的session
	@RequestMapping(value="/logout.action" )
	public String logout(HttpSession session) {
		//清楚session
		session.invalidate();
		//跳转回登录界面，利用重定向跳转
		return "redirect:login.action"; 
	}
	//向登录节目跳转
	@RequestMapping(value = "/login.action",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
}
