package com.www.homedoc.dao;

import java.util.List;

public interface CRUDDao<T,PK> {

	int insert(T dto);
	
	int update(T dto);
	
	int deleteByNo(PK no);
	
	void deleteAll();
	
	List<T> selectAll();
	
	T selectByNo(PK no);
	
	
	
	
}
