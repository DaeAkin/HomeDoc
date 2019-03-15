package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.service.MemberService;
// MemberService 통합 테스트
import com.www.homedoc.util.DtoToMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberServiceTest extends MemberMailSender{
	

	
	@Autowired
	MemberService memberService;
	
	MemberDto memberDto;
	
	
	
	@Before
	public void setUp() {
		memberDto = new MemberDto(
				"testId", "testPw", "testeMail@gmail.com",
				"testAdress", "01011112222"
				);
	}
	
	@Test
	public void cRUDTest() {
		// DB 전부삭제
		memberService.deleteAllMember();
		
		//  DTO 1개 삽입
		memberService.insertMember(
				memberDto);
		
		
		// DB데이터 전부 가져옴
		List<MemberDto> allMemberDto = 
				memberService.selectAllMember();
		
		MemberDto resultMemberDto =
				allMemberDto.get(0);
		
		assertThat(resultMemberDto.getEmail(),is(memberDto.getEmail()));
		
		// 이메일 수정 테스트 시작
		memberDto.setEmail("1111@gmail.com");
		
		memberService.updateMember(
				memberDto);
		
		allMemberDto = 
				memberService.selectAllMember();
		
		resultMemberDto = 
				allMemberDto.get(0);
		
		assertThat(resultMemberDto.getEmail(),is(memberDto.getEmail()));
		
		// 이메일 수정 테스트 끝
		
		
		
		
	
	}
	

}
