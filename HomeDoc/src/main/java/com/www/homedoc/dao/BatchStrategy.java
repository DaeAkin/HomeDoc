package com.www.homedoc.dao;

import com.google.cloud.firestore.WriteBatch;
import com.google.cloud.firestore.DocumentReference;

public interface BatchStrategy {
	
	void doWithBatch(WriteBatch batch, DocumentReference docRef);

}
