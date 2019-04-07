package com.www.homedoc.controller;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.www.homedoc.dao.CRUDDao;
import com.www.homedoc.service.CRUDService;
import com.www.homedoc.service.CRUDServiceImpl;


public abstract class CRUDController<T,PK,S extends CRUDService<T, PK>> {

	@Autowired
	S service;
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	int insert(@ModelAttribute T dto) {
		return service.insert(dto);
		
	}
	
	@RequestMapping(value = "update" , method = RequestMethod.POST)
	int update(@ModelAttribute T dto) {
		return service.update(dto);
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.GET)	
	int deleteByNo(@RequestParam PK no) {	
		return service.deleteByNo(no);
	}
	
	@RequestMapping(value = "/deleteAll" , method = RequestMethod.GET)	
	void deleteAll(@RequestParam PK no) {	
		 service.deleteAll();
	}
	
	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	List<T> selectAll() {
		return service.selectAll();
	}
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	List<T> selectByNo() {
		return service.selectAll();
	}
	
	
	
	
}
