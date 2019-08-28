package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.po.Customer;
import com.itheima.utils.MybatisUtils;

//mybatis入门程序测试

public class MybatisTest {
	
	@Test 
	public void findCustomerByNameAndJobs() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		Customer customer=new Customer();
		customer.setUsername("sam");
		customer.setJobs("doctor");
		 List<Customer> customers=sqlsession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameAndJobs", customer);
		for (Customer customer2 : customers) {
			System.out.println(customer2);
		}
		sqlsession.close();
	}
	
	@Test
	public void findCustomerByNameOrJobs() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		Customer customer=new Customer();
		//customer.setUsername("sam");
		//customer.setJobs("doctor");
		 List<Customer> customers=sqlsession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByNameOrJobs", customer);
		for (Customer customer2 : customers) {
			System.out.println(customer2);
		}
		sqlsession.close();
	}
	@Test
	public void updateCustomer() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		Customer customer=new Customer();
		customer.setId(1);
		customer.setUsername("DaMing");
		customer.setJobs("doctor");
		customer.setPhone("123456");
		int row=sqlsession.update("com.itheima.mapper.CustomerMapper.updateCustomer", customer);
		if(row>0) {
			System.out.println("更新成功");
		}else {
			System.out.println("更新失败");
		}
		sqlsession.commit();
		sqlsession.close();
	}
	//编号批量查询
	@Test
	public void findCustomerByIds() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(1);
		integers.add(3);
		integers.add(5);
		List<Customer> customers= sqlsession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByIds", integers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		sqlsession.close();
	}
	public void findCustomerByName() {
		SqlSession sqlsession=MybatisUtils.getSqlSession();
		Customer customer=new Customer();
		customer.setUsername("j");
		List<Customer> customers=sqlsession.selectList("com.itheima.mapper.CustomerMapper.findCustomerByName",customer);
		for (Customer customer2 : customers) {
			System.out.println(customer2);
		}
		sqlsession.close();
	}
}
