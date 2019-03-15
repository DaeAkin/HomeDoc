package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.MemberDto;

public interface MemberService {

	int insertMember(MemberDto memberDto);

	int updateMember(MemberDto memberDto);

	MemberDto selectOneMember(MemberDto memberDto);
	
	void deleteAllMember();

	List<MemberDto> selectAllMember();

	Boolean memberLogin(MemberDto memberDto);
}
