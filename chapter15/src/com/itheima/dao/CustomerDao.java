package com.itheima.dao;
//接口文件

import com.itheima.po.Customer;

public interface CustomerDao {
	public Customer findCustomerById(Integer id);
}
