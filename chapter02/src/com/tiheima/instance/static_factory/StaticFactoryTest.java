package com.tiheima.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean2是静态工厂实例化测试*/
public class StaticFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpathString="com/tiheima/instance/static_factory/beans2.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpathString);
		Bean2 bean2=(Bean2)applicationContext.getBean("beans2");
		System.out.println(bean2);
	}

}
