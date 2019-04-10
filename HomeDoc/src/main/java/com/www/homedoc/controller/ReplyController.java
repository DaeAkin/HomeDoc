package com.www.homedoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.ReplyService;
 
@RequestMapping("/reply")
@SessionAttributes("replyDto")
@Controller
public class ReplyController extends CRUDController<ReplyDto, Integer, ReplyService>{

	
}
