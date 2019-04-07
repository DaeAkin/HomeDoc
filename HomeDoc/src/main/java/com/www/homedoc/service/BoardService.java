package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;

public interface BoardService {

	int insertBoard(BoardDto boardDto);
	
	// category 필요 
	List<BoardDto> getAllboardWithCategory(BoardDto boardDto);
	
	List<BoardDto> getAllBoard();
	
	BoardDto getOneBoard(BoardDto boardDto);
	
	int deleteBoard(BoardDto boardDto);
	
	int updateBoard(BoardDto boardDto);
	
	void deleteAllBoard();
	
	int deleteOneBoardWithBoard_no(int no);
	
	List<BoardDto> getBoardForHomeWithLimit(Map<String, Object> paramMap);
}
