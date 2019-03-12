package com.www.homedoc.dto;

public class BoardDto {

	int no;
	String title;
	String writer;
	String datetime;
	int hit;
	String category;
	
	public BoardDto(int no, String title,String writer
			,String datetime,int hit,String category) {
		
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.datetime = datetime;
		this.hit = hit;
		this.category = category;
		
	}
	
	public BoardDto( String title,String writer
			,String datetime,int hit,String category) {
		
		
		this.title = title;
		this.writer = writer;
		this.datetime = datetime;
		this.hit = hit;
		this.category = category;
		
	}
	
	public BoardDto() {
		
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
