package com.www.homedoc.dto;

import com.www.homedoc.util.TimeUtil;
import com.www.homedoc.util.TimeUtils;

public class ReplyDto {

	int no;
	int board_no;
	String board_writer;
	String content;
	String writer;
	Boolean isalert;
	String datetime = TimeUtil.getExactlyCurrentTime();
	
	TimeUtils time = new TimeUtils();

	public ReplyDto(int no, int board_no, String content,
			String writer, Boolean isalert,
			String dateTime,String board_writer) {
		this.no = no;
		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
		this.datetime = dateTime;
		this.board_writer = board_writer;
	}

	public ReplyDto(int board_no, String content,
			String writer, Boolean isalert,
			String board_writer) {

		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
		this.board_writer = board_writer;
	}
	
	public ReplyDto(int board_no, String content,
			String writer, Boolean isalert,
			String board_writer,String datetime) {

		this.board_no = board_no;
		this.content = content;
		this.writer = writer;
		this.isalert = isalert;
		this.board_writer = board_writer;
		this.datetime = datetime;
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
	public String getDatetime() {
		return datetime;
	}
	public void setDateTime(String datetime) {
		this.datetime = datetime;
	}
	public String getBoard_writer() {
		return board_writer;
	}
	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

}
