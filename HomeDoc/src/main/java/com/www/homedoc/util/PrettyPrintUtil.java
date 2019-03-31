package com.www.homedoc.util;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;

public class PrettyPrintUtil {
	
	static public void printPaginationDto(PaginationDto paginationDto) {
		
		System.out.println("---- paginationdto ----");
		System.out.println("perPage : " + paginationDto.getPerPage());
		System.out.println("currentPage : " + paginationDto.getCurrentPage());
		System.out.println("startPage : " + paginationDto.getStartPage());
		System.out.println("endPage : " + paginationDto.getEndPage());
		System.out.println("totalPage : " + paginationDto.getTotalPage());
		System.out.println("startNo : " + paginationDto.getStartNo());
		System.out.println("perView : " + paginationDto.getPerView());
		System.out.println("endNo : " + paginationDto.getEndNo());
		System.out.println("lastPage : " + paginationDto.getLastPage());
		System.out.println("---- paginationdto ----");
		
	}
	
	static public void printBoardDto(BoardDto boardDto) {

		System.out.println("---- boardDto -----");
		System.out.println("no : " + boardDto.getNo());
		System.out.println("title : " + boardDto.getTitle());
		System.out.println("writer : " + boardDto.getWriter());
		System.out.println("datetime : " + boardDto.getDatetime());
		System.out.println("hit : " + boardDto.getHit());
		System.out.println("category : " + boardDto.getCategory());
		System.out.println("content : " + boardDto.getContent());
		System.out.println("thumbnail : " + boardDto.getThumbnail());
		System.out.println("---- boardDto -----");
	}
}
