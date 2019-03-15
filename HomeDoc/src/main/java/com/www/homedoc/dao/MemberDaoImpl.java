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
	public int insertMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertMember",memberDto);
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.update("updateMember",memberDto);
	}

	@Override
	public MemberDto selectOneMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("selectOneMember",memberDto);
	}

	@Override
	public List<MemberDto> seleteAllMember() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectAllMember");
	}

	@Override
	public MemberDto memberLogin(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberLogin", memberDto);
	}

	@Override
	public void deleteAllMember() {
		sqlSession.delete("deleteAllMember");
		
	}

}
