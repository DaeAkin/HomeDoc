package com.www.homedoc.dto;

public class AlertDto {

	// 게시판 제목
	String title;
	// 게시판 no 누르면 접근하기 위해서
	int no;
	// alert 됐는지 ?
	Boolean isalert;
	// 댓글 쓴사람
	String writer;
	// 댓글의 no
	int reply_no;
	// 댓글 내용
	String content;
	//댓글 시간
	String datetime;
	
	public AlertDto() {

	}

	public AlertDto(String title, int no,
			Boolean isalert, String writer, int reply_no,
			String content, String datetime) {

		this.title = title;
		this.no = no;
		this.isalert = isalert;
		this.writer = writer;
		this.reply_no = reply_no;
		this.content = content;
		this.datetime = datetime;

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

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
public String getDatetime() {
	return datetime;
}
public void setDatetime(String datetime) {
	this.datetime = datetime;
}


	@Override
	public String toString() {
		
		return "--- alertDto ---" + "\n" +
		"title : " + this.title + "\n" +
		"no : " + this.no + "\n" +
		"isAlert : " + this.isalert + "\n" +
		"wrtier : " + this.writer +  "\n" +
		"reply_no :" + this.reply_no + "\n"+
		"content : " + this.content +  "\n" +
		"datetime : " + this.datetime +  "\n" ;
	}

}
