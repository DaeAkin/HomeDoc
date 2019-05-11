package com.www.homedoc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.junit.internal.matchers.Each;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.www.homedoc.util.FileUtils;
import com.www.homedoc.util.ImageUploadUtil;

@Controller
public class UploadController {
	
	private static final String uploadPath = "/Users/donghyeonmin/upload";

	@Autowired
	ImageUploadUtil imageUploadUtil;
	
	@Autowired
	String imageUploadPath;
	
	
	// 다중 업로드 지원
	@ResponseBody
	@RequestMapping(value = "/upload/image" ,method = RequestMethod.POST)
	 public Map<String, Object> imageUpload(MultipartFile file) throws Exception {
		System.out.println("size : " +file.getSize());
		System.out.println("contentType :" +file.getContentType());
		System.out.println("uploadPath : " + uploadPath);
		//originalFile = 원본 파일
		// boardInsertImage = 리사이징 or Width가 1200이하일 땐 원본 파일
		// makeThumbnail 썸네일 만드는 
		
		Map<String, Object> testMap = new HashMap<>();
		
		testMap = FileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());
		System.out.println("testMap.get(boardInsertImage) :" + testMap.get("boardInsertImage"));
		System.out.println("testMap.get(makeThumnail) : " + testMap.get("makeThumbnail"));
	
//		String jsonData = new ObjectMapper().writeValueAsString(testMap);
//		
//		return jsonData;
		
		return testMap;
		}
		
		
	

	
	// 이미지 표시 매핑.
		@ResponseBody // view가 아닌 data 리턴
		@RequestMapping("/image/displayFile")
		public ResponseEntity<byte[]> displayFile(String fileName) throws Exception {
			
			
			
			System.out.println("*********************** displayFile 메소드 시작 *********************");
			System.out.println("*********************** displayFile 메소드 시작 *********************");
			System.out.println("*********************** displayFile 메소드 시작 *********************");
			System.out.println("*********************** displayFile 메소드 시작 *********************");
			//서버의 파일을 다운로드하기 위한 스트림
			InputStream in = null; // java.io
			ResponseEntity<byte[]> entity = null;
			
			try {
				//확장자를 추출하여 formatName에 저장.
				String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);
				// 추출한 확장자를 MediaUtil 클래스나 다른 클래스를 만들어서 이미지파일여부를 검사하고 리턴하기.
//				MediaType mType = MediaUtils.getMediaType(formatName);
				//
				
				//헤더 구성 객체(외부에서 데이터를 주고받을 때에는 header와 body를 구성해야하기 때문에 )
				HttpHeaders headers = new HttpHeaders();
				//InputStream 생성
				System.out.println("InputStream 할 경로 : " + uploadPath + fileName);
				in = new FileInputStream(uploadPath + fileName);
				
				// 이미지 파일이면 if 쓰고
				
				//else 아니면 ( 일단은 이미지파일이라고 생각하고 코딩 )
//				headers.setContentType(mType);
				entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers,HttpStatus.OK);
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				//HTTP 상태 코드()
				entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
			} finally {
				in.close(); // 스트림 닫기.
			}
			
			return entity;
		}
	 
	
}
