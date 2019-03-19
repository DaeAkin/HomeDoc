package com.www.homedoc.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class PaginationTest {
	
	@Autowired
	BoardService boardService;
	
	BoardDto boardDto;
	
	@Before
	public void setUp() {
		 boardDto = new BoardDto(
				 "testboard", "testwriter", "2019-03-01", 0, "1" ,"컨텐트 내용");
		
		 	//DB 전부삭제. 
			boardService.deleteAllBoard();
			
			//테스트용 게시판 30개 작업 
			//30개로 페이징 처리 테스트를 해볼 예정.
			for(int i=0; i<30; i++) {
				boardDto.setTitle("testboard" + i);
				boardService.insertBoard(boardDto);
			}
		 
	}
	
	@Test
	public void paginationTest() {
		/*
		 * 1) 현재페이지 만 클라이언트에서 받으면 될까?
		 */
		
		
	}
	
	

}
