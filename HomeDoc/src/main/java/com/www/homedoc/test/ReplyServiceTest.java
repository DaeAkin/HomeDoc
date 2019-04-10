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

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.ReplyService;
import com.www.homedoc.util.DtoToMap;

// ReplyService의 통합 테스트
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class ReplyServiceTest {
	
	@Autowired
	ReplyService replyService;
	
	ReplyDto replyDto;
	
	@Before
	public void setUp() {
		
		replyDto = new ReplyDto(1, "견적서 내용입니다.", "인덕철물점", false,null);
		
		
	}
	// Param 형식 말고 Map 형식으로 할것임 	
	@Test
	public void cRUDTest() {

		//DB 전부삭제. 
		replyService.deleteAll();
	
		//DTO 1개 삽입
		replyService.insert(replyDto);
	
		
		//DB 전부 가져오기
		List<ReplyDto> replyDtos = 
				replyService.selectAll();
		
		//확인 
		assertThat(replyDtos.get(0).getContent(), is(replyDto.getContent()));
		
		// 게시글 업데이트 시작.
		replyDto.setContent("견적일까요?");
		
		
		// 게시글 업데이트
		// no 업데이트 
		
		replyDto.setNo(
				replyDtos.get(0).getNo());
		
	
		replyService.update(replyDto);
		
		replyDtos = 
				replyService.selectAll();
		
		 assertThat(replyDtos.get(0).getContent(), is(replyDto.getContent()));
		
		//게시글 업데이트 끝. 
		 
		//삭제 테스트
		replyService.deleteByNo(replyDto.getNo());
		
		System.out.println("삭제할 no :" + replyDtos.get(0).getNo());
		
		
		//DB 전부 가져오기 
		List<ReplyDto> resultDtos = 
				replyService.selectAll();
		
		// DB가 0개인지 확인
		assertThat(resultDtos.size(), is(0));
 
		
		
		
	}

}
