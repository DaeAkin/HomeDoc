package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.MemberDto;

public interface MemberService {

	int insertMember(Map<String, Object> paramMap);

	int updateMember(Map<String, Object> paramMap);

	MemberDto selectOneMember(Map<String, Object> paramMap);
	
	void deleteAllMember();

	List<MemberDto> selectAllMember();

	Boolean memberLogin(Map<String, Object> paramMap);
}
