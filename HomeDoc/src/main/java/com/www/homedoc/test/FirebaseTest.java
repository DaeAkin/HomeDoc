package com.www.homedoc.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dao.CRUDDaoImpl;
import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dao.MemberDaoImpl;
import com.www.homedoc.dto.MemberDto;

//@RunWith(SpringJUnit4ClassRunner.class)
public class FirebaseTest {

	@Test
	public void test() throws IOException {
		System.out.println("??");
		MemberDto memberDto = new MemberDto(
				"testId", "1234", "testeMail@gmail.com",
				"testAdress", "01011112222" 
				);
		MemberDaoImpl dao = new MemberDaoImpl();
		
		dao.insert(memberDto);
		
		dao.deleteByNo(1);
	}
}
