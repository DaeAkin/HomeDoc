package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

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

// MemberController 부터 MVC 통합 테스트.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberControllerTest{
	
	private MockMvc mockMvc;
	
	@Autowired
	MemberController memberController;
	
	@Autowired
	MemberService memberService;
	
	MemberDto memberDto;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
                .standaloneSetup(memberController)
//                .addFilters(new CORSFilter())
                .build();
		
		memberDto = new MemberDto(
				"testId", "1234", "testeMail@gmail.com",
				"testAdress", "01011112222"
				);
		
		
		memberService.deleteAll();
		
		memberService.insert(memberDto);
	}
	
	@Test
	public void memberLogin() throws Exception {

		
		
		//정상 로그인처리
	MvcResult result =
				mockMvc.perform(post("/member/login")
					.param("id", "testid")
					.param("pw", "1234"))
					.andDo(print())
					//리다이렉트 응답코드는 302
					.andExpect(status().is(200))
					.andExpect(jsonPath("$.code", is("OK")))
					.andReturn();

	ModelAndView mav = result.getModelAndView();
	MockHttpServletRequest request = result.getRequest();
	
	HttpSession session = request.getSession();
	
	System.out.println("--- session user : " + 
			session.getAttribute("id"));
	assertThat((String)session.getAttribute("id"), is("testid"));
	
	
//	Map<String, Object> paramMap = null;
//	System.out.println("code : " + 
//			memberController.memberLogin(paramMap, session).get("code"));
//	
	
	}
	
	//회원가입 테스트
	@Test
	public void MemberSignup() throws Exception {
		MvcResult result =
					mockMvc.perform(post("/member/signup")
					.param("id", "testidid")
					.param("pw", "1234")
					.param("address", "서울시 강동구")
					.param("email", "kei89011@gmail.com")
					.param("phone", "010-1111-2222")
							)
					
					
					// redirect 됐는지 확인
					.andExpect(status().is(302))
					.andReturn();
					
	}
	
	
	// CRUD Controller Test 
	@Test
	public void cRUDControllerTest() throws Exception {
		mockMvc.perform(post("/member/insert")
				.param("id", "testididid22")
				.param("pw", "1234")
				.param("address", "서울시 강동구")
				.param("email", "kei89011@gmail.com")
				.param("phone", "010-1111-2222")
						);
	}
	
	@Test
	public void cRUDControllerTest2() throws Exception {
		mockMvc.perform(get("/member/selectAll")

						) .andDo(print());
	}
	
	
	
	
	

} 
