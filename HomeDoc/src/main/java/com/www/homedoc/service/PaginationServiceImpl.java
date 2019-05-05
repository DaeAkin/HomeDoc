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
	
	
	//dao로 #{category} #{startNo}, #{endNo} 줘야함.
	//Map에 List<BoardDto>랑 paginationDto 넣어짐. 
	@Override
	public Map<String, Object> getBoardListDoWithPagination(Map<String, Object> paramMap) {
		Integer currentPage;
		
		// 현재 누른페이지 가져오기. 없으면 1대입. 
		if(paramMap.get("currentPage") == null) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt((String)paramMap.get("currentPage"));
		}
		
		// 카테고리지정. 		
		BoardDto boardDto = new BoardDto();
		boardDto.setCategory((String)paramMap.get("category"));
		
		// totalPage 구하기 . Map에 Key로 category 값 넣어주기.
		int totalPage = boardDao.getAllboardWithCategory(boardDto).size();
		
		Map<String, Object> paginationMap = doPagination(9,currentPage,totalPage);
		paginationMap.put("category", paramMap.get("category"));
		
		Map<String,Object> resultMap = new HashMap<>();
		
		resultMap.put("boardDtos", boardDao.getBoardListDoWithPagination(paginationMap));
		resultMap.put("paginationDto", paginationMap.get("paginationDto"));
		return resultMap;
	}
	
	public Map<String, Object >doPagination(int perPage,int currentPage,int totalPage) {
		Map<String, Object> paramMap = new HashMap<>();
		
		System.out.println("doPagination() :: currentPage : " + currentPage);
		PaginationDto paginationDto = new PaginationDto(currentPage,totalPage);
		System.out.println("doPagination() : " + paginationDto.toString());
		paginationDto.setPerPage(perPage);
		
		System.out.println("startNo in Service :" +paginationDto.getStartNo());
		System.out.println("perPage in Service :" +paginationDto.getPerPage());
		
		paramMap.put("perPage", paginationDto.getPerPage());
		paramMap.put("startNo", paginationDto.getStartNo());
		paramMap.put("endNo", paginationDto.getEndNo());
		paramMap.put("paginationDto", paginationDto);
		
		return paramMap;
		
	}
	
	
	
	
	

}
