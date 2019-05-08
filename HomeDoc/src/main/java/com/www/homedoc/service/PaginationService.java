package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;

public interface PaginationService {

	Map<String, Object> getBoardListDoWithPagination(Map<String, Object> paramMap);
	
	Map<String, Object> getAllBoardWithPagination(Map<String, Object> paramMap);
}
