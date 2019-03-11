package com.www.homedoc.test;

import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.service.MemberServiceImpl;

public class MemberLogicTest {

	
	@Test
	public void cRUDMockTest() {
		
		MemberServiceImpl memberService = new MemberServiceImpl();
		
		// DAO 목 생성 
		MemberDao mockMemberDao = mock(MemberDao.class);
		
		// service 객체에 Dao DI 해주기
		memberService.setMemberDao(mockMemberDao);
		
		mockMemberDao.
	}
	
}
