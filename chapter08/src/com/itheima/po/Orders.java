package com.itheima.po;

import java.util.List;

public class Orders {
	private Integer id;
	private String number;
	private List<Product> products;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", number=" + number + ", products=" + products + "]";
	}

	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
