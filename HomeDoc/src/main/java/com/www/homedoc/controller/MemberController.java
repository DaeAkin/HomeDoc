package com.www.homedoc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.mail.imap.protocol.ID;
import com.www.homedoc.service.MemberService;

public class MemberController {
	
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public String memberLogin(@RequestParam HttpServletRequest request,
			Map<String, Object> paramMap) {
		
		System.out.println("---- memberLogin() ----");
		System.out.println("로그인 한 유저 : " + request.getParameter("id"));
		
		String user = (String)request.getParameter("id");

		//실제서비스에서는 삭제할 예정
		String pw = (String)request.getParameter("pw");
		
		System.out.println(" 아이디 : " + user);
		System.out.println(" 비밀번호 : " + pw);
		
		HttpSession session = request.getSession();
		
			Boolean iscanLogined = 
				memberService.memberLogin(paramMap);
			
			if(iscanLogined) {
				//로그인 성공 페이지로
				session.setAttribute("user", user);
				return "aa";
			} else {
				// 로그인 실패 헤이지
				return null;
			}

	}
	
	
	@RequestMapping(value = "/member/signup", method = RequestMethod.POST)
	public String signUp(@RequestParam
			Map<String, Object> paramMap) {
		
		System.out.println(paramMap.get("test"));
		
		int result = memberService.insertMember(paramMap);
		
		return "home";
		
	}
	
	
	
	@RequestMapping("/test")
	public String testMock() {
		System.out.println("---- testMock() ----");
		
		return null;
	}

}
