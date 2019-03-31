package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.controller.BoardController;
import com.www.homedoc.controller.MemberController;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.util.PrettyPrintUtil;

// MemberController 부터 MVC 통합 테스트.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class BoardControllerTest{
	
	private MockMvc mockMvc;
	
	@Autowired
	BoardController boardController;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
                .standaloneSetup(boardController)
//                .addFilters(new CORSFilter())
                .build();
		

	}
	
	@Test
	public void selectAllBoardTest() throws Exception {
		//정상 로그인처리
	MvcResult result =
				mockMvc.perform(get("/board/selectAll/1")
					.param("category", "1")
//					.param("pw", "1234")
					)
					.andDo(print())
					//리다이렉트 응답코드는 302
					.andExpect(status().is(200))
					.andReturn();

	ModelAndView mv = result.getModelAndView();
	
	ModelMap modelMap = mv.getModelMap();
	
//	Map<Object, Object> map = (Map<Object, Object>) modelMap.get("boardDtos");
	
	PaginationDto paginationDto = (PaginationDto)modelMap.get("paginationDto");
	
	PrettyPrintUtil.printPaginationDto(paginationDto);
	
	List<BoardDto> boardDtos = (List<BoardDto>)modelMap.get("boardDtos");
	
	System.out.println("사이즈 : " + boardDtos.size());
	for (BoardDto boardDto : boardDtos) {
		System.out.println(boardDto.getNo());
	}
	
	
	
	 
	

	
	}
	


} 
