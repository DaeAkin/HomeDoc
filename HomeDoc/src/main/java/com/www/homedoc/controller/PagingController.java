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
	
	@RequestMapping("/board/list")
	public String movePage(@RequestParam Map<String, Object> paramMap) {
		/* Get으로 어떤게 넘어 오는가 ?
		 *  1) 게시판의 category ,
		 *  2) 현재페이지를 나타내는 currentPage 
		 */
		// Service가 필요한 값. 1) category 2) currentPage 
		// board/list?category=1&currnetPage=1
		// @RequestParam이 자동으로 Map으로 매핑해준다.
		
		
		paginationService.getBoardListDoWithPagination(paramMap);
		
		
		return "게시판 템플릿 으로 ";
		
	}

}
