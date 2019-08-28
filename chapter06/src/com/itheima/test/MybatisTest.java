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

//mybatis���ų������

public class MybatisTest {
	
	
	@Test
	public void findCustomerById() throws IOException {
//		//1.��ȡ�����ļ�
//		String resourceString="mybatis-config.xml";
//		InputStream inputStream=Resources.getResourceAsStream(resourceString);
//		//���������ļ�����SqlSessionFactory
//		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
//		//ͨ��SqlSessionFactory����sqlsession
//		SqlSession sqlSession=sessionFactory.openSession();
//		//sqlSessionִ��ӳ���ļ��е�sql��䣬�����ؽ��
//		//��һ������Ϊmapper.xml�е�id���ڶ����Ǵ����ռλ������#{id}��ֵ
		 SqlSession sqlSession=MybatisUtils.getSqlSession();
		
		
		Customer customer=sqlSession.selectOne("com.itheima.po.Customer.findCustomerById", 1);
		System.out.println(customer.toString());
		//�ر�sqlsession
		sqlSession.close();
	}
	@Test
	public void findCustomerByName() throws IOException {
		//1.��ȡ�����ļ�
		String resource="mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//���������ļ�����SqlSessionFactory
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		//ͨ��SqlSessionFactory����sqlsession
		SqlSession sqlSession=sessionFactory.openSession();
		List<Customer> customers= sqlSession.selectList("com.itheima.po.Customer.findCustomerByName","j");
		for (Customer customer:customers) {
			System.out.println(customer.toString());
		}
		sqlSession.close();
	}
	@Test
	public void addCustomerTest() throws IOException {
		//1.��ȡ�����ļ�
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//���������ļ�����SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//ͨ��SqlSessionFactory����sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				Customer customer=new Customer();
				customer.setUsername("zyk");
				customer.setJobs("hero");
				customer.setPhone("15035766618");
				int row=sqlSession.insert("com.itheima.po.Customer.addCustomer", customer);
				if(row>0) {
					System.out.println("������"+row+"����");
				}else {
					System.out.println("����ʧ��");
				}
				//ע��Ҫ�ύ������ɾ�Ķ��漰������
				sqlSession.commit();
				sqlSession.close();
	}
	@Test
	public void updateCustomerTest() throws IOException {
		//1.��ȡ�����ļ�
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//���������ļ�����SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//ͨ��SqlSessionFactory����sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				Customer customer=new Customer();
				customer.setId(7);
				customer.setUsername("zyk1");
				customer.setJobs("student");
				customer.setPhone("15614141855");
				int row=sqlSession.update("com.itheima.po.Customer.updateCustomer", customer);
				if(row>0) {
					System.out.println("�޸ĳɹ�");
				}else {
					System.out.println("�޸�ʧ��");
				}
				//ע��Ҫ�ύ������ɾ�Ķ��漰������
				sqlSession.commit();
				sqlSession.close();
	}
	@Test
	public void deleteCustomerTest() throws IOException {
		//1.��ȡ�����ļ�
				String resource="mybatis-config.xml";
				InputStream inputStream=Resources.getResourceAsStream(resource);
				//���������ļ�����SqlSessionFactory
				SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
				//ͨ��SqlSessionFactory����sqlsession
				SqlSession sqlSession=sessionFactory.openSession();
				int row=sqlSession.delete("com.itheima.po.Customer.deleteCustomer", 3);
				if(row>0) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("ɾ��ʧ��");
				}
				//ע��Ҫ�ύ������ɾ�Ķ��漰������
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
