package com.itheima.aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.jdk.UserDao;

public class TestXmlAspectj {
	public static void main(String args[]) {
		String XmlPath="com/itheima/aspectj/xml/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(XmlPath);
		/*��Spring�����������*/
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.addUser();
	}
}
