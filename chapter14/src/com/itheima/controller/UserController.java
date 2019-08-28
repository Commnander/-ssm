package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.po.User;

@Controller
public class UserController {
	
	@RequestMapping("/testJson")
	@ResponseBody
	public User testJson(@RequestBody User user) {
		//打印接受的json格式数据
		System.out.println(user);
		//返回json格式的响应
		return user;
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	@ResponseBody
	//接收restful风格请求，接受方式为get
	public User selectUser(@PathVariable("id") String id) {
		
		System.out.println("id="+id);
		User user=new User();
		//模拟根据id查询到用户对象数据
		if(id.equals("1234")) {
			user.setUsername("tom");
		}
		return user;
	}
	
}
