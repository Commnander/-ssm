package com.itheima.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*×¢½â²âÊÔ*/
public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpatString="com/itheima/annotation/beans6.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpatString);
		UserController userController=(UserController)applicationContext.getBean("userController");
		userController.save();
	}

}
