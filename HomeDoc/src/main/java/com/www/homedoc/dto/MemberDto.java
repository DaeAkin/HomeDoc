package com.www.homedoc.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.mysql.fabric.xmlrpc.base.Member;

public class MemberDto {

	int no;
	String id;
	String pw;
	String email;
	String address;
	String phone;
	
	public MemberDto() {
		
	}
	
	public MemberDto(int no, String id, String pw,
			String email,String address, String phone) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public MemberDto(String id, String pw, String email,
			String address, String phone) {
		
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	
	//validation 관련메소드
	public boolean supports(Class<?> clazz) {
		return (Member.class.isAssignableFrom(clazz));
	}
	
	public void validate(Object target, Errors errors) {
		Member member = (Member)target;
		
		ValidationUtils.rejectIfEmpty(errors, "name", "field.required");
	}
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
