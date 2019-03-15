package com.www.homedoc.service;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;

import java.time.format.FormatStyle;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dto.MemberDto;
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
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
	
		return memberDao.insertMember(paramMap);
	}

	@Override
	public int updateMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return memberDao.updateMember(paramMap);
	}

	@Override
	public MemberDto selectOneMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return memberDao.selectOneMember(paramMap);
	}

	@Override
	public List<MemberDto> selectAllMember() {
		// TODO Auto-generated method stub
		return memberDao.seleteAllMember();
	}

	@Override
	public Boolean memberLogin(Map<String, Object> paramMap) {
		// 아이디 비밀번호 매칭 작업
		MemberDto memberDto = memberDao.memberLogin(paramMap);
		if(memberDto == null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public void deleteAllMember() {
		memberDao.deleteAllMember();
		
	}

	
}
