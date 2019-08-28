package com.itheima.core.service;

import org.apache.ibatis.annotations.Param;

import com.itheima.core.po.User;

//UserµÄservice½Ó¿Ú

public interface UserService {
	
	public User findUser(String usercode,String password);
}
