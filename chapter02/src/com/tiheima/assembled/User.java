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
	 * ʹ�ù���ע�� 
	 * �ṩ�����в����Ĺ��췽��
	 */
	public User(String username, Integer password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}

	/*
	 * ʹ������ע�� 
	 * �ṩĬ���޲ι��캯�� 
	 * �ṩ�������Ե�set����
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
