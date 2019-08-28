package com.tiheima.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean的生命周期*/
public class LifeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpString="com/tiheima/life/life.xml";
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(xmlpString);
		//只有执行了close方法才能用销毁方法。
		context.close();
	}

}
