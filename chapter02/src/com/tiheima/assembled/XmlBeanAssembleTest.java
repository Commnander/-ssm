package com.tiheima.assembled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*xmlװ�䷽ʽʵ����bean*/

public class XmlBeanAssembleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlString="com/tiheima/assembled/beans5.xml";
		  ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlString);
		  System.out.println(applicationContext.getBean("user1"));
		  System.out.println(applicationContext.getBean("user2"));
	}

}
