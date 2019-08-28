package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.po.Orders;
import com.itheima.po.User;

@Controller
public class OrdersController {
	
	@RequestMapping("tofindOrdersWithUser")
	public String  tofindOrdersWithUser() {
		return "orders";
	}
	
	@RequestMapping("findOrdersWithUser")
	public String findOrdersWithUser(Orders orders) {
		 Integer ordersId=orders.getOrdersId();
		 User user=orders.getUser();
		 String username=user.getUsername();
		 System.out.println(ordersId+"  "+username);
		 return "success";
	}
}
