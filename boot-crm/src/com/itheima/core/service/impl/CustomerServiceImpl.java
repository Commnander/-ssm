package com.itheima.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.common.utils.Page;
import com.itheima.core.dao.CustomerDao;
import com.itheima.core.po.Customer;
import com.itheima.core.service.CustomerService;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

@Service("customerService")

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	// �ͻ��б�
	public Page<Customer> findCustomerList(Integer page, Integer rows, 
			String custName,  String custSource,String custIndustry,
                                                          String custLevel) {
		// �����ͻ�����
         Customer customer = new Customer();
		// �жϿͻ�����
		if(StringUtils.isNotBlank(custName)){
			customer.setCust_name(custName);
		}
		// �жϿͻ���Ϣ��Դ
		if(StringUtils.isNotBlank(custSource)){
			customer.setCust_source(custSource);
		}
		// �жϿͻ�������ҵ
		if(StringUtils.isNotBlank(custIndustry)){
			customer.setCust_industry(custIndustry);
		}
		// �жϿͻ�����
		if(StringUtils.isNotBlank(custLevel)){
			customer.setCust_level(custLevel);
		}
		// ��ǰҳ
		customer.setStart((page-1) * rows) ;
		// ÿҳ��
		customer.setRows(rows);
		// ��ѯ�ͻ��б�
		List<Customer> customers = 
                            customerDao.selectCustomerList(customer);
		// ��ѯ�ͻ��б��ܼ�¼��
		Integer count = customerDao.selectCustomerListCount(customer);
		// ����Page���ض���
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	//�����ͻ�
	@Override
	public int createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerDao.createCustomer(customer);
	}
	
	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		Customer customer=customerDao.getCustomerById(id);
		return customer;
	}
	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}
	@Override
	public int deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(id);
		
	}

}
