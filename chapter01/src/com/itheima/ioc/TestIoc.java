package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 初始化spring容器加载配置文件
		 * 通过容器获取UserDao实例 
		 * 调用实例方法
		 */
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.say();
		
	}

}
