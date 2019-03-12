package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.dao.BoardDao;
import com.www.homedoc.dto.BoardDto;

public class BoardServiceImpl implements BoardService{

	
	@Autowired
	BoardDao boardDao;
	@Override
	public int insertBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.insertBoard(paramMap);
	}

	@Override
	public List<BoardDto> getAllboard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.getAllboard(paramMap);
	}

	@Override
	public BoardDto getOneBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.getOneBoard(paramMap);
	}

	@Override
	public int deleteBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.deleteBoard(paramMap);
	}

	@Override
	public int updateBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.updateBoard(paramMap);
	}

}
