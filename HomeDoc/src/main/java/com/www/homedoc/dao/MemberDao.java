package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.MemberDto;

public interface MemberDao {
	
	int insertMember(MemberDto memberDto);
	
	int updateMember(MemberDto memberDto);
	
	void deleteAllMember();
	
	MemberDto selectOneMember(MemberDto memberDto);
	
	List<MemberDto> seleteAllMember();
	
	MemberDto memberLogin(MemberDto memberDto);
	
	
}
