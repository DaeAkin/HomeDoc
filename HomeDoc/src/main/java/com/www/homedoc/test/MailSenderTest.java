package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.service.MemberMailSender;
// 메일 보내기 인증 통합 테스트
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MailSenderTest extends MemberMailSender{
	
	//테스트 당할 이메일 주소
	private final String testEmail = "kei89011@naver.com";
	
	@Autowired
	MemberMailSender mailSender;
	
	@Test
	public void authenticationTest() {
		int validNumber = 
				mailSender.authenticationsend(testEmail);
		
		assertThat(mailSender.validationEmail(validNumber),
				is(true));
	}

}
