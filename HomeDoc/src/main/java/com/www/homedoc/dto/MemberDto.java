package com.www.homedoc.dto;

public class MemberDto {

	int no;
	String id;
	String pw;
	String email;
	
	public MemberDto() {
		
	}
	
	public MemberDto(int no, String id, String pw, String email) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	public MemberDto(String id, String pw, String email) {
		
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
