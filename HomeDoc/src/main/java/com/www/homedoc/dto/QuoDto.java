package com.www.homedoc.dto;

//카테고리 Dto
public class QuoDto {
	
	int no;
	String category;
	
	
	public QuoDto(String category) {
		this.category = category;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	

}
