package com.www.homedoc.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.service.BoardService;

@Controller
public class HomeController {
	
	//Service 의존성 추가.
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request) {
		System.out.println("---- HomeController home()-----");
		// 홈으로 이동할때 필요한 것들.
		// DB연결해서 실시간 게시글 가져오기 .
		// 일단은 4개씩. 
		//category 1이랑 2로 가져오기.
		// 몇개 짜를 건지 key end에 값 넣어주기.
		
		// boardService를 위한 Map 2개 생성 
		 Map<String, Object> serviceMap = new HashMap<>();
		Map<String, Object> serviceMap2 = new HashMap<>();
		
		serviceMap.put("category", "1");
		//일단 5개만 가져온다. 
		serviceMap.put("end", 5);
		
		serviceMap2.put("category", "2");
		serviceMap2.put("end", 5);
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("boardDto1", 
				boardService.getBoardForHomeWithLimit(serviceMap));
		
		mv.addObject("boardDto2", 
				boardService.getBoardForHomeWithLimit(serviceMap2));
		
		//만약에 로그인 상태라면 네비바에 알람도 같이 넣어주기
		HttpSession session = request.getSession();
		//로그인 한 사람 가져오기.
		String id = (String)session.getAttribute("id");
		
		// 로그인한상태라면 알람도 같이 가져와야됨.
//		if(id != null)
				
		mv.setViewName("index");
		return mv;
	}

}
