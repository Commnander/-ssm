package com.itheima.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	//�Զ����������ݰ���������
	@RequestMapping("/customerDate")
	public String CustomerDate(Date date) {
		System.out.println("date:"+date);
		
		return "success";
		
	}
}
