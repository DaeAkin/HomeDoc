package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.MemberService;

public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "/board/insert " , method = RequestMethod.POST)
	public String boardInsert(HttpServletRequest request, 
			Map<String, Object> paramMap) {
		
		
		return null;
	}
	
	@RequestMapping(value = "/board/selectAll/{category}" , method= RequestMethod.POST)
	public String selectAllBoardWithCategory(@PathVariable(value="category") 
		int category,
		ModelMap modelMap) {
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("category", category);
		
		
		
		System.out.println("boardService : " + boardService);
		List<BoardDto> boardDtos = 
				boardService.getAllboardWithCategory(paramMap);
		
		modelMap.addAttribute("boardDtos",boardDtos);
		

		return "board";
	}
	
	
}
