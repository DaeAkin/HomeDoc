package com.www.homedoc.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.dto.ReplyDto;
@Repository("memberDao")
public class MemberDaoImpl extends CRUDDaoImpl<MemberDto, String> implements MemberDao {

	private static String collectionName = "users";

	public MemberDaoImpl() throws IOException {
		super(collectionName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MemberDto memberLogin(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlertDto> getAlert(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeIsAlertToTrue(int reply_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDto selectOneById(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return null;
	}



	

//	@Override
//	public MemberDto memberLogin(MemberDto memberDto) {
//		// TODO Auto-generated method stub
//		return sqlSession.selectOne("memberLogin", memberDto);
//	}
//
//
//	@Override
//	public List<AlertDto> getAlert(String writer) {
//		// TODO Auto-generated method stub
//		return sqlSession.selectList("getAlert", writer);
//	}
//
//	@Override
//	public void changeIsAlertToTrue(int reply_no) {
//		System.out.println("dao ---changeIsAlertToTrue ----");
//		sqlSession.update("changeIsAlertToTrue",reply_no);
//	}
//
//
//	@Override
//	public MemberDto selectOneById(MemberDto memberDto) {
//		// TODO Auto-generated method stub
//		return sqlSession.selectOne("selectOneById",memberDto);
//	}




	


}
