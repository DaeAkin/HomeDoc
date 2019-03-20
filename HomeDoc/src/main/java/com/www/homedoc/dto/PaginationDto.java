package com.www.homedoc.dto;

import apple.laf.JRSUIState.TitleBarHeightState;

public class PaginationDto {

	// 한번에 몇개의 페이지를 할건지? ex)5 : 1 2 3 4 5 가 뜸 
	int perPage = 7;
	//누른 페이지가 몇페이지인지 ?
	int currentPage;
	// 1 2 3 4 5 중에 1에 해당하는 시작페이지
	int startPage;
	// 1 2 3 4 5 중에 5에 해당하는 끝페이지 ( 라스트 페이지 아님.)
	int endPage;
	// << < 1 2 3 4 5 > >>
	// 전체 보여줄 페이지의 개수 
	int totalPage;
	// 가져올 갯수인데 처음에 정해주는?  
	//DB에서 limit start,end 를 사용할때.
	int startNo = 0;
	// 한 페이지에 보여줄 게시물 갯수. 
	int perView = 5;  // 한페이지에 5개씩 보여준다.
	// 가져올 갯수인데 마지막을 정해주는?
	int endNo = perView;
	@Deprecated
	// 다음페이지
	int nextPage;
	// 이전 페이지 
	@Deprecated
	int prevPage;
	// 최종 마지막 페이지 
	int lastPage;
	
	//실제 서비스시 CurrentPage,totalPage를 생성자에 넣어서 호출해야함. 
	public PaginationDto(int currentPage,int totalPage) {
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		System.out.println("---- dto ----");
		System.out.println("perPage :" + perPage);
		System.out.println("currentPage :" + currentPage);
		
		this.startNo = perPage * (currentPage-1); // 0
		
		// 끝 no 처리 해줘야함. 아직안했는데, 안해도 될듯? 
		this.endNo = perPage * currentPage; // 5 
		
		this.lastPage = totalPage/perPage + 1;
		// 몫이 0이면 ?
		if (currentPage < perPage) {
			this.startPage = 1;
		} else {
			this.startPage = currentPage / perPage * perPage + 1;
		}
		
		this.endPage = startPage + perPage - 1;
		//  끝 페이지 처리 
		if(endPage > lastPage) {
			this.endPage = lastPage;
			System.out.println("????");
		}
		System.out.println("endPage : " + this.endPage);
		System.out.println("lastPage : " + this.lastPage);
		
		
	}
	
	
	
	public PaginationDto(int perPage,int currentPage,
			int startPage, int endPage, int totalPage,
			int startNo, int endNo,int perView) {
		this.perPage = perPage;
		this.currentPage = currentPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
		this.startNo = startNo;
		this.endNo = endNo;
		this.perView = perView;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage; // 1 
		
		
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	public int getPerView() {
		return perView;
	}
	public void setPerView(int perView) {
		this.perView = perView;
	}
	public int getLastPage() {
		return lastPage;
	}
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	
	
	
}
