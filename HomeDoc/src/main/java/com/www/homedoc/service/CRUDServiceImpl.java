package com.www.homedoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.dao.CRUDDao;

public abstract class CRUDServiceImpl<T,PK,Dao extends CRUDDao<T, PK>>implements CRUDService<T, PK>  {
	
	@Autowired
	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public int insert(T dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}
	
	@Override
	public int update(T dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}
	
	public int deleteByNo(PK no) {
		return dao.deleteByNo(no);
		}
	
	@Override
	public List<T> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	
	@Override
	public T selectByNo(PK no) {
		// TODO Auto-generated method stub
		return dao.selectByNo(no);
	}
	
	@Override
	public void deleteAll() {
		
		dao.deleteAll();
		
	}
	

	
}
