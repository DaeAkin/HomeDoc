package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.ReplyDto;
@Repository("replyDao")
public class ReplyDaoImpl extends CRUDDaoImpl<ReplyDto, Integer>implements ReplyDao {

	
	// mapper의 namespace 
	private static final String mappingName = 
			"com.www.homedoc.dao.ReplyDaoImpl";
	
	public ReplyDaoImpl() {
		super(mappingName);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<ReplyDto> getAllReplyWithboard_no(int board_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAllReplyWithboard_no",board_no);
	}

	@Override
	public void changeIsAlertToTrue(int reply_no) {
		sqlSession.update("changeIsAlertToTrue",reply_no);
		
	}
	


}
