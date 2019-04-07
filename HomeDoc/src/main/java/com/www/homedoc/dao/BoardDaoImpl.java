package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int insertBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("insertBoard",boardDto);
	}

	@Override
	public List<BoardDto> getAllboardWithCategory(BoardDto boardDto) {
		// TODO Auto-generated method stub
		System.out.println("sqlSession null? : " + sqlSession);
		return sqlSession.selectList("getAllboardWithCategory", boardDto);
	}

	@Override
	public BoardDto getOneBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getOneBoard",boardDto);
	}

	@Override
	public int deleteBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return sqlSession.delete("deleteBoard",boardDto);
	}

	@Override
	public int updateBoard(BoardDto boardDto) {
		
		return sqlSession.update("updateBoard", boardDto);
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

	@Override
	public List<BoardDto> getBoardListDoWithPagination(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		System.out.println("시작 : " + paramMap.get("startNo"));
		System.out.println("끝 : " + paramMap.get("endNo"));
		System.out.println("Dao perPage : " + paramMap.get("perPage"));
		return sqlSession.selectList("getBoardListDoWithPagination" , paramMap);
	}

	@Override
	public List<BoardDto> getBoardForHomeWithLimit(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
	
		
		return sqlSession.selectList("getBoardForHomeWithLimit",paramMap);
	}

}
