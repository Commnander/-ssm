package com.tiheima.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean����������*/
public class LifeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlpString="com/tiheima/life/life.xml";
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(xmlpString);
		//ֻ��ִ����close�������������ٷ�����
		context.close();
	}

}
