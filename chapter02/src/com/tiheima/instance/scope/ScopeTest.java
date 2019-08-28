package com.tiheima.instance.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpatgString="com/tiheima/instance/scope/beans4.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpatgString);
		System.out.println(applicationContext.getBean("beans4"));
		System.out.println(applicationContext.getBean("beans4"));
	}

}
