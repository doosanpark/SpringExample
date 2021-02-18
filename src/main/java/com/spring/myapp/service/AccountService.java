package com.spring.myapp.service;

import java.util.List;

import com.spring.myapp.model.AccountInfo;

public interface AccountService {
	public List<AccountInfo> getAccountList();
	public AccountInfo logIn(String email, String password);
}
