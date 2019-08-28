package com.itheima.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itheima.po.User;
import com.itheima.po.UserVo;


/*HttpServletRequest request
HttpServletResponse response
HttpSession session
Model model
可以绑定数据
*/
@Controller
public class UserController {
	//默认绑定数据
//	@RequestMapping("/selectUser")
//	public String selectUser(HttpServletRequest request) {
//		String id=request.getParameter("id");
//		System.out.println("id="+id);
//		return "success";
//		
//	}
	
	//简单数据类型绑定：String Integer Double等
	//@RequestParam(value = "user_id")别称
	@RequestMapping("/selectUser")
	public String selectUser(@RequestParam(value = "user_id")Integer id) {
		
		System.out.println("id="+id);
		return "success";
		
	}
	
	//向注册页面跳转
	@RequestMapping("toRegister")
	public String toRegister() {
		return "register";
	}
	
	//绑定pojo类型
	@RequestMapping("/registerUser")
	public String segisterUser(User user) {
		String username=user.getUsername();
		String password=user.getPassword();
		System.out.println(username+"  "+password);
		return "success";
				
	}
	
	//向用户列表跳转
	@RequestMapping("/toUser")
	public String toUser() {
		return "user";
	}
	//批量删除，绑定数组
	@RequestMapping("/deleteUsers")
	public String deleteUsers(Integer[] ids) {
		if(ids!=null) {
			for (Integer id : ids) {
				System.out.println("删除了id为"+id+"用户");
			}
			}else {
				System.out.println("没有选择");
		}
		return "success";
		
	}
	
	//用户批量修改页面跳转
	@RequestMapping("/toUserEdit")
	public String toUserEdit() {
		return "user_edit";
	}
	
	//批量修改用户
	@RequestMapping("/editUsers")
	public String editUsers(UserVo userVo) {
		List<User> users=userVo.getUsers();
		for (User user : users) {
			if(user.getId()!=null) {
				System.out.println("修改了id为"+user.getId()+"用户名为："+user.getUsername());
			}
		}
		return "success";
	}
}
