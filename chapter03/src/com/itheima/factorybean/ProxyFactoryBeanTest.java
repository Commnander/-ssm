package com.itheima.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.jdk.UserDao;

public class ProxyFactoryBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpathString="com/itheima/factorybean/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpathString);
		//从spring容器中获得内容
		UserDao userDao=(UserDao)applicationContext.getBean("userDaoProxy");
		userDao.addUser();
		userDao.deleteUser();
	}

}
