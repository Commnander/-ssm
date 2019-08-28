package com.tiheima.instance.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean1是构造器实例化测试*/
public class InstanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpathString="com/tiheima/instance/contructor/beans1.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpathString);
		Bean1 bean1=(Bean1)applicationContext.getBean("beans1");
		System.out.println(bean1);
	}

}
