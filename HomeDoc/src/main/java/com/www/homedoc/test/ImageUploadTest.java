package com.www.homedoc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.www.homedoc.util.ImageUploadUtil;

// 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "context-testContext.xml")
public class ImageUploadTest {
	private static final String filePath = "/Users/donghyeonmin/upload/";
	
	@Autowired
	ImageUploadUtil imageUploadUtil;
	
	File file;
	
	byte[] bytes;

	@Before
	public void setUp() throws IOException {
	// 업로드할 테스트용 이미지 설정하기 
		
		file = new File("/Users/donghyeonmin/git/HomeDoc/HomeDoc/src/main/java/com/www/homedoc/test/cat.jpg");
		
		FileInputStream fis = new FileInputStream(file);
		
		bytes = IOUtils.toByteArray(fis);
		
		
		
		
		 
	}
	
	@Test
	public void imageUploadTest() throws Exception {
		System.out.println("---- imageUploadTest() ----");
		
		imageUploadUtil.uploadFile(filePath,file.getName() , bytes);
	}
}
