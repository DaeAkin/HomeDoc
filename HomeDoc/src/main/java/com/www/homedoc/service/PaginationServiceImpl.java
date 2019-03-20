package com.www.homedoc.service;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.mockito.Matchers.intThat;

import java.util.HashMap;
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
	//Todo.
	//Map에 List<BoardDto랑 paginationDto 넣을 것.
	@Override
	public Map<String, Object> getBoardListDoWithPagination(Map<String, Object> paramMap) {
		Integer currentPage;
		
		// 현재 누른페이지 가져오기. 없으면 1대입. 
		if(paramMap.get("currentPage") == null) {
			currentPage = 1;
		} else {
			currentPage = (Integer)paramMap.get("currentPage");
		}
		
		System.out.println("currentPage in Service : " + currentPage);
		
		BoardDto boardDto = new BoardDto();
		
		// 카테고리지정. 
		boardDto.setCategory((String)paramMap.get("category"));
		
		// totalPage 구하기 . Map에 Key로 category 값 넣어주기.
		int totalPage = boardDao.getAllboardWithCategory(boardDto).size();
		
		PaginationDto paginationDto = new PaginationDto(currentPage,totalPage);
		System.out.println("startNo in Service :" +paginationDto.getStartNo());
		System.out.println("perPage in Service :" +paginationDto.getPerPage());
		
		paramMap.put("startNo", paginationDto.getStartNo());
		paramMap.put("endNo", paginationDto.getEndNo());
		
		Map<String,Object> resultMap = new HashMap<>();
		
		resultMap.put("boardDtos", boardDao.getBoardListDoWithPagination(paramMap));
		resultMap.put("paginationDto", paginationDto);
		
		return resultMap;
	}
	
	
	
	

}
