package com.www.homedoc.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.PaginationService;

// 로그로 확인하기.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class PaginationTest {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	PaginationService paginationService;
	
	BoardDto boardDto;
	
	@Before
	public void setUp() {
		 boardDto = new BoardDto(
				 "testboard", "testwriter", "2019-03-01", 0, "1" ,"컨텐트 내용");
		
		 	//DB 전부삭제. 
			boardService.deleteAllBoard();
			
			//테스트용 게시판 50개 작업 
			//30개로 페이징 처리 테스트를 해볼 예정.
			for(int i=0; i<50; i++) {
				boardDto.setTitle("testboard" + i);
				boardService.insertBoard(boardDto);
			}
		 
	}
	
	@Test
	public void paginationTest() {
		/*
		 * 1) 현재페이지 만 클라이언트에서 받으면 될까? 그런듯?
		 */
		// 페이징용 맵 설정.
		// category랑 
		// currentPage ( 누른페이지 ) 필수
		Map<String, Object> pagingMap = new HashMap<>();
		
		pagingMap.put("category", "1");
		pagingMap.put("currentPage", 4);
		
		
		
		
		Map<String, Object> resultMap = 
				paginationService.getBoardListDoWithPagination(pagingMap);
						
		List<BoardDto> boardDtos = (List<BoardDto>)resultMap.get("boardDtos");
		
		System.out.println(boardDtos.size());
		
		PaginationDto paginationDto =
				(PaginationDto)resultMap.get("paginationDto");
		
		System.out.println("---- 출력할 페이지 ----");
		System.out.println("startPage :" +paginationDto.getStartPage());
		System.out.println("endPage :" +paginationDto.getEndPage());
		System.out.println("currentPage :" +paginationDto.getCurrentPage());
		System.out.println("startNo :" +paginationDto.getStartNo());
		System.out.println("endNo :" +paginationDto.getEndNo());
		System.out.println("lastPage :" +paginationDto.getLastPage());
		
		
		System.out.print("<<" + " ");
		for(int i = paginationDto.getStartPage(); i<=paginationDto.getEndPage(); i++) {
			System.out.print(i + " ");
		}
		System.out.print(">>" + " ");
		
	}
	
	

}
