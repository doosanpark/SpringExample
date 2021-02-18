package com.spring.myapp.dao;

import java.util.List;

import com.spring.myapp.model.AccountInfo;

public interface AccountDao {
	public List<AccountInfo> getAccountList();
	public AccountInfo logIn(String email, String password);
}
