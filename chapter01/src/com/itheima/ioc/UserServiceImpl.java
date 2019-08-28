package com.itheima.ioc;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	//添加userDao的set方法，就可以实现依赖注入
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
//		还想调用UserDao中的say()
		this.userDao.say();
		System.out.println("UserService hello world");
	}

}
