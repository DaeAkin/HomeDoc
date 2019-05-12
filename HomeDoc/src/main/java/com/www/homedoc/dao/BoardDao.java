package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
import com.www.homedoc.dto.QuoDto;

public interface BoardDao extends CRUDDao<BoardDto, Integer>{

	
	
	List<BoardDto> getAllboardWithCategory(BoardDto boardDto);
	
	List<BoardDto> getBoardListDoWithPagination(Map<String, Object> paramMap);
	
	List<BoardDto> getAllBoardWithPagination(Map<String, Object> paramMap);
	
	List<BoardDto> getBoardForHomeWithLimit(Map<String, Object> paramMap);
	
	void increaseHit(int board_no);
	
	List<QuoDto> getCategoryList();
}
