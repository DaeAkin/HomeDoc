package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.MemberService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board/insert " , method = RequestMethod.POST)
	public String boardInsert(HttpServletRequest request, 
			Map<String, Object> paramMap) {
		
		
		return null;
	}
	
	@RequestMapping(value = "/board/selectAll/{category}" , method= RequestMethod.GET)
	public ModelAndView selectAllBoardWithCategory(@PathVariable(value="category") 
		String category) {
		
		ModelAndView mv = new ModelAndView();
		
		
		BoardDto boardDto = new BoardDto();
		
		boardDto.setCategory(category);
		
		System.out.println("boardService : " + boardService);
		List<BoardDto> boardDtos = 
				boardService.getAllboardWithCategory(boardDto);
		
		mv.addObject("boardDtos", boardDtos);
		mv.setViewName("boardList");
		
		

		return mv;
	}
	
	
	
	
}
