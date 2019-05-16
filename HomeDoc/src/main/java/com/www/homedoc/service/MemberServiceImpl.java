package com.www.homedoc.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.www.homedoc.dao.MemberDao;
import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.util.TimeUtil;
@Service
public class MemberServiceImpl extends CRUDServiceImpl<MemberDto, Integer, MemberDao>
implements MemberService{

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
	public int insert(MemberDto memberDto) {
		
		System.out.println("회원가입 완료");
	
		//패스워드 암호화 
		 String pw = 
				 DigestUtils.sha256Hex(memberDto.getPw());
		
		 memberDto.setPw(pw);
		 
		return memberDao.insert(memberDto);
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
	public List<AlertDto> getAlert(String writer) {
		// 자기가쓴 댓글은 걸러주는 코드가 필요 (완료)
		List<AlertDto> alertDtos = memberDao.getAlert(writer);
		
		System.out.println("싸이즈 : " + alertDtos.size());
		
		int forSize = alertDtos.size();
		
		List<AlertDto> willReturnedDto = new ArrayList<>();
		
		if (alertDtos.size() != 0) {
			System.out.println("service : " + alertDtos.size());
			
			for (AlertDto alertDto : alertDtos) {
				if (alertDto.getWriter().equals(writer)) {
					//자기가 쓴 댓글이면 삭제
//					alertDtos.remove(alertDto);
				} else {
					// datetime 변경
					System.out.println("datetime 변경");
					alertDto.setDatetime(
							TimeUtil.TimeChange(alertDto.getDatetime()));
					willReturnedDto.add(alertDto);
					System.out.println("alertService 시간 변경확인 :" + alertDto.getDatetime());
				}
			}
		}
	

		return willReturnedDto;
	}


	
	
	
	@Override
	public int memberIdCheck(String id) {
		// TODO Auto-generated method stub
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);

		MemberDto resultMemberDto = 
				memberDao.selectOneById(memberDto);    
		if(resultMemberDto == null) 
			return 0;
		
		return 1;
		// 중복이면 1을 리턴하고 그렇지 않으면 0을 리턴한다.
	}



	
}
