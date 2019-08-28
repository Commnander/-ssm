package com.itheima.jdbc;

public class Account {
	private Integer id;
	private String username;
	private Double balance;
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", balance=" + balance + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getBalancce() {
		return balance;
	}
	public void setBalancce(Double balancce) {
		this.balance = balancce;
	}
	
	
	
}
