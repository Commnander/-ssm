package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ��ʼ��spring�������������ļ�
		 * ͨ��������ȡUserDaoʵ�� 
		 * ����ʵ������
		 */
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.say();
		
	}

}
