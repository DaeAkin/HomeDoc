package com.www.homedoc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.www.homedoc.service.PaginationService;

@Controller
public class PagingController {
	
	@Autowired
	PaginationService paginationService;
	
	@RequestMapping("/")
	public String movePage(@RequestParam Map<String, Object> paramMap) {
		/* Get으로 어떤게 넘어 오는가 ?
		 *  1) 게시판의 category ,
		 *  2) 현재페이지를 나타내는 currentPage 
		 */
		
		paginationService.getBoardListDoWithPagination(paramMap);
		
		
		return "게시판 템플릿 으로 ";
		
	}

}
