package com.www.homedoc.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class CRUDDaoImpl<T, PK> implements CRUDDao<T, PK> {
	
	@Inject
	SqlSession sqlSession;
	
	private String mappingName;
	
	public CRUDDaoImpl(String mappingName) {
		this.mappingName = mappingName;
	}
	
	
	public static final String MAPPING_INSERT = "insert";
    //mapping key "update" must be defined in mapping file
    public static final String MAPPING_UPDATE = "update";
    //mapping key "delete" must be defined in mapping file
    public static final String MAPPING_DELETE = "delete";
    //mapping key "selectAll" must be defined in mapping file
    public static final String MAPPING_SELECT_ALL = "selectAll";
    //mapping key "selectById" must be defined in mapping file
    public static final String MAPPING_SELECT_BY_NO = "selectByNo";
    
    public static final String MAPPING_DELETE_ALL = "deleteAll";
	
	@Override
	public int insert(T dto) {
		// TODO Auto-generated method stub
		return sqlSession.insert(mappingName +"." + MAPPING_INSERT,dto);
	}
	
	@Override
	public int update(T dto) {
		// TODO Auto-generated method stub
		return sqlSession.update(mappingName + "." + MAPPING_UPDATE , dto);
	}
	
	public int deleteByNo(PK no) {
		return sqlSession.delete(mappingName +  "." +MAPPING_DELETE , no);
		}
	
	@Override
	public List<T> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(mappingName + "." +MAPPING_SELECT_ALL);
	}
	
	@Override
	public T selectByNo(PK no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(mappingName +"." + MAPPING_SELECT_BY_NO, no);
	}
	
	@Override
	public void deleteAll() {
		sqlSession.delete(mappingName + "." + MAPPING_DELETE_ALL);
		
	}




}
