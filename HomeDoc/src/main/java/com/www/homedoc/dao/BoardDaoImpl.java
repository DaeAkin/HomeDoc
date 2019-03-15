package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.BoardDto;
@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertBoard",paramMap);
	}

	@Override
	public List<BoardDto> getAllboardWithCategory(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		System.out.println("sqlSession null? : " + sqlSession);
		return sqlSession.selectList("getAllboardWithCategory", paramMap);
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
		
		return sqlSession.update("updateBoard", paramMap);
	}

	@Override
	public void deleteAllBoard() {
		 sqlSession.delete("deleteAllBoard");
		
	}

	@Override
	public List<BoardDto> getAllBoard() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList("getAllBoard");
	}

	@Override
	public int deleteOneBoardWithBoard_no(int no) {
		// TODO Auto-generated method stub
		
		return sqlSession.delete("deleteOneBoardWithBoard_no" , no);
	}

}
