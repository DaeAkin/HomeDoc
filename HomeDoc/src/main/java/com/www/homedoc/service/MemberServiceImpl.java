package com.www.homedoc.service;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dto.AlertDto;
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
	public int insertMember(MemberDto memberDto) {
	
		//패스워드 암호화 
		 String pw = 
				 DigestUtils.sha256Hex(memberDto.getPw());
		
		 memberDto.setPw(pw);
		 
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
		//패스워드 암호화 
		 String pw = 
				 DigestUtils.sha256Hex(memberDto.getPw());
		
		 memberDto.setPw(pw);
		
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

	@Override
	public void changeIsAlertToTrue(int reply_no) {
		
		memberDao.changeIsAlertToTrue(reply_no);
		
	}
	
	
	
	@Override
	public int memberIdCheck(String id) {
		// TODO Auto-generated method stub
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);

		MemberDto resultMemberDto = 
				memberDao.selectOneMember(memberDto);    
		if(resultMemberDto == null) 
			return 0;
		
		return 1;
		// 중복이면 1을 리턴하고 그렇지 않으면 0을 리턴한다.
	}

	
}
