package com.www.homedoc.util;

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

}
