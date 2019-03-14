package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;

public interface BoardService {

	int insertBoard(Map<String, Object> paramMap);
	
	List<BoardDto> getAllboardWithCategory(Map<String, Object> paramMap);
	
	BoardDto getOneBoard(Map<String, Object> paramMap);
	
	int deleteBoard(Map<String, Object> paramMap);
	
	int updateBoard(Map<String, Object> paramMap);
}
