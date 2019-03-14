package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.MemberDto;

public interface MemberService {

	int insertMember(Map<String, Object> paramMap);

	int updateMember(Map<String, Object> paramMap);

	MemberDto selectOneMember(Map<String, Object> paramMap);

	List<MemberDto> seleteAllMember(Map<String, Object> paramMap);

	Boolean memberLogin(Map<String, Object> paramMap);
}
