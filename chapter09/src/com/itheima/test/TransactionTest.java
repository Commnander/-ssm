package com.itheima.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.po.Customer;
import com.itheima.service.CustomerService;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService=applicationContext.getBean(CustomerService.class);
		Customer customer=new Customer();
		customer.setUsername("zhangsan");
		customer.setJobs("farmer");
		customer.setPhone("13734115929");
		customerService.addCustomer(customer);
	}

}
