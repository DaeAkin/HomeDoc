package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.www.homedoc.service.MemberMailSender;
@CrossOrigin
@RestController
public class AuthenticationController {

	@Autowired
	MemberMailSender mailSender;
	
	// 인증번호 메일 발송

	@RequestMapping(value = "/authenMail" , method = RequestMethod.POST)
	public void emailAuthenticationSender(@RequestParam @RequestBody String email) {
//		Map<String, Object> resultJsonMap = new HashMap<>();
		System.out.println("emailAuthenticationSender()");
		
		System.out.println("To : " + email);
		mailSender.authenticationsend(email);
			
//		return resultJsonMap.put("status", true);
	}
	
	// 인증번호 확인 
	
	@RequestMapping(value = "/authenConfirm" ,  method = RequestMethod.POST)
	public Object emailAuthentication(@RequestParam int confirmnum) {
		
		System.out.println("emailAuthentication()");
		Map<String, Object> resultJsonMap = new HashMap<>();
		
		boolean validation =
				mailSender.validationEmail(confirmnum);
		
		 
			resultJsonMap.put("validation", validation);
			
			System.out.println(validation);
		
		
		return resultJsonMap;
	}

	
}