package com.www.homedoc.dao;

import java.util.List;
import java.util.Map;

import com.www.homedoc.dto.ReplyDto;

public interface ReplyDao extends CRUDDao<ReplyDto, Integer>{

	List<ReplyDto> getAllReplyWithboard_no(int board_no);
}