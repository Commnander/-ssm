package com.itheima.core.service.impl;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.core.dao.UserDao;
//用户service接口的实现类
import com.itheima.core.po.User;
import com.itheima.core.service.UserService;

@Service("userService")
@Transactional
public class UserviceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Override
	public User findUser(String usercode, String password) {
		// TODO Auto-generated method stub
		User user=userDao.findUser(usercode, password);
		return user;
	}

}
