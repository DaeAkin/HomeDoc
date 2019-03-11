package com.www.homedoc.util;

import java.util.Random;

public class RandomNumberMaker {

	public int numberMaker() {
		Random random = new Random();
		return random.nextInt(100000);
	}
}
