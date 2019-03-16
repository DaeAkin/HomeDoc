package com.www.homedoc.dto;

public class AlertDto {

	//게시판 제목
	String title;
	//게시판 no 누르면 접근하기 위해서 
	int no;
	// alert 됐는지 ? 
	Boolean isalert;
	//댓글 쓴사람 
	String writer;
	
	
	public AlertDto() {
		
	}
	
	public AlertDto(String title, int no, Boolean isalert, String writer) {
		
		this.title = title;
		this.no = no;
		this.isalert = isalert;
		this.writer = writer;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Boolean getIsalert() {
		return isalert;
	}
	public void setIsalert(Boolean isalert) {
		this.isalert = isalert;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	} 
	
	
	
}
