package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.isNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dao.MemberDaoImpl;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.service.MemberMailSender;
import com.www.homedoc.service.MemberService;
// MemberService 통합 테스트
import com.www.homedoc.util.DtoToMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MemberServiceTest{
	
	// 테스트용 MemberDao 생성 
	@Autowired
	MemberDao memberDao;

	@Autowired
	MemberService memberService;
	
	MemberDto memberDto;

	
	
	@Before
	public void setUp() {
		memberDto = new MemberDto(
				"testId", "1234", "testeMail@gmail.com",
				"testAdress", "01011112222" 
				);
		
	}
	
	@Test
	public void cRUDTest() {
		
		// DB 전부삭제
		memberService.deleteAll();
		
		//  DTO 1개 삽입
		memberService.insert(
				memberDto);
		
		
		// DB데이터 전부 가져옴
		List<MemberDto> allMemberDto = 
				memberService.selectAll();
		
		MemberDto resultMemberDto =
				allMemberDto.get(0);
		
		assertThat(resultMemberDto.getEmail(),is(memberDto.getEmail()));
		
		// 이메일 수정 테스트 시작
		memberDto.setEmail("1111@gmail.com");
		
		memberService.update(
				memberDto);
	
		allMemberDto = 
				memberService.selectAll();
		
		resultMemberDto = 
				allMemberDto.get(0);
		
		assertThat(resultMemberDto.getEmail(),is(memberDto.getEmail()));
		
		// 이메일 수정 테스트 끝

		// 아이디 중복체크 테스트 
		memberIdCheckTest();
		
		
	}
	
	public void memberIdCheckTest() {
		
		/*1) 케이스 
		 * 이미 존재하는 아이디 넣어보기. 
		 * 예상 : return 1이 되어야한다.
		 */
		assertThat(
				memberService.memberIdCheck(memberDto.getId()),
					is(1));
		
		/* 2) 케이스
		 * 존재하지 않는 아이디 넣기
		 * 예상 : return 0이 되어야한다.
		 */
		assertThat(
				memberService.memberIdCheck("abc21salll"),
					is(0));
	}
	

	

}
