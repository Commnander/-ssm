package com.itheima.cglib;

public class CglibTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CglibProxy cglibProxy=new CglibProxy();
		UserDao userDao=new UserDao();
		
		UserDao userDao1=(UserDao)cglibProxy.createProxy(userDao);
		userDao1.addUser();
		userDao1.deleteUser();
		
		
		
	}

}
