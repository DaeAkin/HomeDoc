package com.www.homedoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.ReplyService;
 
@RequestMapping("/reply")
//@SessionAttributes("replyDto")
@Controller
public class ReplyController extends CRUDController<ReplyDto, Integer, ReplyService>{

	@Autowired
	ReplyService replyService;
	
	@Autowired
	BoardService boardService;
	// 알림창에 댓글 누르면 뷰로가지고, isalert는 1로 바꾼다.
	@RequestMapping(value = "/alertView", method = RequestMethod.GET)
	public String alertView(@RequestParam int no,@RequestParam
			int reply_no) {
		
		
		boardService.selectByNo(no);
		
		replyService.changeIsAlertToTrue(reply_no);
		
		return "board/boardView";
	}
	
}
