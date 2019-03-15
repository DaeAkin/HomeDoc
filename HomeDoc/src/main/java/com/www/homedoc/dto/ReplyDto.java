package com.www.homedoc.dto;

public class ReplyDto {

	int no;
	int board_no;
	String content;
	String writer;
	Boolean isalert;

	public ReplyDto(int no, int board_no, String content, String writer, Boolean isalert) {
		this.no = no;
		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
	}

	public ReplyDto(int board_no, String content, String writer, Boolean isalert) {

		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
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

}
