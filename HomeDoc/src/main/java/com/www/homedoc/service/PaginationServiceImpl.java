package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.BoardDao;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;

@Service
public class PaginationServiceImpl implements PaginationService{

	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<BoardDto> getBoardListDoWithPagination(Map<String, Object> paramMap) {
		PaginationDto paginationDto = new PaginationDto();
		
		// totalPage 구하기 . 
		paginationDto.setTotalPage(totalPage);
		
		
		return boardDao.getBoardListDoWithPagination(paramMap);
	}
	
	
	
	

}
