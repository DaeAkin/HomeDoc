package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.ReplyDto;

public interface ReplyService {
	
	int insertReply(ReplyDto replyDto);
	
	List<ReplyDto> getAllReplyWithboard_no(ReplyDto replyDto);
	
	List<ReplyDto> getAllReply();
	
	ReplyDto getOneReply(ReplyDto replyDto);
	
	int deleteReply(ReplyDto replyDto);
	
	int updateReply(ReplyDto replyDto);
	
	void deleteAllReply();
	
	int deleteOneReplyWithReply_no(int no);

}
