package com.www.homedoc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.www.homedoc.dto.BoardDto;
import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.BoardService;
import com.www.homedoc.service.ReplyService;

import net.minidev.json.JSONArray;
 
@RequestMapping("/reply")
//@SessionAttributes("replyDto")
@Controller
public class ReplyController extends CRUDController<ReplyDto, Integer, ReplyService>{

	@Autowired
	ReplyService replyService;
	
	@Autowired
	BoardService boardService;
	//수정
	// 알림창에 댓글 누르면 뷰로가지고, isalert는 1로 바꾼다.
	@RequestMapping(value = "/alertView", method = RequestMethod.GET)
	public String alertView(@RequestParam int no,@RequestParam
			int reply_no) {
		
		
		boardService.selectByNo(no);
		
		replyService.changeIsAlertToTrue(reply_no);
		
		return "board/boardView";
	}

	
	@RequestMapping(value = "/replyInsert", method = RequestMethod.POST , produces = "application/json")
	@ResponseBody
	public Object insert(@RequestBody Map<String, Object> paramMap,HttpSession session) 
	{
		
		ObjectMapper mapper = new ObjectMapper();
		
		System.out.println(paramMap.toString());
		
		ReplyDto replyDto = mapper.convertValue(paramMap, ReplyDto.class);
		
		replyDto.setWriter((String)session.getAttribute("id"));
		replyDto.setIsalert(false);
		replyService.insert(replyDto);
		
		return new HashMap<>();
	}
	
}
