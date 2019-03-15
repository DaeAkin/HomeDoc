package com.www.homedoc.util;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;

public class DtoToMap {
	
	 public static Map<String, Object> 
	 dtoToMapWithMemberDto(MemberDto memberDto) {
		 Map<String, Object> resultMap =
				 new HashMap<String, Object>();
		 
		 
		 resultMap.put("id", memberDto.getId());
		 resultMap.put("pw", memberDto.getPw());
		 resultMap.put("email", memberDto.getEmail());
		 resultMap.put("address", memberDto.getAddress());
		 resultMap.put("phone", memberDto.getPhone());
		 
		 return resultMap;
		 
	 }

	public static Map<String, Object>
		dtoToMapWithBoardDto(BoardDto boardDto) {
		Map<String, Object> resultMap =
				 new HashMap<String, Object>();
		
		resultMap.put("title", boardDto.getTitle());
		resultMap.put("writer", boardDto.getWriter());
		resultMap.put("datetime", boardDto.getDatetime());
		resultMap.put("hit", boardDto.getHit());
		resultMap.put("category", boardDto.getCategory());
		resultMap.put("content", boardDto.getContent());
		
		
		return resultMap;
	}
	
	public static Map<String, Object>
		dtoToMapWtihBoardDtoIncludeNo(BoardDto boardDto) {
		
		Map<String, Object> resultMap =
				dtoToMapWithBoardDto(boardDto);
		
		resultMap.put("no", boardDto.getNo());
		
		return resultMap;
	}
	

	
		
}
		