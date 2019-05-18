package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.mail.Session;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.MemberValidator;
import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.service.MemberService;
@CrossOrigin
@RequestMapping("/member")
//아래 어노테이션을 쓰면 오류가 뜨는데 확인하길.
//@SessionAttributes("memberDto")
@Controller
public class MemberController{
	
	
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	MemberMailSender memberMailSender;
	
	@Autowired
	MemberValidator memberValidator;
	
//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		binder.addValidators(memberValidator);
//		
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String moveLoginPage() {
		return "member/login";
	}
	
	@RequestMapping(value="/logout")
	public String memberLogout(HttpSession session) {
		session.invalidate();
		
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String memberLogin(@Valid @ModelAttribute MemberDto memberDto,
		BindingResult result,HttpSession session) {
		
		
		if(result.hasErrors()) {
			System.out.println("에러발생 ?");
			return "home";
		}
		
		System.out.println("---- memberLogin() ----");
		
		System.out.println("memberValidator : " + memberValidator);
		
	
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
				

				
				return "redirect:/";
			} else {
				// 로그인 실패 페이지
				System.out.println("로그인 실패");

				return "member/login";
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
	@RequestMapping(value = "/insert" , method = RequestMethod.POST )
	public String SignUp(@ModelAttribute MemberDto memberDto) {
		
		return "redirect:/";
				
	}
	
	@RequestMapping(value = "/find_id",method = RequestMethod.GET)
	public String moveFind_id() {
		return "member/find_id";
	}
	
	@RequestMapping(value = "/find_pw",method = RequestMethod.GET)
	public String moveFind_pw() {
		return "member/find_pw";
	}
	@RequestMapping(value = "/myPage",method = RequestMethod.GET)
	public String moveMyPage() {
		return "/member/myPagePw";
	}
	@RequestMapping(value="/myPage" , method = RequestMethod.POST)
	public String isInvalidMyPage(@RequestParam String pw,HttpSession session) {
		// interceptor나 AOP로 추후에 변경
		// 세션은 현재 id만 갖고 있음.  
		
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setId((String)session.getAttribute("id"));
		
		memberDto.setPw(pw);
		
		Boolean iscanLogined =
				memberService.memberLogin(memberDto);
		
		if(iscanLogined) {
		
		return "/member/myPage";
		} else {
			return "/member/myPagePw";
		}
		
	}

	
	
	

}
