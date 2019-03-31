package com.www.homedoc.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtils {

	public String getCurrentTime() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월dd일 HH시mm분ss초");

		Calendar time = Calendar.getInstance();

		return String.valueOf(format1);
	}
}