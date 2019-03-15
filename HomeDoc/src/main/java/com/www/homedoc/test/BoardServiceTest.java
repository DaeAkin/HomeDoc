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
				 "testboard", "testwriter", "2019-03-01", 0, "1" ,"컨텐트 내용");
	}
	
	@Test
	public void cRUDTest() {
		//DB 전부삭제. 
		boardService.deleteAllBoard();
	
		//DTO 1개 삽입
		boardService.insertBoard(
				DtoToMap.dtoToMapWithBoardDto(boardDto));
		
		//DB 전부 가져오기
		List<BoardDto> boardDtos =
				boardService.getAllBoard();
		
		//확인 
		assertThat(boardDtos.get(0).getTitle(), is(boardDto.getTitle()));
		
		// 게시글 업데이트 시작.
		boardDto.setTitle("updateTitle");
		boardDto.setContent("update Content");
		
		// 게시글 업데이트
		// no 업데이트 
		
		boardDto.setNo(
				boardDtos.get(0).getNo());
		
	
		boardService.updateBoard(
				DtoToMap.dtoToMapWtihBoardDtoIncludeNo(boardDto));
		
		 boardDtos = 
					boardService.getAllBoard();
		
		 assertThat(boardDtos.get(0).getTitle(), is(boardDto.getTitle()));
		
		//게시글 업데이트 끝. 
		 
		//삭제 테스트
		boardService.deleteOneBoardWithBoard_no(
				boardDtos.get(0).getNo());
		
		System.out.println("삭제할 no :" + boardDtos.get(0).getNo());
		
		
		//DB 전부 가져오기 
		List<BoardDto> resultDtos = 
				boardService.getAllBoard();
		
		// DB가 0개인지 확인
		assertThat(resultDtos.size(), is(0));
		
		 
		
		
		
	}

}
