package com.itheima.po;

import java.util.List;

public class User {
	private int id;
	private String username;
	private String address;
	//一个用户可以有多个订单
	private List<Orders> orders;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", orders=" + orders + "]";
	}
	
}
