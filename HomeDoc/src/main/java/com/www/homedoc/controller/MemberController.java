package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.sun.mail.imap.protocol.ID;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberService;
@Controller
public class MemberController {
	
	
	
	@Autowired
	MemberService memberService;
	
	// ajax 사용할 것.
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> memberLogin(@RequestParam Map<String, Object> paramMap,HttpSession session) {
		
		System.out.println("---- memberLogin() ----");
		
		Map<String, Object> returnMap = new HashMap<>();
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println("로그인 한 유저 : " + paramMap.get("id"));
		
		String id = (String)paramMap.get("id");

		//실제서비스에서는 삭제할 예정
		String pw = (String)paramMap.get("pw");
		
		System.out.println(" 아이디 : " + id);
		System.out.println(" 비밀번호 : " + pw);
		
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setId((String)paramMap.get("id"));
		memberDto.setPw((String)paramMap.get("pw"));
		
			Boolean iscanLogined = 
				memberService.memberLogin(memberDto);
			
			
			
			
			if(iscanLogined) {
				//로그인 성공 페이지로
				//알람은 Home에서 
				session.setAttribute("id", id);
				// 로그인이 되면 Home을 호출
				mav.setViewName("redirect:/");
				
				returnMap.put("code", "OK");
				
				return returnMap;
			} else {
				// 로그인 실패 헤이지
				
				return returnMap;
			}
			

	}
	
	
	@RequestMapping(value = "/member/signup", method = RequestMethod.POST)
	public ModelAndView signUp(@RequestParam
			Map<String, Object> paramMap) {
		
		System.out.println("--- member signup() ----");
		
		ModelAndView mv = new ModelAndView();
		
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId((String)paramMap.get("id"));
		memberDto.setPw((String)paramMap.get("pw"));
		memberDto.setAddress((String)paramMap.get("address"));
		memberDto.setEmail((String)paramMap.get("email"));
		
		
		int result = memberService.insertMember(memberDto);
		
		if(result > 0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		mv.setViewName("redirect:/");
		
		return mv;
		
	}
	
	
	
	@RequestMapping("/test")
	public String testMock(@RequestParam Map<String, Object> paramMap) {
		System.out.println("---- test ----");
		
		System.out.println("test :" + paramMap.get("test"));
		return null;
	}

}
