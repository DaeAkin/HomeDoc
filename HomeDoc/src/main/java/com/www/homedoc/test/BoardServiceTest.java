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
import com.www.homedoc.service.BoardService;
import com.www.homedoc.util.DtoToMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class BoardServiceTest {
	
	@Autowired
	BoardService boardService;

	BoardDto boardDto;
	
	@Before
	public void setUp() {
		 boardDto = new BoardDto(
				 "testboard", "testwriter", 0, "1" ,"컨텐트 내용","asd.jpg");
	}
	
	@Test
	public void cRUDTest() {
		//DB 전부삭제. 
		boardService.deleteAll();
	
		//DTO 1개 삽입
		boardService.insert(
				boardDto);
		
		//DB 전부 가져오기
		List<BoardDto> boardDtos =
				boardService.selectAll();
		//확인 
		assertThat(boardDtos.get(0).getTitle(), is(boardDto.getTitle()));
		
		//조회수 증가 테스트
		boardService.increaseHit(boardDtos.get(0).getNo());
		// 게시글 업데이트 시작.
		boardDto.setTitle("updateTitle");
		boardDto.setContent("update Content"); 
		
		
		// 게시글 업데이트
		// no 업데이트 
		
		boardDto.setNo(
				boardDtos.get(0).getNo());
		

	
	
		boardService.update(boardDto);
		
		// 게시글 한개 가져오는 함수도 잘 작동되는지 확인하기. 
		BoardDto resultBoard = boardService.selectByNo(boardDto.getNo());
		
		assertThat(resultBoard.getTitle(), is(boardDto.getTitle()));
		
		 boardDtos = 
					boardService.selectAll();
		
		 assertThat(boardDtos.get(0).getTitle(), is(boardDto.getTitle()));
		
		 //조회수가 1증가했는지확인.
		 assertThat(boardDto.getHit()+1,
				 	is(resultBoard.getHit()));
		//게시글 업데이트 끝. 
		 
		//삭제 테스트
		boardService.deleteByNo(
				boardDtos.get(0).getNo());
		
		System.out.println("삭제할 no :" + boardDtos.get(0).getNo());
		
		
		//DB 전부 가져오기 
		List<BoardDto> resultDtos = 
				boardService.selectAll();
		
		// DB가 0개인지 확인 
		assertThat(resultDtos.size(), is(0));
		
		 
		
		
		
	}

}
