package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.MemberDto;

public interface MemberDao {
	
	int insertMember(Map<String, Object> paramMap);
	
	int updateMember(Map<String, Object> paramMap);
	
	void deleteAllMember();
	
	MemberDto selectOneMember(Map<String, Object> paramMap);
	
	List<MemberDto> seleteAllMember();
	
	MemberDto memberLogin(Map<String, Object> paramMap);
	
	
}
