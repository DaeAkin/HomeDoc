package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;

public interface PaginationService {

	List<BoardDto> getBoardListDoWithPagination(Map<String, Object> paramMap);
}
