package com.www.homedoc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.homedoc.dao.BoardDao;
import com.www.homedoc.dto.BoardDto;
@Service
public class BoardServiceImpl extends CRUDServiceImpl<BoardDto, Integer, BoardDao> implements BoardService{

	
	@Autowired
	BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	

	@Override
	public List<BoardDto> getAllboardWithCategory(BoardDto boardDto) {
		System.out.println(" ---- getAllboardWithCategory() ----");
		
		System.out.println("boardDao는 널인가? :" + boardDao);
		
		return boardDao.getAllboardWithCategory(boardDto);
	}


	@Override
	public List<BoardDto> getBoardForHomeWithLimit(Map<String, Object> paramMap) {
		// 필요한 파라미터들 
		// 1) categoty
		// 2) limit ex) 0,limit  데이터 몇개 뽑아 올건지
		System.out.println("---- service getBoardForHomeWithLimit()");
		return boardDao.getBoardForHomeWithLimit(paramMap);
	}


	@Override
	public void increaseHit(int board_no) {
		
		boardDao.increaseHit(board_no);
		
	}



}
