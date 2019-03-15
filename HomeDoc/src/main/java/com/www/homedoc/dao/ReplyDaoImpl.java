package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.dto.ReplyDto;

public class ReplyDaoImpl implements ReplyDao {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertReply", replyDto);
	}

	@Override
	public List<ReplyDto> getAllReplyWithboard_no(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAllReplyWithboard_no", replyDto);
	}

	@Override
	public List<ReplyDto> getAllReply() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAllReply");
	}

	@Override
	public ReplyDto getOneReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getOneReply", replyDto);
	}

	// might be deprecated
	@Deprecated
	@Override
	public int deleteReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return sqlSession.delete("deleteReply",replyDto);
	}

	@Override
	public int updateReply(ReplyDto replyDto) {
		// TODO Auto-generated method stub
		return sqlSession.update("updateReply",replyDto);
	}

	@Override
	public void deleteAllReply() {
		// TODO Auto-generated method stub
		sqlSession.delete("deleteAllReply");
	}

	@Override
	public int deleteOneReplyWithReply_no(int no) {
		// TODO Auto-generated method stub
		return sqlSession.delete("deleteOneReplyWithReply_no",no);
	}

}
