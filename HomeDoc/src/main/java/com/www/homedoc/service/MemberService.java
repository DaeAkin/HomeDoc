package com.www.homedoc.service;

import java.util.List;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;

public interface MemberService extends CRUDService<MemberDto, Integer> {


	Boolean memberLogin(MemberDto memberDto);
	
	List<AlertDto> getAlert(String writer);
	
	int memberIdCheck(String id);
}
