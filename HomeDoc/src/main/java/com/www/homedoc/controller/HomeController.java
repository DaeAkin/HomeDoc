package com.www.homedoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Service 의존성 추가.
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}

}
