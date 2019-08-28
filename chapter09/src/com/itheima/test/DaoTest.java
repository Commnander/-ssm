package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.Dao.CustomerDao;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;

//DAO����
public class DaoTest {
	
	@Test
	public void findCustomerById() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡBean��ǩ�е�ָ��Bean
		//CustomerDao customerDao=(CustomerDao)applicationContext.getBean("customerDao");
		//��һ�ַ�ʽ��ȡbean
		 CustomerDao customerDao=applicationContext.getBean(CustomerDao.class);
		Customer customer=customerDao.findCustomerById(1);
		System.out.println(customer);
	}
	
	@Test
	public void findCustomerById1() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerMapper customerMapper=applicationContext.getBean(CustomerMapper.class);
		Customer customer=customerMapper.findCustomerById(1);
		System.out.println(customer);
	}
	
	
}
