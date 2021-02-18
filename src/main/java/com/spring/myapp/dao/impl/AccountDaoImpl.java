package com.spring.myapp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.myapp.dao.AccountDao;
import com.spring.myapp.model.AccountInfo;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<AccountInfo> getAccountList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAccountList");
	}

	@Override
	public AccountInfo logIn(String email, String password) {
		
		return sqlSession.selectOne("logIn", email);
	}
}
