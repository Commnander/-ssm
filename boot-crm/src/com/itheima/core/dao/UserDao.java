package com.itheima.core.dao;

import org.apache.ibatis.annotations.Param;

import com.itheima.core.po.User;

//�û�DAO�ӿ�
public interface UserDao {
	public User findUser(@Param("usercode")String usercode,@Param("password")String password);
}
