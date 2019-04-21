package com.www.homedoc.dao;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteBatch;
import com.google.cloud.firestore.WriteResult;

public class FirebaseTemplate implements BatchCallback {
	private Firestore db;
;
	private DocumentReference docRef;
	
	private WriteBatch batch;
	
	public FirebaseTemplate(String collectionName) {
		System.out.println("Firebase 생성자 호출");
		db = FirebaseCreator.CreateConnection();
	System.out.println("FirebaseTemplte db :" + db);
		
		System.out.println(collectionName);
		docRef = db.collection("users").document();
		System.out.println(docRef);
		batch = db.batch();
		System.out.println("FirebaseTemplte batch :" + batch);
		
	}
	
	@Override
	public void execute(BatchStrategy bs) {
		
		bs.doWithBatch(batch,docRef);
		ApiFuture<List<WriteResult>> future = batch.commit();
		System.out.println("방금 들어간 ID : " + docRef.getId());
		
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
