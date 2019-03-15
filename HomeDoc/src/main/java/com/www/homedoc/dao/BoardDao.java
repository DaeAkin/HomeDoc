package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;

public interface BoardDao {

	int insertBoard(BoardDto boardDto);
	
	List<BoardDto> getAllboardWithCategory(BoardDto boardDto);
	
	List<BoardDto> getAllBoard();
	
	BoardDto getOneBoard(BoardDto boardDto);
	
	int deleteBoard(BoardDto boardDto);
	
	int updateBoard(BoardDto boardDto);
	
	void deleteAllBoard();
	
	int deleteOneBoardWithBoard_no(int no);
	
}
