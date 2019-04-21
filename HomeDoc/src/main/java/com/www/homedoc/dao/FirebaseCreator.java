package com.www.homedoc.dao;

import java.io.FileInputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseCreator {

	public static Firestore CreateConnection() {
		System.out.println("-- FirebaeeCreator CreateConnection() --");
		
	try {
		FileInputStream serviceAccount =
				  new FileInputStream("/Users/donghyeonmin/git/HomeDoc/HomeDoc/src/main/java/com/www/homedoc/dao/serviceAccountKey.json");

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
				  .setDatabaseUrl("https://homedoc-77c36.firebaseio.com")
				  .build();

				FirebaseApp.initializeApp(options);
				return FirestoreClient.getFirestore();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return null;
	}
}
