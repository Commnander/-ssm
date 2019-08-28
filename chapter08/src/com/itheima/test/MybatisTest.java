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

import com.itheima.po.Orders;
import com.itheima.po.Person;
import com.itheima.po.User;
import com.itheima.utils.MybatisUtils;

//mybatis������ѯӳ��������

public class MybatisTest {
	
	@Test
	public void findPersonByIdTest() {
		SqlSession sqlSession=MybatisUtils.getSqlSession();
		//Ƕ�ײ�ѯidΪ1���˵���Ϣ
		Person person=sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById", 1);
		System.out.println(person);
		sqlSession.close();
	}
	
	//Ƕ�׽��
	@Test
	public void findPersonByIdTest2() {
		SqlSession sqlSession=MybatisUtils.getSqlSession();
		//Ƕ�ײ�ѯidΪ1���˵���Ϣ
		Person person=sqlSession.selectOne("com.itheima.mapper.PersonMapper.findPersonById2", 1);
		System.out.println(person);
		sqlSession.close();
	}
	//һ�Զ���ԣ���ѯһ�Զ����û���Ϣ���û�������Ϣ
	@Test
	public void findUsertest() {
		SqlSession sqlSession=MybatisUtils.getSqlSession();
		User user=sqlSession.selectOne("com.itheima.mapper.UserMapper.findUserWithOrders", 1);
		System.out.println(user);
		sqlSession.close();
	}
	//��Զ�
	@Test
	public void findOrderstest() {
		SqlSession sqlSession=MybatisUtils.getSqlSession();
		Orders orders=sqlSession.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithProduct", 1);
		System.out.println(orders);
		sqlSession.close();
	}
	@Test
	public void findOrderstest2() {
		SqlSession sqlSession=MybatisUtils.getSqlSession();
		Orders orders=sqlSession.selectOne("com.itheima.mapper.OrdersMapper.findOrdersWithProduct2", 1);
		System.out.println(orders);
		sqlSession.close();
	}
}
