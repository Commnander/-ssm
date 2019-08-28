package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	//@Resource(name = "userDao")
	@Autowired
	private UserDao Userdao;
	
	public void setUserdao(UserDao userdao) {
		this.Userdao = userdao;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		this.Userdao.save();
		System.out.println("userservice  save");
	}

}
