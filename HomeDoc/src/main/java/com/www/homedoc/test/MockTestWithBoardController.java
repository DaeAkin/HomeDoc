package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

import com.www.homedoc.controller.BoardController;
import com.www.homedoc.dao.BoardDaoImpl;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.service.BoardServiceImpl;

//BoardController 목 테스트

//@InjectMocks : @Mock 어노테이션이 붙은 아이들을 
// @InjectMocks 어노테이션이 붙은 애들한테 주입해주세요.


//@Spy : 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class MockTestWithBoardController {
	
	@InjectMocks
	BoardController boardController;

	@Mock
	BoardServiceImpl boardService;

	BoardDto boardDto;

	List<BoardDto> boardDtos;
	
	
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		boardDto = new BoardDto(1, "test", "writer", "2019-03-13", 0, "1");

		boardDtos = new ArrayList<BoardDto>();
		boardDtos.add(boardDto);
//		mockBoardService.setBoardDao(boardDao);
		
	}
	
	@Test
	public void MockControllerTest() {
		
		ModelMap modelMap = new ModelMap();
		
		when(boardService.getAllboardWithCategory(anyMap())).thenReturn(boardDtos);
			
		
			boardController.selectAllBoardWithCategory(1, modelMap);
				
		
		@SuppressWarnings("unchecked")
		ArrayList<BoardDto> arrayList = (ArrayList<BoardDto>)modelMap.get("boardDtos");
		
		
		for (BoardDto boardDto : arrayList) {
			assertThat(boardDto, is(boardDto));
		}
			
	}

}
