package com.itheima.mapper;

import com.itheima.po.Customer;

//����mapperfactorybean������
public interface CustomerMapper {
	public Customer findCustomerById(Integer id);
	public void addCustomer(Customer customer);
}
