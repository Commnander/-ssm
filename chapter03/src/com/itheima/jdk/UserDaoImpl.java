package com.itheima.jdk;

import org.springframework.stereotype.Repository;

/* aop jdk代理*/
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("添加用户");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("删除用户");
	}

}
