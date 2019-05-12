package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.QuoDto;

public interface BoardService extends CRUDService<BoardDto, Integer>{


	
	// category 필요 
	List<BoardDto> getAllboardWithCategory(BoardDto boardDto);
	
	List<BoardDto> getBoardForHomeWithLimit(Map<String, Object> paramMap);
	
	void increaseHit(int board_no);
	
	List<QuoDto> getCategoryList();
	
	
}
