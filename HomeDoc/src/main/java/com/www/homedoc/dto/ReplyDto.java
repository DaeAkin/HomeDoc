package com.www.homedoc.dto;

import com.www.homedoc.util.TimeUtils;

public class ReplyDto {

	int no;
	int board_no;
	String content;
	String writer;
	Boolean isalert;
	String dateTime; 
	
	TimeUtils time = new TimeUtils();

	public ReplyDto(int no, int board_no, String content, String writer, Boolean isalert,String dateTime) {
		this.no = no;
		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
		this.dateTime = dateTime;
	}

	public ReplyDto(int board_no, String content, String writer, Boolean isalert,String dateTime) {

		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
		this.dateTime = dateTime;
	}

	public ReplyDto() {

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Boolean getIsalert() {
		return isalert;
	}

	public void setIsalert(Boolean isalert) {
		this.isalert = isalert;
	}
	public String getDateTime() {
		return time.getCurrentTime();
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
