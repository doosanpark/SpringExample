package com.spring.myapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.myapp.dao.AccountDao;
import com.spring.myapp.model.AccountInfo;
import com.spring.myapp.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
	@Resource(name="accountDao")
	private AccountDao accountDao;

	@Override
	public List<AccountInfo> getAccountList() {
		return accountDao.getAccountList();
	}

	@Override
	public AccountInfo logIn(String email, String password) {
		// TODO Auto-generated method stub
		return accountDao.logIn(email, password);
	}

}
