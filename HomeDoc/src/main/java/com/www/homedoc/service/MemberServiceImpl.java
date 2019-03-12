package com.www.homedoc.service;

import java.util.Map;

import com.www.homedoc.dao.MemberDao;

public class MemberServiceImpl implements MemberService{

	
	MemberDao memberDao;
	
	MemberMailSender mailSender;
	
	
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void setMailSender(MemberMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	
	
	@Override
	public int insertMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return memberDao.insertMember(paramMap);
	}

	
}
