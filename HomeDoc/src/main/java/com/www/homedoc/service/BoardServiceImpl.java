package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.BoardDao;
import com.www.homedoc.dto.BoardDto;
@Service
public class BoardServiceImpl implements BoardService{

	
	@Autowired
	BoardDao boardDao;
	
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public int insertBoard(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return boardDao.insertBoard(paramMap);
	}

	@Override
	public List<BoardDto> getAllboardWithCategory(Map<String, Object> paramMap) {
		System.out.println(" ---- getAllboardWithCategory() ----");
		
		System.out.println("boardDao는 널인가? :" + boardDao);
		return boardDao.getAllboardWithCategory(paramMap);
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
