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
		//��ӡ���ܵ�json��ʽ����
		System.out.println(user);
		//����json��ʽ����Ӧ
		return user;
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	@ResponseBody
	//����restful������󣬽��ܷ�ʽΪget
	public User selectUser(@PathVariable("id") String id) {
		
		System.out.println("id="+id);
		User user=new User();
		//ģ�����id��ѯ���û���������
		if(id.equals("1234")) {
			user.setUsername("tom");
		}
		return user;
	}
	
}
