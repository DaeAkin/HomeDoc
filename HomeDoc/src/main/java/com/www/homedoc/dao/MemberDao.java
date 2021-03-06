package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;

public interface MemberDao extends CRUDDao<MemberDto, Integer>{
	
	
	MemberDto memberLogin(MemberDto memberDto);
	
	List<AlertDto> getAlert(String writer);
	

	MemberDto selectOneById(MemberDto memberDto);
	
	
	
}
