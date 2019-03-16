package com.www.homedoc.service;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withBadRequest;

import java.time.format.FormatStyle;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;
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
	public int insertMember(MemberDto memberDto) {
	
		return memberDao.insertMember(memberDto);
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return memberDao.updateMember(memberDto);
	}

	@Override
	public MemberDto selectOneMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return memberDao.selectOneMember(memberDto);
	}

	@Override
	public List<MemberDto> selectAllMember() {
		// TODO Auto-generated method stub
		return memberDao.seleteAllMember();
	}

	@Override
	public Boolean memberLogin(MemberDto memberDto) {
		// 아이디 비밀번호 매칭 작업
		MemberDto resultMemberDto = memberDao.memberLogin(memberDto);
		if(resultMemberDto == null) {
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

	@Override
	public List<AlertDto> getAlert(String writer) {
		// 자기가쓴 댓글은 걸러주는 코드가 필요 (완료)
		List<AlertDto> alertDtos = 
				memberDao.getAlert(writer);
		for(int i=0; i<alertDtos.size(); i++) {
			if(alertDtos.get(i).getWriter().equals(writer)) {
				alertDtos.remove(i);
			}
		}
		
		return alertDtos;
	}

	
}
