package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.ReplyDto;

public interface ReplyService extends CRUDService<ReplyDto, Integer> {
	
	List<ReplyDto> getAllReplyWithboard_no(int board_no); 
	
	void changeIsAlertToTrue(int reply_no);
}
