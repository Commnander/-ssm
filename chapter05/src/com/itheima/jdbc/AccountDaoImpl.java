package com.itheima.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl implements AccountDao {
	
	//����JdbcTemplate���Լ�setter����
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		
		String sqlString="insert into account (username,balance)value(?,?)";
		Object[] objects=new Object[] {
				account.getUsername(),
				account.getBalance()
		};
		int num=this.jdbcTemplate.update(sqlString, objects);
		return num;
	}

	@Override
	public int updateAcount(Account account) {
		// TODO Auto-generated method stub
		String sqlString="update account set username=?,balance=?where id=?";
		Object[] objects=new Object[] {
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
		int num=this.jdbcTemplate.update(sqlString, objects);
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		// TODO Auto-generated method stub
		String sqlString="delete from account where id=?";
		int num=this.jdbcTemplate.update(sqlString,id);
		return num;
	}

	@Override
	public Account findAccountById(int id) {
		// TODO Auto-generated method stub
		String sqString="select * from account where id=?";
//		����һ��BeanPropertyRowMapper
		RowMapper<Account>rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
//		��id�󶨵�sql����У�ͨ��RowMapper����һ��object���ص��м�¼
		
		return this.jdbcTemplate.queryForObject(sqString, rowMapper,id);
	}

	@Override
	public List<Account> listAllAccounts() {
		// TODO Auto-generated method stub
		String sqString="select * from account ";
		RowMapper<Account>rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
		
		return this.jdbcTemplate.query(sqString, rowMapper);
	}

	/*
	 * outUser:�տ��� 
	 * inUser������� 
	 * money���տ���
	 */
	@Override
	/*
	 * @Transactional(propagation =Propagation.REQUIRED, isolation =
	 * Isolation.DEFAULT,readOnly = false)
	 */
	public void transfer(String outUser, String inUser, Double money) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update account set balance=balance+?"+
									"where username=?", money,inUser);
		
		//int i=1/0;
		this.jdbcTemplate.update("update account set balance=balance-?"+
									"where username=?", money,outUser);
	}

}
