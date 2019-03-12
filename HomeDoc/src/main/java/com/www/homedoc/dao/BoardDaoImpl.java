package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.dto.BoardDto;

public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertBoard",paramMap);
	}

	@Override
	public List<BoardDto> getAllboard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("getAllboard", paramMap);
	}

	@Override
	public BoardDto getOneBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getOneBoard",paramMap);
	}

	@Override
	public int deleteBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.delete("deleteBoard",paramMap);
	}

	@Override
	public int updateBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.update("updateBoard",paramMap);
	}

}
