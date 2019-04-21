package com.www.homedoc.dao;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.WriteBatch;
import com.google.cloud.firestore.WriteResult;

public abstract class CRUDDaoImpl<T, PK> implements CRUDDao<T, PK> {
	

	private String collectionName;
	
	
	public CRUDDaoImpl(String collectionName) throws IOException {
		this.collectionName = collectionName;
	}
	
	FirebaseTemplate ft = new FirebaseTemplate(collectionName);
	
	@Override
	public int insert(final T dto) {
		
		System.out.println("--insert() --");
		ft.execute(new BatchStrategy() {
			
			@Override
			public void doWithBatch(WriteBatch batch,DocumentReference docRef) {
				System.out.println("CRUDDAO Impl : " + batch);
				System.out.println("CRUDDAO docRef : " + docRef);
				System.out.println("CRUDDAO Dto : " + dto);
				batch.set(docRef, dto);
				
			}
		});
		return 1;
	}
	
//	@Override
//	public int update(T dto) {
//		
//		System.out.println("-- update() --");
//		ft.execute(new BatchStrategy() {
//			
//			@Override
//			public void doWithBatch(WriteBatch batch, DocumentReference docRef) {
//				batch.update(documentReference, fields)
//				
//			}
//		});
//	}
	
	public int deleteByNo(PK no) {
		
		ft.execute(new BatchStrategy() {
			
			@Override
			public void doWithBatch(WriteBatch batch, DocumentReference docRef) {
			batch.delete(docRef);
			}
		});
		return 1;
		}
//	
//	@Override
//	public List<T> selectAll() {
//		// TODO Auto-generated method stub
//		return sqlSession.selectList(mappingName + "." +MAPPING_SELECT_ALL);
//	}
//	
//	@Override
//	public T selectByNo(PK no) {
//		// TODO Auto-generated method stub
//		return sqlSession.selectOne(mappingName +"." + MAPPING_SELECT_BY_NO, no);
//	}
//	
//	@Override
//	public void deleteAll() {
//		sqlSession.delete(mappingName + "." + MAPPING_DELETE_ALL);
//		
//	}




}
