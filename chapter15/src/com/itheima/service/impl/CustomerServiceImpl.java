package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.CustomerDao;
import com.itheima.po.Customer;
import com.itheima.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//×¢½â×¢ÈëCustomer
	@Autowired
	private CustomerDao customerDao;
	@Override
	public Customer findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return this.customerDao.findCustomerById(id);
	}

}
