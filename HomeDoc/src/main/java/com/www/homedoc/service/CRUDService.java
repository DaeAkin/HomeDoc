package com.www.homedoc.service;

import java.util.List;

public interface CRUDService<T,PK> {

	int insert(T dto);
	
	int update(T dto);
	
	int deleteByNo(PK no);
	
	void deleteAll();
	
	List<T> selectAll();
	
	T selectByNo(PK no);
	
	
	
	
}
