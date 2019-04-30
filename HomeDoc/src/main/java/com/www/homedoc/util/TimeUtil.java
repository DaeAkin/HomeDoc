package com.www.homedoc.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.www.homedoc.dto.BoardDto;



public class TimeUtil {

	// 작성일이 오늘이면 시간으로 표시
	// 작성일이 어제면 몇월 몇일로 나타내는 
	// 시간을 변환해주는 유틸
	// Mysql 기준
	// 인자로는 DB의 컬럼 타입이 DATETIME 이며,
	// Default 값으로 CURRENT_TIMESTAMP을 줘야한다.
	public static String TimeChange(String time) {
		// 시간 계산용 변수
//		long calDay = 0;
		
		
			
			//Date 포맷 초기화
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			// 오늘 날짜 구하기.
			String today = getToday();
			// 오늘 날짜를 위에서 선언해준 포맷으로 바꿔준다.
//			Date todays = format.parse(getToday());

			//시간 변경 시작
			// mysql 게시물 오늘날짜이면 시간으로 표시, 아니면 날짜로만 표시.
			
			System.out.println("today :" + today);
			System.out.println("시간짜른거 : " + time.substring(0, 10));
			//yyyy-mm-dd 로 자른 값이 today랑 같으면 오늘써진 글이다.
			if(time.substring(0, 10).equals(today))  
			{
				System.out.println("오늘인데?");
				// 오늘 날짜면 hh:mm 만 리턴해준다.
				return time.substring(11,16);
				
			} else {
				// 오늘 작성된 글이 아니라면 ?
				//mm-dd만 리턴하자
				return time.substring(5,11);
			}
			
			// 밑에는 다른방식
//			for (int i = 0; i < resultDto.size(); i++) {
//				if (resultDto.get(i).getWritertime().substring(0, 10).equals(today)) {
//					System.out.println("시간 변환.");
//					resultDto.get(i).setWritertime(resultDto.get(i).getWritertime().substring(11, 16));
//
//				} else {
//
//					long calData = todays.getTime() - format.parse(resultDto.get(i).getWritertime()).getTime();
//
//					calDay = calData / (24 * 60 * 60 * 1000);
//
//					calDay = Math.abs(calDay);
//
//					resultDto.get(i).setWritertime(String.valueOf(calDay) + "일전");
//				}



	}

	



	// 현재날짜 가져오기.
	public static String getToday() {

		Date today = new Date();

		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		String currentTime = time.format(today);

		System.out.println("현재 시간 : " + currentTime);

		System.out.println(" DB 조회를 위해 자를 시간 :" + currentTime.substring(0, 10));

		currentTime = currentTime.substring(0, 10);

		return currentTime;
	}

	/*
	 * 현재 년도,월,일,시간,분,초 가져옴.
	 */
	public static String getCurrentTime() {

		Date today = new Date();

		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		String currentTime = time.format(today);

		return currentTime;

	}

}
