package com.itheima.jdk;


//jdk动态代理测试
public class JdkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建代理对象
		JdkProxy jdkProxy=new JdkProxy();
		//创建目标对象
		UserDao userDao=new UserDaoImpl();
		//从代理对象中获取增强后的目标对象
		UserDao useaoDao1=(UserDao)jdkProxy.creatProxy(userDao);
		useaoDao1.addUser();
		useaoDao1.deleteUser();
	}

}
