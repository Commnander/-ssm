package com.itheima.ioc;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	//���userDao��set�������Ϳ���ʵ������ע��
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
//		�������UserDao�е�say()
		this.userDao.say();
		System.out.println("UserService hello world");
	}

}
