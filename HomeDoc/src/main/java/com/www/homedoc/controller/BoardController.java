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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.PaginationService;
import com.www.homedoc.util.PrettyPrintUtil;

@RequestMapping("/board")
@SessionAttributes("boardDto")
@Controller
public class BoardController extends CRUDController<BoardDto, Integer,
BoardService> {

	@Autowired
	BoardService boardService;
	
	@Autowired
	PaginationService paginationService;
	
	@RequestMapping(value = "/insert" , method = RequestMethod.GET)
	public String boardInsert() {
		
		
		return "board";
	}
	
	//페이징 처리 같이들어감.
	
	// #{category} #{currentPage} 줘야함.
	
	@RequestMapping(value = "/selectAllWithCategory" , method= RequestMethod.GET)
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
	
	@RequestMapping(value = "/view" , method = RequestMethod.GET)
	public ModelAndView boardView(@RequestParam int no) {
		
		ModelAndView mv = new ModelAndView();
		 
		mv.addObject("boardDtos",
		boardService.selectByNo(no));
		
		BoardDto boardDto = boardService.selectByNo(no);
		
		PrettyPrintUtil.printBoardDto(boardDto);
		
		mv.setViewName("boardView");
		
		return mv;
	}
	
	
	
}
