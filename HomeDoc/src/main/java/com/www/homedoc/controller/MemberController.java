package com.www.homedoc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.mail.imap.protocol.ID;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberService;
@Controller
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
		
		
		MemberDto memberDto = new MemberDto();
		
		HttpSession session = request.getSession();
		
			Boolean iscanLogined = 
				memberService.memberLogin(memberDto);
			
			if(iscanLogined) {
				//로그인 성공 페이지로
				//알람도 같이 
				memberService.getAlert(user);
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
		
		MemberDto memberDto = new MemberDto();
		
		int result = memberService.insertMember(memberDto);
		
		return "home";
		
	}
	
	
	
	@RequestMapping("/test")
	public String testMock(@RequestParam Map<String, Object> paramMap) {
		System.out.println("---- test ----");
		
		System.out.println("test :" + paramMap.get("test"));
		return null;
	}

}
