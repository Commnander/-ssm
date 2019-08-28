package com.itheima.po;

//¶©µ¥pojo£¬°üº¬User

public class Orders {
	private Integer ordersId;
	public Integer getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private User user;
	
}
