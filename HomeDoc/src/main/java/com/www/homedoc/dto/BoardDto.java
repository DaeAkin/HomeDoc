package com.www.homedoc.dto;

import com.www.homedoc.util.TimeUtil;

public class BoardDto {

	int no;
	String title;
	String writer;
	String datetime;
	int hit;
	String category;
	String content;
	String thumbnail;
	
	public BoardDto(int no, String title,String writer
			,String datetime,int hit,String category,
			String content,String thumbnail) {
		
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.datetime = datetime;
		this.hit = hit;
		this.category = category;
		this.content = content;
		this.thumbnail = thumbnail;
		
	}
	
	public BoardDto( String title,String writer
			,String datetime,int hit,String category,
			String content,String thumbnail) {
		
		
		this.title = title;
		this.writer = writer;
		this.datetime = datetime;
		this.hit = hit;
		this.category = category;
		this.content = content;
		this.thumbnail = thumbnail;
		
	}
	
	public BoardDto( String title,String writer
			,int hit,String category,
			String content,String thumbnail) {
		
		
		this.title = title;
		this.writer = writer;
		this.hit = hit;
		this.category = category;
		this.content = content;
		this.thumbnail = thumbnail;
		
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
