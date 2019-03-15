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
		return sqlSession.insert("insertMember",paramMap);
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
	public List<MemberDto> seleteAllMember() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectAllMember");
	}

	@Override
	public MemberDto memberLogin(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberLogin", paramMap);
	}

	@Override
	public void deleteAllMember() {
		sqlSession.delete("deleteAllMember");
		
	}

}
