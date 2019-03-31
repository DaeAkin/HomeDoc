package com.www.homedoc.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.PaginationService;
import com.www.homedoc.util.PrettyPrintUtil;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	PaginationService paginationService;
	
	@RequestMapping(value = "/board/insert" , method = RequestMethod.POST)
	public String boardInsert(HttpServletRequest request, 
			Map<String, Object> paramMap) {
		
		
		return null;
	}
	
	//페이징 처리 같이들어감.
	
	// #{category} #{currentPage} 줘야함.
	
	@RequestMapping(value = "/board/selectAll" , method= RequestMethod.GET)
	public ModelAndView selectAllBoardWithCategory(@RequestParam Map<String, Object> paramMap) {
		/* Get으로 어떤게 넘어 오는가 ?
		 *  1) 게시판의 category ,
		 *  2) 현재페이지를 나타내는 currentPage 
		 */
		// Service가 필요한 값. 1) category 2) currentPage 
		// board/list?category=1&currnetPage=1
		// @RequestParam이 자동으로 Map으로 매핑해준다.
		
		
		ModelAndView mv = new ModelAndView();
		
		
//		paramMap.put("category", category);
	
		// boardDtos 랑 paginationDto 담겨 있음.
		Map<String, Object> resultMap = 
				paginationService.getBoardListDoWithPagination(paramMap);
		
		mv.addObject("boardDtos",
				(List<BoardDto>)resultMap.get("boardDtos"));
		
		mv.addObject("paginationDto",(PaginationDto)resultMap.get("paginationDto"));
		
		mv.addObject("category",paramMap.get("category"));
		
		mv.setViewName("boardList");
		
		List<BoardDto> boardDtos = 
				(List<BoardDto>)resultMap.get("boardDtos");
		
		for (BoardDto boardDto2 : boardDtos) {
			System.out.println(boardDto2.getNo());
		}

		return mv;
	}
	
	@RequestMapping(value = "/board/view" , method = RequestMethod.GET)
	public ModelAndView boardView(@RequestParam Map<String, Object> paramMap) {
		
		ModelAndView mv = new ModelAndView();
		BoardDto boardDto = new BoardDto();
		boardDto.setNo(Integer.parseInt((String)paramMap.get("no"))); 
		
		mv.addObject("boardDtos",
		boardService.getOneBoard(boardDto));
		
		boardDto = boardService.getOneBoard(boardDto);
		
		PrettyPrintUtil.printBoardDto(boardDto);
		
		
		
		mv.setViewName("boardView");
		
		return mv;
	}
	
	
	
}
