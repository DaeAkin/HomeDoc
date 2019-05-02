package com.www.homedoc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.junit.internal.matchers.Each;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;

import com.www.homedoc.util.ImageUploadUtil;

@Controller
public class UploadController {

	@Autowired
	ImageUploadUtil imageUploadUtil;
	
	@Autowired
	String imageUploadPath;
	
	
	// 다중 업로드 지원
	@ResponseBody
	@RequestMapping(value = "/upload/image" ,method = RequestMethod.POST)
	 public Object imageUpload(HttpServletRequest request,MultipartHttpServletRequest multipartRequest) throws Exception {
		System.out.println("---- Controller imageUpload() ----");
		
		List<MultipartFile> files = multipartRequest.getFiles("formData");
		
		System.out.println("파일 사이즈 : " + files.size());
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			
			byte[] fileData = file.getBytes();
			String originalName = file.getOriginalFilename();
			
			imageUploadUtil.uploadFile(imageUploadPath, originalName, fileData);
		}
		
	
		
//		System.out.println(originalName);
		
//		System.out.println("originalName :" + originalName);
//		
//		System.out.println("이미지 업로드 경로위치는 ? : " + imageUploadPath);
		
		/*
		 * s_ 붙은건 썸네일 map.get("makeThumbnail");
		 * 게시판에 넣어야 할 이미지 주소는 map.get("boardInsertImage");
		 */
		
		
		
		Map<String, Object> resultMap = null;
				
		
		return resultMap;
		
	}
	 
	
}
