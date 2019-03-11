package com.www.homedoc.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.util.RandomNumberMaker;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "context-testContext.xml")
public class MockMailSendTest {

	@Autowired
	MemberMailSender mailSender;
	
	MemberMailSender mockMemberMailSender = 
			mock(MemberMailSender.class);

	
	@Test
	public void mailSender() {
		
		mockMemberMailSender.authenticationsend("aa");
		verify(mockMemberMailSender, times(1)).authenticationsend("aa");
		
		
	}

	@Test
	public void AuthenticationTest() {
		when(mockMemberMailSender.authenticationsend("aa")).thenReturn(54623);
		
		int a = mockMemberMailSender.authenticationsend("aa");
		
		System.out.println(a);
		verify(mockMemberMailSender, times(1)).authenticationsend("aa");
		
		
		
		System.out.println(mockMemberMailSender.validationEmail(54623));
		
		
		
		
	}
}
