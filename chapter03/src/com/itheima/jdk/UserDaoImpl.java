package com.itheima.jdk;

import org.springframework.stereotype.Repository;

/* aop jdk����*/
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("����û�");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("ɾ���û�");
	}

}
