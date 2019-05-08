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
				 "testboard", "testwriter", "2019-03-01", 0, "1" ,"컨텐트 내용","asd.jpg");
		
		 	//DB 전부삭제. 
			boardService.deleteAll();
			
			//테스트용 게시판 50개 작업 
			//30개로 페이징 처리 테스트를 해볼 예정.
			for(int i=0; i<50; i++) {
				boardDto.setTitle("testboard" + i);
				boardService.insert(boardDto);
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
		pagingMap.put("currentPage", "4");
		
		
		
		
		Map<String, Object> resultMap = 
				paginationService.getBoardListDoWithPagination(pagingMap);
						
		List<BoardDto> boardDtos = (List<BoardDto>)resultMap.get("boardDtos");
		
		System.out.println(boardDtos.size());
		
		PaginationDto paginationDto =
				(PaginationDto)resultMap.get("paginationDto");
			
		System.out.println(paginationDto.toString());
		
		System.out.print("<<" + " ");
		for(int i = paginationDto.getStartPage(); i<=paginationDto.getEndPage(); i++) {
			System.out.print(i + " ");
		}
		System.out.print(">>" + " ");
		
		//<< 1 2 3 4 5 6 >>
		
	}
	
	
	@Test
	public void paginationTest2() {
		// 게시판 전부 가져오는..
		Map<String, Object> pagingMap = new HashMap<>();
		
		pagingMap.put("currentPage", "4");
		
		
		
		
		Map<String, Object> resultMap = 
				paginationService.getAllBoardWithPagination(pagingMap);
						
		List<BoardDto> boardDtos = (List<BoardDto>)resultMap.get("boardDtos");
		
		System.out.println(boardDtos.size());
		
		PaginationDto paginationDto =
				(PaginationDto)resultMap.get("paginationDto");
			
		System.out.println(paginationDto.toString());
		
		System.out.print("<<" + " ");
		for(int i = paginationDto.getStartPage(); i<=paginationDto.getEndPage(); i++) {
			System.out.print(i + " ");
		}
		System.out.print(">>" + " ");
		
		//<< 1 2 3 4 5 6 >>
		
	}
	
	

}
