package com.itheima.jdbc;

import java.util.List;

import javax.sound.midi.VoiceStatus;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {


	
	  @Test 
	  public void mainTest() {
		  ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml"); 
		  JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		  jdbcTemplate.execute("create table account("+
				  				"id int primary key auto_increment,"+ 
				  				"username varchar(50),"+
				  				"balance double)"); 
		  System.out.println("数据库表创建成功");
		  }
	 
	@Test
	public void addAccountTest() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");
		Account account=new Account();
		account.setUsername("tom");
		account.setBalancce(1000.00);
		int num=accountDao.addAccount(account);
		if(num>0) {
			System.out.println("插入了"+num+"条数据");
		}else {
			System.out.println("fail");
		}
	}
	
	@Test
	public void deleteAccountTest() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");
		int num=accountDao.deleteAccount(1);
		if (num>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void findAccountByIdTest() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao=(AccountDao)applicationContext.getBean("accountDao");
		Account account=accountDao.findAccountById(2);
		System.out.println(account);
	}
	@Test
	public void listAllAccount() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao accountDao=(AccountDao)applicationContext.getBean("accountDao");
		List<Account> accounts=accountDao.listAllAccounts();
		for(Account account:accounts) {
			System.out.println(account);
		}
	}

}
