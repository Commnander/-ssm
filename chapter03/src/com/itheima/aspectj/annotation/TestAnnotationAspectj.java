package com.itheima.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.jdk.UserDao;

public class TestAnnotationAspectj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpathString="com/itheima/aspectj/annotation/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpathString);
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.addUser();
	}

}
