package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.www.homedoc.controller.HomeController;
import com.www.homedoc.dto.BoardDto;

// HomeController 테스트
// 눈으로 확인하는 테스트임.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class HomeControllerTest {
	
	@Autowired
	HomeController homeController;
	
	private  MockMvc mockMvc;
	
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
				.standaloneSetup(homeController)
				.build();
	}
	
	@Test
	public void homeTest() throws Exception {
	
		MvcResult result =
				mockMvc.perform(get("/"))
				.andDo(print())
				.andReturn();
		
		ModelAndView mv = result.getModelAndView();

		List<BoardDto> boardDto1 =
				(List<BoardDto>)mv.getModel().get("boardDto1");
		
		System.out.println("---- boardDto1 ----");
		for (BoardDto boardDto : boardDto1) {
			System.out.println(boardDto.getTitle() + " | " +
					boardDto.getWriter() + " | " + 
					boardDto.getCategory() + " | " + 
					boardDto.getContent() + " | "  );
		}
		System.out.println("---- boardDto1 ----");
		
		assertThat(mv.getViewName(), is("index"));
		
		
		List<BoardDto> boardDto2 =
				(List<BoardDto>)mv.getModel().get("boardDto2");
		System.out.println("---- boardDto2 ----");
		for (BoardDto boardDto : boardDto2) {
			System.out.println(boardDto.getTitle() + " | " +
					boardDto.getWriter() + " | " + 
					boardDto.getCategory() + " | " + 
					boardDto.getContent() + " | "  );
			}
		System.out.println("---- boardDto2 ----");
		}
		
		
	
	


}
