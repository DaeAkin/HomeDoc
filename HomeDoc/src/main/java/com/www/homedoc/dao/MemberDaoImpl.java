package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.MemberDto;
@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertMember");
	}

	@Override
	public int updateMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.update("updateMember",paramMap);
	}

	@Override
	public MemberDto selectOneMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("selectOneMember",paramMap);
	}

	@Override
	public List<MemberDto> seleteAllMember(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("seleteAllMember",paramMap);
	}

	@Override
	public MemberDto memberLogin(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberLogin", paramMap);
	}

}
