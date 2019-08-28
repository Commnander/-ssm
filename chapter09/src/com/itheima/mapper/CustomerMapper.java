package com.itheima.mapper;

import com.itheima.po.Customer;

//基于mapperfactorybean的整合
public interface CustomerMapper {
	public Customer findCustomerById(Integer id);
	public void addCustomer(Customer customer);
}
