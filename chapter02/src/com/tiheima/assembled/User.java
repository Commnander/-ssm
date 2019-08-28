package com.tiheima.assembled;

import java.util.List;

public class User {
	private String username;
	private Integer password;
	private List<String> list;
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", list=" + list + "]";
	}
	

	/*
	 * 使用构造注入 
	 * 提供带所有参数的构造方法
	 */
	public User(String username, Integer password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}

	/*
	 * 使用设置注入 
	 * 提供默认无参构造函数 
	 * 提供所有属性的set方法
	 */
	public User() {
		super();
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
}
