package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.service.MemberService;
// MemberService 통합 테스트
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberDaoTest extends MemberMailSender{
	

	
	@Autowired
	MemberService memberService;
	
	@Test
	public void daoCRUDTest() {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("id", "test");
		paramMap.put("pw", "1234");
		
		assertThat(memberService.memberLogin(paramMap), is(true));
	
	}
	

}
