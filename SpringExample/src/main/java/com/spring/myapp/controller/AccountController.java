package com.spring.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.myapp.model.AccountInfo;
import com.spring.myapp.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginHome() {
		
		return "login/login";
	}
	
	//log in 이벤트
	@ResponseBody
	@RequestMapping(value="/login/logging", method=RequestMethod.POST)
	public String logging(AccountInfo info) {
		
		String email = info.getEmail();
		String password = info.getPassword();
		
		AccountInfo accountInfo = accountService.logIn(email, password);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/login/logging");
		if(accountInfo!=null) {
			return "success";
		} else {
			return "fail";
		}
	}
}
