package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

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

// MemberController 부터 MVC 통합 테스트.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	MemberController memberController;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
                .standaloneSetup(memberController)
//                .addFilters(new CORSFilter())
                .build();
	}
	
	@Test
	public void memberLogin() throws Exception {
		//정상 로그인처리
	MvcResult result =
				mockMvc.perform(post("/member/login")
					.param("id", "testid")
					.param("pw", "1234"))
//			.andDo(print())
//			.andExpect(status().is(302))
			.andReturn();

	ModelAndView mav = result.getModelAndView();
	
	MockHttpServletRequest request = result.getRequest();
	
	HttpSession session = request.getSession();
	
	System.out.println("--- session user : " + 
			session.getAttribute("id"));
	assertThat((String)session.getAttribute("id"), is("testid"));
	System.out.println("getView : " + mav.getViewName());
	
	}
	
	//회원가입 테스트
	@Test
	public void MemberSignup() throws Exception {
		MvcResult result =
					mockMvc.perform(post("/member/signup")
					.param("id", "aa")
					.param("pw", "1234")
							)
					
					.andReturn();
					
							
						
						
	}

}
