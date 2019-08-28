package com.itheima.jdbc;

import java.util.List;

public interface AccountDao {
	public int addAccount(Account account);
	public int updateAcount(Account account);
	public int deleteAccount(int id);
	public Account findAccountById(int id);
	public List<Account> listAllAccounts();
}
