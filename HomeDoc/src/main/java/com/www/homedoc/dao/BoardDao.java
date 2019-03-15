package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;

public interface BoardDao {

	int insertBoard(Map<String, Object> paramMap);
	
	List<BoardDto> getAllboardWithCategory(Map<String, Object> paramMap);
	
	List<BoardDto> getAllBoard();
	
	BoardDto getOneBoard(Map<String, Object> paramMap);
	
	int deleteBoard(Map<String, Object> paramMap);
	
	int updateBoard(Map<String, Object> paramMap);
	
	void deleteAllBoard();
	
	int deleteOneBoardWithBoard_no(int no);
	
}
