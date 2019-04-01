package com.www.homedoc.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.controller.HomeController;
import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.service.interceptor.AlertInterceptor;
import com.www.homedoc.util.PrettyPrintUtil;

// HomeController 테스트
// 눈으로 확인하는 테스트임.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class HomeControllerTest extends BoardAndReplyTest{
	
	@Autowired
	HomeController homeController;
	
	private  MockMvc mockMvc;
	
	@Autowired
	AlertInterceptor alertInterceptor;
	
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders
				.standaloneSetup(homeController)
				.addInterceptors(alertInterceptor)
				.build();
		
		getReplyWithBoard_NoAndAlertTest();
		
	}
	
	@Test
	public void homeTest() throws Exception {
	
		MockHttpSession session = new MockHttpSession();
		
		session.setAttribute("id", "testId");
		MvcResult result =
				mockMvc.perform(get("/")
//						.session(session)) 
						)
//				.andDo(print())
				
				.andReturn();
		
		ModelAndView mv = result.getModelAndView();

		System.out.println("Test ModelAndview :" + mv);
		List<BoardDto> boardDto1 =
				(List<BoardDto>)mv.getModel().get("boardDto1");
		
		
		
		System.out.println("---- boardDto1 ----");
		for (BoardDto boardDto : boardDto1) {
			PrettyPrintUtil.printBoardDto(boardDto);
		}
		System.out.println("---- boardDto1 ----");
		
		assertThat(mv.getViewName(), is("index"));
		
		
		List<BoardDto> boardDto2 =
				(List<BoardDto>)mv.getModel().get("boardDto2");
		System.out.println("---- boardDto2 ----");
		for (BoardDto boardDto : boardDto2) {
			PrettyPrintUtil.printBoardDto(boardDto);
			}
		
		System.out.println("---- boardDto2 ----");
		
		//로그인 상태면 아래에 있는 알람 실행 . 
		List<AlertDto> alertDtos = (List<AlertDto>) mv.getModel().get("alertDtos");
		if (alertDtos != null) {
			for (AlertDto alertDto : alertDtos) {
				System.out.println(alertDto.getNo());
				System.out.println(alertDto.getTitle());
			}
		}
				
		}
	
	
		
		
		
		
	
	


}
