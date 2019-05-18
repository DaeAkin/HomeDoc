package com.www.homedoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.ReplyDao;
import com.www.homedoc.dto.ReplyDto;
@Service
public class ReplyServiceImpl extends CRUDServiceImpl<ReplyDto, Integer,
	ReplyDao>implements ReplyService {
	
	@Autowired
	ReplyDao replyDao;
	
	

	@Override
	public List<ReplyDto> getAllReplyWithboard_no(int board_no) {
		// TODO Auto-generated method stub
		return replyDao.getAllReplyWithboard_no(board_no);
	}

	@Override
	public void changeIsAlertToTrue(int reply_no) {
		replyDao.changeIsAlertToTrue(reply_no);
		
	}

	
	


}
