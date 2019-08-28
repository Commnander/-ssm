package com.tiheima.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*实例化工厂实例化bean*/
public class FactoryBean3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpathString="com/tiheima/instance/factory/beans3.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpathString);
		Bean3 bean3=(Bean3)applicationContext.getBean("beans3");
		System.out.println(bean3);
	}

}
