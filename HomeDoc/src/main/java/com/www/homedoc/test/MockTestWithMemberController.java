package com.www.homedoc.test;

import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletRequest;

import com.www.homedoc.controller.MemberController;
import com.www.homedoc.service.MemberService;

// MemberController 목 테스트
public class MockTestWithMemberController {
	
	@InjectMocks
	MemberController memberController;
	
	@Mock
	MemberService mockMemberService;
	
//	@Mock
//	MockHttpServletRequest mockHttpServletRequest;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void mockMemberLoginTest() {
	
		MockHttpServletRequest request = new MockHttpServletRequest("POST","/member/login");
//		
		Map<String, Object> paramMap = new HashMap<String, Object>();
			
		request.setParameter("id", "test");
		request.setParameter("pw", "1234");
		
		when(mockMemberService.memberLogin(paramMap)).thenReturn(true);
		
		String viewName = 
				memberController.memberLogin(request, paramMap);
		
		System.out.println(viewName);
		
	}
	
	@Test
	public void mockMemberSignupTeest() {
		MockHttpServletRequest request = new MockHttpServletRequest("POST","/member/login");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		memberController.signUp(paramMap);
		
	}

}
