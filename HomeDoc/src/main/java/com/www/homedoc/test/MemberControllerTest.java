package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.controller.MemberController;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberService;
import com.www.homedoc.service.interceptor.AlertInterceptor;

// MemberController 부터 MVC 통합 테스트.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberControllerTest{
	
	private MockMvc mockMvc;
	
	@Autowired
	MemberController memberController;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	AlertInterceptor alertInterceptor;

	MemberDto memberDto;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
                .standaloneSetup(memberController)
                .addInterceptors(alertInterceptor)
                .build();

	}
	
	
	@Test
	public void memberLogin() throws Exception {
	
		
		//정상 로그인처리
	MvcResult result =
				mockMvc.perform(post("/member/login")
					.param("id", "testid")
					.param("pw", "1234"))
//					.andExpect(status().is(302))
					.andReturn();

	ModelAndView mv = result.getModelAndView();
	MockHttpServletRequest request = result.getRequest();

	HttpSession session = request.getSession();
	
	System.out.println("view Name :" + mv.getViewName());
	System.out.println("--- session user : " + 
			session.getAttribute("id"));
	assertThat((String)session.getAttribute("id"), is("testid"));
	
	System.out.println("model : " + mv.getModel().get("a"));
	
	assertThat(mv.getModelMap().get("alertDtos"), is(notNullValue()));
//	System.out.println("request : " + request.getAttribute("alertDtos"));
	
	
	
	}
	
	//회원가입 테스트
	@Test
	public void memberSignup() throws Exception {
		MvcResult result =
					mockMvc.perform(post("/member/insert")
					.param("id", "testidid")
					.param("pw", "1234")
					.param("address", "서울시 강동구")
					.param("email", "kei89011@gmail.com")
					.param("phone", "010-1111-2222")
							)
					.andReturn();
					
	}
	
	@Test
	public void memberValidationTest() throws Exception {
	
				mockMvc.perform(post("/member/login")
//				.param("id", "testid")
				.param("pw", "1234"));
	
	}
	


} 
