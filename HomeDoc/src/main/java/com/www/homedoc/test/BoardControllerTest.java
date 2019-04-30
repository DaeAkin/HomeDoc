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

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
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
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.service.MemberService;
import com.www.homedoc.service.interceptor.AlertInterceptor;
import com.www.homedoc.util.PrettyPrintUtil;

// BoardController부터 MVC 통합 테스트.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class BoardControllerTest {

	private MockMvc mockMvc;

	@Autowired
	BoardController boardController;
	
	@Autowired
	MemberController memberController;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	AlertInterceptor alertInterceptor;
	
	
	// 테스트용 객체 준비 
	BoardDto boardDto;
	//테스트용 로그인 객체 준비
	MemberDto memberDto;
	
	// 로그인 해서 나온 로그인 Session 
	private MockHttpSession session;
	
	/* Session 테스트 하기 위해서 
	 * Member를 다 지우고 테스트용 Member 주입후 , 
	 * 로그인 한 후 Session에서 writer를 가져오기위한 작업
	 */
	public void setUpBeforeSetUp() {
		
		MvcResult mvcResult = null;
		memberService.deleteAll();
		memberService.insert(memberDto);
		
		MockMvc memberMvc 
			= MockMvcBuilders
			.standaloneSetup(memberController)
			.build();
		
		try {
				mvcResult = memberMvc
					.perform(post("/member/login")
					.param("id", memberDto.getId())
					.param("pw", "1234"))
					.andReturn();
				
				MockHttpServletRequest request =
						mvcResult.getRequest();
				session = (MockHttpSession) request.getSession();
				
				System.out.println("엥 뭐냐 ? :" + memberDto.getPw());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

				
		
		
	}

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(boardController)
				// .addFilters(new CORSFilter())
				// .addInterceptors(alertInterceptor)
				.build();

		boardDto = new BoardDto("title", "writer", "", 0,
				"category", "content", "thumbnail");
		
		memberDto = new MemberDto("testid", "1234",
				"email", "address", "phone");
		
		setUpBeforeSetUp();
		
		
	}

	@Test
	public void selectAllBoardTest() throws Exception {
		// 정상 로그인처리
		MvcResult result = mockMvc.perform(get("/board/selectAll")

		).andDo(print())
				// 리다이렉트 응답코드는 302
				.andExpect(status().is(200)).andReturn();

		ModelAndView mv = result.getModelAndView();

		ModelMap modelMap = mv.getModelMap();

		// Map<Object, Object> map = (Map<Object, Object>) modelMap.get("boardDtos");

		PaginationDto paginationDto = (PaginationDto) modelMap.get("paginationDto");

		PrettyPrintUtil.printPaginationDto(paginationDto);

		List<BoardDto> boardDtos = (List<BoardDto>) modelMap.get("boardDtos");

		System.out.println("사이즈 : " + boardDtos.size());
		for (BoardDto boardDto : boardDtos) {
			System.out.println(boardDto.getNo());
		}

	}
	
	@Test
	public void boardWriteTest() throws Exception {
		
		MvcResult result =
				mockMvc.perform(post("/board/boardwrite").
						// 제목
						param("title", boardDto.getTitle())
						// 내용
						.param("content", boardDto.getContent())
						.param("writer", (String)session.getAttribute("id")))
						.andExpect(status().is(200))
						.andReturn();
		
		
	}

}
