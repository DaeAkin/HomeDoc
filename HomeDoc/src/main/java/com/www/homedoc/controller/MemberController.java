package com.www.homedoc.controller;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sun.media.sound.ModelDirector;
import com.www.homedoc.dao.MemberDaoImpl;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.service.MemberService;
import com.www.homedoc.service.MemberServiceImpl;
@CrossOrigin
@RequestMapping("/member")
//아래 어노테이션을 쓰면 오류가 뜨는데 확인하길.
//@SessionAttributes("memberDto")
@Controller
public class MemberController extends CRUDController<MemberDto, Integer,
	MemberService>{
	
	
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberMailSender memberMailSender;
	
	
	// ajax 사용할 것.
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> memberLogin(@ModelAttribute MemberDto memberDto,
			HttpSession session, ModelAndView mv) {

		System.out.println("---- memberLogin() ----");
		
		Map<String, Object> returnMap = new HashMap<>();

		System.out.println("로그인 한 유저 : " + memberDto.getId());
		
		String id = memberDto.getId();

		//실제서비스에서는 삭제할 예정
		String pw = memberDto.getPw();
		
		System.out.println(" 아이디 : " + id);
		System.out.println(" 비밀번호 : " + pw);

			Boolean iscanLogined = 
					memberService.memberLogin(memberDto);
			if(iscanLogined) {
				//로그인 성공 페이지로
				//알람은 Home에서 
				System.out.println("로그인 성공");
				session.setAttribute("id", id);
				// 로그인이 되면 Home을 호출
				mv.setViewName("redirect:/");
				
				returnMap.put("code", "OK");
				
				return returnMap;
			} else {
				// 로그인 실패 헤이지
				
				return returnMap;
			}
			
	}
	
	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public Object memberIdCheck(@RequestParam String id) {
		Map<String, Object> resultMap = new HashMap<>();
		
		int result = 
				memberService.memberIdCheck(id);
		
		resultMap.put("cnt", result);
		
		return resultMap;
		
	}
	
	
	
	@RequestMapping(value = "/insert" , method = RequestMethod.GET )
	public String moveSignupJsp() {
		return "register_client";
	}
	
	

}
