package com.www.homedoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.www.homedoc.dto.ReplyDto;
import com.www.homedoc.service.ReplyService;
 
@RequestMapping("/reply")
@Controller
public class ReplyController extends CRUDController<ReplyDto, Integer, ReplyService>{

	
}
