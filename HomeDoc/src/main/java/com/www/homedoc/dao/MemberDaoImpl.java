package com.www.homedoc.dao;

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
public class MemberDaoImpl extends CRUDDaoImpl<MemberDto, Integer> implements MemberDao {
	


	
	// mapper의 namespace 
	private static final String mappingName = 
			"com.www.homedoc.dao.MemberDaoImpl";
			
	
	public MemberDaoImpl() {
		super(mappingName);
	
	}
	
	

	@Autowired
	SqlSession sqlSession;
	

	@Override
	public MemberDto memberLogin(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberLogin", memberDto);
	}


	@Override
	public List<AlertDto> getAlert(String writer) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAlert", writer);
	}

	@Override
	public void changeIsAlertToTrue(int reply_no) {
		System.out.println("dao ---changeIsAlertToTrue ----");
		sqlSession.update("changeIsAlertToTrue",reply_no);
	}


	@Override
	public MemberDto selectOneById(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("selectOneById",memberDto);
	}




	


}
