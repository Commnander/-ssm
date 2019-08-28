package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.po.Customer;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;

//mybatis入门程序测试

public class MybatisTest {
	
	
	@Test
	public void findCustomerById() throws IOException {
//		//1.读取配置文件
//		String resourceString="mybatis-config.xml";
//		InputStream inputStream=Resources.getResourceAsStream(resourceString);
//		//根据配置文件构建SqlSessionFactory
//		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//		//通过SqlSessionFactory创建sqlsession
//		SqlSession sqlSession=sessionFactory.openSession();
//		//sqlSession执行映射文件中的sql语句，并返回结果
//		//第一个参数为mapper.xml中的id，第二个是传入的占位符就是#{id}的值
		 SqlSession sqlSession=MybatisUtils.getSqlSession();
		
		
		Customer customer=sqlSession.selectOne("com.itheima.po.Customer.findCustomerById", 1);
		System.out.println(customer.toString());
		//关闭sqlsession
		sqlSession.close();
	}
	@Test
	public void findCustomerByName() throws IOException {
		//1.读取配置文件
		String resource="mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//根据配置文件构建SqlSessionFactory
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		//通过SqlSessionFactory创建sqlsession
		SqlSession sqlSession=sessionFactory.openSession();
		List<Customer> customers= sqlSession.selectList("com.itheima.po.Customer.findCustomerByName","j");
		for (Customer customer:customers) {
			System.out.println(customer.toString());
		}
		sqlSession.close();
	}
	@Test
	public void addCustomerTest() throws IOException {
		//1.读取配置文件
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//根据配置文件构建SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//通过SqlSessionFactory创建sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				Customer customer=new Customer();
				customer.setUsername("zyk");
				customer.setJobs("hero");
				customer.setPhone("15035766618");
				int row=sqlSession.insert("com.itheima.po.Customer.addCustomer", customer);
				if(row>0) {
					System.out.println("插入了"+row+"数据");
				}else {
					System.out.println("插入失败");
				}
				//注意要提交事务，增删改都涉及到事务
				sqlSession.commit();
				sqlSession.close();
	}
	@Test
	public void updateCustomerTest() throws IOException {
		//1.读取配置文件
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//根据配置文件构建SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//通过SqlSessionFactory创建sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				Customer customer=new Customer();
				customer.setId(7);
				customer.setUsername("zyk1");
				customer.setJobs("student");
				customer.setPhone("15614141855");
				int row=sqlSession.update("com.itheima.po.Customer.updateCustomer", customer);
				if(row>0) {
					System.out.println("修改成功");
				}else {
					System.out.println("修改失败");
				}
				//注意要提交事务，增删改都涉及到事务
				sqlSession.commit();
				sqlSession.close();
	}
	@Test
	public void deleteCustomerTest() throws IOException {
		//1.读取配置文件
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//根据配置文件构建SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//通过SqlSessionFactory创建sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				int row=sqlSession.delete("com.itheima.po.Customer.deleteCustomer", 3);
				if(row>0) {
					System.out.println("删除成功");
				}else {
					System.out.println("删除失败");
				}
				//注意要提交事务，增删改都涉及到事务
				sqlSession.commit();
				sqlSession.close();
	}
	@Test
	public void findAllUser() {
		 SqlSession sqlSession=MybatisUtils.getSqlSession();
		List<User> users= sqlSession.selectList("com.itheima.po.User.findAllUser");
		for(User user:users) {
			System.out.println(user);
		}
		sqlSession.close();
	}
}
