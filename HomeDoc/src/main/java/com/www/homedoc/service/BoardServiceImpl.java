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
	public int insertBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.insertBoard(boardDto);
	}

	@Override
	public List<BoardDto> getAllboardWithCategory(BoardDto boardDto) {
		System.out.println(" ---- getAllboardWithCategory() ----");
		
		System.out.println("boardDao는 널인가? :" + boardDao);
		return boardDao.getAllboardWithCategory(boardDto);
	}

	@Override
	public BoardDto getOneBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.getOneBoard(boardDto);
	}

	@Override
	public int deleteBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.deleteBoard(boardDto);
	}

	@Override
	public int updateBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
		return boardDao.updateBoard(boardDto);
	}

	@Override
	public void deleteAllBoard() {
		boardDao.deleteAllBoard();
		
	}

	@Override
	public List<BoardDto> getAllBoard() {
		// TODO Auto-generated method stub
		return boardDao.getAllBoard();
	}

	@Override
	public int deleteOneBoardWithBoard_no(int no) {
		// TODO Auto-generated method stub
		return boardDao.deleteOneBoardWithBoard_no(no);
	}

}
