package com.www.homedoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.ReplyDao;
import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.util.TimeUtils;
@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	ReplyDao replyDao;

	
	
	@Override
	public int insertReply(ReplyDto replyDto) {
		
		return replyDao.insertReply(replyDto);
	}

	@Override
	public List<ReplyDto> getAllReplyWithboard_no(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return replyDao.getAllReplyWithboard_no(replyDto);
	}

	@Override
	public List<ReplyDto> getAllReply() {
		// TODO Auto-generated method stub
		return replyDao.getAllReply();
	}

	@Override
	public ReplyDto getOneReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return replyDao.getOneReply(replyDto);
	}

	@Override
	public int deleteReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return replyDao.deleteReply(replyDto);
	}

	@Override
	public int updateReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return replyDao.updateReply(replyDto);
	}

	@Override
	public void deleteAllReply() {
		// TODO Auto-generated method stub
		replyDao.deleteAllReply();
	}

	@Override
	public int deleteOneReplyWithReply_no(int no) {
		// TODO Auto-generated method stub
		return replyDao.deleteOneReplyWithReply_no(no);
	}

}
