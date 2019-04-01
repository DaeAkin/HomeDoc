package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;

public interface MemberDao {
	
	int insertMember(MemberDto memberDto);
	
	int updateMember(MemberDto memberDto);
	
	void deleteAllMember();
	
	MemberDto selectOneMember(MemberDto memberDto);
	
	List<MemberDto> seleteAllMember();
	
	MemberDto memberLogin(MemberDto memberDto);
	
	List<AlertDto> getAlert(String writer);
	
	void changeIsAlertToTrue(int reply_no);
	
	
	
}
