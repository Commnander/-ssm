package com.itheima.Impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.Dao.CustomerDao;
import com.itheima.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.itheima.po.CustomerMapper.findCustomerById",1);
		
	}

}
