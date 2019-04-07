package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.PaginationDto;
@Repository("boardDao")
public class BoardDaoImpl extends CRUDDaoImpl<BoardDto, Integer> implements BoardDao{

	// mapper의 namespace
	private static final String mappingName = 
			"com.www.homedoc.dao.BoardDaoImpl";
	
	public BoardDaoImpl() {
		super(mappingName);
		// TODO Auto-generated constructor stub
	}

	@Autowired
	SqlSession sqlSession;
	

	@Override
	public List<BoardDto> getAllboardWithCategory(BoardDto boardDto) {
		// TODO Auto-generated method stub
		System.out.println("sqlSession null? : " + sqlSession);
		return sqlSession.selectList("getAllboardWithCategory", boardDto);
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
