package com.www.homedoc.dao;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.Transaction;

public abstract class CRUDDaoImpl<T, PK> implements CRUDDao<T, PK> {

	private Firestore db;

	private DocumentReference docRef;

	private CollectionReference pointedRef;

	private String collectionName;

	public CRUDDaoImpl(String collectionName) throws IOException {
		this.collectionName = collectionName;
		System.out.println("Firebase 생성자 호출");
		db = FirebaseCreator.CreateConnection();
		System.out.println("CRUDDaoImpl db :" + db);

		System.out.println(collectionName);
		docRef = db.collection("users").document();
		System.out.println(docRef);

		// collectionName으로 받아서 하는걸로 수정할것
		pointedRef = db.collection("users");

	}

	@Override
	public int insert(final T dto) {
		ApiFuture<String> transaction = db.runTransaction(new Transaction.Function<String>() {
			@Override
			public String updateCallback(Transaction transaction) throws Exception {

				transaction.set(docRef, dto);

				transaction.update(pointedRef.document(docRef.getId()), "no", docRef.getId());
				return "insert 완료";
			}
		});
		try {
			transaction.get();
		} catch (InterruptedException e) {
			// TODO Auto-generat3SsXed catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 1;
	}

	@Override
	public int update(T dto, PK no) {

		System.out.println("-- update() --");
		ApiFuture<Integer> transaction = db.runTransaction(new Transaction.Function<Integer>() {
			@Override
			public Integer updateCallback(Transaction transaction) throws Exception {
				// dto no을 문서의 이름과 동일하게 하는 작업
				transaction.update(pointedRef.document((String) no), "pw", "!234");
				;

				return 1;
			}
		});
		try {
			transaction.get();
		} catch (InterruptedException e) {
			// TODO Auto-generat3SsXed catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	public int deleteByNo(PK no) {

		ApiFuture<String> transaction = db.runTransaction(new Transaction.Function<String>() {
			@Override
			public String updateCallback(Transaction transaction) throws Exception {
				transaction.delete(pointedRef.document((String) no));
				return null;
			}
		});

		try {
			transaction.get();
		} catch (InterruptedException e) {
			// TODO Auto-generat3SsXed catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	//
	// @Override
	// public List<T> selectAll() {
	// // TODO Auto-generated method stub
	// return sqlSession.selectList(mappingName + "." +MAPPING_SELECT_ALL);
	// }
	//
	// @Override
	// public T selectByNo(PK no) {
	// // TODO Auto-generated method stub
	// return sqlSession.selectOne(mappingName +"." + MAPPING_SELECT_BY_NO, no);
	// }
	//
	// @Override
	// public void deleteAll() {
	// sqlSession.delete(mappingName + "." + MAPPING_DELETE_ALL);
	//
	// }

}
